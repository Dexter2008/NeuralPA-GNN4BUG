[P8_Replace_Mix]^private  ThreadLocal<IMockitoConfiguration> globalConfiguration = new ThreadLocal<IMockitoConfiguration> (  ) ;^19^^^^^14^24^private static ThreadLocal<IMockitoConfiguration> globalConfiguration = new ThreadLocal<IMockitoConfiguration> (  ) ;^[CLASS] GlobalConfiguration   [VARIABLES] 
[P2_Replace_Operator]^if  ( globalConfiguration.get (  )  != null )  {^28^^^^^26^31^if  ( globalConfiguration.get (  )  == null )  {^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P8_Replace_Mix]^if  ( globalConfiguration.get (  )  == false )  {^28^^^^^26^31^if  ( globalConfiguration.get (  )  == null )  {^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P15_Unwrap_Block]^org.mockito.internal.configuration.GlobalConfiguration.globalConfiguration.set(createConfig());^28^29^30^^^26^31^if  ( globalConfiguration.get (  )  == null )  { globalConfiguration.set ( createConfig (  )  ) ; }^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P16_Remove_Block]^^28^29^30^^^26^31^if  ( globalConfiguration.get (  )  == null )  { globalConfiguration.set ( createConfig (  )  ) ; }^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^globalConfiguration.get ( createConfig (  )  ) ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^globalConfiguration .get (  )  ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^globalConfiguration.set ( GlobalConfiguration (  )  ) ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P14_Delete_Statement]^^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P11_Insert_Donor_Statement]^return globalConfiguration.get (  ) .getReturnValues (  ) ;globalConfiguration.set ( createConfig (  )  ) ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P11_Insert_Donor_Statement]^return globalConfiguration.get (  ) .getAnnotationEngine (  ) ;globalConfiguration.set ( createConfig (  )  ) ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P11_Insert_Donor_Statement]^return globalConfiguration.get (  ) .cleansStackTrace (  ) ;globalConfiguration.set ( createConfig (  )  ) ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P11_Insert_Donor_Statement]^return globalConfiguration.get (  ) .getDefaultAnswer (  ) ;globalConfiguration.set ( createConfig (  )  ) ;^29^^^^^26^31^globalConfiguration.set ( createConfig (  )  ) ;^[CLASS] GlobalConfiguration  [METHOD] <init> [RETURN_TYPE] GlobalConfiguration()   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P12_Insert_Condition]^if  ( globalConfiguration.get (  )  == null )  { return globalConfiguration.get (  ) ; }^23^^^^^22^24^return globalConfiguration.get (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getIt [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P14_Delete_Statement]^^23^^^^^22^24^return globalConfiguration.get (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getIt [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P11_Insert_Donor_Statement]^IMockitoConfiguration config = new ClassPathLoader (  ) .loadConfiguration (  ) ;IMockitoConfiguration defaultConfiguration = new DefaultMockitoConfiguration (  ) ;^35^^^^^34^42^IMockitoConfiguration defaultConfiguration = new DefaultMockitoConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P4_Replace_Constructor]^IMockitoConfiguration config = IMockitoConfiguration config =  new GlobalConfiguration (  )  .loadConfiguration (  ) ;^36^^^^^34^42^IMockitoConfiguration config = new ClassPathLoader (  ) .loadConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P7_Replace_Invocation]^IMockitoConfiguration config = new ClassPathLoader (  ) .ClassPathLoader (  ) ;^36^^^^^34^42^IMockitoConfiguration config = new ClassPathLoader (  ) .loadConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P11_Insert_Donor_Statement]^IMockitoConfiguration defaultConfiguration = new DefaultMockitoConfiguration (  ) ;IMockitoConfiguration config = new ClassPathLoader (  ) .loadConfiguration (  ) ;^36^^^^^34^42^IMockitoConfiguration config = new ClassPathLoader (  ) .loadConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P14_Delete_Statement]^^36^^^^^34^42^IMockitoConfiguration config = new ClassPathLoader (  ) .loadConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P2_Replace_Operator]^if  ( config == null )  {^37^^^^^34^42^if  ( config != null )  {^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P8_Replace_Mix]^if  ( config != true )  {^37^^^^^34^42^if  ( config != null )  {^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P15_Unwrap_Block]^return config;^37^38^39^40^41^34^42^if  ( config != null )  { return config; } else { return defaultConfiguration; }^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P16_Remove_Block]^^37^38^39^40^41^34^42^if  ( config != null )  { return config; } else { return defaultConfiguration; }^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P5_Replace_Variable]^return config;^40^^^^^34^42^return defaultConfiguration;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P5_Replace_Variable]^return defaultConfiguration;^38^^^^^34^42^return config;^[CLASS] GlobalConfiguration  [METHOD] createConfig [RETURN_TYPE] IMockitoConfiguration   [VARIABLES] ThreadLocal  globalConfiguration  IMockitoConfiguration  config  defaultConfiguration  boolean  
[P4_Replace_Constructor]^new ClassPathLoader (  )  ;^45^^^^^44^46^new GlobalConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] validate [RETURN_TYPE] void   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P12_Insert_Condition]^if  ( globalConfiguration.get (  )  == null )  { new GlobalConfiguration (  ) ; }^45^^^^^44^46^new GlobalConfiguration (  ) ;^[CLASS] GlobalConfiguration  [METHOD] validate [RETURN_TYPE] void   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^return globalConfiguration.get (  ) .getDefaultAnswer (  ) ;^49^^^^^48^50^return globalConfiguration.get (  ) .getReturnValues (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getReturnValues [RETURN_TYPE] ReturnValues   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P12_Insert_Condition]^if  ( globalConfiguration.get (  )  == null )  { return globalConfiguration.get (  ) .getReturnValues (  ) ; }^49^^^^^48^50^return globalConfiguration.get (  ) .getReturnValues (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getReturnValues [RETURN_TYPE] ReturnValues   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P14_Delete_Statement]^^49^^^^^48^50^return globalConfiguration.get (  ) .getReturnValues (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getReturnValues [RETURN_TYPE] ReturnValues   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^return globalConfiguration.get (  ) .getReturnValues (  ) ;^53^^^^^52^54^return globalConfiguration.get (  ) .getAnnotationEngine (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getAnnotationEngine [RETURN_TYPE] AnnotationEngine   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P12_Insert_Condition]^if  ( globalConfiguration.get (  )  == null )  { return globalConfiguration.get (  ) .getAnnotationEngine (  ) ; }^53^^^^^52^54^return globalConfiguration.get (  ) .getAnnotationEngine (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getAnnotationEngine [RETURN_TYPE] AnnotationEngine   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P14_Delete_Statement]^^53^^^^^52^54^return globalConfiguration.get (  ) .getAnnotationEngine (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getAnnotationEngine [RETURN_TYPE] AnnotationEngine   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^return globalConfiguration.get (  ) .getAnnotationEngine (  ) ;^57^^^^^56^58^return globalConfiguration.get (  ) .cleansStackTrace (  ) ;^[CLASS] GlobalConfiguration  [METHOD] cleansStackTrace [RETURN_TYPE] boolean   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P12_Insert_Condition]^if  ( globalConfiguration.get (  )  == null )  { return globalConfiguration.get (  ) .cleansStackTrace (  ) ; }^57^^^^^56^58^return globalConfiguration.get (  ) .cleansStackTrace (  ) ;^[CLASS] GlobalConfiguration  [METHOD] cleansStackTrace [RETURN_TYPE] boolean   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P14_Delete_Statement]^^57^^^^^56^58^return globalConfiguration.get (  ) .cleansStackTrace (  ) ;^[CLASS] GlobalConfiguration  [METHOD] cleansStackTrace [RETURN_TYPE] boolean   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P7_Replace_Invocation]^return globalConfiguration.get (  ) .getReturnValues (  ) ;^61^^^^^60^62^return globalConfiguration.get (  ) .getDefaultAnswer (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getDefaultAnswer [RETURN_TYPE] Answer   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P12_Insert_Condition]^if  ( globalConfiguration.get (  )  == null )  { return globalConfiguration.get (  ) .getDefaultAnswer (  ) ; }^61^^^^^60^62^return globalConfiguration.get (  ) .getDefaultAnswer (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getDefaultAnswer [RETURN_TYPE] Answer   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P14_Delete_Statement]^^61^^^^^60^62^return globalConfiguration.get (  ) .getDefaultAnswer (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getDefaultAnswer [RETURN_TYPE] Answer   [VARIABLES] ThreadLocal  globalConfiguration  boolean  
[P8_Replace_Mix]^return this.get (  ) .getDefaultAnswer (  ) ;^61^^^^^60^62^return globalConfiguration.get (  ) .getDefaultAnswer (  ) ;^[CLASS] GlobalConfiguration  [METHOD] getDefaultAnswer [RETURN_TYPE] Answer   [VARIABLES] ThreadLocal  globalConfiguration  boolean  