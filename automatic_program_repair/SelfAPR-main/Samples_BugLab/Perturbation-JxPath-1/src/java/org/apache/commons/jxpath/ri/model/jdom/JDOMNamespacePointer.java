[BugLab_Variable_Misuse]^this.prefix = namespaceURI;^34^^^^^32^35^this.prefix = prefix;^[CLASS] JDOMNamespacePointer  [METHOD] <init> [RETURN_TYPE] String)   NodePointer parent String prefix [VARIABLES] String  namespaceURI  prefix  NodePointer  parent  boolean  
[BugLab_Variable_Misuse]^this.prefix = namespaceURI;^43^^^^^37^45^this.prefix = prefix;^[CLASS] JDOMNamespacePointer  [METHOD] <init> [RETURN_TYPE] String)   NodePointer parent String prefix String namespaceURI [VARIABLES] String  namespaceURI  prefix  NodePointer  parent  boolean  
[BugLab_Variable_Misuse]^this.namespaceURI = prefix;^44^^^^^37^45^this.namespaceURI = namespaceURI;^[CLASS] JDOMNamespacePointer  [METHOD] <init> [RETURN_TYPE] String)   NodePointer parent String prefix String namespaceURI [VARIABLES] String  namespaceURI  prefix  NodePointer  parent  boolean  
[BugLab_Variable_Misuse]^return new QName ( namespaceURI ) ;^48^^^^^47^49^return new QName ( prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] getName [RETURN_TYPE] QName   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^return true;^56^^^^^55^57^return false;^[CLASS] JDOMNamespacePointer  [METHOD] isCollection [RETURN_TYPE] boolean   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^return 2;^60^^^^^59^61^return 1;^[CLASS] JDOMNamespacePointer  [METHOD] getLength [RETURN_TYPE] int   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^if  ( prefix == null )  {^68^^^^^67^72^if  ( namespaceURI == null )  {^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( namespaceURI != null )  {^68^^^^^67^72^if  ( namespaceURI == null )  {^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^namespaceURI = parent.getNamespaceURI ( namespaceURI ) ;^69^^^^^67^72^namespaceURI = parent.getNamespaceURI ( prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Argument_Swapping]^namespaceURI = prefix.getNamespaceURI ( parent ) ;^69^^^^^67^72^namespaceURI = parent.getNamespaceURI ( prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^namespaceURI = 0.getNamespaceURI ( prefix ) ;^69^^^^^67^72^namespaceURI = parent.getNamespaceURI ( prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^return prefix;^71^^^^^67^72^return namespaceURI;^[CLASS] JDOMNamespacePointer  [METHOD] getNamespaceURI [RETURN_TYPE] String   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^return false;^75^^^^^74^76^return true;^[CLASS] JDOMNamespacePointer  [METHOD] isLeaf [RETURN_TYPE] boolean   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( parent == null )  {^87^^^^^85^97^if  ( parent != null )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( buffer.length (  )  == 0 && buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( buffer.length (  )  > 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  <= '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )   >  1 )  != '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^if  ( buffer.length (  )  == -1 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )   )  != '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^|| buffer.charAt ( buffer.length (  )   <  1 )  != '/' )  {^90^^^^^85^97^|| buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^|| buffer.charAt ( buffer.length (  )   )  != '/' )  {^90^^^^^85^97^|| buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  >= '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )   &&  1 )  != '/' )  {^89^90^^^^85^97^if  ( buffer.length (  )  == 0 || buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^buffer.append ( 2.asPath (  )  ) ;^88^^^^^85^97^buffer.append ( parent.asPath (  )  ) ;^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^|| buffer.charAt ( buffer.length (  )   &  1 )  != '/' )  {^90^^^^^85^97^|| buffer.charAt ( buffer.length (  )  - 1 )  != '/' )  {^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^buffer.append ( namespaceURI ) ;^95^^^^^85^97^buffer.append ( prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^return namespaceURI.hashCode (  ) ;^100^^^^^99^101^return prefix.hashCode (  ) ;^[CLASS] JDOMNamespacePointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( object != this )  {^104^^^^^103^114^if  ( object == this )  {^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^return false;^105^^^^^103^114^return true;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Operator]^if  ( ! ( object  <  JDOMNamespacePointer )  )  {^108^^^^^103^114^if  ( ! ( object instanceof JDOMNamespacePointer )  )  {^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^return true;^109^^^^^103^114^return false;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^return namespaceURI.equals ( other.prefix ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Variable_Misuse]^return prefix.equals ( namespaceURI ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Argument_Swapping]^return other.equals ( prefix.prefix ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Argument_Swapping]^return other.prefix.equals ( prefix ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Argument_Swapping]^return prefix.equals ( other ) ;^113^^^^^103^114^return prefix.equals ( other.prefix ) ;^[CLASS] JDOMNamespacePointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  JDOMNamespacePointer  other  String  namespaceURI  prefix  boolean  
[BugLab_Wrong_Literal]^return ;^121^^^^^116^122^return 0;^[CLASS] JDOMNamespacePointer  [METHOD] compareChildNodePointers [RETURN_TYPE] int   NodePointer pointer1 NodePointer pointer2 [VARIABLES] String  namespaceURI  prefix  NodePointer  pointer1  pointer2  boolean  