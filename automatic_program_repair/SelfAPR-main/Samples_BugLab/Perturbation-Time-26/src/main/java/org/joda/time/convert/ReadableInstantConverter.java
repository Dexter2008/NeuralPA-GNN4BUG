[BugLab_Wrong_Operator]^if  ( chrono != null )  {^59^^^^^57^70^if  ( chrono == null )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Variable_Misuse]^return ISOChronology.getInstance ( chronoZone ) ;^60^^^^^57^70^return ISOChronology.getInstance ( zone ) ;^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Argument_Swapping]^if  ( zone != chronoZone )  {^63^^^^^57^70^if  ( chronoZone != zone )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Argument_Swapping]^if  ( zoneZone != chrono )  {^63^^^^^57^70^if  ( chronoZone != zone )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Argument_Swapping]^if  ( chronoZoneZone != zone )  {^63^^^^^57^70^if  ( chronoZone != zone )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Wrong_Operator]^if  ( chronoZone <= zone )  {^63^^^^^57^70^if  ( chronoZone != zone )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Wrong_Operator]^if  ( chrono != null )  {^65^^^^^57^70^if  ( chrono == null )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Variable_Misuse]^return ISOChronology.getInstance ( chronoZone ) ;^66^^^^^57^70^return ISOChronology.getInstance ( zone ) ;^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Variable_Misuse]^chrono = chrono.withZone ( chronoZone ) ;^64^^^^^57^70^chrono = chrono.withZone ( zone ) ;^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Argument_Swapping]^chrono = zone.withZone ( chrono ) ;^64^^^^^57^70^chrono = chrono.withZone ( zone ) ;^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  DateTimeZone  chronoZone  zone  
[BugLab_Wrong_Operator]^if  ( chrono != null )  {^83^^^^^82^88^if  ( chrono == null )  {^[CLASS] ReadableInstantConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object Chronology chrono [VARIABLES] ReadableInstantConverter  INSTANCE  Object  object  Chronology  chrono  boolean  