# Self-Supervised Bug Detection and Repair

> 一种自我监督的bug检测与修复器

## ABSTRACT

基于机器学习的程序分析最近显示了将形式推理和概率推理结合起来帮助软件开发的良好前景。然而，由于缺乏大型注释语料库，训练这些分析具有挑战性。为了解决这个问题，我们提出了BUGLAB，这是一种用于错误检测和修复的自我监督学习方法。

BUGLAB共同训练两个模型: (1) BUG Detector，它学习检测和修复代码中的错误; (2) BUG Selector，它学习创建有错误的代码，供检测器用作训练数据。在包含2374个真实bug的测试数据集上，BUGLAB的Python实现在基线方法上提高了30%，并在开源软件中发现了19个以前未知的bug。

## INTRODUCTION

+ *BUGLAB* 的提出背景
	- 传统的程序分析能够通过形式推理和组合搜索来检测关键错误，但需要由大量手动编码。
	- 方法都依赖于非常有限大小的数据集，或者那些已知不能代表实际代码中发现的bug特征的数据集。
+ *BUGLAB* 介绍
	+ bug detector +selector
	+ 神经网络结构（GNN,GREAT）
	+ 在*PYPIBUGS* 测试集上更高性能，但假阳性过高

## Self-Supervised Bug Detection

### Code Rewriting

> 代码重写，将服务于*BUGLAB* 定义框架

1. **重写规则（Rewrite Rule）**：
	- 每个重写规则由一个匹配函数（ $m_p$ ）和一个转换函数（ $t_p$ ）组成。
	- 对于 $s∈S$  ， $s|_{(i,j)}$  表示 $s$ 的第 $j$ 个子节点的第 $i$ 个子节点
	- 匹配函数 $m_p$: $S→\{true, false\}$  用于检查在抽象语法树 *s* 的某个位置 ℓ 是否可以应用重写规则 $\rho$。如果 $m_ρ(s∣_ℓ)=true$，则规则 $ρ$ 可以应用于位置 ℓ。
	- 转换函数 $t_ρ:S→S$ 用于将语法树 *s* 转换为新的语法树。如果 $m_ρ(s)=false$，则 $t_ρ(s)=s$，即不进行任何改变。
2. **潜在重写集合（Set of Potential Rewrites）**：
	- 对于语法树 $s$ 和重写规则集合 *R*，潜在重写集合 $R^R_s$ 包含了所有可能应用的重写规则。
	- $R^R_s$ 可以定义为： $R^R_s=\{⟨ℓ,ρ⟩∣ρ∈R,ℓ\ is\  a\  location\  in\  s,m_ρ(s∣ℓ)=true\}$ 
	- 这意味着，对于每个规则 *ρ*，如果它在位置 ℓ 处匹配，则 $⟨ℓ,ρ⟩$ 就会被包含在 $R^R_s$ 中。
3. **应用重写规则（Applying Rewrite Rules）**：
	- 给定 $R^R_s$ 中的一个元组 $⟨ℓ,ρ⟩$，我们可以通过应用重写规则 *ρ* 在位置 ℓ 处来生成新的语法树 $s^′=s[ρ]_ℓ$ 。
	- 这个过程实际上是在原始代码树的基础上，按照规则 *ρ* 对特定位置进行修改，从而得到一个新的代码树。

### BUGLAB

![BUGLAB](Self-Supervised%20Bug%20Detection%20and%20Repair.assets/BUGLAB.png)

> 概述:*Bug Selector*($S_φ$) 决定将哪个(错误的)重写应用于输入代码片段。然后，*Bug Detector*($D_θ$) 试图定位并修复插入的错误(如果插入了一个错误)。

#### Bug选择器（Bug Selector）

