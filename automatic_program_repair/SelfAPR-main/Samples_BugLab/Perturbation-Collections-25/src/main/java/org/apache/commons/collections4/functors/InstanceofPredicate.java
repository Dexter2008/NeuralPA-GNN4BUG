[BugLab_Wrong_Operator]^if  ( type != null )  {^46^^^^^45^50^if  ( type == null )  {^[CLASS] InstanceofPredicate  [METHOD] instanceOfPredicate [RETURN_TYPE] Predicate   Class<?> type [VARIABLES] Class  iType  type  long  serialVersionUID  boolean  
[BugLab_Argument_Swapping]^return object.isInstance ( iType ) ;^70^^^^^69^71^return iType.isInstance ( object ) ;^[CLASS] InstanceofPredicate  [METHOD] evaluate [RETURN_TYPE] boolean   Object object [VARIABLES] Class  iType  type  Object  object  boolean  long  serialVersionUID  