[BugLab_Wrong_Literal]^valueSpecified = true;^69^^^^^67^75^valueSpecified = false;^[CLASS] ParseDateTimeSupport  [METHOD] init [RETURN_TYPE] void   [VARIABLES] Locale  locale  boolean  valueSpecified  String  pattern  style  value  var  DateTimeZone  dateTimeZone  int  scope  
[BugLab_Variable_Misuse]^this.scope = Util.getScope ( var ) ;^82^^^^^81^83^this.scope = Util.getScope ( scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] setScope [RETURN_TYPE] void   String scope [VARIABLES] Locale  locale  boolean  valueSpecified  String  pattern  scope  style  value  var  DateTimeZone  dateTimeZone  int  scope  
[BugLab_Variable_Misuse]^this.scope = Util.getScope ( value ) ;^82^^^^^81^83^this.scope = Util.getScope ( scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] setScope [RETURN_TYPE] void   String scope [VARIABLES] Locale  locale  boolean  valueSpecified  String  pattern  scope  style  value  var  DateTimeZone  dateTimeZone  int  scope  
[BugLab_Variable_Misuse]^if  ( styleSpecified )  {^89^^^^^74^104^if  ( valueSpecified )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^if  ( value )  {^89^^^^^74^104^if  ( valueSpecified )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( bodyContent != null || bodyContent.getString (  )  != null )  {^94^^^^^89^97^if  ( bodyContent != null && bodyContent.getString (  )  != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( bodyContent == null && bodyContent.getString (  )  != null )  {^94^^^^^89^97^if  ( bodyContent != null && bodyContent.getString (  )  != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( bodyContent != null && bodyContent.getString (  )  == null )  {^94^^^^^89^97^if  ( bodyContent != null && bodyContent.getString (  )  != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^input = this.getString (  ) .trim (  ) ;^95^^^^^89^97^input = bodyContent.getString (  ) .trim (  ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^input = 3.getString (  ) .trim (  ) ;^95^^^^^89^97^input = bodyContent.getString (  ) .trim (  ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^input = var;^91^^^^^76^106^input = value;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( bodyContent != null || bodyContent.getString (  )  != null )  {^94^^^^^79^109^if  ( bodyContent != null && bodyContent.getString (  )  != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( bodyContent == null && bodyContent.getString (  )  != null )  {^94^^^^^79^109^if  ( bodyContent != null && bodyContent.getString (  )  != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( bodyContent != null && bodyContent.getString (  )  == null )  {^94^^^^^79^109^if  ( bodyContent != null && bodyContent.getString (  )  != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  (  ( value == null )  || input.equals ( "" )  )  {^99^^^^^84^114^if  (  ( input == null )  || input.equals ( "" )  )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  (  ( input == null )  && input.equals ( "" )  )  {^99^^^^^84^114^if  (  ( input == null )  || input.equals ( "" )  )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  (  ( input != null )  || input.equals ( "" )  )  {^99^^^^^84^114^if  (  ( input == null )  || input.equals ( "" )  )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  ( value != null )  {^100^^^^^85^115^if  ( var != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( var == null )  {^100^^^^^85^115^if  ( var != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^pageContext.removeAttribute ( value, scope ) ;^101^^^^^86^116^pageContext.removeAttribute ( var, scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^pageContext.removeAttribute ( scope, var ) ;^101^^^^^86^116^pageContext.removeAttribute ( var, scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  (  ( var == null )  || input.equals ( "" )  )  {^99^^^^^84^114^if  (  ( input == null )  || input.equals ( "" )  )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  ( var != null )  {^108^^^^^93^123^if  ( pattern != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( pattern == null )  {^108^^^^^93^123^if  ( pattern != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^} else if  ( var != null )  {^110^^^^^95^125^} else if  ( style != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^} else if  ( style == null )  {^110^^^^^95^125^} else if  ( style != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^formatter = DateTimeFormat.forStyle ( var ) ;^111^^^^^96^126^formatter = DateTimeFormat.forStyle ( style ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^formatter = DateTimeFormat.forStyle ( value ) ;^111^^^^^96^126^formatter = DateTimeFormat.forStyle ( style ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^formatter = DateTimeFormat.forPattern ( var ) ;^109^^^^^94^124^formatter = DateTimeFormat.forPattern ( pattern ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^formatter = DateTimeFormat.forPattern ( value ) ;^109^^^^^94^124^formatter = DateTimeFormat.forPattern ( pattern ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( locale != null )  {^118^^^^^103^133^if  ( locale == null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Literal]^locale = Util.getFormattingLocale ( pageContext, this, false, DateFormat.getAvailableLocales (  )  ) ;^119^120^^^^104^134^locale = Util.getFormattingLocale ( pageContext, this, true, DateFormat.getAvailableLocales (  )  ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( locale == null )  {^122^^^^^107^137^if  ( locale != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^formatter = locale.withLocale ( formatter ) ;^123^^^^^108^138^formatter = formatter.withLocale ( locale ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^DateTimeZone tz = dateTimeZone;^127^^^^^112^142^DateTimeZone tz = this.dateTimeZone;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  ( dateTimeZone == null )  {^128^^^^^113^143^if  ( tz == null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( tz != null )  {^128^^^^^113^143^if  ( tz == null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  ( dateTimeZone != null )  {^131^^^^^116^146^if  ( tz != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( tz == null )  {^131^^^^^116^146^if  ( tz != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^formatter = formatter.withZone ( dateTimeZone ) ;^132^^^^^117^147^formatter = formatter.withZone ( tz ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^formatter = tz.withZone ( formatter ) ;^132^^^^^117^147^formatter = formatter.withZone ( tz ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^parsed = input.parseDateTime ( formatter ) ;^138^^^^^123^153^parsed = formatter.parseDateTime ( input ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^parsed = formatter.parseDateTime ( var ) ;^138^^^^^123^153^parsed = formatter.parseDateTime ( input ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^parsed = formatter.parseDateTime ( value ) ;^138^^^^^123^153^parsed = formatter.parseDateTime ( input ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^throw new JspException ( Resources.getMessage ( "PARSE_DATE_PARSE_ERROR", var ) , iae ) ;^140^141^^^^125^155^throw new JspException ( Resources.getMessage ( "PARSE_DATE_PARSE_ERROR", input ) , iae ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^throw new JspException ( Resources.getMessage ( "PARSE_DATE_PARSE_ERROR", iae ) , input ) ;^140^141^^^^125^155^throw new JspException ( Resources.getMessage ( "PARSE_DATE_PARSE_ERROR", input ) , iae ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^if  ( value != null )  {^144^^^^^129^159^if  ( var != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Wrong_Operator]^if  ( var == null )  {^144^^^^^129^159^if  ( var != null )  {^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Variable_Misuse]^pageContext.setAttribute ( value, parsed, scope ) ;^145^^^^^130^160^pageContext.setAttribute ( var, parsed, scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^pageContext.setAttribute ( parsed, var, scope ) ;^145^^^^^130^160^pageContext.setAttribute ( var, parsed, scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  
[BugLab_Argument_Swapping]^pageContext.setAttribute ( scope, parsed, var ) ;^145^^^^^130^160^pageContext.setAttribute ( var, parsed, scope ) ;^[CLASS] ParseDateTimeSupport  [METHOD] doEndTag [RETURN_TYPE] int   [VARIABLES] Locale  locale  boolean  valueSpecified  String  input  pattern  scope  style  value  var  IOException  ioe  DateTimeFormatter  formatter  DateTimeZone  dateTimeZone  tz  int  scope  DateTime  parsed  IllegalArgumentException  iae  