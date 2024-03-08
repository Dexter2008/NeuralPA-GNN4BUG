[P1_Replace_Type]^private static final  short  serialVersionUID = 1L;^51^^^^^46^56^private static final long serialVersionUID = 1L;^[CLASS] AllType   [VARIABLES] 
[P8_Replace_Mix]^private static final long serialVersionUID = 1;^51^^^^^46^56^private static final long serialVersionUID = 1L;^[CLASS] AllType   [VARIABLES] 
[P14_Delete_Statement]^^54^^^^^53^55^super ( registry ) ;^[CLASS] AllType  [METHOD] <init> [RETURN_TYPE] JSTypeRegistry)   JSTypeRegistry registry [VARIABLES] long  serialVersionUID  JSTypeRegistry  registry  boolean  
[P2_Replace_Operator]^return that.isAllType (  )  && that.isUnknownType (  ) ;^64^^^^^63^65^return that.isAllType (  )  || that.isUnknownType (  ) ;^[CLASS] AllType  [METHOD] isSubtype [RETURN_TYPE] boolean   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P8_Replace_Mix]^return   that.isUnknownType (  ) ;^64^^^^^63^65^return that.isAllType (  )  || that.isUnknownType (  ) ;^[CLASS] AllType  [METHOD] isSubtype [RETURN_TYPE] boolean   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P14_Delete_Statement]^^64^^^^^63^65^return that.isAllType (  )  || that.isUnknownType (  ) ;^[CLASS] AllType  [METHOD] isSubtype [RETURN_TYPE] boolean   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P3_Replace_Literal]^return false;^69^^^^^68^70^return true;^[CLASS] AllType  [METHOD] isAllType [RETURN_TYPE] boolean   [VARIABLES] long  serialVersionUID  boolean  
[P3_Replace_Literal]^return false;^75^^^^^73^76^return true;^[CLASS] AllType  [METHOD] matchesStringContext [RETURN_TYPE] boolean   [VARIABLES] long  serialVersionUID  boolean  
[P3_Replace_Literal]^return false;^81^^^^^79^82^return true;^[CLASS] AllType  [METHOD] matchesObjectContext [RETURN_TYPE] boolean   [VARIABLES] long  serialVersionUID  boolean  
[P3_Replace_Literal]^return true;^86^^^^^85^87^return false;^[CLASS] AllType  [METHOD] canBeCalled [RETURN_TYPE] boolean   [VARIABLES] long  serialVersionUID  boolean  
[P5_Replace_Variable]^return null;^91^^^^^90^92^return UNKNOWN;^[CLASS] AllType  [METHOD] testForEquality [RETURN_TYPE] TernaryValue   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P15_Unwrap_Block]^return registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);^96^97^98^^^95^100^if  ( that.isUnknownType (  )  )  { return registry.getNativeType ( JSTypeNative.UNKNOWN_TYPE ) ; }^[CLASS] AllType  [METHOD] getLeastSupertype [RETURN_TYPE] JSType   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P16_Remove_Block]^^96^97^98^^^95^100^if  ( that.isUnknownType (  )  )  { return registry.getNativeType ( JSTypeNative.UNKNOWN_TYPE ) ; }^[CLASS] AllType  [METHOD] getLeastSupertype [RETURN_TYPE] JSType   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P13_Insert_Block]^if  ( that.isUnknownType (  )  )  {     return registry.getNativeType ( JSTypeNative.UNKNOWN_TYPE ) ; }^97^^^^^95^100^[Delete]^[CLASS] AllType  [METHOD] getLeastSupertype [RETURN_TYPE] JSType   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P14_Delete_Statement]^^97^^^^^95^100^return registry.getNativeType ( JSTypeNative.UNKNOWN_TYPE ) ;^[CLASS] AllType  [METHOD] getLeastSupertype [RETURN_TYPE] JSType   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P8_Replace_Mix]^if  ( that .isAllType (  )   )  {^96^^^^^95^100^if  ( that.isUnknownType (  )  )  {^[CLASS] AllType  [METHOD] getLeastSupertype [RETURN_TYPE] JSType   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P8_Replace_Mix]^return null;^99^^^^^95^100^return this;^[CLASS] AllType  [METHOD] getLeastSupertype [RETURN_TYPE] JSType   JSType that [VARIABLES] long  serialVersionUID  JSType  that  boolean  
[P3_Replace_Literal]^return "";^109^^^^^108^110^return "*";^[CLASS] AllType  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] long  serialVersionUID  boolean  
[P14_Delete_Statement]^^114^^^^^113^115^return visitor.caseAllType (  ) ;^[CLASS] AllType  [METHOD] visit [RETURN_TYPE] <T>   Visitor<T> visitor [VARIABLES] Visitor  visitor  long  serialVersionUID  boolean  