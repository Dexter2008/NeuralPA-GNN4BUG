[BugLab_Variable_Misuse]^return max;^91^^^^^90^92^return this.cursor;^[CLASS] AxisState  [METHOD] getCursor [RETURN_TYPE] double   [VARIABLES] double  cursor  max  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = max;^100^^^^^99^101^this.cursor = cursor;^[CLASS] AxisState  [METHOD] setCursor [RETURN_TYPE] void   double cursor [VARIABLES] double  cursor  max  List  ticks  boolean  
[BugLab_Wrong_Operator]^if  ( edge >= RectangleEdge.TOP )  {^110^^^^^109^122^if  ( edge == RectangleEdge.TOP )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^if  ( edge != RectangleEdge.TOP )  {^110^^^^^109^122^if  ( edge == RectangleEdge.TOP )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^if  ( edge <= RectangleEdge.TOP )  {^110^^^^^109^122^if  ( edge == RectangleEdge.TOP )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge <= RectangleEdge.BOTTOM )  {^113^^^^^109^122^else if  ( edge == RectangleEdge.BOTTOM )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge >= RectangleEdge.LEFT )  {^116^^^^^109^122^else if  ( edge == RectangleEdge.LEFT )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge != RectangleEdge.LEFT )  {^116^^^^^109^122^else if  ( edge == RectangleEdge.LEFT )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge != RectangleEdge.RIGHT )  {^119^^^^^109^122^else if  ( edge == RectangleEdge.RIGHT )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Variable_Misuse]^cursorRight ( max ) ;^120^^^^^109^122^cursorRight ( units ) ;^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Variable_Misuse]^cursorLeft ( max ) ;^117^^^^^109^122^cursorLeft ( units ) ;^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge <= RectangleEdge.RIGHT )  {^119^^^^^109^122^else if  ( edge == RectangleEdge.RIGHT )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Variable_Misuse]^cursorDown ( max ) ;^114^^^^^109^122^cursorDown ( units ) ;^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Variable_Misuse]^cursorUp ( max ) ;^111^^^^^109^122^cursorUp ( units ) ;^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge != RectangleEdge.BOTTOM )  {^113^^^^^109^122^else if  ( edge == RectangleEdge.BOTTOM )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge <= RectangleEdge.LEFT )  {^116^^^^^109^122^else if  ( edge == RectangleEdge.LEFT )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Wrong_Operator]^else if  ( edge >= RectangleEdge.RIGHT )  {^119^^^^^109^122^else if  ( edge == RectangleEdge.RIGHT )  {^[CLASS] AxisState  [METHOD] moveCursor [RETURN_TYPE] void   double units RectangleEdge edge [VARIABLES] List  ticks  boolean  double  cursor  max  units  RectangleEdge  edge  
[BugLab_Variable_Misuse]^this.cursor = this.cursor - max;^130^^^^^129^131^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorUp [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = max - units;^130^^^^^129^131^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorUp [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Argument_Swapping]^this.cursor = units - this.cursor;^130^^^^^129^131^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorUp [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Wrong_Operator]^this.cursor = this.cursor  |  units;^130^^^^^129^131^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorUp [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = max + units;^139^^^^^138^140^this.cursor = this.cursor + units;^[CLASS] AxisState  [METHOD] cursorDown [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Argument_Swapping]^this.cursor = units + this.cursor;^139^^^^^138^140^this.cursor = this.cursor + units;^[CLASS] AxisState  [METHOD] cursorDown [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = this.cursor - max;^148^^^^^147^149^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorLeft [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = max - units;^148^^^^^147^149^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorLeft [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Argument_Swapping]^this.cursor = units - this.cursor;^148^^^^^147^149^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorLeft [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Wrong_Operator]^this.cursor = this.cursor  <  units;^148^^^^^147^149^this.cursor = this.cursor - units;^[CLASS] AxisState  [METHOD] cursorLeft [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = this.cursor + max;^157^^^^^156^158^this.cursor = this.cursor + units;^[CLASS] AxisState  [METHOD] cursorRight [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.cursor = max + units;^157^^^^^156^158^this.cursor = this.cursor + units;^[CLASS] AxisState  [METHOD] cursorRight [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Argument_Swapping]^this.cursor = units + this.cursor;^157^^^^^156^158^this.cursor = this.cursor + units;^[CLASS] AxisState  [METHOD] cursorRight [RETURN_TYPE] void   double units [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^return ticks;^166^^^^^165^167^return this.ticks;^[CLASS] AxisState  [METHOD] getTicks [RETURN_TYPE] List   [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^return units;^184^^^^^183^185^return this.max;^[CLASS] AxisState  [METHOD] getMax [RETURN_TYPE] double   [VARIABLES] double  cursor  max  units  List  ticks  boolean  
[BugLab_Variable_Misuse]^this.max = units;^193^^^^^192^194^this.max = max;^[CLASS] AxisState  [METHOD] setMax [RETURN_TYPE] void   double max [VARIABLES] double  cursor  max  units  List  ticks  boolean  