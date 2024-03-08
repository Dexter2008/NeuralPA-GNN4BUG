[BugLab_Variable_Misuse]^this.angle = linkPercent;^96^^^^^92^103^this.angle = angle;^[CLASS] PieLabelRecord  [METHOD] <init> [RETURN_TYPE] TextBox,double,double,double)   Comparable key double angle double baseY TextBox label double labelHeight double gap double linkPercent [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^this.baseY = linkPercent;^97^^^^^92^103^this.baseY = baseY;^[CLASS] PieLabelRecord  [METHOD] <init> [RETURN_TYPE] TextBox,double,double,double)   Comparable key double angle double baseY TextBox label double labelHeight double gap double linkPercent [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^this.allocatedY = labelHeight;^98^^^^^92^103^this.allocatedY = baseY;^[CLASS] PieLabelRecord  [METHOD] <init> [RETURN_TYPE] TextBox,double,double,double)   Comparable key double angle double baseY TextBox label double labelHeight double gap double linkPercent [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^this.gap = labelHeight;^101^^^^^92^103^this.gap = gap;^[CLASS] PieLabelRecord  [METHOD] <init> [RETURN_TYPE] TextBox,double,double,double)   Comparable key double angle double baseY TextBox label double labelHeight double gap double linkPercent [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^this.linkPercent = labelHeight;^102^^^^^92^103^this.linkPercent = linkPercent;^[CLASS] PieLabelRecord  [METHOD] <init> [RETURN_TYPE] TextBox,double,double,double)   Comparable key double angle double baseY TextBox label double labelHeight double gap double linkPercent [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return linkPercent;^112^^^^^111^113^return this.baseY;^[CLASS] PieLabelRecord  [METHOD] getBaseY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^this.baseY = linkPercent;^121^^^^^120^122^this.baseY = base;^[CLASS] PieLabelRecord  [METHOD] setBaseY [RETURN_TYPE] void   double base [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return baseY - this.labelHeight / 2.0;^130^^^^^129^131^return this.allocatedY - this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getLowerY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Argument_Swapping]^return this.labelHeight - this.allocatedY / 2.0;^130^^^^^129^131^return this.allocatedY - this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getLowerY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Wrong_Operator]^return this.allocatedY  >=  this.labelHeight / 2.0;^130^^^^^129^131^return this.allocatedY - this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getLowerY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Wrong_Operator]^return this.allocatedY - this.labelHeight + 2.0;^130^^^^^129^131^return this.allocatedY - this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getLowerY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return baseY + this.labelHeight / 2.0;^139^^^^^138^140^return this.allocatedY + this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getUpperY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return this.allocatedY + baseY / 2.0;^139^^^^^138^140^return this.allocatedY + this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getUpperY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Argument_Swapping]^return this.labelHeight + this.allocatedY / 2.0;^139^^^^^138^140^return this.allocatedY + this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getUpperY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Wrong_Operator]^return this.allocatedY + this.labelHeight + 2.0;^139^^^^^138^140^return this.allocatedY + this.labelHeight / 2.0;^[CLASS] PieLabelRecord  [METHOD] getUpperY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return gap;^148^^^^^147^149^return this.angle;^[CLASS] PieLabelRecord  [METHOD] getAngle [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return key;^157^^^^^156^158^return this.key;^[CLASS] PieLabelRecord  [METHOD] getKey [RETURN_TYPE] Comparable   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return label;^166^^^^^165^167^return this.label;^[CLASS] PieLabelRecord  [METHOD] getLabel [RETURN_TYPE] TextBox   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return linkPercent;^176^^^^^175^177^return this.labelHeight;^[CLASS] PieLabelRecord  [METHOD] getLabelHeight [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^return linkPercent;^185^^^^^184^186^return this.allocatedY;^[CLASS] PieLabelRecord  [METHOD] getAllocatedY [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  
[BugLab_Variable_Misuse]^this.allocatedY = gap;^194^^^^^193^195^this.allocatedY = y;^[CLASS] PieLabelRecord  [METHOD] setAllocatedY [RETURN_TYPE] void   double y [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Variable_Misuse]^return labelHeight;^203^^^^^202^204^return this.gap;^[CLASS] PieLabelRecord  [METHOD] getGap [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Variable_Misuse]^return y;^212^^^^^211^213^return this.linkPercent;^[CLASS] PieLabelRecord  [METHOD] getLinkPercent [RETURN_TYPE] double   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Wrong_Operator]^if  ( obj  <=  PieLabelRecord )  {^224^^^^^222^234^if  ( obj instanceof PieLabelRecord )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^if  ( y < plr.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^if  ( this.baseY < labelHeight )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^if  ( this.baseY < plr.baseY.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^if  ( plr.baseY < this.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^if  ( this.baseY < plr )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Operator]^if  ( this.baseY <= plr.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^else if  ( labelHeight > plr.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^else if  ( this.baseY > gap )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^else if  ( this.baseY > plr.baseY.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^else if  ( plr > this.baseY.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^else if  ( plr.baseY > this.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Operator]^else if  ( this.baseY >= plr.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = ;^230^^^^^222^234^result = 1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = 0;^230^^^^^222^234^result = 1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = -result;^227^^^^^222^234^result = -1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^else if  ( y > plr.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = result;^230^^^^^222^234^result = 1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = -0;^227^^^^^222^234^result = -1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^if  ( plr < this.baseY.baseY )  {^226^^^^^222^234^if  ( this.baseY < plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^else if  ( this.baseY > linkPercent )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Argument_Swapping]^else if  ( this.baseY > plr )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Operator]^else if  ( this.baseY < plr.baseY )  {^229^^^^^222^234^else if  ( this.baseY > plr.baseY )  {^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = 2;^230^^^^^222^234^result = 1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Wrong_Literal]^result = -2;^227^^^^^222^234^result = -1;^[CLASS] PieLabelRecord  [METHOD] compareTo [RETURN_TYPE] int   Object obj [VARIABLES] Comparable  key  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  PieLabelRecord  plr  Object  obj  TextBox  label  int  result  
[BugLab_Variable_Misuse]^return gap + ", " + this.key.toString (  ) ;^242^^^^^241^243^return this.baseY + ", " + this.key.toString (  ) ;^[CLASS] PieLabelRecord  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Variable_Misuse]^return this.baseY + ", " + key.toString (  ) ;^242^^^^^241^243^return this.baseY + ", " + this.key.toString (  ) ;^[CLASS] PieLabelRecord  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Argument_Swapping]^return this.key + ", " + this.baseY.toString (  ) ;^242^^^^^241^243^return this.baseY + ", " + this.key.toString (  ) ;^[CLASS] PieLabelRecord  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Wrong_Operator]^return this.baseY + ", " + this.key.toString (  <=  ) ;^242^^^^^241^243^return this.baseY + ", " + this.key.toString (  ) ;^[CLASS] PieLabelRecord  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  
[BugLab_Wrong_Operator]^return this.baseY  ==  ", " + this.key.toString (  ) ;^242^^^^^241^243^return this.baseY + ", " + this.key.toString (  ) ;^[CLASS] PieLabelRecord  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Comparable  key  TextBox  label  boolean  double  allocatedY  angle  base  baseY  gap  labelHeight  linkPercent  y  