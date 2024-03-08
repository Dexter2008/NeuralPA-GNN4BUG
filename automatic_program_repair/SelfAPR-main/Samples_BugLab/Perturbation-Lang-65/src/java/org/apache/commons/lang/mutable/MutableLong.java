[BugLab_Variable_Misuse]^return new Long ( value ) ;^71^^^^^70^72^return new Long ( this.value ) ;^[CLASS] MutableLong  [METHOD] getValue [RETURN_TYPE] Object   [VARIABLES] long  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^this.value = serialVersionUID;^81^^^^^80^82^this.value = value;^[CLASS] MutableLong  [METHOD] setValue [RETURN_TYPE] void   long value [VARIABLES] long  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^this.value += value;^127^^^^^126^128^this.value += operand;^[CLASS] MutableLong  [METHOD] add [RETURN_TYPE] void   long operand [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^this.value -= value;^153^^^^^152^154^this.value -= operand;^[CLASS] MutableLong  [METHOD] subtract [RETURN_TYPE] void   long operand [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Wrong_Operator]^this.value = operand;^153^^^^^152^154^this.value -= operand;^[CLASS] MutableLong  [METHOD] subtract [RETURN_TYPE] void   long operand [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Wrong_Operator]^this.value = operand.longValue (  ) ;^167^^^^^166^168^this.value -= operand.longValue (  ) ;^[CLASS] MutableLong  [METHOD] subtract [RETURN_TYPE] void   Number operand [VARIABLES] Number  operand  long  operand  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^return serialVersionUID;^187^^^^^186^188^return value;^[CLASS] MutableLong  [METHOD] longValue [RETURN_TYPE] long   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^return serialVersionUID;^196^^^^^195^197^return value;^[CLASS] MutableLong  [METHOD] floatValue [RETURN_TYPE] float   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^return serialVersionUID;^205^^^^^204^206^return value;^[CLASS] MutableLong  [METHOD] doubleValue [RETURN_TYPE] double   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Wrong_Operator]^if  ( obj  ==  MutableLong )  {^229^^^^^228^233^if  ( obj instanceof MutableLong )  {^[CLASS] MutableLong  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  operand  serialVersionUID  value  Object  obj  boolean  
[BugLab_Variable_Misuse]^return serialVersionUID ==  (  ( MutableLong )  obj ) .longValue (  ) ;^230^^^^^228^233^return value ==  (  ( MutableLong )  obj ) .longValue (  ) ;^[CLASS] MutableLong  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  operand  serialVersionUID  value  Object  obj  boolean  
[BugLab_Wrong_Operator]^return value !=  (  ( MutableLong )  obj ) .longValue (  ) ;^230^^^^^228^233^return value ==  (  ( MutableLong )  obj ) .longValue (  ) ;^[CLASS] MutableLong  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  operand  serialVersionUID  value  Object  obj  boolean  
[BugLab_Wrong_Literal]^return true;^232^^^^^228^233^return false;^[CLASS] MutableLong  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] long  operand  serialVersionUID  value  Object  obj  boolean  
[BugLab_Variable_Misuse]^return  ( int )   ( serialVersionUID ^  ( value >>> 32 )  ) ;^241^^^^^240^242^return  ( int )   ( value ^  ( value >>> 32 )  ) ;^[CLASS] MutableLong  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Wrong_Operator]^return  ( int )   ( value &  ( value >>> 32 )  ) ;^241^^^^^240^242^return  ( int )   ( value ^  ( value >>> 32 )  ) ;^[CLASS] MutableLong  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Wrong_Operator]^return  ( int )   ( value ^  ( value  ==  32 )  ) ;^241^^^^^240^242^return  ( int )   ( value ^  ( value >>> 32 )  ) ;^[CLASS] MutableLong  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Wrong_Literal]^return  ( int )   ( value ^  ( value >>> 31 )  ) ;^241^^^^^240^242^return  ( int )   ( value ^  ( value >>> 32 )  ) ;^[CLASS] MutableLong  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] long  operand  serialVersionUID  value  boolean  
[BugLab_Variable_Misuse]^long anotherVal = value;^254^^^^^252^256^long anotherVal = other.value;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Argument_Swapping]^long anotherVal = other.value.value;^254^^^^^252^256^long anotherVal = other.value;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Argument_Swapping]^long anotherVal = other;^254^^^^^252^256^long anotherVal = other.value;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Variable_Misuse]^return value < serialVersionUID ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^255^^^^^252^256^return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Variable_Misuse]^return serialVersionUID < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^255^^^^^252^256^return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Argument_Swapping]^return anotherVal < value ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^255^^^^^252^256^return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Wrong_Operator]^return value > anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^255^^^^^252^256^return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Wrong_Operator]^return value < anotherVal ? -1 :  ( value != anotherVal ? 0 : 1 ) ;^255^^^^^252^256^return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Wrong_Literal]^return value < anotherVal ? - :  ( value == anotherVal ? 0 :  ) ;^255^^^^^252^256^return value < anotherVal ? -1 :  ( value == anotherVal ? 0 : 1 ) ;^[CLASS] MutableLong  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Object  obj  MutableLong  other  boolean  long  anotherVal  operand  serialVersionUID  value  
[BugLab_Variable_Misuse]^return String.valueOf ( serialVersionUID ) ;^264^^^^^263^265^return String.valueOf ( value ) ;^[CLASS] MutableLong  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] long  anotherVal  operand  serialVersionUID  value  boolean  