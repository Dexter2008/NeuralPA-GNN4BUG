[BugLab_Wrong_Literal]^return getClassInfo ( r ) [1];^33^^^^^31^35^return getClassInfo ( r ) [0];^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassName [RETURN_TYPE] String   ClassReader r [VARIABLES] ClassReader  r  EarlyExitException  EARLY_EXIT  boolean  
[BugLab_Variable_Misuse]^if ( signature != null ) {^48^^^^^37^61^if ( superName != null ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Operator]^if ( superName == null ) {^48^^^^^37^61^if ( superName != null ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  signature.replace ( '/', '.' )   ) ;^49^^^^^37^61^array.add (  superName.replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^for ( versionnt i = 0; i < interfaces.length; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^for ( int i = 0; i < version; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^for ( int i = 0; i < interfaces.length.length; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^for ( interfaces.lengthnt i = 0; i < i; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Operator]^for ( int i = 0; i <= interfaces.length; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Literal]^for ( int i = i; i < interfaces.length; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  versionnterfaces[i].replace ( '/', '.' )   ) ;^52^^^^^37^61^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^array.add (  i[i].replace ( '/', '.' )   ) ;^52^^^^^37^61^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^array.add (  interfacesnterfaces[i].replace ( '/', '.' )   ) ;^52^^^^^37^61^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^for ( int i = 0; i < interfaces; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Literal]^for ( int i = access; i < interfaces.length; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^throw e;^55^^^^^37^61^throw EARLY_EXIT;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  superName.replace ( '/', '.' )   ) ;^47^^^^^37^61^array.add (  name.replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Literal]^for ( int i = version; i < interfaces.length; i++   ) {^51^^^^^37^61^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] getClassInfo [RETURN_TYPE] String[]   ClassReader r [VARIABLES] boolean  ClassReader  r  List  array  EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  superName.replace ( '/', '.' )   ) ;^47^^^^^41^56^array.add (  name.replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^if ( signature != null ) {^48^^^^^41^56^if ( superName != null ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Wrong_Operator]^if ( superName == null ) {^48^^^^^41^56^if ( superName != null ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  signature.replace ( '/', '.' )   ) ;^49^^^^^41^56^array.add (  superName.replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^for ( versionnt i = 0; i < interfaces.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^for ( int i = 0; i < version; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Argument_Swapping]^for ( interfaces.lengthnt i = 0; i < i; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Argument_Swapping]^for ( int i = 0; i < interfaces.length.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Wrong_Operator]^for ( int i = 0; i <= interfaces.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Wrong_Literal]^for ( int i = i; i < interfaces.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  versionnterfaces[i].replace ( '/', '.' )   ) ;^52^^^^^41^56^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Argument_Swapping]^array.add (  i[i].replace ( '/', '.' )   ) ;^52^^^^^41^56^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Argument_Swapping]^array.add (  interfacesnterfaces[i].replace ( '/', '.' )   ) ;^52^^^^^41^56^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Wrong_Literal]^for ( int i = version; i < interfaces.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^throw e;^55^^^^^41^56^throw EARLY_EXIT;^[CLASS] ClassNameReader EarlyExitException 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] EarlyExitException  EARLY_EXIT  e  String  name  signature  superName  String[]  interfaces  boolean  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  superName.replace ( '/', '.' )   ) ;^47^^^^^41^56^array.add (  name.replace ( '/', '.' )   ) ;^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^if ( signature != null ) {^48^^^^^41^56^if ( superName != null ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Operator]^if ( superName == null ) {^48^^^^^41^56^if ( superName != null ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  signature.replace ( '/', '.' )   ) ;^49^^^^^41^56^array.add (  superName.replace ( '/', '.' )   ) ;^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^for ( int i = 0; i < version; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^for ( interfaces.lengthnt i = 0; i < i; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^for ( int i = 0; i < interfaces.length.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Operator]^for ( int i = 0; i <= interfaces.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Variable_Misuse]^array.add (  versionnterfaces[i].replace ( '/', '.' )   ) ;^52^^^^^41^56^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^array.add (  i[i].replace ( '/', '.' )   ) ;^52^^^^^41^56^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Argument_Swapping]^array.add (  interfacesnterfaces[i].replace ( '/', '.' )   ) ;^52^^^^^41^56^array.add (  interfaces[i].replace ( '/', '.' )   ) ;^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  
[BugLab_Wrong_Literal]^for ( int i = i; i < interfaces.length; i++   ) {^51^^^^^41^56^for ( int i = 0; i < interfaces.length; i++   ) {^[CLASS] 1  [METHOD] visit [RETURN_TYPE] void   int version int access String name String signature String superName String[] interfaces [VARIABLES] boolean  String  name  signature  superName  String[]  interfaces  int  access  i  version  