[P1_Replace_Type]^public static final int DEFAULT_SCALE_FACTOR = 1.0;^56^^^^^51^61^public static final double DEFAULT_SCALE_FACTOR = 1.0;^[CLASS] NormalizedMatrixSeries   [VARIABLES] 
[P3_Replace_Literal]^public static final double DEFAULT_SCALE_FACTOR = 0.125;^56^^^^^51^61^public static final double DEFAULT_SCALE_FACTOR = 1.0;^[CLASS] NormalizedMatrixSeries   [VARIABLES] 
[P8_Replace_Mix]^public  final double DEFAULT_SCALE_FACTOR = 0.0d;^56^^^^^51^61^public static final double DEFAULT_SCALE_FACTOR = 1.0;^[CLASS] NormalizedMatrixSeries   [VARIABLES] 
[P1_Replace_Type]^private int m_scaleFactor = DEFAULT_SCALE_FACTOR;^62^^^^^57^67^private double m_scaleFactor = DEFAULT_SCALE_FACTOR;^[CLASS] NormalizedMatrixSeries   [VARIABLES] 
[P5_Replace_Variable]^private double m_scaleFactor = null;^62^^^^^57^67^private double m_scaleFactor = DEFAULT_SCALE_FACTOR;^[CLASS] NormalizedMatrixSeries   [VARIABLES] 
[P1_Replace_Type]^private int m_totalSum;^65^^^^^60^70^private double m_totalSum;^[CLASS] NormalizedMatrixSeries   [VARIABLES] 
[P5_Replace_Variable]^super (  rows, columns ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P5_Replace_Variable]^super ( name,  columns ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P5_Replace_Variable]^super ( name, rows ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P5_Replace_Variable]^super ( rows, name, columns ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P5_Replace_Variable]^super ( name, columns, rows ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P5_Replace_Variable]^super ( columns, rows, name ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P8_Replace_Mix]^super ( name, columns, columns ) ;^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P14_Delete_Statement]^^75^^^^^74^84^super ( name, rows, columns ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P8_Replace_Mix]^this.m_totalSum  = null ;^83^^^^^74^84^this.m_totalSum = Double.MIN_VALUE;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P11_Insert_Donor_Statement]^this.m_totalSum = 0;this.m_totalSum = Double.MIN_VALUE;^83^^^^^74^84^this.m_totalSum = Double.MIN_VALUE;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P11_Insert_Donor_Statement]^this.m_totalSum += mij;this.m_totalSum = Double.MIN_VALUE;^83^^^^^74^84^this.m_totalSum = Double.MIN_VALUE;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P11_Insert_Donor_Statement]^this.m_totalSum -= get ( i, j ) ;this.m_totalSum = Double.MIN_VALUE;^83^^^^^74^84^this.m_totalSum = Double.MIN_VALUE;^[CLASS] NormalizedMatrixSeries  [METHOD] <init> [RETURN_TYPE] String,int,int)   String name int rows int columns [VARIABLES] String  name  boolean  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  int  columns  rows  
[P1_Replace_Type]^long  i = getItemRow ( itemIndex ) ;^96^^^^^95^103^int i = getItemRow ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^int i = getItemRow ( j ) ;^96^^^^^95^103^int i = getItemRow ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P7_Replace_Invocation]^int i = getItemColumn ( itemIndex ) ;^96^^^^^95^103^int i = getItemRow ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P11_Insert_Donor_Statement]^int j = getItemColumn ( itemIndex ) ;int i = getItemRow ( itemIndex ) ;^96^^^^^95^103^int i = getItemRow ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P8_Replace_Mix]^int i = getItemColumn ( j ) ;^96^^^^^95^103^int i = getItemRow ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P14_Delete_Statement]^^96^97^^^^95^103^int i = getItemRow ( itemIndex ) ; int j = getItemColumn ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P1_Replace_Type]^long  j = getItemColumn ( itemIndex ) ;^97^^^^^95^103^int j = getItemColumn ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^int j = getItemColumn ( i ) ;^97^^^^^95^103^int j = getItemColumn ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P11_Insert_Donor_Statement]^int i = getItemRow ( itemIndex ) ;int j = getItemColumn ( itemIndex ) ;^97^^^^^95^103^int j = getItemColumn ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^int j = getItemColumn ( j ) ;^97^^^^^95^103^int j = getItemColumn ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P14_Delete_Statement]^^97^^^^^95^103^int j = getItemColumn ( itemIndex ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P1_Replace_Type]^int mij = get ( i, j )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P2_Replace_Operator]^double + mij = get ( i, j )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^double mij = get ( j, j )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^double mij = get (  j )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^double mij = get ( i )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^double mij = get ( j, i )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^double mij = get ( i, this.m_scaleFactor )  * j;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P8_Replace_Mix]^double mij = get ( i, j )  * m_totalSum;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^double mij = get ( itemIndex, j )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P8_Replace_Mix]^double mij = get ( i, itemIndex )  * this.m_scaleFactor;^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P14_Delete_Statement]^^99^^^^^95^103^double mij = get ( i, j )  * this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P2_Replace_Operator]^Number n = new Double ( mij - this.m_totalSum ) ;^100^^^^^95^103^Number n = new Double ( mij / this.m_totalSum ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^Number n = new Double ( mij / m_totalSum ) ;^100^^^^^95^103^Number n = new Double ( mij / this.m_totalSum ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^Number n = new Double ( this.m_totalSum / mij ) ;^100^^^^^95^103^Number n = new Double ( mij / this.m_totalSum ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P8_Replace_Mix]^Number n = new Double ( m_totalSum / this.m_totalSum ) ;^100^^^^^95^103^Number n = new Double ( mij / this.m_totalSum ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P2_Replace_Operator]^Number n = new Double ( mij + this.m_totalSum ) ;^100^^^^^95^103^Number n = new Double ( mij / this.m_totalSum ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P8_Replace_Mix]^Number n = new Double ( mij / mij ) ;^100^^^^^95^103^Number n = new Double ( mij / this.m_totalSum ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] getItem [RETURN_TYPE] Number   int itemIndex [VARIABLES] boolean  Number  n  double  DEFAULT_SCALE_FACTOR  m_scaleFactor  m_totalSum  mij  int  i  itemIndex  j  
[P5_Replace_Variable]^this.m_scaleFactor = mij;^114^^^^^113^116^this.m_scaleFactor = factor;^[CLASS] NormalizedMatrixSeries  [METHOD] setScaleFactor [RETURN_TYPE] void   double factor [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P5_Replace_Variable]^return m_scaleFactor;^126^^^^^125^127^return this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getScaleFactor [RETURN_TYPE] double   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P8_Replace_Mix]^return m_totalSum;^126^^^^^125^127^return this.m_scaleFactor;^[CLASS] NormalizedMatrixSeries  [METHOD] getScaleFactor [RETURN_TYPE] double   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P2_Replace_Operator]^this.m_totalSum = get ( i, j ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^this.m_totalSum -= get (  j ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^this.m_totalSum -= get ( i ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^this.m_totalSum -= get ( j, i ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P8_Replace_Mix]^this.m_totalSum -=  get ( j, j ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum = 0;this.m_totalSum -= get ( i, j ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum += mij;this.m_totalSum -= get ( i, j ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum = Double.MIN_VALUE;this.m_totalSum -= get ( i, j ) ;^134^^^^^133^138^this.m_totalSum -= get ( i, j ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P14_Delete_Statement]^^134^135^^^^133^138^this.m_totalSum -= get ( i, j ) ; this.m_totalSum += mij;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^this.m_totalSum += m_totalSum;^135^^^^^133^138^this.m_totalSum += mij;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum = 0;this.m_totalSum += mij;^135^^^^^133^138^this.m_totalSum += mij;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum -= get ( i, j ) ;this.m_totalSum += mij;^135^^^^^133^138^this.m_totalSum += mij;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum = Double.MIN_VALUE;this.m_totalSum += mij;^135^^^^^133^138^this.m_totalSum += mij;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^super.update (  j, mij ) ;^137^^^^^133^138^super.update ( i, j, mij ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^super.update ( i,  mij ) ;^137^^^^^133^138^super.update ( i, j, mij ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P5_Replace_Variable]^super.update ( i, j ) ;^137^^^^^133^138^super.update ( i, j, mij ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P14_Delete_Statement]^^137^^^^^133^138^super.update ( i, j, mij ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] update [RETURN_TYPE] void   int i int j double mij [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  int  i  j  boolean  
[P8_Replace_Mix]^this.m_totalSum = 0 * 4;^144^^^^^143^146^this.m_totalSum = 0;^[CLASS] NormalizedMatrixSeries  [METHOD] zeroAll [RETURN_TYPE] void   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum += mij;this.m_totalSum = 0;^144^^^^^143^146^this.m_totalSum = 0;^[CLASS] NormalizedMatrixSeries  [METHOD] zeroAll [RETURN_TYPE] void   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum -= get ( i, j ) ;this.m_totalSum = 0;^144^^^^^143^146^this.m_totalSum = 0;^[CLASS] NormalizedMatrixSeries  [METHOD] zeroAll [RETURN_TYPE] void   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P11_Insert_Donor_Statement]^this.m_totalSum = Double.MIN_VALUE;this.m_totalSum = 0;^144^^^^^143^146^this.m_totalSum = 0;^[CLASS] NormalizedMatrixSeries  [METHOD] zeroAll [RETURN_TYPE] void   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P7_Replace_Invocation]^super.getItemColumn (  ) ;^145^^^^^143^146^super.zeroAll (  ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] zeroAll [RETURN_TYPE] void   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  
[P14_Delete_Statement]^^145^^^^^143^146^super.zeroAll (  ) ;^[CLASS] NormalizedMatrixSeries  [METHOD] zeroAll [RETURN_TYPE] void   [VARIABLES] double  DEFAULT_SCALE_FACTOR  factor  m_scaleFactor  m_totalSum  mij  boolean  