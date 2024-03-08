[BugLab_Variable_Misuse]^this ( formatPattern ) ;^80^^^^^79^81^this ( DEFAULT_LABEL_FORMAT ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] <init> [RETURN_TYPE] StandardXYSeriesLabelGenerator()   [VARIABLES] long  serialVersionUID  String  DEFAULT_LABEL_FORMAT  formatPattern  boolean  
[BugLab_Variable_Misuse]^if  ( formatPattern == null )  {^89^^^^^88^93^if  ( format == null )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] <init> [RETURN_TYPE] String)   String format [VARIABLES] long  serialVersionUID  String  DEFAULT_LABEL_FORMAT  format  formatPattern  boolean  
[BugLab_Wrong_Operator]^if  ( format != null )  {^89^^^^^88^93^if  ( format == null )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] <init> [RETURN_TYPE] String)   String format [VARIABLES] long  serialVersionUID  String  DEFAULT_LABEL_FORMAT  format  formatPattern  boolean  
[BugLab_Variable_Misuse]^this.formatPattern = formatPattern;^92^^^^^88^93^this.formatPattern = format;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] <init> [RETURN_TYPE] String)   String format [VARIABLES] long  serialVersionUID  String  DEFAULT_LABEL_FORMAT  format  formatPattern  boolean  
[BugLab_Wrong_Operator]^if  ( dataset != null )  {^105^^^^^104^112^if  ( dataset == null )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Variable_Misuse]^String label = MessageFormat.format ( formatPattern, createItemArray ( dataset, series ) ) ;^108^109^110^^^104^112^String label = MessageFormat.format ( this.formatPattern, createItemArray ( dataset, series ) ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Argument_Swapping]^String label = MessageFormat.format ( dataset, createItemArray ( this.formatPattern, series ) ) ;^108^109^110^^^104^112^String label = MessageFormat.format ( this.formatPattern, createItemArray ( dataset, series ) ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Argument_Swapping]^String label = MessageFormat.format ( this.formatPattern, createItemArray ( series, dataset ) ) ;^108^109^110^^^104^112^String label = MessageFormat.format ( this.formatPattern, createItemArray ( dataset, series ) ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Argument_Swapping]^String label = MessageFormat.format ( series, createItemArray ( dataset, this.formatPattern ) ) ;^108^109^110^^^104^112^String label = MessageFormat.format ( this.formatPattern, createItemArray ( dataset, series ) ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Argument_Swapping]^this.formatPattern, createItemArray ( series, dataset ) ) ;^109^110^^^^104^112^this.formatPattern, createItemArray ( dataset, series ) ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Variable_Misuse]^return formatPattern;^111^^^^^104^112^return label;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] generateLabel [RETURN_TYPE] String   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  
[BugLab_Argument_Swapping]^result[0] = series.getSeriesKey ( dataset ) .toString (  ) ;^125^^^^^123^127^result[0] = dataset.getSeriesKey ( series ) .toString (  ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] createItemArray [RETURN_TYPE] Object[]   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  Object[]  result  
[BugLab_Wrong_Literal]^result[series] = dataset.getSeriesKey ( series ) .toString (  ) ;^125^^^^^123^127^result[0] = dataset.getSeriesKey ( series ) .toString (  ) ;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] createItemArray [RETURN_TYPE] Object[]   XYDataset dataset int series [VARIABLES] XYDataset  dataset  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  int  series  Object[]  result  
[BugLab_Wrong_Operator]^if  ( obj < this )  {^150^^^^^149^162^if  ( obj == this )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Wrong_Literal]^return false;^151^^^^^149^162^return true;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Wrong_Operator]^if  ( ! ( obj  &&  StandardXYSeriesLabelGenerator )  )  {^153^^^^^149^162^if  ( ! ( obj instanceof StandardXYSeriesLabelGenerator )  )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Wrong_Literal]^return true;^154^^^^^149^162^return false;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Variable_Misuse]^if  ( !this.formatPattern.equals ( label )  )  {^158^^^^^149^162^if  ( !this.formatPattern.equals ( that.formatPattern )  )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Argument_Swapping]^if  ( !this.formatPattern.equals ( that.formatPattern.formatPattern )  )  {^158^^^^^149^162^if  ( !this.formatPattern.equals ( that.formatPattern )  )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Argument_Swapping]^if  ( !this.formatPattern.equals ( that )  )  {^158^^^^^149^162^if  ( !this.formatPattern.equals ( that.formatPattern )  )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Wrong_Literal]^return true;^159^^^^^149^162^return false;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Variable_Misuse]^if  ( !this.formatPattern.equals ( formatPattern )  )  {^158^^^^^149^162^if  ( !this.formatPattern.equals ( that.formatPattern )  )  {^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  
[BugLab_Wrong_Literal]^return false;^161^^^^^149^162^return true;^[CLASS] StandardXYSeriesLabelGenerator  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  String  DEFAULT_LABEL_FORMAT  format  formatPattern  label  boolean  long  serialVersionUID  StandardXYSeriesLabelGenerator  that  