[BugLab_Wrong_Operator]^if  ( seriesKey != null )  {^103^^^^^99^117^if  ( seriesKey == null )  {^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Wrong_Operator]^if  ( date != null )  {^106^^^^^99^117^if  ( date == null )  {^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.high = createNumberArray ( open ) ;^111^^^^^99^117^this.high = createNumberArray ( high ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.high = createNumberArray ( volume ) ;^111^^^^^99^117^this.high = createNumberArray ( high ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.low = createNumberArray ( open ) ;^112^^^^^99^117^this.low = createNumberArray ( low ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.low = createNumberArray ( volume ) ;^112^^^^^99^117^this.low = createNumberArray ( low ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.open = createNumberArray ( low ) ;^113^^^^^99^117^this.open = createNumberArray ( open ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.close = createNumberArray ( volume ) ;^114^^^^^99^117^this.close = createNumberArray ( close ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.close = createNumberArray ( open ) ;^114^^^^^99^117^this.close = createNumberArray ( close ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^this.volume = createNumberArray ( low ) ;^115^^^^^99^117^this.volume = createNumberArray ( volume ) ;^[CLASS] DefaultHighLowDataset  [METHOD] <init> [RETURN_TYPE] Date[],double[],double[],double[],double[],double[])   Comparable seriesKey Date[] date double[] high double[] low double[] open double[] close double[] volume [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  double[]  close  high  low  open  volume  Date[]  date  
[BugLab_Variable_Misuse]^return seriesKey;^128^^^^^127^129^return this.seriesKey;^[CLASS] DefaultHighLowDataset  [METHOD] getSeriesKey [RETURN_TYPE] Comparable   int series [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  series  
[BugLab_Variable_Misuse]^return new Long ( date[item].getTime (  )  ) ;^146^^^^^145^147^return new Long ( this.date[item].getTime (  )  ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getX [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  item  series  
[BugLab_Variable_Misuse]^return date[item];^162^^^^^161^163^return this.date[item];^[CLASS] DefaultHighLowDataset  [METHOD] getXDate [RETURN_TYPE] Date   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  item  series  
[BugLab_Argument_Swapping]^return getClose ( item, series ) ;^179^^^^^178^180^return getClose ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getY [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  item  series  
[BugLab_Variable_Misuse]^return low[item];^193^^^^^192^194^return this.high[item];^[CLASS] DefaultHighLowDataset  [METHOD] getHigh [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  item  series  
[BugLab_Variable_Misuse]^Number high = getHigh ( item, item ) ;^209^^^^^207^214^Number high = getHigh ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  high  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number high = getHigh ( series, series ) ;^209^^^^^207^214^Number high = getHigh ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  high  Date[]  date  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number high = getHigh ( item, series ) ;^209^^^^^207^214^Number high = getHigh ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  high  Date[]  date  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( high == null )  {^210^^^^^207^214^if  ( high != null )  {^[CLASS] DefaultHighLowDataset  [METHOD] getHighValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  high  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^return volume[item];^227^^^^^226^228^return this.low[item];^[CLASS] DefaultHighLowDataset  [METHOD] getLow [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  item  series  
[BugLab_Variable_Misuse]^Number low = getLow ( item, item ) ;^243^^^^^241^248^Number low = getLow ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  low  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number low = getLow ( series, series ) ;^243^^^^^241^248^Number low = getLow ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  low  Date[]  date  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number low = getLow ( item, series ) ;^243^^^^^241^248^Number low = getLow ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  low  Date[]  date  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( low == null )  {^244^^^^^241^248^if  ( low != null )  {^[CLASS] DefaultHighLowDataset  [METHOD] getLowValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  low  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number open = getOpen ( item, item ) ;^277^^^^^275^282^Number open = getOpen ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  open  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number open = getOpen ( series, series ) ;^277^^^^^275^282^Number open = getOpen ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  open  Date[]  date  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number open = getOpen ( item, series ) ;^277^^^^^275^282^Number open = getOpen ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  open  Date[]  date  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( open == null )  {^278^^^^^275^282^if  ( open != null )  {^[CLASS] DefaultHighLowDataset  [METHOD] getOpenValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  open  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^return volume[item];^295^^^^^294^296^return this.close[item];^[CLASS] DefaultHighLowDataset  [METHOD] getClose [RETURN_TYPE] Number   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  item  series  
[BugLab_Variable_Misuse]^Number close = getClose ( item, item ) ;^311^^^^^309^316^Number close = getClose ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  close  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number close = getClose ( series, series ) ;^311^^^^^309^316^Number close = getClose ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  close  Date[]  date  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number close = getClose ( item, series ) ;^311^^^^^309^316^Number close = getClose ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  close  Date[]  date  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( close == null )  {^312^^^^^309^316^if  ( close != null )  {^[CLASS] DefaultHighLowDataset  [METHOD] getCloseValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  close  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number volume = getVolume ( item, item ) ;^345^^^^^343^350^Number volume = getVolume ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  volume  Date[]  date  double  result  int  item  series  
[BugLab_Variable_Misuse]^Number volume = getVolume ( series, series ) ;^345^^^^^343^350^Number volume = getVolume ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  volume  Date[]  date  double  result  int  item  series  
[BugLab_Argument_Swapping]^Number volume = getVolume ( item, series ) ;^345^^^^^343^350^Number volume = getVolume ( series, item ) ;^[CLASS] DefaultHighLowDataset  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  volume  Date[]  date  double  result  int  item  series  
[BugLab_Wrong_Operator]^if  ( volume == null )  {^346^^^^^343^350^if  ( volume != null )  {^[CLASS] DefaultHighLowDataset  [METHOD] getVolumeValue [RETURN_TYPE] double   int series int item [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Number  volume  Date[]  date  double  result  int  item  series  
[BugLab_Wrong_Literal]^return null;^360^^^^^359^361^return 1;^[CLASS] DefaultHighLowDataset  [METHOD] getSeriesCount [RETURN_TYPE] int   [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  
[BugLab_Variable_Misuse]^return date.length;^371^^^^^370^372^return this.date.length;^[CLASS] DefaultHighLowDataset  [METHOD] getItemCount [RETURN_TYPE] int   int series [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  boolean  Date[]  date  int  series  
[BugLab_Wrong_Operator]^if  ( obj != this )  {^382^^^^^381^411^if  ( obj == this )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return false;^383^^^^^381^411^return true;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Operator]^if  ( ! ( obj  <=  DefaultHighLowDataset )  )  {^385^^^^^381^411^if  ( ! ( obj instanceof DefaultHighLowDataset )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^386^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !this.seriesKey.equals ( seriesKey )  )  {^389^^^^^381^411^if  ( !this.seriesKey.equals ( that.seriesKey )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^390^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( date, that.date )  )  {^392^^^^^381^411^if  ( !Arrays.equals ( this.date, that.date )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.date, date )  )  {^392^^^^^381^411^if  ( !Arrays.equals ( this.date, that.date )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.date, that.date.date )  )  {^392^^^^^381^411^if  ( !Arrays.equals ( this.date, that.date )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that.date, this.date )  )  {^392^^^^^381^411^if  ( !Arrays.equals ( this.date, that.date )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.date, that )  )  {^392^^^^^381^411^if  ( !Arrays.equals ( this.date, that.date )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^393^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that, this.date.date )  )  {^392^^^^^381^411^if  ( !Arrays.equals ( this.date, that.date )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( volume, that.open )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.open, volume )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.open, that.open.open )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that.open, this.open )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^396^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( low, that.open )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.open, low )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that, this.open.open )  )  {^395^^^^^381^411^if  ( !Arrays.equals ( this.open, that.open )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( volume, that.high )  )  {^398^^^^^381^411^if  ( !Arrays.equals ( this.high, that.high )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.high, volume )  )  {^398^^^^^381^411^if  ( !Arrays.equals ( this.high, that.high )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.high, that.high.high )  )  {^398^^^^^381^411^if  ( !Arrays.equals ( this.high, that.high )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that.high, this.high )  )  {^398^^^^^381^411^if  ( !Arrays.equals ( this.high, that.high )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^399^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( open, that.high )  )  {^398^^^^^381^411^if  ( !Arrays.equals ( this.high, that.high )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( volume, that.low )  )  {^401^^^^^381^411^if  ( !Arrays.equals ( this.low, that.low )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.low, that.low.low )  )  {^401^^^^^381^411^if  ( !Arrays.equals ( this.low, that.low )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that.low, this.low )  )  {^401^^^^^381^411^if  ( !Arrays.equals ( this.low, that.low )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^402^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.low, low )  )  {^401^^^^^381^411^if  ( !Arrays.equals ( this.low, that.low )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that, this.low.low )  )  {^401^^^^^381^411^if  ( !Arrays.equals ( this.low, that.low )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( low, that.close )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.close, volume )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.close, that.close.close )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that, this.close.close )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that.close, this.close )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^405^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( volume, that.close )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.close, low )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( this.close, that )  )  {^404^^^^^381^411^if  ( !Arrays.equals ( this.close, that.close )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( open, that.volume )  )  {^407^^^^^381^411^if  ( !Arrays.equals ( this.volume, that.volume )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.volume, open )  )  {^407^^^^^381^411^if  ( !Arrays.equals ( this.volume, that.volume )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that, this.volume.volume )  )  {^407^^^^^381^411^if  ( !Arrays.equals ( this.volume, that.volume )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^if  ( !Arrays.equals ( that.volume, this.volume )  )  {^407^^^^^381^411^if  ( !Arrays.equals ( this.volume, that.volume )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return true;^408^^^^^381^411^return false;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( volume, that.volume )  )  {^407^^^^^381^411^if  ( !Arrays.equals ( this.volume, that.volume )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Variable_Misuse]^if  ( !Arrays.equals ( this.volume, low )  )  {^407^^^^^381^411^if  ( !Arrays.equals ( this.volume, that.volume )  )  {^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Wrong_Literal]^return false;^410^^^^^381^411^return true;^[CLASS] DefaultHighLowDataset  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  volume  Object  obj  boolean  Date[]  date  DefaultHighLowDataset  that  
[BugLab_Argument_Swapping]^for  ( data.lengthnt i = 0; i < i; i++ )  {^423^^^^^421^427^for  ( int i = 0; i < data.length; i++ )  {^[CLASS] DefaultHighLowDataset  [METHOD] createNumberArray [RETURN_TYPE] Number[]   double[] data [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  result  volume  boolean  double[]  data  Date[]  date  int  i  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= data.length; i++ )  {^423^^^^^421^427^for  ( int i = 0; i < data.length; i++ )  {^[CLASS] DefaultHighLowDataset  [METHOD] createNumberArray [RETURN_TYPE] Number[]   double[] data [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  result  volume  boolean  double[]  data  Date[]  date  int  i  
[BugLab_Wrong_Literal]^for  ( int i = i; i < data.length; i++ )  {^423^^^^^421^427^for  ( int i = 0; i < data.length; i++ )  {^[CLASS] DefaultHighLowDataset  [METHOD] createNumberArray [RETURN_TYPE] Number[]   double[] data [VARIABLES] Comparable  seriesKey  Number[]  close  high  low  open  result  volume  boolean  double[]  data  Date[]  date  int  i  