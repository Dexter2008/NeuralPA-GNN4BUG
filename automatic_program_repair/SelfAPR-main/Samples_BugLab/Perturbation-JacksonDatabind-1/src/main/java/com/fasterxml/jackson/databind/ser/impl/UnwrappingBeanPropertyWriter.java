[BugLab_Variable_Misuse]^_nameTransformer = _nameTransformer;^34^^^^^32^35^_nameTransformer = unwrapper;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] <init> [RETURN_TYPE] NameTransformer)   BeanPropertyWriter base NameTransformer unwrapper [VARIABLES] NameTransformer  _nameTransformer  unwrapper  BeanPropertyWriter  base  boolean  
[BugLab_Argument_Swapping]^super ( name, base ) ;^39^^^^^37^41^super ( base, name ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] <init> [RETURN_TYPE] SerializedString)   UnwrappingBeanPropertyWriter base NameTransformer transformer SerializedString name [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  SerializedString  name  boolean  UnwrappingBeanPropertyWriter  base  
[BugLab_Variable_Misuse]^_nameTransformer = unwrapper;^40^^^^^37^41^_nameTransformer = transformer;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] <init> [RETURN_TYPE] SerializedString)   UnwrappingBeanPropertyWriter base NameTransformer transformer SerializedString name [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  SerializedString  name  boolean  UnwrappingBeanPropertyWriter  base  
[BugLab_Variable_Misuse]^String oldName = null.getValue (  ) ;^46^^^^^44^53^String oldName = _name.getValue (  ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^String newName = unwrapper.transform ( oldName ) ;^47^^^^^44^53^String newName = transformer.transform ( oldName ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Argument_Swapping]^String newName = oldName.transform ( transformer ) ;^47^^^^^44^53^String newName = transformer.transform ( oldName ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^String newName = transformer.transform ( newName ) ;^47^^^^^44^53^String newName = transformer.transform ( oldName ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^transformer = NameTransformer.chainedTransformer ( unwrapper, _nameTransformer ) ;^50^^^^^44^53^transformer = NameTransformer.chainedTransformer ( transformer, _nameTransformer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^transformer = NameTransformer.chainedTransformer ( transformer, unwrapper ) ;^50^^^^^44^53^transformer = NameTransformer.chainedTransformer ( transformer, _nameTransformer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Argument_Swapping]^transformer = NameTransformer.chainedTransformer ( _nameTransformer, transformer ) ;^50^^^^^44^53^transformer = NameTransformer.chainedTransformer ( transformer, _nameTransformer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^return new UnwrappingBeanPropertyWriter ( this, transformer, new SerializedString ( oldName )  ) ;^52^^^^^44^53^return new UnwrappingBeanPropertyWriter ( this, transformer, new SerializedString ( newName )  ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Argument_Swapping]^return new UnwrappingBeanPropertyWriter ( this, newName, new SerializedString ( transformer )  ) ;^52^^^^^44^53^return new UnwrappingBeanPropertyWriter ( this, transformer, new SerializedString ( newName )  ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^return new UnwrappingBeanPropertyWriter ( this, unwrapper, new SerializedString ( newName )  ) ;^52^^^^^44^53^return new UnwrappingBeanPropertyWriter ( this, transformer, new SerializedString ( newName )  ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] rename [RETURN_TYPE] UnwrappingBeanPropertyWriter   NameTransformer transformer [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  String  newName  oldName  boolean  
[BugLab_Variable_Misuse]^Object value = get ( value ) ;^65^^^^^50^80^Object value = get ( bean ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^if  ( bean == null )  {^66^^^^^51^81^if  ( value == null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( value != null )  {^66^^^^^51^81^if  ( value == null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( ser != null )  {^72^^^^^57^87^if  ( ser == null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( ser != null )  {^76^^^^^61^91^if  ( ser == null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser = _findAndAddDynamic ( prov, cls, map ) ;^77^^^^^62^92^ser = _findAndAddDynamic ( map, cls, prov ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser = _findAndAddDynamic ( map, prov, cls ) ;^77^^^^^62^92^ser = _findAndAddDynamic ( map, cls, prov ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser = _findAndAddDynamic ( cls, map, prov ) ;^77^^^^^62^92^ser = _findAndAddDynamic ( map, cls, prov ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser = cls.serializerFor ( map ) ;^75^^^^^60^90^ser = map.serializerFor ( cls ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^Class<?> cls = bean.getClass (  ) ;^73^^^^^58^88^Class<?> cls = value.getClass (  ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( _suppressableValue == null )  {^80^^^^^65^95^if  ( _suppressableValue != null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^if  ( _suppressableValue == MARKER_FOR_EMPTY )  {^81^^^^^66^96^if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( MARKER_FOR_EMPTY >= _suppressableValue )  {^81^^^^^66^96^if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^} else if  ( _suppressableValue.equals ( bean )  )  {^85^^^^^70^100^} else if  ( _suppressableValue.equals ( value )  )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^} else if  ( value.equals ( _suppressableValue )  )  {^85^^^^^70^100^} else if  ( _suppressableValue.equals ( value )  )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^if  ( ser.isEmpty ( bean )  )  {^82^^^^^67^97^if  ( ser.isEmpty ( value )  )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^if  ( value.isEmpty ( ser )  )  {^82^^^^^67^97^if  ( ser.isEmpty ( value )  )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( MARKER_FOR_EMPTY < _suppressableValue )  {^81^^^^^66^96^if  ( MARKER_FOR_EMPTY == _suppressableValue )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^if  ( value == value )  {^90^^^^^75^105^if  ( value == bean )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^if  ( bean == value )  {^90^^^^^75^105^if  ( value == bean )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( value != bean )  {^90^^^^^75^105^if  ( value == bean )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^_handleSelfReference ( value, ser ) ;^91^^^^^76^106^_handleSelfReference ( bean, ser ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^_handleSelfReference ( ser, bean ) ;^91^^^^^76^106^_handleSelfReference ( bean, ser ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^jgen.writeFieldName ( 2 ) ;^96^^^^^81^111^jgen.writeFieldName ( _name ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( _typeSerializer != null )  {^99^^^^^84^114^if  ( _typeSerializer == null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^ser.serializeWithType ( bean, jgen, prov, _typeSerializer ) ;^102^^^^^99^103^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serializeWithType ( value, prov, jgen, _typeSerializer ) ;^102^^^^^99^103^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serializeWithType ( value, jgen, _typeSerializer, prov ) ;^102^^^^^99^103^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serialize ( prov, jgen, value ) ;^100^^^^^85^115^ser.serialize ( value, jgen, prov ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serialize ( jgen, value, prov ) ;^100^^^^^85^115^ser.serialize ( value, jgen, prov ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serialize ( value, prov, jgen ) ;^100^^^^^85^115^ser.serialize ( value, jgen, prov ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Variable_Misuse]^ser.serializeWithType ( bean, jgen, prov, _typeSerializer ) ;^102^^^^^87^117^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serializeWithType ( _typeSerializer, jgen, prov, value ) ;^102^^^^^87^117^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serializeWithType ( value, prov, jgen, _typeSerializer ) ;^102^^^^^87^117^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Argument_Swapping]^ser.serializeWithType ( prov, jgen, value, _typeSerializer ) ;^102^^^^^87^117^ser.serializeWithType ( value, jgen, prov, _typeSerializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider prov [VARIABLES] NameTransformer  _nameTransformer  transformer  unwrapper  boolean  PropertySerializerMap  map  JsonGenerator  jgen  Object  bean  value  Class  cls  JsonSerializer  ser  SerializerProvider  prov  
[BugLab_Wrong_Operator]^if  ( _serializer == null )  {^111^^^^^108^118^if  ( _serializer != null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] assignSerializer [RETURN_TYPE] void   Object> ser [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JsonSerializer  ser  boolean  
[BugLab_Variable_Misuse]^_serializer = _serializer.unwrappingSerializer ( unwrapper ) ;^116^^^^^108^118^_serializer = _serializer.unwrappingSerializer ( t ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] assignSerializer [RETURN_TYPE] void   Object> ser [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JsonSerializer  ser  boolean  
[BugLab_Argument_Swapping]^_serializer = t.unwrappingSerializer ( _serializer ) ;^116^^^^^108^118^_serializer = _serializer.unwrappingSerializer ( t ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] assignSerializer [RETURN_TYPE] void   Object> ser [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JsonSerializer  ser  boolean  
[BugLab_Variable_Misuse]^NameTransformer t = unwrapper;^112^^^^^108^118^NameTransformer t = _nameTransformer;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] assignSerializer [RETURN_TYPE] void   Object> ser [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JsonSerializer  ser  boolean  
[BugLab_Wrong_Operator]^if  ( _nonTrivialBaseType == null )  {^126^^^^^122^140^if  ( _nonTrivialBaseType != null )  {^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Variable_Misuse]^serializer = provider.findValueSerializer ( 0, this ) ;^130^^^^^122^140^serializer = provider.findValueSerializer ( type, this ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^serializer = type.findValueSerializer ( provider, this ) ;^130^^^^^122^140^serializer = provider.findValueSerializer ( type, this ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^serializer = subtype.findValueSerializer ( provider, this ) ;^128^^^^^122^140^serializer = provider.findValueSerializer ( subtype, this ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^JavaType subtype = _nonTrivialBaseType.constructSpecializedType ( provider, type ) ;^127^^^^^122^140^JavaType subtype = provider.constructSpecializedType ( _nonTrivialBaseType, type ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^JavaType subtype = provider.constructSpecializedType ( type, _nonTrivialBaseType ) ;^127^^^^^122^140^JavaType subtype = provider.constructSpecializedType ( _nonTrivialBaseType, type ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^JavaType subtype = type.constructSpecializedType ( _nonTrivialBaseType, provider ) ;^127^^^^^122^140^JavaType subtype = provider.constructSpecializedType ( _nonTrivialBaseType, type ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^serializer = t.unwrappingSerializer ( serializer ) ;^136^^^^^122^140^serializer = serializer.unwrappingSerializer ( t ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Variable_Misuse]^serializer = serializer.unwrappingSerializer ( unwrapper ) ;^136^^^^^122^140^serializer = serializer.unwrappingSerializer ( t ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^_dynamicSerializers = type.newWith ( _dynamicSerializers, serializer ) ;^138^^^^^122^140^_dynamicSerializers = _dynamicSerializers.newWith ( type, serializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^_dynamicSerializers = _dynamicSerializers.newWith ( serializer, type ) ;^138^^^^^122^140^_dynamicSerializers = _dynamicSerializers.newWith ( type, serializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  
[BugLab_Argument_Swapping]^_dynamicSerializers = serializer.newWith ( type, _dynamicSerializers ) ;^138^^^^^122^140^_dynamicSerializers = _dynamicSerializers.newWith ( type, serializer ) ;^[CLASS] UnwrappingBeanPropertyWriter  [METHOD] _findAndAddDynamic [RETURN_TYPE] JsonSerializer   PropertySerializerMap map Class<?> type SerializerProvider provider [VARIABLES] NameTransformer  _nameTransformer  t  transformer  unwrapper  JavaType  subtype  boolean  PropertySerializerMap  map  Class  type  JsonSerializer  serializer  SerializerProvider  provider  