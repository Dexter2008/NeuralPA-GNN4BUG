[BugLab_Variable_Misuse]^return tTest.homoscedasticT ( sample2, sample2 ) ;^66^^^^^64^67^return tTest.homoscedasticT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Variable_Misuse]^return tTest.homoscedasticT ( sample1, sample1 ) ;^66^^^^^64^67^return tTest.homoscedasticT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample1.homoscedasticT ( tTest, sample2 ) ;^66^^^^^64^67^return tTest.homoscedasticT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.homoscedasticT ( sample2, sample1 ) ;^66^^^^^64^67^return tTest.homoscedasticT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sampleStats1.homoscedasticT ( tTest, sampleStats2 ) ;^75^^^^^72^76^return tTest.homoscedasticT ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.homoscedasticT ( sampleStats2, sampleStats1 ) ;^75^^^^^72^76^return tTest.homoscedasticT ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sampleStats2.homoscedasticT ( sampleStats1, tTest ) ;^75^^^^^72^76^return tTest.homoscedasticT ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticT [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Variable_Misuse]^return tTest. homoscedasticTTest ( sample2, sample2, alpha ) ;^84^^^^^81^85^return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return sample1. homoscedasticTTest ( tTest, sample2, alpha ) ;^84^^^^^81^85^return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest. homoscedasticTTest ( sample2, sample1, alpha ) ;^84^^^^^81^85^return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return alpha. homoscedasticTTest ( sample1, sample2, tTest ) ;^84^^^^^81^85^return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest. homoscedasticTTest ( alpha, sample2, sample1 ) ;^84^^^^^81^85^return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return sample2. homoscedasticTTest ( sample1, tTest, alpha ) ;^84^^^^^81^85^return tTest. homoscedasticTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest.homoscedasticTTest ( sample2, sample1 ) ;^92^^^^^90^93^return tTest.homoscedasticTTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample1.homoscedasticTTest ( tTest, sample2 ) ;^92^^^^^90^93^return tTest.homoscedasticTTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.homoscedasticTTest ( sampleStats2, sampleStats1 ) ;^101^^^^^98^102^return tTest.homoscedasticTTest ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sampleStats2.homoscedasticTTest ( sampleStats1, tTest ) ;^101^^^^^98^102^return tTest.homoscedasticTTest ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] homoscedasticTTest [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample1.pairedT ( tTest, sample2 ) ;^109^^^^^107^110^return tTest.pairedT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.pairedT ( sample2, sample1 ) ;^109^^^^^107^110^return tTest.pairedT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample2.pairedT ( sample1, tTest ) ;^109^^^^^107^110^return tTest.pairedT ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedT [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.pairedTTest ( alpha, sample2, sample1 ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest.pairedTTest ( sample2, sample1, alpha ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return alpha.pairedTTest ( sample1, sample2, tTest ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Variable_Misuse]^return tTest.pairedTTest ( sample2, sample2, alpha ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Variable_Misuse]^return tTest.pairedTTest ( sample1, sample1, alpha ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return sample1.pairedTTest ( tTest, sample2, alpha ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return sample2.pairedTTest ( sample1, tTest, alpha ) ;^118^^^^^115^119^return tTest.pairedTTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Variable_Misuse]^return tTest.pairedTTest ( sample2, sample2 ) ;^126^^^^^124^127^return tTest.pairedTTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.pairedTTest ( sample2, sample1 ) ;^126^^^^^124^127^return tTest.pairedTTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample1.pairedTTest ( tTest, sample2 ) ;^126^^^^^124^127^return tTest.pairedTTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample2.pairedTTest ( sample1, tTest ) ;^126^^^^^124^127^return tTest.pairedTTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] pairedTTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.t ( observed, mu ) ;^134^^^^^132^135^return tTest.t ( mu, observed ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double mu double[] observed [VARIABLES] TTest  tTest  boolean  double[]  observed  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return observed.t ( mu, tTest ) ;^134^^^^^132^135^return tTest.t ( mu, observed ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double mu double[] observed [VARIABLES] TTest  tTest  boolean  double[]  observed  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return tTest.t ( sampleStats, mu ) ;^142^^^^^140^143^return tTest.t ( mu, sampleStats ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double mu StatisticalSummary sampleStats [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return sampleStats.t ( mu, tTest ) ;^142^^^^^140^143^return tTest.t ( mu, sampleStats ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double mu StatisticalSummary sampleStats [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return mu.t ( tTest, sampleStats ) ;^142^^^^^140^143^return tTest.t ( mu, sampleStats ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double mu StatisticalSummary sampleStats [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return tTest.t ( sample2, sample1 ) ;^150^^^^^148^151^return tTest.t ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample1.t ( tTest, sample2 ) ;^150^^^^^148^151^return tTest.t ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample2.t ( sample1, tTest ) ;^150^^^^^148^151^return tTest.t ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.t ( sampleStats2, sampleStats1 ) ;^159^^^^^156^160^return tTest.t ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sampleStats1.t ( tTest, sampleStats2 ) ;^159^^^^^156^160^return tTest.t ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] t [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.tTest ( alpha, sample, mu ) ;^167^^^^^165^168^return tTest.tTest ( mu, sample, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu double[] sample double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return sample.tTest ( mu, tTest, alpha ) ;^167^^^^^165^168^return tTest.tTest ( mu, sample, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu double[] sample double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return alpha.tTest ( mu, sample, tTest ) ;^167^^^^^165^168^return tTest.tTest ( mu, sample, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu double[] sample double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return tTest.tTest ( mu, alpha, sample ) ;^167^^^^^165^168^return tTest.tTest ( mu, sample, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu double[] sample double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return tTest.tTest ( sample, mu ) ;^175^^^^^173^176^return tTest.tTest ( mu, sample ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double mu double[] sample [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return mu.tTest ( tTest, sample ) ;^175^^^^^173^176^return tTest.tTest ( mu, sample ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double mu double[] sample [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return sample.tTest ( mu, tTest ) ;^175^^^^^173^176^return tTest.tTest ( mu, sample ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double mu double[] sample [VARIABLES] TTest  tTest  boolean  double[]  sample  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Variable_Misuse]^return tTest. tTest ( alpha, sampleStats, alpha ) ;^184^^^^^181^185^return tTest. tTest ( mu, sampleStats, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu StatisticalSummary sampleStats double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Variable_Misuse]^return tTest. tTest ( mu, sampleStats, mu ) ;^184^^^^^181^185^return tTest. tTest ( mu, sampleStats, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu StatisticalSummary sampleStats double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return tTest. tTest ( alpha, sampleStats, mu ) ;^184^^^^^181^185^return tTest. tTest ( mu, sampleStats, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu StatisticalSummary sampleStats double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return sampleStats. tTest ( mu, tTest, alpha ) ;^184^^^^^181^185^return tTest. tTest ( mu, sampleStats, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu StatisticalSummary sampleStats double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return mu. tTest ( tTest, sampleStats, alpha ) ;^184^^^^^181^185^return tTest. tTest ( mu, sampleStats, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double mu StatisticalSummary sampleStats double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  alpha  mu  
[BugLab_Argument_Swapping]^return tTest.tTest ( sampleStats, mu ) ;^192^^^^^190^193^return tTest.tTest ( mu, sampleStats ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double mu StatisticalSummary sampleStats [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return sampleStats.tTest ( mu, tTest ) ;^192^^^^^190^193^return tTest.tTest ( mu, sampleStats ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double mu StatisticalSummary sampleStats [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return mu.tTest ( tTest, sampleStats ) ;^192^^^^^190^193^return tTest.tTest ( mu, sampleStats ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double mu StatisticalSummary sampleStats [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats  boolean  ChiSquareTest  chiSquareTest  double  mu  
[BugLab_Argument_Swapping]^return sample1.tTest ( tTest, sample2, alpha ) ;^200^^^^^198^201^return tTest.tTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest.tTest ( sample2, sample1, alpha ) ;^200^^^^^198^201^return tTest.tTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest.tTest ( alpha, sample2, sample1 ) ;^200^^^^^198^201^return tTest.tTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Variable_Misuse]^return tTest.tTest ( sample1, sample1, alpha ) ;^200^^^^^198^201^return tTest.tTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return alpha.tTest ( sample1, sample2, tTest ) ;^200^^^^^198^201^return tTest.tTest ( sample1, sample2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   double[] sample1 double[] sample2 double alpha [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Variable_Misuse]^return tTest.tTest ( sample2, sample2 ) ;^208^^^^^206^209^return tTest.tTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest.tTest ( sample2, sample1 ) ;^208^^^^^206^209^return tTest.tTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample2.tTest ( sample1, tTest ) ;^208^^^^^206^209^return tTest.tTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sample1.tTest ( tTest, sample2 ) ;^208^^^^^206^209^return tTest.tTest ( sample1, sample2 ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   double[] sample1 double[] sample2 [VARIABLES] TTest  tTest  boolean  double[]  sample1  sample2  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return tTest. tTest ( sampleStats2, sampleStats1, alpha ) ;^217^^^^^214^218^return tTest. tTest ( sampleStats1, sampleStats2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return sampleStats2. tTest ( sampleStats1, tTest, alpha ) ;^217^^^^^214^218^return tTest. tTest ( sampleStats1, sampleStats2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest. tTest ( alpha, sampleStats2, sampleStats1 ) ;^217^^^^^214^218^return tTest. tTest ( sampleStats1, sampleStats2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return alpha. tTest ( sampleStats1, sampleStats2, tTest ) ;^217^^^^^214^218^return tTest. tTest ( sampleStats1, sampleStats2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return sampleStats1. tTest ( tTest, sampleStats2, alpha ) ;^217^^^^^214^218^return tTest. tTest ( sampleStats1, sampleStats2, alpha ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] boolean   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 double alpha [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return tTest.tTest ( sampleStats2, sampleStats1 ) ;^226^^^^^223^227^return tTest.tTest ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return sampleStats1.tTest ( tTest, sampleStats2 ) ;^226^^^^^223^227^return tTest.tTest ( sampleStats1, sampleStats2 ) ;^[CLASS] TestUtils  [METHOD] tTest [RETURN_TYPE] double   StatisticalSummary sampleStats1 StatisticalSummary sampleStats2 [VARIABLES] TTest  tTest  StatisticalSummary  sampleStats1  sampleStats2  boolean  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return expected.chiSquare ( chiSquareTest, observed ) ;^234^^^^^232^235^return chiSquareTest.chiSquare ( expected, observed ) ;^[CLASS] TestUtils  [METHOD] chiSquare [RETURN_TYPE] double   double[] expected long[] observed [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return chiSquareTest.chiSquare ( observed, expected ) ;^234^^^^^232^235^return chiSquareTest.chiSquare ( expected, observed ) ;^[CLASS] TestUtils  [METHOD] chiSquare [RETURN_TYPE] double   double[] expected long[] observed [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return observed.chiSquare ( expected, chiSquareTest ) ;^234^^^^^232^235^return chiSquareTest.chiSquare ( expected, observed ) ;^[CLASS] TestUtils  [METHOD] chiSquare [RETURN_TYPE] double   double[] expected long[] observed [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return counts.chiSquare ( chiSquareTest ) ;^242^^^^^240^243^return chiSquareTest.chiSquare ( counts ) ;^[CLASS] TestUtils  [METHOD] chiSquare [RETURN_TYPE] double   long[][] counts [VARIABLES] TTest  tTest  boolean  long[][]  counts  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return chiSquareTest.chiSquareTest ( alpha, observed, expected ) ;^251^^^^^248^252^return chiSquareTest.chiSquareTest ( expected, observed, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   double[] expected long[] observed double alpha [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return observed.chiSquareTest ( expected, chiSquareTest, alpha ) ;^251^^^^^248^252^return chiSquareTest.chiSquareTest ( expected, observed, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   double[] expected long[] observed double alpha [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return chiSquareTest.chiSquareTest ( expected, alpha, observed ) ;^251^^^^^248^252^return chiSquareTest.chiSquareTest ( expected, observed, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   double[] expected long[] observed double alpha [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return alpha.chiSquareTest ( expected, observed, chiSquareTest ) ;^251^^^^^248^252^return chiSquareTest.chiSquareTest ( expected, observed, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   double[] expected long[] observed double alpha [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return chiSquareTest.chiSquareTest ( observed, expected, alpha ) ;^251^^^^^248^252^return chiSquareTest.chiSquareTest ( expected, observed, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   double[] expected long[] observed double alpha [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return chiSquareTest.chiSquareTest ( observed, expected ) ;^259^^^^^257^260^return chiSquareTest.chiSquareTest ( expected, observed ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] double   double[] expected long[] observed [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return observed.chiSquareTest ( expected, chiSquareTest ) ;^259^^^^^257^260^return chiSquareTest.chiSquareTest ( expected, observed ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] double   double[] expected long[] observed [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return expected.chiSquareTest ( chiSquareTest, observed ) ;^259^^^^^257^260^return chiSquareTest.chiSquareTest ( expected, observed ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] double   double[] expected long[] observed [VARIABLES] TTest  tTest  boolean  double[]  expected  long[]  observed  ChiSquareTest  chiSquareTest  
[BugLab_Argument_Swapping]^return chiSquareTest. chiSquareTest ( alpha, counts ) ;^267^^^^^265^268^return chiSquareTest. chiSquareTest ( counts, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   long[][] counts double alpha [VARIABLES] TTest  tTest  boolean  long[][]  counts  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return alpha. chiSquareTest ( counts, chiSquareTest ) ;^267^^^^^265^268^return chiSquareTest. chiSquareTest ( counts, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   long[][] counts double alpha [VARIABLES] TTest  tTest  boolean  long[][]  counts  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return counts. chiSquareTest ( chiSquareTest, alpha ) ;^267^^^^^265^268^return chiSquareTest. chiSquareTest ( counts, alpha ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] boolean   long[][] counts double alpha [VARIABLES] TTest  tTest  boolean  long[][]  counts  ChiSquareTest  chiSquareTest  double  alpha  
[BugLab_Argument_Swapping]^return counts. chiSquareTest ( chiSquareTest ) ;^275^^^^^273^276^return chiSquareTest. chiSquareTest ( counts ) ;^[CLASS] TestUtils  [METHOD] chiSquareTest [RETURN_TYPE] double   long[][] counts [VARIABLES] TTest  tTest  boolean  long[][]  counts  ChiSquareTest  chiSquareTest  