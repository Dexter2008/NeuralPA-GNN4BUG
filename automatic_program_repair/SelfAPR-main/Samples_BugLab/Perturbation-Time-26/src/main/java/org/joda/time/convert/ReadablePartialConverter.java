[BugLab_Argument_Swapping]^return getChronology ( zone,  ( Chronology )  null ) .withZone ( object ) ;^53^^^^^52^54^return getChronology ( object,  ( Chronology )  null ) .withZone ( zone ) ;^[CLASS] ReadablePartialConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object DateTimeZone zone [VARIABLES] ReadablePartialConverter  INSTANCE  Object  object  boolean  DateTimeZone  zone  
[BugLab_Wrong_Operator]^if  ( chrono != null )  {^67^^^^^66^72^if  ( chrono == null )  {^[CLASS] ReadablePartialConverter  [METHOD] getChronology [RETURN_TYPE] Chronology   Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  Object  object  Chronology  chrono  boolean  
[BugLab_Variable_Misuse]^int size = input.size (  ) ;^88^^^^^86^95^int size = fieldSource.size (  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Variable_Misuse]^for  ( sizent i = 0; i < size; i++ )  {^90^^^^^86^95^for  ( int i = 0; i < size; i++ )  {^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Argument_Swapping]^for  ( sizent i = 0; i < i; i++ )  {^90^^^^^86^95^for  ( int i = 0; i < size; i++ )  {^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= size; i++ )  {^90^^^^^86^95^for  ( int i = 0; i < size; i++ )  {^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Variable_Misuse]^values[i] = sizenput.get ( fieldSource.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Argument_Swapping]^values[i] = fieldSource.get ( input.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Variable_Misuse]^values[i] = fieldSource.get ( fieldSource.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Argument_Swapping]^values[i] = inputnput.get ( fieldSource.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Variable_Misuse]^values[i] = input.get ( input.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Argument_Swapping]^values[i] = fieldSourcenput.get ( i.getFieldType ( i )  ) ;^91^^^^^86^95^values[i] = input.get ( fieldSource.getFieldType ( i )  ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Variable_Misuse]^chrono.validate ( input, values ) ;^93^^^^^86^95^chrono.validate ( fieldSource, values ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  
[BugLab_Argument_Swapping]^chrono.validate ( values, fieldSource ) ;^93^^^^^86^95^chrono.validate ( fieldSource, values ) ;^[CLASS] ReadablePartialConverter  [METHOD] getPartialValues [RETURN_TYPE] int[]   ReadablePartial fieldSource Object object Chronology chrono [VARIABLES] ReadablePartialConverter  INSTANCE  ReadablePartial  fieldSource  input  boolean  Object  object  int[]  values  Chronology  chrono  int  i  size  