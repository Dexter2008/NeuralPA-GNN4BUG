[BugLab_Wrong_Literal]^return createSchemaNode ( "string", false ) ;^33^^^^^31^34^return createSchemaNode ( "string", true ) ;^[CLASS] SqlTimeSerializer  [METHOD] getSchema [RETURN_TYPE] JsonNode   SerializerProvider provider Type typeHint [VARIABLES] Type  typeHint  boolean  SerializerProvider  provider  
[BugLab_Argument_Swapping]^JsonStringFormatVisitor v2 =  ( typeHint == null )  ? null : visitor.expectStringFormat ( visitor ) ;^40^^^^^37^44^JsonStringFormatVisitor v2 =  ( visitor == null )  ? null : visitor.expectStringFormat ( typeHint ) ;^[CLASS] SqlTimeSerializer  [METHOD] acceptJsonFormatVisitor [RETURN_TYPE] void   JsonFormatVisitorWrapper visitor JavaType typeHint [VARIABLES] JavaType  typeHint  boolean  JsonFormatVisitorWrapper  visitor  JsonStringFormatVisitor  v2  
[BugLab_Wrong_Operator]^JsonStringFormatVisitor v2 =  ( visitor != null )  ? null : visitor.expectStringFormat ( typeHint ) ;^40^^^^^37^44^JsonStringFormatVisitor v2 =  ( visitor == null )  ? null : visitor.expectStringFormat ( typeHint ) ;^[CLASS] SqlTimeSerializer  [METHOD] acceptJsonFormatVisitor [RETURN_TYPE] void   JsonFormatVisitorWrapper visitor JavaType typeHint [VARIABLES] JavaType  typeHint  boolean  JsonFormatVisitorWrapper  visitor  JsonStringFormatVisitor  v2  
[BugLab_Wrong_Operator]^if  ( v2 == null )  {^41^^^^^37^44^if  ( v2 != null )  {^[CLASS] SqlTimeSerializer  [METHOD] acceptJsonFormatVisitor [RETURN_TYPE] void   JsonFormatVisitorWrapper visitor JavaType typeHint [VARIABLES] JavaType  typeHint  boolean  JsonFormatVisitorWrapper  visitor  JsonStringFormatVisitor  v2  