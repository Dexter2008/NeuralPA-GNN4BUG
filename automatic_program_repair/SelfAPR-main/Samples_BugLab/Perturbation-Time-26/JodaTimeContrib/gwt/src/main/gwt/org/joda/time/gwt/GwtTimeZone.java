[BugLab_Wrong_Operator]^return - -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^38^^^^^36^39^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^[CLASS] GwtTimeZone  [METHOD] getStandardOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Operator]^return + -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^38^^^^^36^39^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^[CLASS] GwtTimeZone  [METHOD] getStandardOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Operator]^return -1 / 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^38^^^^^36^39^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^[CLASS] GwtTimeZone  [METHOD] getStandardOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Literal]^return -0 * 0000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^38^^^^^36^39^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getStandardOffset (  ) ;^[CLASS] GwtTimeZone  [METHOD] getStandardOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Operator]^return - -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^42^^^^^41^43^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Operator]^return + -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^42^^^^^41^43^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Operator]^return -1 + 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^42^^^^^41^43^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Literal]^return -1 * 999 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^42^^^^^41^43^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Argument_Swapping]^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * instant.getOffset ( new Date ( gwtTimeZone )  ) ;^42^^^^^41^43^return -1 * 1000 * DateTimeConstants.SECONDS_PER_MINUTE * gwtTimeZone.getOffset ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getOffset [RETURN_TYPE] int   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Argument_Swapping]^return instant.getShortName ( new Date ( gwtTimeZone )  ) ;^46^^^^^45^47^return gwtTimeZone.getShortName ( new Date ( instant )  ) ;^[CLASS] GwtTimeZone  [METHOD] getNameKey [RETURN_TYPE] String   long instant [VARIABLES] TimeZone  gwtTimeZone  long  instant  boolean  
[BugLab_Wrong_Operator]^if  ( this != object )  {^54^^^^^53^63^if  ( this == object )  {^[CLASS] GwtTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] TimeZone  gwtTimeZone  Object  object  GwtTimeZone  other  boolean  
[BugLab_Wrong_Literal]^return false;^55^^^^^53^63^return true;^[CLASS] GwtTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] TimeZone  gwtTimeZone  Object  object  GwtTimeZone  other  boolean  
[BugLab_Wrong_Operator]^if  ( object  &&  GwtTimeZone )  {^57^^^^^53^63^if  ( object instanceof GwtTimeZone )  {^[CLASS] GwtTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] TimeZone  gwtTimeZone  Object  object  GwtTimeZone  other  boolean  
[BugLab_Wrong_Literal]^return true;^62^^^^^53^63^return false;^[CLASS] GwtTimeZone  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] TimeZone  gwtTimeZone  Object  object  GwtTimeZone  other  boolean  