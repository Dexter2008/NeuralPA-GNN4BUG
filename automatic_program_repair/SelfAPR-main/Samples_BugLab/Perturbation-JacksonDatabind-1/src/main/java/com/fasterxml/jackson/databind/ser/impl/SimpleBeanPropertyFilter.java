[BugLab_Argument_Swapping]^HashSet<String> properties = new HashSet<String> ( propertyArray.length.length ) ;^37^^^^^36^40^HashSet<String> properties = new HashSet<String> ( propertyArray.length ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] filterOutAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Argument_Swapping]^HashSet<String> properties = new HashSet<String> ( propertyArray ) ;^37^^^^^36^40^HashSet<String> properties = new HashSet<String> ( propertyArray.length ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] filterOutAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Argument_Swapping]^Collections.addAll ( propertyArray, properties ) ;^38^^^^^36^40^Collections.addAll ( properties, propertyArray ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] filterOutAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Variable_Misuse]^return new FilterExceptFilter ( null ) ;^39^^^^^36^40^return new FilterExceptFilter ( properties ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] filterOutAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Argument_Swapping]^HashSet<String> properties = new HashSet<String> ( propertyArray.length.length ) ;^47^^^^^46^50^HashSet<String> properties = new HashSet<String> ( propertyArray.length ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] serializeAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Argument_Swapping]^HashSet<String> properties = new HashSet<String> ( propertyArray ) ;^47^^^^^46^50^HashSet<String> properties = new HashSet<String> ( propertyArray.length ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] serializeAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Argument_Swapping]^Collections.addAll ( propertyArray, properties ) ;^48^^^^^46^50^Collections.addAll ( properties, propertyArray ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] serializeAllExcept [RETURN_TYPE] SimpleBeanPropertyFilter    propertyArray [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  String[]  propertyArray  boolean  long  serialVersionUID  HashSet  properties  
[BugLab_Argument_Swapping]^writer.serializeAsField ( provider, jgen, bean ) ;^69^^^^^65^71^writer.serializeAsField ( bean, jgen, provider ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider provider BeanPropertyWriter writer [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  boolean  JsonGenerator  jgen  Object  bean  SerializerProvider  provider  BeanPropertyWriter  writer  long  serialVersionUID  
[BugLab_Argument_Swapping]^writer.serializeAsField ( bean, provider, jgen ) ;^69^^^^^65^71^writer.serializeAsField ( bean, jgen, provider ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] serializeAsField [RETURN_TYPE] void   Object bean JsonGenerator jgen SerializerProvider provider BeanPropertyWriter writer [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  boolean  JsonGenerator  jgen  Object  bean  SerializerProvider  provider  BeanPropertyWriter  writer  long  serialVersionUID  
[BugLab_Argument_Swapping]^writer.depositSchemaProperty ( provider, propertiesNode ) ;^79^^^^^74^81^writer.depositSchemaProperty ( propertiesNode, provider ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] depositSchemaProperty [RETURN_TYPE] void   BeanPropertyWriter writer ObjectNode propertiesNode SerializerProvider provider [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  boolean  ObjectNode  propertiesNode  SerializerProvider  provider  BeanPropertyWriter  writer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return writer.contains ( _propertiesToInclude.getName (  )  ) ;^120^^^^^119^121^return _propertiesToInclude.contains ( writer.getName (  )  ) ;^[CLASS] SimpleBeanPropertyFilter FilterExceptFilter SerializeExceptFilter  [METHOD] include [RETURN_TYPE] boolean   BeanPropertyWriter writer [VARIABLES] Set  _propertiesToExclude  _propertiesToInclude  properties  boolean  BeanPropertyWriter  writer  long  serialVersionUID  
[BugLab_Argument_Swapping]^return writer.contains ( _propertiesToInclude.getName (  )  ) ;^120^^^^^119^121^return _propertiesToInclude.contains ( writer.getName (  )  ) ;^[CLASS] FilterExceptFilter  [METHOD] include [RETURN_TYPE] boolean   BeanPropertyWriter writer [VARIABLES] Set  _propertiesToInclude  properties  boolean  BeanPropertyWriter  writer  long  serialVersionUID  
[BugLab_Variable_Misuse]^return 1.contains ( writer.getName (  )  ) ;^120^^^^^119^121^return _propertiesToInclude.contains ( writer.getName (  )  ) ;^[CLASS] FilterExceptFilter  [METHOD] include [RETURN_TYPE] boolean   BeanPropertyWriter writer [VARIABLES] Set  _propertiesToInclude  properties  boolean  BeanPropertyWriter  writer  long  serialVersionUID  