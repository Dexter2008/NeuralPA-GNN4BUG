[BugLab_Argument_Swapping]^super ( type, propertyName, null, contextAnnotations, mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[BugLab_Argument_Swapping]^super ( propertyName, mutator, null, contextAnnotations, type, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[BugLab_Argument_Swapping]^super ( contextAnnotations, type, null, propertyName, mutator, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[BugLab_Argument_Swapping]^super ( mutator, type, null, contextAnnotations, propertyName, false ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[BugLab_Wrong_Literal]^super ( propertyName, type, null, contextAnnotations, mutator, true ) ;^30^^^^^26^32^super ( propertyName, type, null, contextAnnotations, mutator, false ) ;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[BugLab_Variable_Misuse]^_valueId = _valueId;^31^^^^^26^32^_valueId = valueId;^[CLASS] ValueInjector  [METHOD] <init> [RETURN_TYPE] Object)   String propertyName JavaType type Annotations contextAnnotations AnnotatedMember mutator Object valueId [VARIABLES] AnnotatedMember  mutator  Object  _valueId  valueId  JavaType  type  String  propertyName  Annotations  contextAnnotations  boolean  
[BugLab_Variable_Misuse]^return context.findInjectableValue ( _valueId, this, valueId ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[BugLab_Variable_Misuse]^return context.findInjectableValue ( valueId, this, beanInstance ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[BugLab_Argument_Swapping]^return beanInstance.findInjectableValue ( _valueId, this, context ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[BugLab_Argument_Swapping]^return context.findInjectableValue ( beanInstance, this, _valueId ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[BugLab_Argument_Swapping]^return _valueId.findInjectableValue ( context, this, beanInstance ) ;^36^^^^^34^37^return context.findInjectableValue ( _valueId, this, beanInstance ) ;^[CLASS] ValueInjector  [METHOD] findValue [RETURN_TYPE] Object   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[BugLab_Variable_Misuse]^_member.setValue ( valueId, findValue ( context, beanInstance )  ) ;^42^^^^^39^43^_member.setValue ( beanInstance, findValue ( context, beanInstance )  ) ;^[CLASS] ValueInjector  [METHOD] inject [RETURN_TYPE] void   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  
[BugLab_Argument_Swapping]^_member.setValue ( context, findValue ( beanInstance, beanInstance )  ) ;^42^^^^^39^43^_member.setValue ( beanInstance, findValue ( context, beanInstance )  ) ;^[CLASS] ValueInjector  [METHOD] inject [RETURN_TYPE] void   DeserializationContext context Object beanInstance [VARIABLES] DeserializationContext  context  Object  _valueId  beanInstance  valueId  boolean  