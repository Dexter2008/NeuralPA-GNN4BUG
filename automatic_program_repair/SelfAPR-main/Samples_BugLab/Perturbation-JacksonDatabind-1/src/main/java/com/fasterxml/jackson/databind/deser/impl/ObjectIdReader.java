[BugLab_Variable_Misuse]^idType = idType;^44^^^^^41^49^idType = t;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Variable_Misuse]^idProperty = idProperty;^48^^^^^41^49^idProperty = idProp;^[CLASS] ObjectIdReader  [METHOD] <init> [RETURN_TYPE] SettableBeanProperty)   JavaType t String propName ObjectIdGenerator<?> gen JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Variable_Misuse]^return new ObjectIdReader ( t, propName, generator, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Variable_Misuse]^return new ObjectIdReader ( idType, propertyName, generator, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Variable_Misuse]^return new ObjectIdReader ( idType, propName, generator, deser, idProperty ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( idProp, propName, generator, deser, idType ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( idType, generator, propName, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( generator, propName, idType, deser, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( deser, propName, generator, idType, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( idType, propName, idProp, deser, generator ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( idType, idProp, generator, deser, propName ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( idType, propName, deser, generator, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return new ObjectIdReader ( idType, deser, generator, propName, idProp ) ;^60^^^^^56^61^return new ObjectIdReader ( idType, propName, generator, deser, idProp ) ;^[CLASS] ObjectIdReader  [METHOD] construct [RETURN_TYPE] ObjectIdReader   JavaType idType String propName ObjectIdGenerator<?> generator JsonDeserializer<?> deser SettableBeanProperty idProp [VARIABLES] JavaType  idType  t  ObjectIdGenerator  gen  generator  boolean  SettableBeanProperty  idProp  idProperty  String  propName  propertyName  JsonDeserializer  deser  deserializer  long  serialVersionUID  