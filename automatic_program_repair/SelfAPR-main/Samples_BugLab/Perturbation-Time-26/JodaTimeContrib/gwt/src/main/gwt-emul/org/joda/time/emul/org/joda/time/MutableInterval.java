[BugLab_Variable_Misuse]^super ( serialVersionUID, endInstant, null ) ;^76^^^^^75^77^super ( startInstant, endInstant, null ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] MutableInterval(long,long)   long startInstant long endInstant [VARIABLES] long  endInstant  serialVersionUID  startInstant  boolean  
[BugLab_Argument_Swapping]^super ( endInstant, startInstant, null ) ;^76^^^^^75^77^super ( startInstant, endInstant, null ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] MutableInterval(long,long)   long startInstant long endInstant [VARIABLES] long  endInstant  serialVersionUID  startInstant  boolean  
[BugLab_Variable_Misuse]^super ( startInstant, serialVersionUID, chronology ) ;^88^^^^^87^89^super ( startInstant, endInstant, chronology ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] Chronology)   long startInstant long endInstant Chronology chronology [VARIABLES] long  endInstant  serialVersionUID  startInstant  Chronology  chronology  boolean  
[BugLab_Argument_Swapping]^super ( endInstant, startInstant, chronology ) ;^88^^^^^87^89^super ( startInstant, endInstant, chronology ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] Chronology)   long startInstant long endInstant Chronology chronology [VARIABLES] long  endInstant  serialVersionUID  startInstant  Chronology  chronology  boolean  
[BugLab_Argument_Swapping]^super ( startInstant, chronology, endInstant ) ;^88^^^^^87^89^super ( startInstant, endInstant, chronology ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] Chronology)   long startInstant long endInstant Chronology chronology [VARIABLES] long  endInstant  serialVersionUID  startInstant  Chronology  chronology  boolean  
[BugLab_Argument_Swapping]^super ( end, start ) ;^101^^^^^100^102^super ( start, end ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] ReadableInstant)   ReadableInstant start ReadableInstant end [VARIABLES] long  endInstant  serialVersionUID  startInstant  ReadableInstant  end  start  boolean  
[BugLab_Argument_Swapping]^super ( duration, start ) ;^113^^^^^112^114^super ( start, duration ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] ReadableDuration)   ReadableInstant start ReadableDuration duration [VARIABLES] ReadableInstant  start  boolean  ReadableDuration  duration  long  endInstant  serialVersionUID  startInstant  
[BugLab_Argument_Swapping]^super ( end, duration ) ;^125^^^^^124^126^super ( duration, end ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] ReadableInstant)   ReadableDuration duration ReadableInstant end [VARIABLES] ReadableInstant  end  boolean  ReadableDuration  duration  long  endInstant  serialVersionUID  startInstant  
[BugLab_Argument_Swapping]^super ( period, start ) ;^140^^^^^139^141^super ( start, period ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] ReadablePeriod)   ReadableInstant start ReadablePeriod period [VARIABLES] ReadableInstant  start  boolean  ReadablePeriod  period  long  endInstant  serialVersionUID  startInstant  
[BugLab_Argument_Swapping]^super ( end, period ) ;^155^^^^^154^156^super ( period, end ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] ReadableInstant)   ReadablePeriod period ReadableInstant end [VARIABLES] ReadableInstant  end  boolean  ReadablePeriod  period  long  endInstant  serialVersionUID  startInstant  
[BugLab_Argument_Swapping]^super ( chronology, interval ) ;^191^^^^^190^192^super ( interval, chronology ) ;^[CLASS] MutableInterval  [METHOD] <init> [RETURN_TYPE] Chronology)   Object interval Chronology chronology [VARIABLES] Object  interval  Chronology  chronology  boolean  long  endInstant  serialVersionUID  startInstant  
[BugLab_Wrong_Operator]^if  ( interval != null )  {^213^^^^^212^220^if  ( interval == null )  {^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInterval interval [VARIABLES] Chronology  chrono  boolean  long  endInstant  endMillis  serialVersionUID  startInstant  startMillis  ReadableInterval  interval  
[BugLab_Wrong_Operator]^if  ( start == null || end == null )  {^231^^^^^230^240^if  ( start == null && end == null )  {^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Wrong_Operator]^if  ( start != null && end == null )  {^231^^^^^230^240^if  ( start == null && end == null )  {^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Wrong_Operator]^if  ( start == null && end != null )  {^231^^^^^230^240^if  ( start == null && end == null )  {^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Variable_Misuse]^long startMillis = DateTimeUtils.getInstantMillis ( end ) ;^236^^^^^230^240^long endMillis = DateTimeUtils.getInstantMillis ( end ) ;^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Variable_Misuse]^Chronology chrono = DateTimeUtils.getInstantChronology ( end ) ;^237^^^^^230^240^Chronology chrono = DateTimeUtils.getInstantChronology ( start ) ;^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Variable_Misuse]^long endMillis = DateTimeUtils.getInstantMillis ( start ) ;^235^^^^^230^240^long startMillis = DateTimeUtils.getInstantMillis ( start ) ;^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Variable_Misuse]^setInterval ( startInstant, now ) ;^233^^^^^230^240^setInterval ( now, now ) ;^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Variable_Misuse]^setInterval ( startMillis, now ) ;^233^^^^^230^240^setInterval ( now, now ) ;^[CLASS] MutableInterval  [METHOD] setInterval [RETURN_TYPE] void   ReadableInstant start ReadableInstant end [VARIABLES] ReadableInstant  end  start  Chronology  chrono  boolean  long  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  
[BugLab_Variable_Misuse]^setEndMillis ( FieldUtils.safeAdd ( getStartMillis (  ) , startMillis )  ) ;^305^^^^^304^306^setEndMillis ( FieldUtils.safeAdd ( getStartMillis (  ) , duration )  ) ;^[CLASS] MutableInterval  [METHOD] setDurationAfterStart [RETURN_TYPE] void   long duration [VARIABLES] long  duration  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Variable_Misuse]^setStartMillis ( FieldUtils.safeAdd ( getEndMillis (  ) , -startInstant )  ) ;^316^^^^^315^317^setStartMillis ( FieldUtils.safeAdd ( getEndMillis (  ) , -duration )  ) ;^[CLASS] MutableInterval  [METHOD] setDurationBeforeEnd [RETURN_TYPE] void   long duration [VARIABLES] long  duration  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Variable_Misuse]^setEndMillis ( FieldUtils.safeAdd ( getStartMillis (  ) , startInstant )  ) ;^329^^^^^327^330^setEndMillis ( FieldUtils.safeAdd ( getStartMillis (  ) , durationMillis )  ) ;^[CLASS] MutableInterval  [METHOD] setDurationAfterStart [RETURN_TYPE] void   ReadableDuration duration [VARIABLES] ReadableDuration  duration  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Variable_Misuse]^setEndMillis ( FieldUtils.safeAdd ( getStartMillis (  ) , startMillis )  ) ;^329^^^^^327^330^setEndMillis ( FieldUtils.safeAdd ( getStartMillis (  ) , durationMillis )  ) ;^[CLASS] MutableInterval  [METHOD] setDurationAfterStart [RETURN_TYPE] void   ReadableDuration duration [VARIABLES] ReadableDuration  duration  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Variable_Misuse]^setStartMillis ( FieldUtils.safeAdd ( getEndMillis (  ) , -startMillis )  ) ;^341^^^^^339^342^setStartMillis ( FieldUtils.safeAdd ( getEndMillis (  ) , -durationMillis )  ) ;^[CLASS] MutableInterval  [METHOD] setDurationBeforeEnd [RETURN_TYPE] void   ReadableDuration duration [VARIABLES] ReadableDuration  duration  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Variable_Misuse]^setStartMillis ( FieldUtils.safeAdd ( getEndMillis (  ) , -serialVersionUID )  ) ;^341^^^^^339^342^setStartMillis ( FieldUtils.safeAdd ( getEndMillis (  ) , -durationMillis )  ) ;^[CLASS] MutableInterval  [METHOD] setDurationBeforeEnd [RETURN_TYPE] void   ReadableDuration duration [VARIABLES] ReadableDuration  duration  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Wrong_Operator]^if  ( period != null )  {^354^^^^^353^359^if  ( period == null )  {^[CLASS] MutableInterval  [METHOD] setPeriodAfterStart [RETURN_TYPE] void   ReadablePeriod period [VARIABLES] ReadablePeriod  period  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Wrong_Literal]^setEndMillis ( getChronology (  ) .add ( period, getStartMillis (  ) , 0 )  ) ;^357^^^^^353^359^setEndMillis ( getChronology (  ) .add ( period, getStartMillis (  ) , 1 )  ) ;^[CLASS] MutableInterval  [METHOD] setPeriodAfterStart [RETURN_TYPE] void   ReadablePeriod period [VARIABLES] ReadablePeriod  period  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Wrong_Literal]^setEndMillis ( getChronology (  ) .add ( period, getStartMillis (  ) , 2 )  ) ;^357^^^^^353^359^setEndMillis ( getChronology (  ) .add ( period, getStartMillis (  ) , 1 )  ) ;^[CLASS] MutableInterval  [METHOD] setPeriodAfterStart [RETURN_TYPE] void   ReadablePeriod period [VARIABLES] ReadablePeriod  period  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Wrong_Operator]^if  ( period != null )  {^370^^^^^369^375^if  ( period == null )  {^[CLASS] MutableInterval  [METHOD] setPeriodBeforeEnd [RETURN_TYPE] void   ReadablePeriod period [VARIABLES] ReadablePeriod  period  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Wrong_Literal]^setStartMillis ( getChronology (  ) .add ( period, getEndMillis (  ) , -0 )  ) ;^373^^^^^369^375^setStartMillis ( getChronology (  ) .add ( period, getEndMillis (  ) , -1 )  ) ;^[CLASS] MutableInterval  [METHOD] setPeriodBeforeEnd [RETURN_TYPE] void   ReadablePeriod period [VARIABLES] ReadablePeriod  period  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  
[BugLab_Wrong_Literal]^setStartMillis ( getChronology (  ) .add ( period, getEndMillis (  ) , -2 )  ) ;^373^^^^^369^375^setStartMillis ( getChronology (  ) .add ( period, getEndMillis (  ) , -1 )  ) ;^[CLASS] MutableInterval  [METHOD] setPeriodBeforeEnd [RETURN_TYPE] void   ReadablePeriod period [VARIABLES] ReadablePeriod  period  long  duration  durationMillis  endInstant  endMillis  now  serialVersionUID  startInstant  startMillis  boolean  