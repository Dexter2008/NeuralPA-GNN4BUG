[BugLab_Wrong_Operator]^if  ( opt != null ) {^44^45^^^^29^59^if  ( opt == null ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^else if  ( opt.length (  )  != 1 ) {^50^51^^^^35^65^else if  ( opt.length (  )  == 1 ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^else if  ( opt.length (  )  == 0 ) {^50^51^^^^35^65^else if  ( opt.length (  )  == 1 ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^throw new IllegalArgumentException ( "opt contains charsllegal character value '" + i[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  >>  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  &&  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( charsnt i = 0; i < i.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( int i = 0; i < chars; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  ( int i = 0; i > chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  <<  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  >=  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ^  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"   instanceof   chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ==  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  >  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^for  ( int i = i; i < chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  &&  ch  &&  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >=  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >>  ch  >>  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  &&  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <<  ch  <<  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <=  ch  <=  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  !=  ch  !=  "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <<  ch + "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <=  ch  <=  "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"   instanceof   ch + "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^throw new IllegalArgumentException ( "opt contains charsllegal character value '" + i[i] + "'" ) ;^70^71^72^^^68^73^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ^  chars[i] + "'" ) ;^70^71^72^^^68^73^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ||  chars[i] + "'" ) ;^70^71^72^^^68^73^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( chars.lengthnt i = 0; i < i; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( int i = 0; i < chars.length.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  ==  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  <=  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^throw new IllegalArgumentException ( "opt contains charsllegal character value '" + i[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  <  chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ||  chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"   instanceof   chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  &  ch  &  "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >>  ch + "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^throw new IllegalArgumentException ( "opt contains charsllegal character value '" + i[i] + "'" ) ;^70^71^72^^^55^85^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ==  chars[i] + "'" ) ;^70^71^72^^^55^85^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^char ch = opt.charAt ( -1 ) ;^52^^^^^37^67^char ch = opt.charAt ( 0 ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^for  ( int i = -1; i < chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >=  ch  >=  "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  ==  ch + "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^char ch = opt.charAt ( i ) ;^52^^^^^37^67^char ch = opt.charAt ( 0 ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^else if  ( opt.length (  )  >= 1 ) {^50^51^^^^35^65^else if  ( opt.length (  )  == 1 ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^else if  ( opt.length (  )  == i ) {^50^51^^^^35^65^else if  ( opt.length (  )  == 1 ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  ||  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( int i = 0; i < chars.length.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( chars.lengthnt i = 0; i < i; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  >>  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  <  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^50^75^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  >=  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  <<  chars[i] + "'" ) ;^70^71^72^^^50^75^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  &  ch  &  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  |  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >=  ch  >=  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <<  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  ==  ch  ==  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  ==  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^char ch = opt.charAt ( i ) ;^52^^^^^50^75^char ch = opt.charAt ( 0 ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  !=  ch  !=  "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  ^  ch + "'" ) ;^56^57^^^^50^75^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <<  ch  <<  "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  >  ch  >  "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  !=  ch + "'" ) ;^56^57^^^^54^58^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  <  chars[i] + "'" ) ;^70^71^72^^^68^73^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Argument_Swapping]^for  ( charsnt i = 0; i < i.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  ||  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^for  &  ( int i = 0; i < chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^for  ( int i = i; i < chars.length; i++ ) {^66^67^^^^51^81^for  ( int i = 0; i < chars.length; i++ ) {^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  >=  chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  <=  chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  &&  chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  !=  chars[i] + "'" ) ;^70^71^72^^^66^74^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <=  ch  <=  "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  ||  ch + "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "opt contains illegal character value '"  <  chars[i] + "'" ) ;^70^71^72^^^55^85^throw new IllegalArgumentException ( "opt contains illegal character value '" + chars[i] + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  <  ch  <  "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "illegal option value '"  ^  ch + "'" ) ;^56^57^^^^41^71^throw new IllegalArgumentException ( "illegal option value '" + ch + "'" ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Literal]^char ch = opt.charAt ( 1 ) ;^52^^^^^37^67^char ch = opt.charAt ( 0 ) ;^[CLASS] OptionValidator  [METHOD] validateOption [RETURN_TYPE] void   String opt [VARIABLES] boolean  char  ch  String  opt  int  i  char[]  chars  
[BugLab_Wrong_Operator]^return  ( isValidChar ( c )  &&  ( c == ' ' )  ||  ( c == '?' )  || c == '@' ) ;^87^^^^^85^88^return  ( isValidChar ( c )  ||  ( c == ' ' )  ||  ( c == '?' )  || c == '@' ) ;^[CLASS] OptionValidator  [METHOD] isValidOpt [RETURN_TYPE] boolean   char c [VARIABLES] boolean  char  c  
[BugLab_Wrong_Operator]^return  ( isValidChar ( c )  ||  ( c >= ' ' )  ||  ( c == '?' )  || c == '@' ) ;^87^^^^^85^88^return  ( isValidChar ( c )  ||  ( c == ' ' )  ||  ( c == '?' )  || c == '@' ) ;^[CLASS] OptionValidator  [METHOD] isValidOpt [RETURN_TYPE] boolean   char c [VARIABLES] boolean  char  c  
[BugLab_Wrong_Operator]^return  ( isValidChar ( c )  ||  ( c == ' ' )  ||  ( c < '?' )  || c == '@' ) ;^87^^^^^85^88^return  ( isValidChar ( c )  ||  ( c == ' ' )  ||  ( c == '?' )  || c == '@' ) ;^[CLASS] OptionValidator  [METHOD] isValidOpt [RETURN_TYPE] boolean   char c [VARIABLES] boolean  char  c  
[BugLab_Wrong_Operator]^return  ( isValidChar ( c )  ||  ( c == ' ' )  ||  ( c == '?' )  || c != '@' ) ;^87^^^^^85^88^return  ( isValidChar ( c )  ||  ( c == ' ' )  ||  ( c == '?' )  || c == '@' ) ;^[CLASS] OptionValidator  [METHOD] isValidOpt [RETURN_TYPE] boolean   char c [VARIABLES] boolean  char  c  