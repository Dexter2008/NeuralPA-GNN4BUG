[BugLab_Variable_Misuse]^super ( type, range ) ;^57^^^^^55^70^super ( type, unit ) ;^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Argument_Swapping]^super ( unit, type ) ;^57^^^^^55^70^super ( type, unit ) ;^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^long unitMillis = range.getUnitMillis (  ) ;^63^^^^^55^70^long rangeMillis = range.getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^iRange =  ( int )  ( serialVersionUID / getUnitMillis (  )  ) ;^64^^^^^55^70^iRange =  ( int )  ( rangeMillis / getUnitMillis (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^iRange =  ( int )  ( rangeMillis - getUnitMillis (  )  ) ;^64^^^^^55^70^iRange =  ( int )  ( rangeMillis / getUnitMillis (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^if  ( iRange <= 2 )  {^65^^^^^55^70^if  ( iRange < 2 )  {^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Literal]^if  ( iRange < 1 )  {^65^^^^^55^70^if  ( iRange < 2 )  {^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^iRangeField = unit;^69^^^^^55^70^iRangeField = range;^[CLASS] PreciseDateTimeField  [METHOD] <init> [RETURN_TYPE] DurationField)   DateTimeFieldType type DurationField unit DurationField range [VARIABLES] DateTimeFieldType  type  boolean  DurationField  iRangeField  range  unit  long  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^if  ( serialVersionUID >= 0 )  {^79^^^^^78^84^if  ( instant >= 0 )  {^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^if  ( instant > 0 )  {^79^^^^^78^84^if  ( instant >= 0 )  {^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Literal]^if  ( instant >= iRange )  {^79^^^^^78^84^if  ( instant >= 0 )  {^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^return iRange - 1 +  ( int )   (  (  ( serialVersionUID + 1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Argument_Swapping]^return instant - 1 +  ( int )   (  (  ( iRange + 1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  &  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange  &&  1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )   >>  iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  * getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  ( int )   (  (  ( instant  <<  1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Literal]^return iRange - 1 +  ( int )   (  (  ( instant  )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Literal]^return iRange - iRange +  ( int )   (  (  ( instant + iRange )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^return  ( int )   (  ( serialVersionUID / getUnitMillis (  )  )  % iRange ) ;^80^^^^^78^84^return  ( int )   (  ( instant / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Argument_Swapping]^return  ( int )   (  ( iRange / getUnitMillis (  )  )  % instant ) ;^80^^^^^78^84^return  ( int )   (  ( instant / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return  ( int )   (  ( instant / getUnitMillis (  )  )   >>  iRange ) ;^80^^^^^78^84^return  ( int )   (  ( instant / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return  ( int )   (  ( instant + getUnitMillis (  )  )  % iRange ) ;^80^^^^^78^84^return  ( int )   (  ( instant / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return  ( int )   (  ( instant / getUnitMillis (  )  )   ||  iRange ) ;^80^^^^^78^84^return  ( int )   (  ( instant / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return  ( int )   (  ( instant - getUnitMillis (  )  )  % iRange ) ;^80^^^^^78^84^return  ( int )   (  ( instant / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  >>  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange  <<  1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )   ==  iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Wrong_Operator]^return iRange - 1 +  ( int )   (  (  ( instant  ==  1 )  / getUnitMillis (  )  )  % iRange ) ;^82^^^^^78^84^return iRange - 1 +  ( int )   (  (  ( instant + 1 )  / getUnitMillis (  )  )  % iRange ) ;^[CLASS] PreciseDateTimeField  [METHOD] get [RETURN_TYPE] int   long instant [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  iRange  
[BugLab_Variable_Misuse]^int thisValue = get ( serialVersionUID ) ;^95^^^^^94^100^int thisValue = get ( instant ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^int wrappedValue = FieldUtils.getWrappedValue ( iRange, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^96^97^^^^94^100^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, thisValue, getMinimumValue (  ) , getMaximumValue (  )  ) ;^96^97^^^^94^100^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Argument_Swapping]^int wrappedValue = FieldUtils.getWrappedValue ( amount, thisValue, getMinimumValue (  ) , getMaximumValue (  )  ) ;^96^97^^^^94^100^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^int wrappedValue = FieldUtils.getWrappedValue ( wrappedValue, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^96^97^^^^94^100^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, wrappedValue, getMinimumValue (  ) , getMaximumValue (  )  ) ;^96^97^^^^94^100^int wrappedValue = FieldUtils.getWrappedValue ( thisValue, amount, getMinimumValue (  ) , getMaximumValue (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^return serialVersionUID +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^return instant +  ( iRange - thisValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^return instant +  ( wrappedValue - wrappedValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Argument_Swapping]^return wrappedValue +  ( instant - thisValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Argument_Swapping]^return instant +  ( thisValue - wrappedValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Wrong_Operator]^return instant +  <=  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Wrong_Operator]^return + instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Wrong_Operator]^return instant +  ( wrappedValue  <  thisValue )  * getUnitMillis (  ) ;^99^^^^^94^100^return instant +  ( wrappedValue - thisValue )  * getUnitMillis (  ) ;^[CLASS] PreciseDateTimeField  [METHOD] addWrapField [RETURN_TYPE] long   long instant int amount [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  wrappedValue  
[BugLab_Variable_Misuse]^FieldUtils.verifyValueBounds ( this, wrappedValue, getMinimumValue (  ) , getMaximumValue (  )  ) ;^111^^^^^110^113^FieldUtils.verifyValueBounds ( this, value, getMinimumValue (  ) , getMaximumValue (  )  ) ;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Variable_Misuse]^return serialVersionUID +  ( value - get ( instant )  )  * iUnitMillis;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Variable_Misuse]^return instant +  ( wrappedValue - get ( instant )  )  * iUnitMillis;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Argument_Swapping]^return value +  ( instant - get ( instant )  )  * iUnitMillis;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Argument_Swapping]^return iUnitMillis +  ( value - get ( instant )  )  * instant;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Wrong_Operator]^return instant +  <=  ( value - get ( instant )  )  * iUnitMillis;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Wrong_Operator]^return + instant +  ( value - get ( instant )  )  * iUnitMillis;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Wrong_Operator]^return instant +  ( value  ==  get ( instant )  )  * iUnitMillis;^112^^^^^110^113^return instant +  ( value - get ( instant )  )  * iUnitMillis;^[CLASS] PreciseDateTimeField  [METHOD] set [RETURN_TYPE] long   long instant int value [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Variable_Misuse]^return unit;^122^^^^^121^123^return iRangeField;^[CLASS] PreciseDateTimeField  [METHOD] getRangeDurationField [RETURN_TYPE] DurationField   [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Variable_Misuse]^return wrappedValue - 1;^131^^^^^130^132^return iRange - 1;^[CLASS] PreciseDateTimeField  [METHOD] getMaximumValue [RETURN_TYPE] int   [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Wrong_Operator]^return iRange  &  1;^131^^^^^130^132^return iRange - 1;^[CLASS] PreciseDateTimeField  [METHOD] getMaximumValue [RETURN_TYPE] int   [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Wrong_Literal]^return iRange - thisValue;^131^^^^^130^132^return iRange - 1;^[CLASS] PreciseDateTimeField  [METHOD] getMaximumValue [RETURN_TYPE] int   [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  
[BugLab_Variable_Misuse]^return wrappedValue;^143^^^^^142^144^return iRange;^[CLASS] PreciseDateTimeField  [METHOD] getRange [RETURN_TYPE] int   [VARIABLES] boolean  DurationField  iRangeField  range  unit  long  instant  rangeMillis  serialVersionUID  int  amount  iRange  thisValue  value  wrappedValue  