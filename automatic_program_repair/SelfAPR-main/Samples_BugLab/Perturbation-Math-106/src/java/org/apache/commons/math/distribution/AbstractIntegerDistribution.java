[BugLab_Argument_Swapping]^if  ( x == fl )  {^87^^^^^85^92^if  ( fl == x )  {^[CLASS] AbstractIntegerDistribution  [METHOD] probability [RETURN_TYPE] double   double x [VARIABLES] long  serialVersionUID  double  fl  x  boolean  
[BugLab_Wrong_Operator]^if  ( fl <= x )  {^87^^^^^85^92^if  ( fl == x )  {^[CLASS] AbstractIntegerDistribution  [METHOD] probability [RETURN_TYPE] double   double x [VARIABLES] long  serialVersionUID  double  fl  x  boolean  
[BugLab_Wrong_Literal]^return 1;^90^^^^^85^92^return 0;^[CLASS] AbstractIntegerDistribution  [METHOD] probability [RETURN_TYPE] double   double x [VARIABLES] long  serialVersionUID  double  fl  x  boolean  
[BugLab_Argument_Swapping]^if  ( x1 > x0 )  {^106^^^^^105^111^if  ( x0 > x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Wrong_Operator]^if  ( x0 >= x1 )  {^106^^^^^105^111^if  ( x0 > x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Argument_Swapping]^return cumulativeProbability ( x0 )  - cumulativeProbability ( x1 - 1 ) ;^110^^^^^105^111^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Wrong_Operator]^return cumulativeProbability ( x1 )   >=  cumulativeProbability ( x0 - 1 ) ;^110^^^^^105^111^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Wrong_Operator]^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0  |  1 ) ;^110^^^^^105^111^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Wrong_Literal]^return cumulativeProbability ( xx1 )  - cumulativeProbability ( x0 - x1 ) ;^110^^^^^105^111^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Variable_Misuse]^return cumulativeProbability ( x1 )  - cumulativeProbability ( x1 - 1 ) ;^110^^^^^105^111^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Wrong_Operator]^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0   instanceof   1 ) ;^110^^^^^105^111^return cumulativeProbability ( x1 )  - cumulativeProbability ( x0 - 1 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] cumulativeProbability [RETURN_TYPE] double   int x0 int x1 [VARIABLES] long  serialVersionUID  int  x0  x1  boolean  
[BugLab_Variable_Misuse]^if  ( pm < 0.0 || p > 1.0 )  {^125^^^^^110^140^if  ( p < 0.0 || p > 1.0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( p < 0.0 && p > 1.0 )  {^125^^^^^110^140^if  ( p < 0.0 || p > 1.0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( p == 0.0 || p > 1.0 )  {^125^^^^^110^140^if  ( p < 0.0 || p > 1.0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( p < 0.0 || p >= 1.0 )  {^125^^^^^110^140^if  ( p < 0.0 || p > 1.0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^int x0 = getDomainLowerBound ( pm ) ;^132^^^^^117^147^int x0 = getDomainLowerBound ( p ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^int x1 = getDomainUpperBound ( pm ) ;^133^^^^^118^148^int x1 = getDomainUpperBound ( p ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^while  ( x0 < x0 )  {^135^^^^^120^150^while  ( x0 < x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^while  ( x1 < x0 )  {^135^^^^^120^150^while  ( x0 < x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^while  ( x0 <= x1 )  {^135^^^^^120^150^while  ( x0 < x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( p > p )  {^138^^^^^123^153^if  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^if  ( p > pm )  {^138^^^^^123^153^if  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^if  ( pmm > p )  {^138^^^^^123^153^if  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( pm >= p )  {^138^^^^^123^153^if  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( x1 == x0 )  {^150^^^^^138^158^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( xm == x1 )  {^150^^^^^138^158^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^if  ( x0 == xm )  {^150^^^^^138^158^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( xm <= x0 )  {^150^^^^^138^158^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^x0 = x1;^156^^^^^138^158^x0 = xm;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( x0 == x1 )  {^140^^^^^125^155^if  ( xm == x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( xm == x0 )  {^140^^^^^125^155^if  ( xm == x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^if  ( x1 == xm )  {^140^^^^^125^155^if  ( xm == x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( xm != x1 )  {^140^^^^^125^155^if  ( xm == x1 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^x1 = x1;^146^^^^^140^147^x1 = xm;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^x1 = x1;^146^^^^^131^161^x1 = xm;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^if  ( x0 == xm )  {^150^^^^^135^165^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^if  ( xm != x0 )  {^150^^^^^135^165^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^x0 = x1;^156^^^^^150^157^x0 = xm;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^pm = cumulativeProbability ( x1 ) ;^137^^^^^122^152^pm = cumulativeProbability ( xm ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^x0 = x1;^156^^^^^141^171^x0 = xm;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^int xm = x1 +  ( x1 - x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^int xm = x0 +  ( x0 - x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^int xm = x1 +  ( x0 - x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^int xm = x0 +  |  ( x1 - x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^int xm = x0 +  ( x1 - x0 )  * 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^int xm = x0 +  ( x1  ^  x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Literal]^int xm = x0 +  ( x1 - x0 )  / 3;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( x1 == x0 )  {^150^^^^^135^165^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^if  ( xm == x1 )  {^150^^^^^135^165^if  ( xm == x0 )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^int xm = x0 +  >  ( x1 - x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^int xm = x0 +  ( x1 - x0 )  - 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^int xm = x0 +  ( x1  |  x0 )  / 2;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Literal]^int xm = x0 +  ( x1 - x0 )  / x0;^136^^^^^121^151^int xm = x0 +  ( x1 - x0 )  / 2;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^pm = cumulativeProbability ( xm ) ;^162^^^^^147^177^pm = cumulativeProbability ( x0 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^while  ( p > pm )  {^163^^^^^148^178^while  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Argument_Swapping]^while  ( pmm > p )  {^163^^^^^148^178^while  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Wrong_Operator]^while  ( pm >= p )  {^163^^^^^148^178^while  ( pm > p )  {^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^pm = cumulativeProbability ( xm ) ;^165^^^^^150^180^pm = cumulativeProbability ( x0 ) ;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  
[BugLab_Variable_Misuse]^return xm;^168^^^^^153^183^return x0;^[CLASS] AbstractIntegerDistribution  [METHOD] inverseCumulativeProbability [RETURN_TYPE] int   final double p [VARIABLES] boolean  long  serialVersionUID  double  p  pm  int  x0  x1  xm  