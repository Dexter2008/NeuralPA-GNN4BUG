[BugLab_Wrong_Literal]^this ( key, false, false ) ;^68^^^^^67^69^this ( key, false, true ) ;^[CLASS] VectorSeries  [METHOD] <init> [RETURN_TYPE] Comparable)   Comparable key [VARIABLES] Comparable  key  boolean  
[BugLab_Variable_Misuse]^super ( key, allowDuplicateXValues, allowDuplicateXValues ) ;^83^^^^^81^84^super ( key, autoSort, allowDuplicateXValues ) ;^[CLASS] VectorSeries  [METHOD] <init> [RETURN_TYPE] Comparable,boolean,boolean)   Comparable key boolean autoSort boolean allowDuplicateXValues [VARIABLES] Comparable  key  boolean  allowDuplicateXValues  autoSort  
[BugLab_Argument_Swapping]^super ( allowDuplicateXValues, autoSort, key ) ;^83^^^^^81^84^super ( key, autoSort, allowDuplicateXValues ) ;^[CLASS] VectorSeries  [METHOD] <init> [RETURN_TYPE] Comparable,boolean,boolean)   Comparable key boolean autoSort boolean allowDuplicateXValues [VARIABLES] Comparable  key  boolean  allowDuplicateXValues  autoSort  
[BugLab_Argument_Swapping]^super ( key, allowDuplicateXValues, autoSort ) ;^83^^^^^81^84^super ( key, autoSort, allowDuplicateXValues ) ;^[CLASS] VectorSeries  [METHOD] <init> [RETURN_TYPE] Comparable,boolean,boolean)   Comparable key boolean autoSort boolean allowDuplicateXValues [VARIABLES] Comparable  key  boolean  allowDuplicateXValues  autoSort  
[BugLab_Variable_Misuse]^super.add ( new VectorDataItem ( y, y, deltaX, deltaY ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Variable_Misuse]^super.add ( new VectorDataItem ( x, x, deltaX, deltaY ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Variable_Misuse]^super.add ( new VectorDataItem ( x, y, y, deltaY ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Variable_Misuse]^super.add ( new VectorDataItem ( x, y, deltaX, x ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Argument_Swapping]^super.add ( new VectorDataItem ( deltaX, y, x, deltaY ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Argument_Swapping]^super.add ( new VectorDataItem ( x, deltaY, deltaX, y ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Argument_Swapping]^super.add ( new VectorDataItem ( deltaY, y, deltaX, x ) , true ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Wrong_Literal]^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , false ) ;^95^^^^^94^96^super.add ( new VectorDataItem ( x, y, deltaX, deltaY ) , true ) ;^[CLASS] VectorSeries  [METHOD] add [RETURN_TYPE] void   double x double y double deltaX double deltaY [VARIABLES] boolean  double  deltaX  deltaY  x  y  
[BugLab_Wrong_Operator]^if  ( this.data.size (  )  >= 0 )  {^117^^^^^116^121^if  ( this.data.size (  )  > 0 )  {^[CLASS] VectorSeries  [METHOD] clear [RETURN_TYPE] void   [VARIABLES] boolean  