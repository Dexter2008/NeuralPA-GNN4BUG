[BugLab_Variable_Misuse]^_map = _map;^31^^^^^29^32^_map = map;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] <init> [RETURN_TYPE] JsonSerializerMap)   JsonSerializerMap map [VARIABLES] JsonSerializerMap  _map  map  TypeKey  _cacheKey  boolean  
[BugLab_Variable_Misuse]^return new ReadOnlyClassToSerializerMap ( map ) ;^36^^^^^34^37^return new ReadOnlyClassToSerializerMap ( _map ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] instance [RETURN_TYPE] ReadOnlyClassToSerializerMap   [VARIABLES] JsonSerializerMap  _map  map  TypeKey  _cacheKey  boolean  
[BugLab_Wrong_Operator]^if  ( _cacheKey != null )  {^51^^^^^49^57^if  ( _cacheKey == null )  {^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Literal]^_cacheKey = new TypeKey ( type, false ) ;^52^^^^^49^57^_cacheKey = new TypeKey ( type, true ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Variable_Misuse]^return map.find ( _cacheKey ) ;^56^^^^^49^57^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Argument_Swapping]^return _cacheKey.find ( _map ) ;^56^^^^^49^57^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Operator]^if  ( _cacheKey != null )  {^61^^^^^59^67^if  ( _cacheKey == null )  {^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Literal]^_cacheKey = new TypeKey ( cls, false ) ;^62^^^^^59^67^_cacheKey = new TypeKey ( cls, true ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Variable_Misuse]^return map.find ( _cacheKey ) ;^66^^^^^59^67^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Argument_Swapping]^return _cacheKey.find ( _map ) ;^66^^^^^59^67^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] typedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Operator]^if  ( _cacheKey != null )  {^71^^^^^69^77^if  ( _cacheKey == null )  {^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Literal]^_cacheKey = new TypeKey ( type, true ) ;^72^^^^^69^77^_cacheKey = new TypeKey ( type, false ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Variable_Misuse]^return map.find ( _cacheKey ) ;^76^^^^^69^77^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Argument_Swapping]^return _cacheKey.find ( _map ) ;^76^^^^^69^77^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   JavaType type [VARIABLES] TypeKey  _cacheKey  JavaType  type  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Operator]^if  ( _cacheKey != null )  {^81^^^^^79^87^if  ( _cacheKey == null )  {^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Wrong_Literal]^_cacheKey = new TypeKey ( cls, true ) ;^82^^^^^79^87^_cacheKey = new TypeKey ( cls, false ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Variable_Misuse]^return map.find ( _cacheKey ) ;^86^^^^^79^87^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  
[BugLab_Argument_Swapping]^return _cacheKey.find ( _map ) ;^86^^^^^79^87^return _map.find ( _cacheKey ) ;^[CLASS] ReadOnlyClassToSerializerMap  [METHOD] untypedValueSerializer [RETURN_TYPE] JsonSerializer   Class<?> cls [VARIABLES] TypeKey  _cacheKey  Class  cls  boolean  JsonSerializerMap  _map  map  