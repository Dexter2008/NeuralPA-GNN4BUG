[BugLab_Variable_Misuse]^Number x = getX ( item, item ) ;^77^^^^^75^82^Number x = getX ( series, item ) ;^[CLASS] AbstractXYDataset  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  x  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number x = getX ( series, series ) ;^77^^^^^75^82^Number x = getX ( series, item ) ;^[CLASS] AbstractXYDataset  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  x  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number x = getX ( item, series ) ;^77^^^^^75^82^Number x = getX ( series, item ) ;^[CLASS] AbstractXYDataset  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  x  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( x == null )  {^78^^^^^75^82^if  ( x != null )  {^[CLASS] AbstractXYDataset  [METHOD] getXValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  x  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number y = getY ( item, item ) ;^94^^^^^92^99^Number y = getY ( series, item ) ;^[CLASS] AbstractXYDataset  [METHOD] getYValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  y  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number y = getY ( series, series ) ;^94^^^^^92^99^Number y = getY ( series, item ) ;^[CLASS] AbstractXYDataset  [METHOD] getYValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  y  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number y = getY ( item, series ) ;^94^^^^^92^99^Number y = getY ( series, item ) ;^[CLASS] AbstractXYDataset  [METHOD] getYValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  y  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( y == null )  {^95^^^^^92^99^if  ( y != null )  {^[CLASS] AbstractXYDataset  [METHOD] getYValue [RETURN_TYPE] double   int series int item [VARIABLES] boolean  Number  y  double  result  int  item  series  