[BugLab_Wrong_Operator]^if  ( value != null )  {^183^^^^^182^187^if  ( value == null )  {^[CLASS] Range  [METHOD] containsLong [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Wrong_Literal]^return true;^184^^^^^182^187^return false;^[CLASS] Range  [METHOD] containsLong [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Wrong_Operator]^return value >= getMinimumLong (  )  || value <= getMaximumLong (  ) ;^201^^^^^200^202^return value >= getMinimumLong (  )  && value <= getMaximumLong (  ) ;^[CLASS] Range  [METHOD] containsLong [RETURN_TYPE] boolean   long value [VARIABLES] boolean  long  value  
[BugLab_Wrong_Operator]^return value > getMinimumLong (  )  && value <= getMaximumLong (  ) ;^201^^^^^200^202^return value >= getMinimumLong (  )  && value <= getMaximumLong (  ) ;^[CLASS] Range  [METHOD] containsLong [RETURN_TYPE] boolean   long value [VARIABLES] boolean  long  value  
[BugLab_Wrong_Operator]^return value >= getMinimumLong (  )  && value < getMaximumLong (  ) ;^201^^^^^200^202^return value >= getMinimumLong (  )  && value <= getMaximumLong (  ) ;^[CLASS] Range  [METHOD] containsLong [RETURN_TYPE] boolean   long value [VARIABLES] boolean  long  value  
[BugLab_Wrong_Operator]^if  ( value != null )  {^217^^^^^216^221^if  ( value == null )  {^[CLASS] Range  [METHOD] containsInteger [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Wrong_Literal]^return true;^218^^^^^216^221^return false;^[CLASS] Range  [METHOD] containsInteger [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Wrong_Operator]^return value >= getMinimumInteger (  )  || value <= getMaximumInteger (  ) ;^235^^^^^234^236^return value >= getMinimumInteger (  )  && value <= getMaximumInteger (  ) ;^[CLASS] Range  [METHOD] containsInteger [RETURN_TYPE] boolean   int value [VARIABLES] boolean  int  value  
[BugLab_Wrong_Operator]^return value > getMinimumInteger (  )  && value <= getMaximumInteger (  ) ;^235^^^^^234^236^return value >= getMinimumInteger (  )  && value <= getMaximumInteger (  ) ;^[CLASS] Range  [METHOD] containsInteger [RETURN_TYPE] boolean   int value [VARIABLES] boolean  int  value  
[BugLab_Wrong_Operator]^return value >= getMinimumInteger (  )  && value < getMaximumInteger (  ) ;^235^^^^^234^236^return value >= getMinimumInteger (  )  && value <= getMaximumInteger (  ) ;^[CLASS] Range  [METHOD] containsInteger [RETURN_TYPE] boolean   int value [VARIABLES] boolean  int  value  
[BugLab_Wrong_Operator]^if  ( value != null )  {^251^^^^^250^255^if  ( value == null )  {^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Wrong_Literal]^return true;^252^^^^^250^255^return false;^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Argument_Swapping]^return compareMax <= 0 && compareMin >= 0;^271^^^^^268^272^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   double value [VARIABLES] boolean  double  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^return compareMin <= 0 || compareMax >= 0;^271^^^^^268^272^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   double value [VARIABLES] boolean  double  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^return compareMin < 0 && compareMax >= 0;^271^^^^^268^272^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   double value [VARIABLES] boolean  double  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^return compareMin <= 0 && compareMax > 0;^271^^^^^268^272^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   double value [VARIABLES] boolean  double  value  int  compareMax  compareMin  
[BugLab_Wrong_Literal]^return compareMin <= compareMax && compareMax >= compareMax;^271^^^^^268^272^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsDouble [RETURN_TYPE] boolean   double value [VARIABLES] boolean  double  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^if  ( value != null )  {^287^^^^^286^291^if  ( value == null )  {^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Wrong_Literal]^return true;^288^^^^^286^291^return false;^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   Number value [VARIABLES] boolean  Number  value  
[BugLab_Argument_Swapping]^return compareMax <= 0 && compareMin >= 0;^307^^^^^304^308^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   float value [VARIABLES] boolean  float  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^return compareMin <= 0 || compareMax >= 0;^307^^^^^304^308^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   float value [VARIABLES] boolean  float  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^return compareMin == 0 && compareMax >= 0;^307^^^^^304^308^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   float value [VARIABLES] boolean  float  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^return compareMin <= 0 && compareMax > 0;^307^^^^^304^308^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   float value [VARIABLES] boolean  float  value  int  compareMax  compareMin  
[BugLab_Wrong_Literal]^return compareMin <= 1 && compareMax >= 1;^307^^^^^304^308^return compareMin <= 0 && compareMax >= 0;^[CLASS] Range  [METHOD] containsFloat [RETURN_TYPE] boolean   float value [VARIABLES] boolean  float  value  int  compareMax  compareMin  
[BugLab_Wrong_Operator]^if  ( range != null )  {^331^^^^^330^336^if  ( range == null )  {^[CLASS] Range  [METHOD] containsRange [RETURN_TYPE] boolean   Range range [VARIABLES] boolean  Range  range  
[BugLab_Wrong_Literal]^return true;^332^^^^^330^336^return false;^[CLASS] Range  [METHOD] containsRange [RETURN_TYPE] boolean   Range range [VARIABLES] boolean  Range  range  
[BugLab_Wrong_Operator]^return containsNumber ( range.getMinimumNumber (  )  ) || containsNumber ( range.getMaximumNumber (  )  ) ;^334^335^^^^330^336^return containsNumber ( range.getMinimumNumber (  )  ) && containsNumber ( range.getMaximumNumber (  )  ) ;^[CLASS] Range  [METHOD] containsRange [RETURN_TYPE] boolean   Range range [VARIABLES] boolean  Range  range  
[BugLab_Wrong_Operator]^if  ( range != null )  {^357^^^^^356^363^if  ( range == null )  {^[CLASS] Range  [METHOD] overlapsRange [RETURN_TYPE] boolean   Range range [VARIABLES] boolean  Range  range  
[BugLab_Wrong_Literal]^return true;^358^^^^^356^363^return false;^[CLASS] Range  [METHOD] overlapsRange [RETURN_TYPE] boolean   Range range [VARIABLES] boolean  Range  range  
[BugLab_Wrong_Operator]^return range.containsNumber ( getMinimumNumber (  )  ) && range.containsNumber ( getMaximumNumber (  )  ) || containsNumber ( range.getMinimumNumber (  )  ) ;^360^361^362^^^356^363^return range.containsNumber ( getMinimumNumber (  )  ) || range.containsNumber ( getMaximumNumber (  )  ) || containsNumber ( range.getMinimumNumber (  )  ) ;^[CLASS] Range  [METHOD] overlapsRange [RETURN_TYPE] boolean   Range range [VARIABLES] boolean  Range  range  
[BugLab_Wrong_Operator]^if  ( obj != this )  {^381^^^^^380^390^if  ( obj == this )  {^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Operator]^} else if  ( obj == null && obj.getClass (  )  != getClass (  )  )  {^383^^^^^380^390^} else if  ( obj == null || obj.getClass (  )  != getClass (  )  )  {^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Operator]^} else if  ( obj != null || obj.getClass (  )  != getClass (  )  )  {^383^^^^^380^390^} else if  ( obj == null || obj.getClass (  )  != getClass (  )  )  {^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Operator]^} else if  ( obj == null || obj.getClass (  )  == getClass (  )  )  {^383^^^^^380^390^} else if  ( obj == null || obj.getClass (  )  != getClass (  )  )  {^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Operator]^return getMinimumNumber (  ) .equals ( range.getMinimumNumber (  )  )  || getMaximumNumber (  ) .equals ( range.getMaximumNumber (  )  ) ;^387^388^^^^380^390^return getMinimumNumber (  ) .equals ( range.getMinimumNumber (  )  )  && getMaximumNumber (  ) .equals ( range.getMaximumNumber (  )  ) ;^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Literal]^return true;^384^^^^^380^390^return false;^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Literal]^return false;^382^^^^^380^390^return true;^[CLASS] Range  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] boolean  Object  obj  Range  range  
[BugLab_Wrong_Literal]^int result = result;^402^^^^^401^407^int result = 17;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Operator]^result = 37 * result + getClass (  >  ) .hashCode (  ) ;^403^^^^^401^407^result = 37 * result + getClass (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Operator]^result = 37 - result + getClass (  ) .hashCode (  ) ;^403^^^^^401^407^result = 37 * result + getClass (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Literal]^result = 38 * result + getClass (  ) .hashCode (  ) ;^403^^^^^401^407^result = 37 * result + getClass (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Operator]^result = 37 * result + getMinimumNumber (  |  ) .hashCode (  ) ;^404^^^^^401^407^result = 37 * result + getMinimumNumber (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Operator]^result = 37 / result + getMinimumNumber (  ) .hashCode (  ) ;^404^^^^^401^407^result = 37 * result + getMinimumNumber (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Literal]^result = result * result + getMinimumNumber (  ) .hashCode (  ) ;^404^^^^^401^407^result = 37 * result + getMinimumNumber (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Operator]^result = 37 * result + getMaximumNumber (  &  ) .hashCode (  ) ;^405^^^^^401^407^result = 37 * result + getMaximumNumber (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Operator]^result = 37 + result + getMaximumNumber (  ) .hashCode (  ) ;^405^^^^^401^407^result = 37 * result + getMaximumNumber (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Literal]^result = result * result + getMaximumNumber (  ) .hashCode (  ) ;^405^^^^^401^407^result = 37 * result + getMaximumNumber (  ) .hashCode (  ) ;^[CLASS] Range  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] boolean  int  result  
[BugLab_Wrong_Literal]^StringBuffer buf = new StringBuffer ( 33 ) ;^421^^^^^420^428^StringBuffer buf = new StringBuffer ( 32 ) ;^[CLASS] Range  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buf  boolean  