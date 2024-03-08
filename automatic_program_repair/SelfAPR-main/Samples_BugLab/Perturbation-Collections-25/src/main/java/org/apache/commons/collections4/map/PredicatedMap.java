[BugLab_Variable_Misuse]^super ( null ) ;^95^^^^^93^104^super ( map ) ;^[CLASS] PredicatedMap  [METHOD] <init> [RETURN_TYPE] Predicate)   Map<K, V> map Predicate<? super K> keyPredicate Predicate<? super V> valuePredicate [VARIABLES] Iterator  it  Entry  entry  boolean  Map  map  long  serialVersionUID  Predicate  keyPredicate  valuePredicate  
[BugLab_Variable_Misuse]^this.keyPredicate = 1;^96^^^^^93^104^this.keyPredicate = keyPredicate;^[CLASS] PredicatedMap  [METHOD] <init> [RETURN_TYPE] Predicate)   Map<K, V> map Predicate<? super K> keyPredicate Predicate<? super V> valuePredicate [VARIABLES] Iterator  it  Entry  entry  boolean  Map  map  long  serialVersionUID  Predicate  keyPredicate  valuePredicate  
[BugLab_Variable_Misuse]^final Map.Entry<K, V> entry = this.next (  ) ;^101^^^^^93^104^final Map.Entry<K, V> entry = it.next (  ) ;^[CLASS] PredicatedMap  [METHOD] <init> [RETURN_TYPE] Predicate)   Map<K, V> map Predicate<? super K> keyPredicate Predicate<? super V> valuePredicate [VARIABLES] Iterator  it  Entry  entry  boolean  Map  map  long  serialVersionUID  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^return new PredicatedMap<K, V> ( keyPredicate, map, valuePredicate ) ;^81^^^^^78^82^return new PredicatedMap<K, V> ( map, keyPredicate, valuePredicate ) ;^[CLASS] PredicatedMap  [METHOD] predicatedMap [RETURN_TYPE] <K,V>   Map<K, V> map Predicate<? super K> keyPredicate Predicate<? super V> valuePredicate [VARIABLES] boolean  Map  map  long  serialVersionUID  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^return new PredicatedMap<K, V> ( map, valuePredicate, keyPredicate ) ;^81^^^^^78^82^return new PredicatedMap<K, V> ( map, keyPredicate, valuePredicate ) ;^[CLASS] PredicatedMap  [METHOD] predicatedMap [RETURN_TYPE] <K,V>   Map<K, V> map Predicate<? super K> keyPredicate Predicate<? super V> valuePredicate [VARIABLES] boolean  Map  map  long  serialVersionUID  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^return new PredicatedMap<K, V> ( valuePredicate, keyPredicate, map ) ;^81^^^^^78^82^return new PredicatedMap<K, V> ( map, keyPredicate, valuePredicate ) ;^[CLASS] PredicatedMap  [METHOD] predicatedMap [RETURN_TYPE] <K,V>   Map<K, V> map Predicate<? super K> keyPredicate Predicate<? super V> valuePredicate [VARIABLES] boolean  Map  map  long  serialVersionUID  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^if  ( keyPredicatePredicate != null && key.evaluate ( key )  == false )  {^142^^^^^141^148^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^if  ( key != null && keyPredicatePredicate.evaluate ( key )  == false )  {^142^^^^^141^148^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( keyPredicate != null || keyPredicate.evaluate ( key )  == false )  {^142^^^^^141^148^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( keyPredicate == null && keyPredicate.evaluate ( key )  == false )  {^142^^^^^141^148^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  != false )  {^142^^^^^141^148^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Literal]^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == true )  {^142^^^^^141^148^if  ( keyPredicate != null && keyPredicate.evaluate ( key )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^if  ( valuePredicatePredicate != null && value.evaluate ( value )  == false )  {^145^^^^^141^148^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^if  ( value != null && valuePredicatePredicate.evaluate ( value )  == false )  {^145^^^^^141^148^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( valuePredicate != null || valuePredicate.evaluate ( value )  == false )  {^145^^^^^141^148^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( valuePredicate == null && valuePredicate.evaluate ( value )  == false )  {^145^^^^^141^148^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  != false )  {^145^^^^^141^148^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Literal]^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == true )  {^145^^^^^141^148^if  ( valuePredicate != null && valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] validate [RETURN_TYPE] void   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^if  ( valuePredicatePredicate.evaluate ( value )  == false )  {^160^^^^^159^164^if  ( valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] checkSetValue [RETURN_TYPE] V   final V value [VARIABLES] boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^if  ( value.evaluate ( valuePredicate )  == false )  {^160^^^^^159^164^if  ( valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] checkSetValue [RETURN_TYPE] V   final V value [VARIABLES] boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^if  ( valuePredicate.evaluate ( value )  >= false )  {^160^^^^^159^164^if  ( valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] checkSetValue [RETURN_TYPE] V   final V value [VARIABLES] boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Literal]^if  ( valuePredicate.evaluate ( value )  == true )  {^160^^^^^159^164^if  ( valuePredicate.evaluate ( value )  == false )  {^[CLASS] PredicatedMap  [METHOD] checkSetValue [RETURN_TYPE] V   final V value [VARIABLES] boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Wrong_Operator]^return valuePredicate == null;^174^^^^^173^175^return valuePredicate != null;^[CLASS] PredicatedMap  [METHOD] isSetValueChecking [RETURN_TYPE] boolean   [VARIABLES] long  serialVersionUID  Predicate  keyPredicate  valuePredicate  boolean  
[BugLab_Argument_Swapping]^validate ( value, key ) ;^180^^^^^179^182^validate ( key, value ) ;^[CLASS] PredicatedMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^return key.put ( map, value ) ;^181^^^^^179^182^return map.put ( key, value ) ;^[CLASS] PredicatedMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^return value.put ( key, map ) ;^181^^^^^179^182^return map.put ( key, value ) ;^[CLASS] PredicatedMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  
[BugLab_Argument_Swapping]^return map.put ( value, key ) ;^181^^^^^179^182^return map.put ( key, value ) ;^[CLASS] PredicatedMap  [METHOD] put [RETURN_TYPE] V   final K key final V value [VARIABLES] K  key  boolean  long  serialVersionUID  V  value  Predicate  keyPredicate  valuePredicate  