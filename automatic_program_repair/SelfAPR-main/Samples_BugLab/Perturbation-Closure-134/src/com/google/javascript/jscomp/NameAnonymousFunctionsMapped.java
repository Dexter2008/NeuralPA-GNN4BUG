[BugLab_Wrong_Literal]^private int bytesUsed = 1;^56^^^^^51^61^private int bytesUsed = 0;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer   [VARIABLES] 
[BugLab_Variable_Misuse]^NodeTraversal.traverse ( compiler, externs, namingCallback ) ;^69^^^^^66^75^NodeTraversal.traverse ( compiler, root, namingCallback ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^NodeTraversal.traverse ( root, compiler, namingCallback ) ;^69^^^^^66^75^NodeTraversal.traverse ( compiler, root, namingCallback ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^NodeTraversal.traverse ( compiler, namingCallback, root ) ;^69^^^^^66^75^NodeTraversal.traverse ( compiler, root, namingCallback ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^logger.info ( "Named " + bytesUsed + " anon functions using " + bytesUsed + " bytes" ) ;^70^71^^^^66^75^logger.info ( "Named " + namedCount + " anon functions using " + bytesUsed + " bytes" ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^logger.info ( "Named " + bytesUsed + " anon functions using " + namedCount + " bytes" ) ;^70^71^^^^66^75^logger.info ( "Named " + namedCount + " anon functions using " + bytesUsed + " bytes" ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Wrong_Operator]^logger.info ( "Named "  >=  namedCount + " anon functions using " + bytesUsed + " bytes" ) ;^70^71^^^^66^75^logger.info ( "Named " + namedCount + " anon functions using " + bytesUsed + " bytes" ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Wrong_Operator]^if  ( namedCount >= 0 )  {^72^^^^^66^75^if  ( namedCount > 0 )  {^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Wrong_Literal]^if  ( namedCount > -1 )  {^72^^^^^66^75^if  ( namedCount > 0 )  {^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] process [RETURN_TYPE] void   Node externs Node root [VARIABLES] AbstractCompiler  compiler  boolean  AnonymousFunctionNamingCallback  namingCallback  Node  externs  root  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^String newName = renameMap.get ( PREFIX_STRING ) ;^101^^^^^99^109^String newName = renameMap.get ( name ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^String newName = 0.get ( name ) ;^101^^^^^99^109^String newName = renameMap.get ( name ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^String newName = name.get ( renameMap ) ;^101^^^^^99^109^String newName = renameMap.get ( name ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^String newName = renameMap.get ( newName ) ;^101^^^^^99^109^String newName = renameMap.get ( name ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^if  ( name == null )  {^102^^^^^99^109^if  ( newName == null )  {^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Wrong_Operator]^if  ( newName != null )  {^102^^^^^99^109^if  ( newName == null )  {^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^renameMap.put ( newName, newName ) ;^104^^^^^99^109^renameMap.put ( name, newName ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^renameMap.put ( name, PREFIX_STRING ) ;^104^^^^^99^109^renameMap.put ( name, newName ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^renameMap.put ( newName, name ) ;^104^^^^^99^109^renameMap.put ( name, newName ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^fnNameNode.setString ( name ) ;^106^^^^^99^109^fnNameNode.setString ( newName ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^bytesUsed += name.length (  ) ;^108^^^^^99^109^bytesUsed += newName.length (  ) ;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] AbstractCompiler  compiler  boolean  Node  fnNameNode  fnNode  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  name  newName  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^return rhs + DELIMITER + rhs;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] AbstractCompiler  compiler  boolean  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  lhs  name  newName  rhs  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^return lhs + DELIMITER + newName;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] AbstractCompiler  compiler  boolean  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  lhs  name  newName  rhs  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^return rhs + DELIMITER + lhs;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] AbstractCompiler  compiler  boolean  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  lhs  name  newName  rhs  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Argument_Swapping]^return DELIMITER + lhs + rhs;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] AbstractCompiler  compiler  boolean  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  lhs  name  newName  rhs  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Wrong_Operator]^return lhs  &&  DELIMITER + rhs;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] NameAnonymousFunctionsMapped MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] AbstractCompiler  compiler  boolean  char  DELIMITER  PREFIX  NameGenerator  nameGenerator  String  PREFIX_STRING  lhs  name  newName  rhs  Logger  logger  Map  renameMap  int  bytesUsed  namedCount  
[BugLab_Variable_Misuse]^Node fnNameNode = fnNameNode.getFirstChild (  ) ;^100^^^^^99^109^Node fnNameNode = fnNode.getFirstChild (  ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Argument_Swapping]^String newName = name.get ( renameMap ) ;^101^^^^^99^109^String newName = renameMap.get ( name ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Variable_Misuse]^String newName = renameMap.get ( newName ) ;^101^^^^^99^109^String newName = renameMap.get ( name ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Wrong_Operator]^if  ( newName != null )  {^102^^^^^99^109^if  ( newName == null )  {^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Argument_Swapping]^renameMap.put ( newName, name ) ;^104^^^^^99^109^renameMap.put ( name, newName ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Variable_Misuse]^renameMap.put ( name, name ) ;^104^^^^^99^109^renameMap.put ( name, newName ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Variable_Misuse]^fnNameNode.setString ( name ) ;^106^^^^^99^109^fnNameNode.setString ( newName ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Variable_Misuse]^bytesUsed += name.length (  ) ;^108^^^^^99^109^bytesUsed += newName.length (  ) ;^[CLASS] MappedFunctionNamer  [METHOD] setFunctionName [RETURN_TYPE] void   String name Node fnNode [VARIABLES] char  DELIMITER  String  name  newName  boolean  Node  fnNameNode  fnNode  
[BugLab_Argument_Swapping]^return rhs + DELIMITER + lhs;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] char  DELIMITER  String  lhs  rhs  boolean  
[BugLab_Argument_Swapping]^return lhs + rhs + DELIMITER;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] char  DELIMITER  String  lhs  rhs  boolean  
[BugLab_Wrong_Operator]^return lhs  &  DELIMITER + rhs;^113^^^^^112^114^return lhs + DELIMITER + rhs;^[CLASS] MappedFunctionNamer  [METHOD] getCombinedName [RETURN_TYPE] String   String lhs String rhs [VARIABLES] char  DELIMITER  String  lhs  rhs  boolean  