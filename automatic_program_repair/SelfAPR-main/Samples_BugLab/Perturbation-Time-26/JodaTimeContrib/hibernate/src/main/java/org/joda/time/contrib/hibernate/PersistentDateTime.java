[BugLab_Argument_Swapping]^if  ( y == x )  {^49^^^^^48^59^if  ( x == y )  {^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Wrong_Operator]^if  ( x < y )  {^49^^^^^48^59^if  ( x == y )  {^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Wrong_Literal]^return false;^50^^^^^48^59^return true;^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Argument_Swapping]^if  ( y == null || x == null )  {^52^^^^^48^59^if  ( x == null || y == null )  {^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Wrong_Operator]^if  ( x == null && y == null )  {^52^^^^^48^59^if  ( x == null || y == null )  {^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Wrong_Operator]^if  ( x != null || y == null )  {^52^^^^^48^59^if  ( x == null || y == null )  {^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Wrong_Operator]^if  ( x == null || y != null )  {^52^^^^^48^59^if  ( x == null || y == null )  {^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Wrong_Literal]^return true;^53^^^^^48^59^return false;^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Argument_Swapping]^return dty.equals ( dtx ) ;^58^^^^^48^59^return dtx.equals ( dty ) ;^[CLASS] PersistentDateTime  [METHOD] equals [RETURN_TYPE] boolean   Object x Object y [VARIABLES] int[]  SQL_TYPES  Object  x  y  boolean  PersistentDateTime  INSTANCE  DateTime  dtx  dty  
[BugLab_Argument_Swapping]^return nullSafeGet ( strings, resultSet[0] ) ;^66^^^^^65^68^return nullSafeGet ( resultSet, strings[0] ) ;^[CLASS] PersistentDateTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String[] strings Object object [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  object  String[]  strings  boolean  PersistentDateTime  INSTANCE  
[BugLab_Argument_Swapping]^Object timestamp = Hibernate.TIMESTAMP.nullSafeGet ( string, resultSet ) ;^71^^^^^70^77^Object timestamp = Hibernate.TIMESTAMP.nullSafeGet ( resultSet, string ) ;^[CLASS] PersistentDateTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  PersistentDateTime  INSTANCE  
[BugLab_Wrong_Operator]^if  ( timestamp != null )  {^72^^^^^70^77^if  ( timestamp == null )  {^[CLASS] PersistentDateTime  [METHOD] nullSafeGet [RETURN_TYPE] Object   ResultSet resultSet String string [VARIABLES] ResultSet  resultSet  int[]  SQL_TYPES  Object  timestamp  String  string  boolean  PersistentDateTime  INSTANCE  
[BugLab_Wrong_Operator]^if  ( value != null )  {^80^^^^^79^85^if  ( value == null )  {^[CLASS] PersistentDateTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  PersistentDateTime  INSTANCE  int  index  
[BugLab_Argument_Swapping]^Hibernate.TIMESTAMP.nullSafeSet ( index, null, preparedStatement ) ;^81^^^^^79^85^Hibernate.TIMESTAMP.nullSafeSet ( preparedStatement, null, index ) ;^[CLASS] PersistentDateTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  PersistentDateTime  INSTANCE  int  index  
[BugLab_Argument_Swapping]^Hibernate.TIMESTAMP.nullSafeSet ( index,  (  ( DateTime )  value ) .toDate (  ) , preparedStatement ) ;^83^^^^^79^85^Hibernate.TIMESTAMP.nullSafeSet ( preparedStatement,  (  ( DateTime )  value ) .toDate (  ) , index ) ;^[CLASS] PersistentDateTime  [METHOD] nullSafeSet [RETURN_TYPE] void   PreparedStatement preparedStatement Object value int index [VARIABLES] int[]  SQL_TYPES  PreparedStatement  preparedStatement  Object  value  boolean  PersistentDateTime  INSTANCE  int  index  
[BugLab_Wrong_Literal]^return true;^92^^^^^91^93^return false;^[CLASS] PersistentDateTime  [METHOD] isMutable [RETURN_TYPE] boolean   [VARIABLES] PersistentDateTime  INSTANCE  int[]  SQL_TYPES  boolean  
[BugLab_Variable_Misuse]^return target;^104^^^^^103^105^return original;^[CLASS] PersistentDateTime  [METHOD] replace [RETURN_TYPE] Object   Object original Object target Object owner [VARIABLES] int[]  SQL_TYPES  Object  original  owner  target  boolean  PersistentDateTime  INSTANCE  