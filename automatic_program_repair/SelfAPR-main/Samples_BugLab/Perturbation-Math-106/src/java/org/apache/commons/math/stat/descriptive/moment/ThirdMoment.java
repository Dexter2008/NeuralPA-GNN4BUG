[BugLab_Wrong_Operator]^if  ( n == 1 )  {^73^^^^^72^82^if  ( n < 1 )  {^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^nDevSq - = nDev * nDev;^79^^^^^72^82^nDevSq = nDev * nDev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Variable_Misuse]^m3 = m3 - 3.0 * nDev * nDevSq +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Variable_Misuse]^m3 = m3 - 3.0 * nDev * prevM2 +  ( prevM2 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Variable_Misuse]^m3 = prevM2 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Variable_Misuse]^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * n0 * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Argument_Swapping]^m3 = m3 - 3.0 * nDev * nDevSq +  ( n0 - 1 )  *  ( n0 - 2 )  * prevM2 * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Argument_Swapping]^m3 = m3 - 3.0 * n0 * prevM2 +  ( nDev - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Argument_Swapping]^m3 = prevM2 - 3.0 * nDev * m3 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Argument_Swapping]^m3 = m3 - 3.0 * prevM2 * nDev +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Argument_Swapping]^m3 = dev - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * m3;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 = m3 - 3.0 * nDev * prevM2 +  <=  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 = m3  >  3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 + = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 = m3 - 3.0 - nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 / = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  -  ( n0 - 2 )  - nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 - = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0  >  1 )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Operator]^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0  >>  2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Literal]^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0  )  *  ( n0 - 2 )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Wrong_Literal]^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0  )  * nDevSq * dev;^81^^^^^72^82^m3 = m3 - 3.0 * nDev * prevM2 +  ( n0 - 1 )  *  ( n0 - 2 )  * nDevSq * dev;^[CLASS] ThirdMoment  [METHOD] increment [RETURN_TYPE] void   final double d [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  
[BugLab_Variable_Misuse]^return nDevSq;^88^^^^^87^89^return m3;^[CLASS] ThirdMoment  [METHOD] getResult [RETURN_TYPE] double   [VARIABLES] double  d  m3  n0  nDevSq  prevM2  long  serialVersionUID  boolean  