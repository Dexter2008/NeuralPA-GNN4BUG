[BugLab_Wrong_Operator]^if  ( value != Integer.MIN_VALUE )  {^209^^^^^208^213^if  ( value == Integer.MIN_VALUE )  {^[CLASS] DurationField  [METHOD] subtract [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  long  instant  int  value  
[BugLab_Variable_Misuse]^if  ( instant == Long.MIN_VALUE )  {^224^^^^^223^228^if  ( value == Long.MIN_VALUE )  {^[CLASS] DurationField  [METHOD] subtract [RETURN_TYPE] long   long instant long value [VARIABLES] boolean  long  instant  value  
[BugLab_Variable_Misuse]^if  ( value == Long.instant )  {^224^^^^^223^228^if  ( value == Long.MIN_VALUE )  {^[CLASS] DurationField  [METHOD] subtract [RETURN_TYPE] long   long instant long value [VARIABLES] boolean  long  instant  value  
[BugLab_Wrong_Operator]^if  ( value != Long.MIN_VALUE )  {^224^^^^^223^228^if  ( value == Long.MIN_VALUE )  {^[CLASS] DurationField  [METHOD] subtract [RETURN_TYPE] long   long instant long value [VARIABLES] boolean  long  instant  value  