[BugLab_Variable_Misuse]^String name =  ( String )  iNames.get ( iId ) ;^72^^^^^70^86^String name =  ( String )  iNames.get ( localeStr ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Argument_Swapping]^String name =  ( String )  localeStr.get ( iNames ) ;^72^^^^^70^86^String name =  ( String )  iNames.get ( localeStr ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^String name =  ( String )  iNames.get ( name ) ;^72^^^^^70^86^String name =  ( String )  iNames.get ( localeStr ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^if  ( iId == null && locale.getVariant (  ) .length (  )  > 0 )  {^73^^^^^70^86^if  ( name == null && locale.getVariant (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Argument_Swapping]^if  ( locale == null && name.getVariant (  ) .length (  )  > 0 )  {^73^^^^^70^86^if  ( name == null && locale.getVariant (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name == null || locale.getVariant (  ) .length (  )  > 0 )  {^73^^^^^70^86^if  ( name == null && locale.getVariant (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name != null && locale.getVariant (  ) .length (  )  > 0 )  {^73^^^^^70^86^if  ( name == null && locale.getVariant (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name == null && locale.getVariant (  ) .length (  )  >= 0 )  {^73^^^^^70^86^if  ( name == null && locale.getVariant (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^if  ( name == null && locale.getVariant (  ) .length (  )  >  )  {^73^^^^^70^86^if  ( name == null && locale.getVariant (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Argument_Swapping]^name =  ( String )  localeStr.get ( iNames.substring ( 0, 5 )  ) ;^74^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 5 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^name =  ( String )  iNames.get ( name.substring ( 0, 5 )  ) ;^74^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 5 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( -1, 5 )  ) ;^74^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 5 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( 0, 6 )  ) ;^74^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 5 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( 1, 5 )  ) ;^74^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 5 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( 0,  )  ) ;^74^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 5 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^if  ( iId == null && locale.getCountry (  ) .length (  )  > 0 )  {^76^^^^^70^86^if  ( name == null && locale.getCountry (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name == null || locale.getCountry (  ) .length (  )  > 0 )  {^76^^^^^70^86^if  ( name == null && locale.getCountry (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name != null && locale.getCountry (  ) .length (  )  > 0 )  {^76^^^^^70^86^if  ( name == null && locale.getCountry (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name == null && locale.getCountry (  ) .length (  )  < 0 )  {^76^^^^^70^86^if  ( name == null && locale.getCountry (  ) .length (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^name =  ( String )  iNames.get ( name.substring ( 0, 2 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Argument_Swapping]^name =  ( String )  localeStr.get ( iNames.substring ( 0, 2 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( , 2 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( 0, 3 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( 0, 1 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( -1, 2 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^name =  ( String )  iNames.get ( localeStr.substring ( 1, 2 )  ) ;^77^^^^^70^86^name =  ( String )  iNames.get ( localeStr.substring ( 0, 2 )  ) ;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^if  ( localeStr == null )  {^79^^^^^70^86^if  ( name == null )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name != null )  {^79^^^^^70^86^if  ( name == null )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^if  ( localeStr == null && iNames.size (  )  > 0 )  {^82^^^^^70^86^if  ( name == null && iNames.size (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Argument_Swapping]^if  ( iNames == null && name.size (  )  > 0 )  {^82^^^^^70^86^if  ( name == null && iNames.size (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name == null || iNames.size (  )  > 0 )  {^82^^^^^70^86^if  ( name == null && iNames.size (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name != null && iNames.size (  )  > 0 )  {^82^^^^^70^86^if  ( name == null && iNames.size (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Operator]^if  ( name == null && iNames.size (  )  >= 0 )  {^82^^^^^70^86^if  ( name == null && iNames.size (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Wrong_Literal]^if  ( name == null && iNames.size (  )  > -1 )  {^82^^^^^70^86^if  ( name == null && iNames.size (  )  > 0 )  {^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Variable_Misuse]^return localeStr;^85^^^^^70^86^return name;^[CLASS] Holiday  [METHOD] getName [RETURN_TYPE] String   Locale locale [VARIABLES] Locale  locale  List  iHolidayRules  String  iId  localeStr  name  boolean  Map  iNames  
[BugLab_Argument_Swapping]^if  ( mdt.appliesForYear ( rule, year )  )  {^99^^^^^95^104^if  ( rule.appliesForYear ( mdt, year )  )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^if  ( rule.appliesForYear ( year, mdt )  )  {^99^^^^^95^104^if  ( rule.appliesForYear ( mdt, year )  )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Variable_Misuse]^return new YearMonthDay ( rule.applyForYear ( mdt, i )  ) ;^100^^^^^95^104^return new YearMonthDay ( rule.applyForYear ( mdt, year )  ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^return new YearMonthDay ( mdt.applyForYear ( rule, year )  ) ;^100^^^^^95^104^return new YearMonthDay ( rule.applyForYear ( mdt, year )  ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^return new YearMonthDay ( rule.applyForYear ( year, mdt )  ) ;^100^^^^^95^104^return new YearMonthDay ( rule.applyForYear ( mdt, year )  ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^return new YearMonthDay ( year.applyForYear ( mdt, rule )  ) ;^100^^^^^95^104^return new YearMonthDay ( rule.applyForYear ( mdt, year )  ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^for  ( iHolidayRulesnt i = 0; i < i.size (  ) ; i++ )  {^97^^^^^95^104^for  ( int i = 0; i < iHolidayRules.size (  ) ; i++ )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= iHolidayRules.size (  ) ; i++ )  {^97^^^^^95^104^for  ( int i = 0; i < iHolidayRules.size (  ) ; i++ )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Variable_Misuse]^if  ( rule.appliesForYear ( mdt, i )  )  {^99^^^^^95^104^if  ( rule.appliesForYear ( mdt, year )  )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^if  ( year.appliesForYear ( mdt, rule )  )  {^99^^^^^95^104^if  ( rule.appliesForYear ( mdt, year )  )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Variable_Misuse]^HolidayRule rule =  ( HolidayRule )  yearHolidayRules.get ( i ) ;^98^^^^^95^104^HolidayRule rule =  ( HolidayRule )  iHolidayRules.get ( i ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^HolidayRule rule =  ( HolidayRule )  iHolidayRulesHolidayRules.get ( i ) ;^98^^^^^95^104^HolidayRule rule =  ( HolidayRule )  iHolidayRules.get ( i ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Argument_Swapping]^HolidayRule rule =  ( HolidayRule )  i.get ( iHolidayRules ) ;^98^^^^^95^104^HolidayRule rule =  ( HolidayRule )  iHolidayRules.get ( i ) ;^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  
[BugLab_Wrong_Literal]^for  ( int i = i; i < iHolidayRules.size (  ) ; i++ )  {^97^^^^^95^104^for  ( int i = 0; i < iHolidayRules.size (  ) ; i++ )  {^[CLASS] Holiday  [METHOD] yearMonthDayForYear [RETURN_TYPE] YearMonthDay   int year [VARIABLES] boolean  MutableDateTime  mdt  List  iHolidayRules  String  iId  localeStr  name  Map  iNames  HolidayRule  rule  int  i  year  