- bug选择器的职责是创建带有bug的代码样本。它通过应用预定义的[代码重写规则](#%20Code%20Rewriting)来修改原始代码，从而生成新的、含有bug的代码版本。
- bug选择器会从一组可能的重写规则中选择一个或多个规则，然后应用到原始代码的特定位置。这个过程是随机的，但也可以是有策略的，目的是生成尽可能难以检测的bug。

#### Bug检测器（Bug Detector）

- bug检测器的目标是识别bug选择器生成的带有bug的代码，并预测如何修复这些bug。
- bug检测器通过分析带有bug的代码样本来学习如何定位bug的位置，并预测正确的修复方法。这通常涉及到对代码的表示（如使用[图神经网络](#%20Neural%20Models)）和对[重写规则的应用](#%20Code%20Rewriting)。

#### 自监督学习过程

- **训练循环**：在训练过程中，bug选择器和bug检测器会交替进行训练。首先，bug选择器生成一批带有bug的代码样本。然后，bug检测器在这些样本上进行训练，学习如何检测和修复bug。接着，bug选择器会根据bug检测器的表现来调整其策略，以便生成更难以检测的bug。这个过程不断迭代，直到两个模型达到一定的平衡。即bug选择器能够生成足够难的bug，而bug检测器也能够有效地检测和修复这些bug。

- **优化目标**：BUGLAB的训练目标是一个min-max问题，即bug选择器试图生成最难被bug检测器发现的bug，而bug检测器则试图最小化在修复这些bug时的损失。

	- 该 $min-max$ 问题可以表示为： $\max_{\phi} \min_{\theta} E_{s \sim C} \left[ \max_{\langle \ell, \rho \rangle \in R^R_s} L_{D_{\theta}}(s[\rho]_{\ell}, \langle \ell, \rho^{-1} \rangle)  \right]$
		
		为了简化 $\max$，引入 $S_{\phi}(s)$ 抽样重写而非计算最大值，即： $\max_{\phi} \min_{\theta} E_{s \sim C} \left[ E_{\langle \ell, \rho \rangle \sim S_{\phi}(s)} \left[ L_{D_{\theta}}(s[\rho]_{\ell}, \langle \ell, \rho^{-1} \rangle)  \right] \right]$
		
		> - *φ* 是bug选择器模型的参数。 
		> - *θ* 是bug检测器模型的参数。
		> - *s* 是代码库C中的一个代码片段。
		> - $R^R_s$ 是在代码片段 *s* 中所有可能的重写规则集合。
		> - $L_{D_θ}$ 是bug检测器的损失函数，它衡量了模型在修复特定bug时的性能。
		> - ⟨ℓ,*ρ*⟩ 是一个重写规则，其中 ℓ 是应用重写的位置，*ρ* 是重写规则本身。
		> - $ρ^{−1}$ 是重写规则的逆，代表修复由 *ρ* 引入的bug。
		
	- **min-max问题的直观理解**
	
		- **bug选择器（maxφ）**：试图最大化bug检测器的损失，即生成那些最难被检测器发现的bug。它通过尝试不同的重写规则和位置来实现这一点。
		- **bug检测器（minθ）**：试图最小化这个损失，即提高其检测和修复bug的能力。它通过学习如何正确地识别和修复bug来实现这一点。
	
	- 从某种程度上， $S$  与 $D$ 是对称的，故在下面的神经网络建模时，忽略 $S$ 只考虑 $D$。

## Neural Models

> 在BUGLAB系统中，神经网络是用来表示和处理代码的关键组件。这些神经网络模型，特别是图神经网络（GNN）和GREAT（Global Relational Transformers），被用来学习和理解代码的结构，以便检测和修复bug。
>
> + GNN 是一种神经网络结构，它通过逐层更新节点的表示来学习图的全局表示。通常，GNN 在每个节点上执行消息传递操作，并通过聚合邻居节点的信息来更新节点的表示。在BUGLAB中，GNN用于理解代码的结构和上下文。
> + GREAT 则是一种图嵌入方法，它通过将图中的节点映射到低维空间中的向量表示来学习图的全局表示。GREAT通常使用特征工程和优化算法来生成节点的嵌入。

### Code Representation

在BUGLAB中，代码被视为一个图结构，其中包含实体（Entities）和关系（Relations）。实体可以是变量、函数、语法节点等，而关系则描述了这些实体之间的相互作用，例如调用、赋值等。

- **实体（Entities）**：代表代码中的各种元素，如变量名、函数名、语法节点等，如：

	- **Token**：代码中的单个字符或词，如关键字、变量名、操作符等。
	- **SyntaxNode**：抽象语法树（AST）中的节点，代表代码的结构元素，如函数定义、循环、条件语句等。
	- **Symbol**：程序中的符号，如变量、函数、类等。
	- **Type**：由类型推断系统推断出的变量或表达式的类型。

- **关系（Relations）**：描述实体之间的连接，例如一个变量被另一个函数调用，如：

	- **NextToken**：连接连续的Token节点。
	- **SyntaxChild**：连接父SyntaxNode和它的子SyntaxNode或Token。
	- **SyntaxNextSibling**：连接具有兄弟关系的相邻SyntaxNode。
	- **Type**：连接Symbol和它的类型。
	- **CallDoc**：连接方法调用和相关的文档字符串。
	- **ControlFlowNext**：连接控制流中的语句，如一个语句执行后可能跳转到的下一个语句。
	- **AssignedFrom**：连接赋值目标和赋值源。
	- **ReturnsFrom**：连接函数定义和它包含的返回语句。
	- **OccurrenceOf**：连接变量的使用和它所引用的Symbol。

	![PYBUGLAB_rewrites](Self-Supervised%20Bug%20Detection%20and%20Repair.assets/PYBUGLAB_rewrites.png)

- **上下文化（Contextualization）**

	为了捕捉实体之间的上下文信息，神经网络模型（如GNN或GREAT）会使用嵌入向量来计算实体的最终表示。这通常涉及到聚合邻居节点的信息。在GNN中，这可以通过消息传递机制实现，而在GREAT中，这涉及到自注意力机制。

- **投影函数（Projection Function）**

	投影函数 $P_{tok}$ 用于将实体和关系映射到一个序列，这个序列包含了所有Token实体和它们在关系中的映射。这个序列用于后续的神经网络处理。具体来说，投影函数接受实体集合 *V* 和关系集合 *E*，并返回一个Token实体的序列 $V_{tok}$，以及这些Token实体在关系中的映射 $E_{tok}$。

- **嵌入函数（Embedding Function）**

	嵌入函数 $e(v_i)$ 用于将每个实体的内容映射到一个初始的D维向量。这个向量是实体在神经网络中的表示。例如，对于一个Token实体，它的嵌入向量可以通过以下方式获得：

	1. 将Token字符串表示分割成子Token（Subtokens）。
	2. 对每个子Token应用一个预训练的嵌入矩阵，得到子Token的嵌入向量。
	3. 使用最大池化（Max Pooling）来聚合所有子Token的嵌入向量，得到最终的Token嵌入向量。
	4. 公式化为：
		+ $e(v_i)=MaxPool({e_{subtoken}(v_i)})$ 其中，$e_{subtoken}(v_i)$ 是子Token的嵌入向量，MaxPool 是最大池化操作。
		+ 对于关系 *R* 中的每个边 $(v_i,r,v_j)$，我们可能有一个关系嵌入向量 $e_r$，它与实体的嵌入向量一起用于表示整个图结构。
		+ 在GNN中，节点的最终表示 $h(v_i)$ 可以通过聚合邻居节点的表示来获得： $h(v_i)=Aggregation({h(v_j)∣(v_i,v_j)∈E})$ 其中，Aggregation 是聚合函数，如求和、求平均或使用更复杂的聚合策略。

### Probabilistic Code Rewriting Models

> 代码重写概率模型：用于预测在代码的特定位置应用特定重写规则的概率。

代码重写概率模型由两个主要部分组成：

1. **位置预测（Localization）**：
	- 这部分模型的目标是确定代码中哪些位置可能存在bug。它预测一个位置 ℓ 是否应该被修改，即是否存在bug。
	- 位置预测模型可以表示为一个概率分布 $p_{loc}(ℓ∣s,R^R_s)$，它给出了在给定代码 *s* 和重写规则集合 $R^R_s$ 的情况下，位置 ℓ 被选中的概率。
2. **重写给定位置（Rewrite-Given-Location）**：
	- 一旦确定了潜在的bug位置，这部分模型需要预测在该位置应用哪个重写规则 *ρ*。
	- 给定位置 ℓ，模型预测应用重写规则 *ρ* 的概率 $p_{rew}(ρ∣ℓ,s,R^R_s)$。

#### 概率模型的计算

在BUGLAB中，这两个概率模型通常被组合起来，形成一个联合概率模型，用于预测在给定代码 *s* 和重写规则集合 $R^R_s$ 的情况下，应用特定重写规则 ⟨ℓ,*ρ*⟩ 的概率：

$p(⟨ℓ,ρ⟩∣s,R^R_s)=p_{loc}(ℓ∣s,R^R_s)⋅p_{rew}(ρ∣ℓ,s,R^R_s)$

#### 训练过程

在训练过程中，bug选择器和bug检测器会使用这个联合概率模型：

- **bug选择器**：尝试生成那些使得bug检测器损失最大化的bug。它会根据这个概率模型选择难以检测的bug位置和重写规则。
- **bug检测器**：尝试最小化在修复bug时的损失。它会学习如何准确地预测bug的位置和正确的重写规则。

## A Python Implementation

> BUGLAB系统在Python语言上的实现，即PYBUGLAB。其专注于处理所谓的“简单愚蠢的bug”，这些bug通常容易被开发者忽略，但修复后能显著提高代码质量。

### Bug-Inducing PYBUGLAB Rewrite Rules

这部分讨论了PYBUGLAB如何通过重写规则来引入bug。这些规则专注于四种常见的bug类型：

1. **变量误用（Variable Misuse）**：这涉及到在代码中错误地使用变量。例如，将一个变量与另一个不相关的变量交换。
2. **参数交换（Argument Swapping）**：在函数调用中交换参数的顺序，这可能导致函数行为不正确。
3. **错误的运算符（Wrong Operator）**：使用错误的比较运算符，如将小于号（`<`）错误地替换为大于号（`>`）。
4. **错误的字面量（Wrong Literal）**：在代码中错误地使用字面量，如将整数`1`替换为`0`。

### PYBUGLAB Rewrite Rules for Data Augmentation

这部分描述了PYBUGLAB如何使用额外的重写规则来增强数据集，以提高模型的泛化能力。这些规则不改变程序的语义，但可以模拟代码的自然变化：

1. **变量重命名（Variable Renaming）**：将局部变量重命名为不在当前作用域中的新名称。这种变化不会改变代码的逻辑，但会改变代码的表示。
2. **注释删除（Comment Deletion）**：移除代码中的注释，包括文档字符串（docstrings）和内联注释。注释通常包含自然语言信息，有助于代码理解，但通常不影响程序的执行。
3. **比较表达式镜像（Comparison Expression Mirroring）**：交换比较表达式的两边，并适当地调整比较运算符。例如，将 `a < b` 转换为 `b > a`。
4. **if-else 分支交换（If-Else Branch Swapping）**：使用德摩根定律（DeMorgan's Law）否定if-else语句的测试条件，并交换then和else分支的代码块。

###  Implementation Details

为了使训练过程计算可行，PYBUGLAB使用了两个不断更新的训练数据池，一个用于bug检测器，另一个用于bug选择器。每个训练步骤从当前状态的数据池中采样一个小批量（minibatch）。

PYBUGLAB的训练过程被实现为一组异步通信的进程。所有描述的步骤都并行发生。在训练过程中，定期（在单独的并发进程中）对当前状态的D（检测器）和S（选择器）模型进行快照，以生成新的元素，这些元素随后被更新到数据池中。

为了近似训练目标，PYBUGLAB在训练选择器模型时，会根据检测器模型在上一轮训练中的损失来识别最难检测的样本，并训练选择器模型以产生这样的样本。

## Evaluation

> 此处贴上论文结果评估，复现时根据结果在进行总结修改

### 定量评估

- **训练策略**：研究者们比较了四种不同的训练策略：全监督学习（在随机插入bug的固定数据集上训练bug检测器）、随机选择器（使用随机选择重写规则的bug选择器模型）、PYBUGLAB（使用自监督框架训练的模型）以及PYBUGLAB +Aug（使用数据增强的PYBUGLAB模型）。

- **性能指标**：评估了模型在预测完整bug修复（Joint）、定位bug位置（Loc）以及选择正确的修复重写（Repair）方面的准确性。

- **结果**：PYBUGLAB和PYBUGLAB +Aug在RANDOMBUGS和PYPIBUGS测试集上的性能优于其他训练策略。这表明PYBUGLAB训练框架能够产生更精确的bug检测器。

	![evaluation1](Self-Supervised%20Bug%20Detection%20and%20Repair.assets/evaluation1.png)

### 定性分析

- **警告的检查**：研究者们对PYBUGLAB在PyPI包中发现的警告进行了定性分析。他们发现，虽然PYBUGLAB能够检测到一些真实的bug，但也产生了许多假阳性（false positives）。
- **bug类型分析**：研究者们还分析了PYBUGLAB在不同类型bug上的表现。他们发现，检测和修复真实世界bug比处理随机插入的bug要困难得多。

## Model Architecture

### 代码表示

首先，代码被表示为一个图结构，其中包含实体（如变量、函数）和它们之间的关系。这些实体和关系是从Python代码的抽象语法树（AST）中提取的。例如，实体可以是语法节点（SyntaxNodes）、标记（Tokens）和符号（Symbols），而关系可以是控制流（ControlFlowNext）、赋值（AssignedFrom）等。

### GNN架构

PYBUGLAB使用了图神经网络（GNN）来处理代码的图表示。GNN通过消息传递机制来更新图中每个节点的表示。这个过程涉及到以下几个关键步骤：

1. **嵌入函数（Embedding Function）**：将每个实体（如Token）的内容映射到一个初始的D维向量。这通常涉及到对Token进行子Token化，然后通过嵌入矩阵得到子Token的向量表示，最后通过最大池化（Max Pooling）来聚合这些向量。
2. **消息传递（Message Passing）**：在GNN的每一层，节点会接收来自其邻居节点的信息，并结合自己的特征来更新自己的表示。这个过程通常涉及到线性变换和非线性激活函数。
3. **更新函数（Update Function）**：节点的最终表示是通过聚合邻居节点的信息和自身的特征来计算的。这通常涉及到一个或多个全连接层（Fully Connected Layers）。

### GREAT架构

PYBUGLAB还使用了GREAT（Global Relational Transformers）模型，这是一种基于Transformer的架构，专门用于处理代码中的全局关系。GREAT通过自注意力机制来捕捉代码中不同部分之间的全局关系。这允许模型在处理代码时考虑到整个代码库的上下文信息。

### 训练过程

在训练过程中，PYBUGLAB的模型会学习如何根据代码的图表示来预测bug的位置和修复方法。这涉及到训练模型以最小化在修复bug时的损失。模型的训练是通过对抗性训练进行的，其中bug选择器模型试图生成难以检测的bug，而bug检测器模型则试图准确地识别和修复这些bug。

### 实现细节

PYBUGLAB的模型实现考虑了Python语言的特性，如动态类型和丰富的语法结构。模型的训练和评估使用了PyTorch框架，并且模型的参数通过反向传播和梯度下降方法进行优化。
