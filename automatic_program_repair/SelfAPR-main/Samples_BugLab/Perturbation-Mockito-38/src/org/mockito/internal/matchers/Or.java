[BugLab_Argument_Swapping]^if  ( actual.matches ( matcher )  )  {^25^^^^^23^30^if  ( matcher.matches ( actual )  )  {^[CLASS] Or  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] List  matchers  Object  actual  boolean  Matcher  matcher  
[BugLab_Wrong_Literal]^return false;^26^^^^^23^30^return true;^[CLASS] Or  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] List  matchers  Object  actual  boolean  Matcher  matcher  
[BugLab_Wrong_Literal]^return true;^29^^^^^23^30^return false;^[CLASS] Or  [METHOD] matches [RETURN_TYPE] boolean   Object actual [VARIABLES] List  matchers  Object  actual  boolean  Matcher  matcher  
[BugLab_Argument_Swapping]^for  ( Iterator<Matcher> matchers = it.iterator (  ) ; it.hasNext (  ) ; )  {^34^^^^^32^41^for  ( Iterator<Matcher> it = matchers.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] Or  [METHOD] describeTo [RETURN_TYPE] void   Description description [VARIABLES] Iterator  it  List  matchers  Description  description  boolean  