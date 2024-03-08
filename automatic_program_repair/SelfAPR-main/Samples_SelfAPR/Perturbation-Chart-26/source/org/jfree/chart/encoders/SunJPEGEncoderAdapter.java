[P1_Replace_Type]^private int quality = 0.95f;^71^^^^^66^76^private float quality = 0.95f;^[CLASS] SunJPEGEncoderAdapter   [VARIABLES] 
[P5_Replace_Variable]^return quality;^89^^^^^88^90^return this.quality;^[CLASS] SunJPEGEncoderAdapter  [METHOD] getQuality [RETURN_TYPE] float   [VARIABLES] float  quality  boolean  
[P2_Replace_Operator]^if  ( quality < 0.0f && quality > 1.0f )  {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P2_Replace_Operator]^if  ( quality > 0.0f || quality > 1.0f )  {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P2_Replace_Operator]^if  ( quality < 0.0f || quality == 1.0f )  {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P6_Replace_Expression]^if  ( quality < 0.0f ) {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P6_Replace_Expression]^if  (  quality > 1.0f )  {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P6_Replace_Expression]^if  ( quality < 0.0F )  {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P6_Replace_Expression]^if  ( quality > 1.0F )  {^101^^^^^100^106^if  ( quality < 0.0f || quality > 1.0f )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("The 'quality' must be in the range 0.0f to 1.0f");^101^102^103^104^^100^106^if  ( quality < 0.0f || quality > 1.0f )  { throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; }^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P16_Remove_Block]^^101^102^103^104^^100^106^if  ( quality < 0.0f || quality > 1.0f )  { throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; }^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^101^^^^^100^106^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^101^^^^^100^106^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0fThe 'quality" ) ;^102^103^^^^100^106^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P13_Insert_Block]^if  (  ( quality < 0.0F )  ||  ( quality > 1.0F )  )  {     throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; }^102^^^^^100^106^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0fran" ) ;^102^103^^^^100^106^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P8_Replace_Mix]^return 0;^102^103^^^^100^106^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P3_Replace_Literal]^throw new IllegalArgumentException ( "e in the range 0.0" ) ;^102^103^^^^100^106^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P3_Replace_Literal]^throw new IllegalArgumentException ( " thehe 'quality' must be in the range 0.0f to 1.0f" ) ;^102^103^^^^100^106^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P8_Replace_Mix]^this.quality =  null;^105^^^^^100^106^this.quality = quality;^[CLASS] SunJPEGEncoderAdapter  [METHOD] setQuality [RETURN_TYPE] void   float quality [VARIABLES] float  quality  boolean  
[P3_Replace_Literal]^return true;^115^^^^^114^116^return false;^[CLASS] SunJPEGEncoderAdapter  [METHOD] isEncodingAlpha [RETURN_TYPE] boolean   [VARIABLES] float  quality  boolean  
[P5_Replace_Variable]^encode (  outputStream ) ;^142^^^^^140^144^encode ( bufferedImage, outputStream ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] ByteArrayOutputStream  outputStream  boolean  float  quality  BufferedImage  bufferedImage  
[P5_Replace_Variable]^encode ( bufferedImage ) ;^142^^^^^140^144^encode ( bufferedImage, outputStream ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] ByteArrayOutputStream  outputStream  boolean  float  quality  BufferedImage  bufferedImage  
[P5_Replace_Variable]^encode ( outputStream, bufferedImage ) ;^142^^^^^140^144^encode ( bufferedImage, outputStream ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] ByteArrayOutputStream  outputStream  boolean  float  quality  BufferedImage  bufferedImage  
[P14_Delete_Statement]^^142^143^^^^140^144^encode ( bufferedImage, outputStream ) ; return outputStream.toByteArray (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] ByteArrayOutputStream  outputStream  boolean  float  quality  BufferedImage  bufferedImage  
[P7_Replace_Invocation]^return outputStream .ByteArrayOutputStream (  )  ;^143^^^^^140^144^return outputStream.toByteArray (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] ByteArrayOutputStream  outputStream  boolean  float  quality  BufferedImage  bufferedImage  
[P14_Delete_Statement]^^143^^^^^140^144^return outputStream.toByteArray (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] byte[]   BufferedImage bufferedImage [VARIABLES] ByteArrayOutputStream  outputStream  boolean  float  quality  BufferedImage  bufferedImage  
[P2_Replace_Operator]^if  ( bufferedImage != null )  {^160^^^^^158^177^if  ( bufferedImage == null )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P8_Replace_Mix]^if  ( bufferedImage == this )  {^160^^^^^158^177^if  ( bufferedImage == null )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P9_Replace_Statement]^if  ( outputStream == null )  {^160^^^^^158^177^if  ( bufferedImage == null )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Null 'image' argument.");^160^161^162^^^158^177^if  ( bufferedImage == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P16_Remove_Block]^^160^161^162^^^158^177^if  ( bufferedImage == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^160^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  (  ( quality < 0.0F )  ||  ( quality > 1.0F )  )  {     throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; }^160^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Null 'outputStream' argument." )   ;^161^^^^^158^177^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^161^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^161^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P8_Replace_Mix]^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; ;^161^^^^^158^177^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P2_Replace_Operator]^if  ( outputStream != null )  {^163^^^^^158^177^if  ( outputStream == null )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P8_Replace_Mix]^if  ( outputStream == false )  {^163^^^^^158^177^if  ( outputStream == null )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P9_Replace_Statement]^if  ( bufferedImage == null )  {^163^^^^^158^177^if  ( outputStream == null )  {^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P15_Unwrap_Block]^throw new java.lang.IllegalArgumentException("Null 'outputStream' argument.");^163^164^165^^^158^177^if  ( outputStream == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P16_Remove_Block]^^163^164^165^^^158^177^if  ( outputStream == null )  { throw new IllegalArgumentException  (" ")  ; }^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^163^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  (  ( quality < 0.0F )  ||  ( quality > 1.0F )  )  {     throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; }^163^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P4_Replace_Constructor]^throw throw  new IllegalArgumentException ( "Null 'image' argument." )   ;^164^^^^^158^177^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  ( outputStream == null )  {     throw new IllegalArgumentException ( "Null 'outputStream' argument." ) ; }^164^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P13_Insert_Block]^if  ( bufferedImage == null )  {     throw new IllegalArgumentException ( "Null 'image' argument." ) ; }^164^^^^^158^177^[Delete]^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P8_Replace_Mix]^throw new IllegalArgumentException ( "The 'quality' must be in the range 0.0f to 1.0f" ) ; ;^164^^^^^158^177^throw new IllegalArgumentException  (" ")  ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P3_Replace_Literal]^Iterator iterator = ImageIO.getImageWritersByFormatName ( "jppeg" ) ;^166^^^^^158^177^Iterator iterator = ImageIO.getImageWritersByFormatName ( "jpeg" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^Iterator iterator = ImageIO.createImageOutputStream ( "jpeg" ) ;^166^^^^^158^177^Iterator iterator = ImageIO.getImageWritersByFormatName ( "jpeg" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^166^^^^^158^177^Iterator iterator = ImageIO.getImageWritersByFormatName ( "jpeg" ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^167^168^^^^158^177^ImageWriter writer =  ( ImageWriter )  iterator.next (  ) ; ImageWriteParam p = writer.getDefaultWriteParam (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^ImageWriteParam p = writer.setOutput (  ) ;^168^^^^^158^177^ImageWriteParam p = writer.getDefaultWriteParam (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^168^169^^^^158^177^ImageWriteParam p = writer.getDefaultWriteParam (  ) ; p.setCompressionMode ( ImageWriteParam.MODE_EXPLICIT ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^p.setCompressionQuality ( ImageWriteParam.MODE_EXPLICIT ) ;^169^^^^^158^177^p.setCompressionMode ( ImageWriteParam.MODE_EXPLICIT ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^169^^^^^158^177^p.setCompressionMode ( ImageWriteParam.MODE_EXPLICIT ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P5_Replace_Variable]^p.setCompressionQuality ( quality ) ;^170^^^^^158^177^p.setCompressionQuality ( this.quality ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^p.setCompressionMode ( this.quality ) ;^170^^^^^158^177^p.setCompressionQuality ( this.quality ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^170^171^^^^158^177^p.setCompressionQuality ( this.quality ) ; ImageOutputStream ios = ImageIO.createImageOutputStream ( outputStream ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^ImageOutputStream ios = ImageIO.getImageWritersByFormatName ( outputStream ) ;^171^^^^^158^177^ImageOutputStream ios = ImageIO.createImageOutputStream ( outputStream ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^ImageOutputStream ios = ImageIO .getImageWritersByFormatName ( 2 )  ;^171^^^^^158^177^ImageOutputStream ios = ImageIO.createImageOutputStream ( outputStream ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^171^172^^^^158^177^ImageOutputStream ios = ImageIO.createImageOutputStream ( outputStream ) ; writer.setOutput ( ios ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P8_Replace_Mix]^writer .getDefaultWriteParam (  )  ;^172^^^^^158^177^writer.setOutput ( ios ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^172^173^^^^158^177^writer.setOutput ( ios ) ; writer.write ( null, new IIOImage ( bufferedImage, null, null ) , p ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P11_Insert_Donor_Statement]^writer.dispose (  ) ;writer.setOutput ( ios ) ;^172^^^^^158^177^writer.setOutput ( ios ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P4_Replace_Constructor]^writer.write ( null, new IIOImage (  null, null ) , p ) ;^173^^^^^158^177^writer.write ( null, new IIOImage ( bufferedImage, null, null ) , p ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P4_Replace_Constructor]^writer.write ( null, new IIOImage ( bufferedImage, null, null )  ) ;^173^^^^^158^177^writer.write ( null, new IIOImage ( bufferedImage, null, null ) , p ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P5_Replace_Variable]^writer.write ( null, new IIOImage ( p, null, null ) , bufferedImage ) ;^173^^^^^158^177^writer.write ( null, new IIOImage ( bufferedImage, null, null ) , p ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^173^174^^^^158^177^writer.write ( null, new IIOImage ( bufferedImage, null, null ) , p ) ; ios.flush (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^174^^^^^158^177^ios.flush (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P11_Insert_Donor_Statement]^ios.close (  ) ;ios.flush (  ) ;^174^^^^^158^177^ios.flush (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^writer.setOutput (  ) ;^175^^^^^158^177^writer.dispose (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P8_Replace_Mix]^writer .getDefaultWriteParam (  )  ;^175^^^^^158^177^writer.dispose (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^175^176^^^^158^177^writer.dispose (  ) ; ios.close (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P11_Insert_Donor_Statement]^writer.setOutput ( ios ) ;writer.dispose (  ) ;^175^^^^^158^177^writer.dispose (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P11_Insert_Donor_Statement]^ios.close (  ) ;writer.dispose (  ) ;^175^^^^^158^177^writer.dispose (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P7_Replace_Invocation]^ios .flush (  )  ;^176^^^^^158^177^ios.close (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P14_Delete_Statement]^^176^^^^^158^177^ios.close (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P11_Insert_Donor_Statement]^ios.flush (  ) ;ios.close (  ) ;^176^^^^^158^177^ios.close (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  
[P11_Insert_Donor_Statement]^writer.dispose (  ) ;ios.close (  ) ;^176^^^^^158^177^ios.close (  ) ;^[CLASS] SunJPEGEncoderAdapter  [METHOD] encode [RETURN_TYPE] void   BufferedImage bufferedImage OutputStream outputStream [VARIABLES] boolean  OutputStream  outputStream  Iterator  iterator  ImageWriter  writer  float  quality  ImageWriteParam  p  BufferedImage  bufferedImage  ImageOutputStream  ios  