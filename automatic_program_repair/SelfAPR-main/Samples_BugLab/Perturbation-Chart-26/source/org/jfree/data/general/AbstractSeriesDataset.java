[BugLab_Variable_Misuse]^if  ( getSeriesKey ( seriesCount ) .equals ( seriesKey )  )  {^101^^^^^98^106^if  ( getSeriesKey ( s ) .equals ( seriesKey )  )  {^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  
[BugLab_Argument_Swapping]^if  ( getSeriesKey ( seriesKey ) .equals ( s )  )  {^101^^^^^98^106^if  ( getSeriesKey ( s ) .equals ( seriesKey )  )  {^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  
[BugLab_Variable_Misuse]^return seriesCount;^102^^^^^98^106^return s;^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  
[BugLab_Argument_Swapping]^for  ( int seriesCount = 0; s < s; s++ )  {^100^^^^^98^106^for  ( int s = 0; s < seriesCount; s++ )  {^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  
[BugLab_Wrong_Operator]^for  ( int s = 0; s <= seriesCount; s++ )  {^100^^^^^98^106^for  ( int s = 0; s < seriesCount; s++ )  {^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  
[BugLab_Wrong_Literal]^for  ( int s = seriesCount; s < seriesCount; s++ )  {^100^^^^^98^106^for  ( int s = 0; s < seriesCount; s++ )  {^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  
[BugLab_Wrong_Literal]^return -s;^105^^^^^98^106^return -1;^[CLASS] AbstractSeriesDataset  [METHOD] indexOf [RETURN_TYPE] int   Comparable seriesKey [VARIABLES] Comparable  seriesKey  boolean  long  serialVersionUID  int  s  seriesCount  