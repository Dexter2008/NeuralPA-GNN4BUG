[BugLab_Argument_Swapping]^super ( predicate, bag ) ;^77^^^^^76^78^super ( bag, predicate ) ;^[CLASS] PredicatedBag  [METHOD] <init> [RETURN_TYPE] Predicate)   Bag<E> bag Predicate<? super E> predicate [VARIABLES] Bag  bag  boolean  long  serialVersionUID  Predicate  predicate  
[BugLab_Argument_Swapping]^return new PredicatedBag<E> ( predicate, bag ) ;^61^^^^^60^62^return new PredicatedBag<E> ( bag, predicate ) ;^[CLASS] PredicatedBag  [METHOD] predicatedBag [RETURN_TYPE] <E>   Bag<E> bag Predicate<? super E> predicate [VARIABLES] Bag  bag  boolean  long  serialVersionUID  Predicate  predicate  
[BugLab_Variable_Misuse]^return new PredicatedBag<E> ( bag, 4 ) ;^61^^^^^60^62^return new PredicatedBag<E> ( bag, predicate ) ;^[CLASS] PredicatedBag  [METHOD] predicatedBag [RETURN_TYPE] <E>   Bag<E> bag Predicate<? super E> predicate [VARIABLES] Bag  bag  boolean  long  serialVersionUID  Predicate  predicate  
[BugLab_Wrong_Operator]^return object == this && decorated (  ) .equals ( object ) ;^92^^^^^91^93^return object == this || decorated (  ) .equals ( object ) ;^[CLASS] PredicatedBag  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] long  serialVersionUID  Object  object  boolean  
[BugLab_Wrong_Operator]^return object > this || decorated (  ) .equals ( object ) ;^92^^^^^91^93^return object == this || decorated (  ) .equals ( object ) ;^[CLASS] PredicatedBag  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] long  serialVersionUID  Object  object  boolean  
[BugLab_Argument_Swapping]^return decorated (  ) .add ( count, object ) ;^104^^^^^102^105^return decorated (  ) .add ( object, count ) ;^[CLASS] PredicatedBag  [METHOD] add [RETURN_TYPE] boolean   final E object final int count [VARIABLES] boolean  E  object  long  serialVersionUID  int  count  
[BugLab_Argument_Swapping]^return decorated (  ) .remove ( count, object ) ;^108^^^^^107^109^return decorated (  ) .remove ( object, count ) ;^[CLASS] PredicatedBag  [METHOD] remove [RETURN_TYPE] boolean   Object object final int count [VARIABLES] Object  object  boolean  long  serialVersionUID  int  count  