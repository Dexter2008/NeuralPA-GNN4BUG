[BugLab_Variable_Misuse]^child = parent.getFirstChild (  ) .getNext (  ) ;^50^^^^^46^74^child = n.getFirstChild (  ) .getNext (  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^child = NodeUtil.getLoopCodeBlock ( parent ) ;^55^^^^^46^74^child = NodeUtil.getLoopCodeBlock ( n ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^switch  ( parent.getType (  )  )  {^48^^^^^46^74^switch  ( n.getType (  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^if  (  ( parent.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^65^^^^^46^74^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildreparent (  )  )  )  {^65^^^^^46^74^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^if  (  ( child.getType (  )  == Token.4 )  &&  ( !child.hasChildren (  )  )  )  {^65^^^^^46^74^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Wrong_Operator]^if  (  ( child.getType (  )  == Token.BLOCK )  ||  ( !child.hasChildren (  )  )  )  {^65^^^^^46^74^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Wrong_Operator]^if  (  ( child.getType (  )  != Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^65^^^^^46^74^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^if  ( parent.wasEmptyNode (  )  )  {^68^^^^^46^74^if  ( child.wasEmptyNode (  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^t.getCompiler (  ) .report ( JSError.make ( t, parent, level, SUSPICIOUS_SEMICOLON )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^t.getCompiler (  ) .report ( JSError.make ( level, n, t, SUSPICIOUS_SEMICOLON )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^t.getCompiler (  ) .report ( JSError.make ( t, level, n, SUSPICIOUS_SEMICOLON )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^t.getCompiler (  ) .report ( JSError.make ( t, SUSPICIOUS_SEMICOLON, level, n )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^JSError.make ( t, parent, level, SUSPICIOUS_SEMICOLON )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^JSError.make ( SUSPICIOUS_SEMICOLON, n, level, t )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^JSError.make ( t, level, n, SUSPICIOUS_SEMICOLON )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^JSError.make ( t, n, SUSPICIOUS_SEMICOLON, level )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^t.getCompiler (  ) .report ( JSError.make ( n, t, level, SUSPICIOUS_SEMICOLON )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^t.getCompiler (  ) .report ( JSError.make ( t, n, SUSPICIOUS_SEMICOLON, level )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^JSError.make ( t, SUSPICIOUS_SEMICOLON, level, n )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^JSError.make ( n, t, level, SUSPICIOUS_SEMICOLON )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^for  ( ; parent != null; child = child.getNext (  )  )  {^64^^^^^46^74^for  ( ; child != null; child = child.getNext (  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Variable_Misuse]^for  ( ; child != parentull; child = child.getNext (  )  )  {^64^^^^^46^74^for  ( ; child != null; child = child.getNext (  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^for  ( ; n != childull; child = child.getNext (  )  )  {^64^^^^^46^74^for  ( ; child != null; child = child.getNext (  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Wrong_Operator]^for  ( ; child == null; child = child.getNext (  )  )  {^64^^^^^46^74^for  ( ; child != null; child = child.getNext (  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Wrong_Operator]^if  (  ( child.getType (  )  <= Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^65^^^^^46^74^if  (  ( child.getType (  )  == Token.BLOCK )  &&  ( !child.hasChildren (  )  )  )  {^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^JSError.make ( level, n, t, SUSPICIOUS_SEMICOLON )  ) ;^70^^^^^46^74^JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  
[BugLab_Argument_Swapping]^t.getCompiler (  ) .report ( JSError.make ( SUSPICIOUS_SEMICOLON, n, level, t )  ) ;^69^70^^^^46^74^t.getCompiler (  ) .report ( JSError.make ( t, n, level, SUSPICIOUS_SEMICOLON )  ) ;^[CLASS] CheckAccidentalSemicolon  [METHOD] visit [RETURN_TYPE] void   NodeTraversal t Node n Node parent [VARIABLES] boolean  NodeTraversal  t  DiagnosticType  SUSPICIOUS_SEMICOLON  CheckLevel  level  Node  child  n  parent  