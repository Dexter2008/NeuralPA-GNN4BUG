[P8_Replace_Mix]^protected  TypeIdResolver _idResolver;^10^^^^^5^15^protected final TypeIdResolver _idResolver;^[CLASS] TypeSerializerBase   [VARIABLES] 
[P8_Replace_Mix]^protected  BeanProperty _property;^12^^^^^7^17^protected final BeanProperty _property;^[CLASS] TypeSerializerBase   [VARIABLES] 
[P5_Replace_Variable]^_idResolver = _idResolver;^16^^^^^14^18^_idResolver = idRes;^[CLASS] TypeSerializerBase  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  boolean  
[P8_Replace_Mix]^_idResolver =  null;^16^^^^^14^18^_idResolver = idRes;^[CLASS] TypeSerializerBase  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  boolean  
[P5_Replace_Variable]^_property = _property;^17^^^^^14^18^_property = property;^[CLASS] TypeSerializerBase  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  boolean  
[P8_Replace_Mix]^_property =  null;^17^^^^^14^18^_property = property;^[CLASS] TypeSerializerBase  [METHOD] <init> [RETURN_TYPE] BeanProperty)   TypeIdResolver idRes BeanProperty property [VARIABLES] TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  boolean  
[P8_Replace_Mix]^public String getPropertyName (  )  { return false; }^24^^^^^19^29^public String getPropertyName (  )  { return null; }^[CLASS] TypeSerializerBase  [METHOD] getPropertyName [RETURN_TYPE] String   [VARIABLES] TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  boolean  
[P5_Replace_Variable]^return idRes.idFromValue ( value ) ;^36^^^^^35^37^return _idResolver.idFromValue ( value ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValue [RETURN_TYPE] String   Object value [VARIABLES] Object  value  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return value.idFromValue ( _idResolver ) ;^36^^^^^35^37^return _idResolver.idFromValue ( value ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValue [RETURN_TYPE] String   Object value [VARIABLES] Object  value  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P14_Delete_Statement]^^36^^^^^35^37^return _idResolver.idFromValue ( value ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValue [RETURN_TYPE] String   Object value [VARIABLES] Object  value  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return idRes.idFromValueAndType ( value, type ) ;^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return _idResolver.idFromValueAndType (  type ) ;^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return _idResolver.idFromValueAndType ( value ) ;^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return _idResolver.idFromValueAndType ( type, value ) ;^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return value.idFromValueAndType ( _idResolver, type ) ;^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P5_Replace_Variable]^return type.idFromValueAndType ( value, _idResolver ) ;^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  
[P14_Delete_Statement]^^40^^^^^39^41^return _idResolver.idFromValueAndType ( value, type ) ;^[CLASS] TypeSerializerBase  [METHOD] idFromValueAndType [RETURN_TYPE] String   Object value Class<?> type [VARIABLES] Object  value  Class  type  boolean  TypeIdResolver  _idResolver  idRes  BeanProperty  _property  property  