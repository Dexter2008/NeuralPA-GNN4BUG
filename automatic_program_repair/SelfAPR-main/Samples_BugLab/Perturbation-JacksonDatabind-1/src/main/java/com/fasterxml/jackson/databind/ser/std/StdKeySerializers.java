[BugLab_Wrong_Operator]^if  ( keyType != null )  {^26^^^^^24^45^if  ( keyType == null )  {^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] getStdKeySerializer [RETURN_TYPE] JsonSerializer   JavaType keyType [VARIABLES] JavaType  keyType  Class  cls  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  
[BugLab_Wrong_Operator]^if  ( cls > String.class )  {^30^^^^^24^45^if  ( cls == String.class )  {^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] getStdKeySerializer [RETURN_TYPE] JsonSerializer   JavaType keyType [VARIABLES] JavaType  keyType  Class  cls  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  
[BugLab_Variable_Misuse]^if  ( 0 == Object.class )  {^33^^^^^24^45^if  ( cls == Object.class )  {^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] getStdKeySerializer [RETURN_TYPE] JsonSerializer   JavaType keyType [VARIABLES] JavaType  keyType  Class  cls  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  
[BugLab_Wrong_Operator]^if  ( cls != Object.class )  {^33^^^^^24^45^if  ( cls == Object.class )  {^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] getStdKeySerializer [RETURN_TYPE] JsonSerializer   JavaType keyType [VARIABLES] JavaType  keyType  Class  cls  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  
[BugLab_Variable_Misuse]^return null;^34^^^^^24^45^return DEFAULT_KEY_SERIALIZER;^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] getStdKeySerializer [RETURN_TYPE] JsonSerializer   JavaType keyType [VARIABLES] JavaType  keyType  Class  cls  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  
[BugLab_Argument_Swapping]^provider.defaultSerializeDateKey ( jgen, value ) ;^77^^^^^74^78^provider.defaultSerializeDateKey ( value, jgen ) ;^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] serialize [RETURN_TYPE] void   Date value JsonGenerator jgen SerializerProvider provider [VARIABLES] JsonGenerator  jgen  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  SerializerProvider  provider  Date  value  
[BugLab_Argument_Swapping]^provider.defaultSerializeDateKey ( jgen.getTimeInMillis (  ) , value ) ;^92^^^^^89^93^provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^[CLASS] StdKeySerializers StringKeySerializer DateKeySerializer CalendarKeySerializer  [METHOD] serialize [RETURN_TYPE] void   Calendar value JsonGenerator jgen SerializerProvider provider [VARIABLES] JsonGenerator  jgen  JsonSerializer  DEFAULT_KEY_SERIALIZER  DEFAULT_STRING_SERIALIZER  instance  boolean  SerializerProvider  provider  Calendar  value  
[BugLab_Argument_Swapping]^provider.defaultSerializeDateKey ( jgen, value ) ;^77^^^^^74^78^provider.defaultSerializeDateKey ( value, jgen ) ;^[CLASS] DateKeySerializer  [METHOD] serialize [RETURN_TYPE] void   Date value JsonGenerator jgen SerializerProvider provider [VARIABLES] JsonGenerator  jgen  JsonSerializer  instance  boolean  SerializerProvider  provider  Date  value  
[BugLab_Argument_Swapping]^provider.defaultSerializeDateKey ( jgen.getTimeInMillis (  ) , value ) ;^92^^^^^89^93^provider.defaultSerializeDateKey ( value.getTimeInMillis (  ) , jgen ) ;^[CLASS] CalendarKeySerializer  [METHOD] serialize [RETURN_TYPE] void   Calendar value JsonGenerator jgen SerializerProvider provider [VARIABLES] JsonGenerator  jgen  JsonSerializer  instance  boolean  SerializerProvider  provider  Calendar  value  