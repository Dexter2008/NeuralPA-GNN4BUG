[BugLab_Variable_Misuse]^this ( DEFAULT_TOOLTIP_FORMAT, NumberFormat.getNumberInstance (  ) , NumberFormat.getPercentInstance (  )  ) ;^96^97^^^^95^98^this ( DEFAULT_SECTION_LABEL_FORMAT, NumberFormat.getNumberInstance (  ) , NumberFormat.getPercentInstance (  )  ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] <init> [RETURN_TYPE] StandardPieToolTipGenerator()   [VARIABLES] long  serialVersionUID  String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  boolean  
[BugLab_Variable_Misuse]^this ( DEFAULT_TOOLTIP_FORMAT, NumberFormat.getNumberInstance (  ) , NumberFormat.getPercentInstance (  )  ) ;^106^107^^^^105^108^this ( labelFormat, NumberFormat.getNumberInstance (  ) , NumberFormat.getPercentInstance (  )  ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] <init> [RETURN_TYPE] String)   String labelFormat [VARIABLES] long  serialVersionUID  String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  labelFormat  boolean  
[BugLab_Variable_Misuse]^super ( DEFAULT_TOOLTIP_FORMAT, numberFormat, percentFormat ) ;^122^^^^^120^123^super ( labelFormat, numberFormat, percentFormat ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] <init> [RETURN_TYPE] NumberFormat)   String labelFormat NumberFormat numberFormat NumberFormat percentFormat [VARIABLES] String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  labelFormat  boolean  long  serialVersionUID  NumberFormat  numberFormat  percentFormat  
[BugLab_Variable_Misuse]^super ( labelFormat, percentFormat, percentFormat ) ;^122^^^^^120^123^super ( labelFormat, numberFormat, percentFormat ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] <init> [RETURN_TYPE] NumberFormat)   String labelFormat NumberFormat numberFormat NumberFormat percentFormat [VARIABLES] String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  labelFormat  boolean  long  serialVersionUID  NumberFormat  numberFormat  percentFormat  
[BugLab_Argument_Swapping]^super ( percentFormat, numberFormat, labelFormat ) ;^122^^^^^120^123^super ( labelFormat, numberFormat, percentFormat ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] <init> [RETURN_TYPE] NumberFormat)   String labelFormat NumberFormat numberFormat NumberFormat percentFormat [VARIABLES] String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  labelFormat  boolean  long  serialVersionUID  NumberFormat  numberFormat  percentFormat  
[BugLab_Argument_Swapping]^super ( labelFormat, percentFormat, numberFormat ) ;^122^^^^^120^123^super ( labelFormat, numberFormat, percentFormat ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] <init> [RETURN_TYPE] NumberFormat)   String labelFormat NumberFormat numberFormat NumberFormat percentFormat [VARIABLES] String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  labelFormat  boolean  long  serialVersionUID  NumberFormat  numberFormat  percentFormat  
[BugLab_Argument_Swapping]^return generateSectionLabel ( key, dataset ) ;^134^^^^^133^135^return generateSectionLabel ( dataset, key ) ;^[CLASS] StandardPieToolTipGenerator  [METHOD] generateToolTip [RETURN_TYPE] String   PieDataset dataset Comparable key [VARIABLES] Comparable  key  String  DEFAULT_SECTION_LABEL_FORMAT  DEFAULT_TOOLTIP_FORMAT  labelFormat  boolean  PieDataset  dataset  long  serialVersionUID  