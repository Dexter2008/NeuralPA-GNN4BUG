[BugLab_Variable_Misuse]^this.open = low;^76^^^^^75^80^this.open = open;^[CLASS] OHLC  [METHOD] <init> [RETURN_TYPE] OHLC(double,double,double,double)   double open double high double low double close [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Variable_Misuse]^this.close = open;^77^^^^^75^80^this.close = close;^[CLASS] OHLC  [METHOD] <init> [RETURN_TYPE] OHLC(double,double,double,double)   double open double high double low double close [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Variable_Misuse]^this.high = open;^78^^^^^75^80^this.high = high;^[CLASS] OHLC  [METHOD] <init> [RETURN_TYPE] OHLC(double,double,double,double)   double open double high double low double close [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Variable_Misuse]^this.low = open;^79^^^^^75^80^this.low = low;^[CLASS] OHLC  [METHOD] <init> [RETURN_TYPE] OHLC(double,double,double,double)   double open double high double low double close [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Variable_Misuse]^return open;^97^^^^^96^98^return this.close;^[CLASS] OHLC  [METHOD] getClose [RETURN_TYPE] double   [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Variable_Misuse]^return open;^106^^^^^105^107^return this.high;^[CLASS] OHLC  [METHOD] getHigh [RETURN_TYPE] double   [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Variable_Misuse]^return open;^115^^^^^114^116^return this.low;^[CLASS] OHLC  [METHOD] getLow [RETURN_TYPE] double   [VARIABLES] double  close  high  low  open  boolean  
[BugLab_Wrong_Operator]^if  ( obj != this )  {^126^^^^^125^146^if  ( obj == this )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return false;^127^^^^^125^146^return true;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Operator]^if  ( ! ( obj  !=  OHLC )  )  {^129^^^^^125^146^if  ( ! ( obj instanceof OHLC )  )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return true;^130^^^^^125^146^return false;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( this.open != open )  {^133^^^^^125^146^if  ( this.open != that.open )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( that != this.open.open )  {^133^^^^^125^146^if  ( this.open != that.open )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( that.open != this.open )  {^133^^^^^125^146^if  ( this.open != that.open )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Operator]^if  ( this.open == that.open )  {^133^^^^^125^146^if  ( this.open != that.open )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return true;^134^^^^^125^146^return false;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( low != that.close )  {^136^^^^^125^146^if  ( this.close != that.close )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( this.close != low )  {^136^^^^^125^146^if  ( this.close != that.close )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( this.close != that.close.close )  {^136^^^^^125^146^if  ( this.close != that.close )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( that.close != this.close )  {^136^^^^^125^146^if  ( this.close != that.close )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( this.close != that )  {^136^^^^^125^146^if  ( this.close != that.close )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Operator]^if  ( this.close > that.close )  {^136^^^^^125^146^if  ( this.close != that.close )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return true;^137^^^^^125^146^return false;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( open != that.high )  {^139^^^^^125^146^if  ( this.high != that.high )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( this.high != open )  {^139^^^^^125^146^if  ( this.high != that.high )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( that != this.high.high )  {^139^^^^^125^146^if  ( this.high != that.high )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( that.high != this.high )  {^139^^^^^125^146^if  ( this.high != that.high )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( this.high != that )  {^139^^^^^125^146^if  ( this.high != that.high )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Operator]^if  ( this.high == that.high )  {^139^^^^^125^146^if  ( this.high != that.high )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return true;^140^^^^^125^146^return false;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( low != that.low )  {^142^^^^^125^146^if  ( this.low != that.low )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Variable_Misuse]^if  ( this.low != low )  {^142^^^^^125^146^if  ( this.low != that.low )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( this.low != that.low.low )  {^142^^^^^125^146^if  ( this.low != that.low )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( that.low != this.low )  {^142^^^^^125^146^if  ( this.low != that.low )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Argument_Swapping]^if  ( this.low != that )  {^142^^^^^125^146^if  ( this.low != that.low )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Operator]^if  ( this.low == that.low )  {^142^^^^^125^146^if  ( this.low != that.low )  {^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return true;^143^^^^^125^146^return false;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  
[BugLab_Wrong_Literal]^return false;^145^^^^^125^146^return true;^[CLASS] OHLC  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Object  obj  boolean  OHLC  that  double  close  high  low  open  