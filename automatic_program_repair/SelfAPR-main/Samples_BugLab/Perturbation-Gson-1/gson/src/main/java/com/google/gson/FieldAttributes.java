[BugLab_Variable_Misuse]^name = field.getName (  ) ;^62^^^^^59^67^name = f.getName (  ) ;^[CLASS] FieldAttributes  [METHOD] <init> [RETURN_TYPE] Field)   Class<?> declaringClazz Field f [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  int  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^declaredType = field.getType (  ) ;^63^^^^^59^67^declaredType = f.getType (  ) ;^[CLASS] FieldAttributes  [METHOD] <init> [RETURN_TYPE] Field)   Class<?> declaringClazz Field f [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  int  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^isSynthetic = field.isSynthetic (  ) ;^64^^^^^59^67^isSynthetic = f.isSynthetic (  ) ;^[CLASS] FieldAttributes  [METHOD] <init> [RETURN_TYPE] Field)   Class<?> declaringClazz Field f [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  int  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^modifiers = field.getModifiers (  ) ;^65^^^^^59^67^modifiers = f.getModifiers (  ) ;^[CLASS] FieldAttributes  [METHOD] <init> [RETURN_TYPE] Field)   Class<?> declaringClazz Field f [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  int  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^field = field;^66^^^^^59^67^field = f;^[CLASS] FieldAttributes  [METHOD] <init> [RETURN_TYPE] Field)   Class<?> declaringClazz Field f [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  int  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Literal]^final int defaultMaxCacheSize = 2001;^70^^^^^69^78^final int defaultMaxCacheSize = 2000;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^return Integer.parseInt ( name ) ;^74^^^^^69^78^return Integer.parseInt ( propertyValue ) ;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( modifiers )  ) ;^72^73^^^^69^78^String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Argument_Swapping]^String propertyValue = System.getProperty ( defaultMaxCacheSize, String.valueOf ( MAX_CACHE_PROPERTY_NAME )  ) ;^72^73^^^^69^78^String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^String propertyValue = System.getProperty ( propertyValue, String.valueOf ( defaultMaxCacheSize )  ) ;^72^73^^^^69^78^String propertyValue = System.getProperty ( MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^MAX_CACHE_PROPERTY_NAME, String.valueOf ( modifiers )  ) ;^73^^^^^69^78^MAX_CACHE_PROPERTY_NAME, String.valueOf ( defaultMaxCacheSize )  ) ;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^return modifiers;^76^^^^^69^78^return defaultMaxCacheSize;^[CLASS] FieldAttributes  [METHOD] getMaxCacheSize [RETURN_TYPE] int   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  NumberFormatException  e  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^return propertyValue;^91^^^^^90^92^return name;^[CLASS] FieldAttributes  [METHOD] getName [RETURN_TYPE] String   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Operator]^if  ( genericType != null )  {^111^^^^^110^115^if  ( genericType == null )  {^[CLASS] FieldAttributes  [METHOD] getDeclaredType [RETURN_TYPE] Type   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^genericType = f.getGenericType (  ) ;^112^^^^^110^115^genericType = field.getGenericType (  ) ;^[CLASS] FieldAttributes  [METHOD] getDeclaredType [RETURN_TYPE] Type   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Operator]^if  ( annotations != null )  {^155^^^^^154^165^if  ( annotations == null )  {^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Wrong_Operator]^if  ( annotations != null )  {^158^^^^^154^165^if  ( annotations == null )  {^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^annotations = Collections.unmodifiableCollection ( Arrays.asList ( f.getAnnotations (  )  )  ) ;^159^160^^^^154^165^annotations = Collections.unmodifiableCollection ( Arrays.asList ( field.getAnnotations (  )  )  ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^Arrays.asList ( f.getAnnotations (  )  )  ) ;^160^^^^^154^165^Arrays.asList ( field.getAnnotations (  )  )  ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Argument_Swapping]^ANNOTATION_CACHE.addElement ( annotations, key ) ;^161^^^^^154^165^ANNOTATION_CACHE.addElement ( key, annotations ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Argument_Swapping]^annotations = key.getElement ( ANNOTATION_CACHE ) ;^157^^^^^154^165^annotations = ANNOTATION_CACHE.getElement ( key ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^Pair<Class<?>, String> key = new Pair<Class<?>, String> ( declaringClazz, propertyValue ) ;^156^^^^^154^165^Pair<Class<?>, String> key = new Pair<Class<?>, String> ( declaringClazz, name ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Argument_Swapping]^Pair<Class<?>, String> key = new Pair<Class<?>, String> ( name, declaringClazz ) ;^156^^^^^154^165^Pair<Class<?>, String> key = new Pair<Class<?>, String> ( declaringClazz, name ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^Pair<Class<?>, String> key = new Pair<Class<?>, String> ( 1, name ) ;^156^^^^^154^165^Pair<Class<?>, String> key = new Pair<Class<?>, String> ( declaringClazz, name ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^ANNOTATION_CACHE.addElement ( key, null ) ;^161^^^^^154^165^ANNOTATION_CACHE.addElement ( key, annotations ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^if  ( null == null )  {^158^^^^^154^165^if  ( annotations == null )  {^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^ANNOTATION_CACHE.addElement ( key, this ) ;^161^^^^^154^165^ANNOTATION_CACHE.addElement ( key, annotations ) ;^[CLASS] FieldAttributes  [METHOD] getAnnotations [RETURN_TYPE] Collection   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifiers  Cache  ANNOTATION_CACHE  Pair  key  
[BugLab_Variable_Misuse]^return  ( defaultMaxCacheSizes & modifier )  != 0;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^return  ( defaultMaxCacheSize & modifier )  != 0;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Argument_Swapping]^return  ( modifierss & modifier )  != 0;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Argument_Swapping]^return  ( modifier & modifiers )  != 0;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Operator]^return  ( modifiers & modifier )  <= 0;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Operator]^return  ( modifiers  |  modifier )  != 0;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Literal]^return  ( modifiers & modifier )  != defaultMaxCacheSize;^178^^^^^177^179^return  ( modifiers & modifier )  != 0;^[CLASS] FieldAttributes  [METHOD] hasModifier [RETURN_TYPE] boolean   int modifier [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Argument_Swapping]^field.set ( value, instance ) ;^189^^^^^188^190^field.set ( instance, value ) ;^[CLASS] FieldAttributes  [METHOD] set [RETURN_TYPE] void   Object instance Object value [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  Object  instance  value  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^return f.get ( instance ) ;^200^^^^^199^201^return field.get ( instance ) ;^[CLASS] FieldAttributes  [METHOD] get [RETURN_TYPE] Object   Object instance [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  Object  instance  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Argument_Swapping]^return instance.get ( field ) ;^200^^^^^199^201^return field.get ( instance ) ;^[CLASS] FieldAttributes  [METHOD] get [RETURN_TYPE] Object   Object instance [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  Object  instance  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Variable_Misuse]^return f;^217^^^^^216^218^return field;^[CLASS] FieldAttributes  [METHOD] getFieldObject [RETURN_TYPE] Field   [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Cache  ANNOTATION_CACHE  
[BugLab_Argument_Swapping]^if  ( annotation.annotationType (  )  == a )  {^224^^^^^221^229^if  ( a.annotationType (  )  == annotation )  {^[CLASS] FieldAttributes  [METHOD] getAnnotationFromArray [RETURN_TYPE] <T   Annotation> annotations Class<T> annotation [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Annotation  a  Cache  ANNOTATION_CACHE  
[BugLab_Wrong_Operator]^if  ( a.annotationType (  )  != annotation )  {^224^^^^^221^229^if  ( a.annotationType (  )  == annotation )  {^[CLASS] FieldAttributes  [METHOD] getAnnotationFromArray [RETURN_TYPE] <T   Annotation> annotations Class<T> annotation [VARIABLES] Field  f  field  Type  genericType  boolean  isSynthetic  Collection  annotations  Class  annotation  declaredType  declaringClazz  String  MAX_CACHE_PROPERTY_NAME  name  propertyValue  int  defaultMaxCacheSize  modifier  modifiers  Annotation  a  Cache  ANNOTATION_CACHE  