[P5_Replace_Variable]^return Parser.parse (  baseUri ) ;^28^^^^^27^29^return Parser.parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html String baseUri [VARIABLES] boolean  String  baseUri  html  
[P5_Replace_Variable]^return Parser.parse ( html ) ;^28^^^^^27^29^return Parser.parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html String baseUri [VARIABLES] boolean  String  baseUri  html  
[P5_Replace_Variable]^return Parser.parse ( baseUri, html ) ;^28^^^^^27^29^return Parser.parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html String baseUri [VARIABLES] boolean  String  baseUri  html  
[P7_Replace_Invocation]^return Parser.parseBodyFragment ( html, baseUri ) ;^28^^^^^27^29^return Parser.parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html String baseUri [VARIABLES] boolean  String  baseUri  html  
[P14_Delete_Statement]^^28^^^^^27^29^return Parser.parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html String baseUri [VARIABLES] boolean  String  baseUri  html  
[P7_Replace_Invocation]^return Parser.parseBodyFragment ( html, "" ) ;^41^^^^^40^42^return Parser.parse ( html, "" ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html [VARIABLES] boolean  String  html  
[P7_Replace_Invocation]^return Parser .parse ( html )  ;^41^^^^^40^42^return Parser.parse ( html, "" ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html [VARIABLES] boolean  String  html  
[P14_Delete_Statement]^^41^^^^^40^42^return Parser.parse ( html, "" ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   String html [VARIABLES] boolean  String  html  
[P1_Replace_Type]^char html = DataUtil.load ( url, timeoutMillis ) ;^55^^^^^54^57^String html = DataUtil.load ( url, timeoutMillis ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P5_Replace_Variable]^String html = DataUtil.load (  timeoutMillis ) ;^55^^^^^54^57^String html = DataUtil.load ( url, timeoutMillis ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P5_Replace_Variable]^String html = DataUtil.load ( url ) ;^55^^^^^54^57^String html = DataUtil.load ( url, timeoutMillis ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P5_Replace_Variable]^String html = DataUtil.load ( timeoutMillis, url ) ;^55^^^^^54^57^String html = DataUtil.load ( url, timeoutMillis ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P11_Insert_Donor_Statement]^String html = DataUtil.load ( in, charsetName ) ;String html = DataUtil.load ( url, timeoutMillis ) ;^55^^^^^54^57^String html = DataUtil.load ( url, timeoutMillis ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P14_Delete_Statement]^^55^^^^^54^57^String html = DataUtil.load ( url, timeoutMillis ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P5_Replace_Variable]^return parse (  url.toExternalForm (  )  ) ;^56^^^^^54^57^return parse ( html, url.toExternalForm (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P5_Replace_Variable]^return parse ( html.toExternalForm (  )  ) ;^56^^^^^54^57^return parse ( html, url.toExternalForm (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P5_Replace_Variable]^return parse ( url, html.toExternalForm (  )  ) ;^56^^^^^54^57^return parse ( html, url.toExternalForm (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P14_Delete_Statement]^^56^^^^^54^57^return parse ( html, url.toExternalForm (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   URL url int timeoutMillis [VARIABLES] boolean  String  html  URL  url  int  timeoutMillis  
[P1_Replace_Type]^char html = DataUtil.load ( in, charsetName ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( in, baseUri ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load (  charsetName ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( in ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( charsetName, in ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P11_Insert_Donor_Statement]^String html = DataUtil.load ( url, timeoutMillis ) ;String html = DataUtil.load ( in, charsetName ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( in, html ) ;^70^^^^^69^72^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P14_Delete_Statement]^^70^71^^^^69^72^String html = DataUtil.load ( in, charsetName ) ; return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^return parse (  baseUri ) ;^71^^^^^69^72^return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( html ) ;^71^^^^^69^72^return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( baseUri, html ) ;^71^^^^^69^72^return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( charsetName, baseUri ) ;^71^^^^^69^72^return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( html, charsetName ) ;^71^^^^^69^72^return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P14_Delete_Statement]^^71^^^^^69^72^return parse ( html, baseUri ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName String baseUri [VARIABLES] boolean  String  baseUri  charsetName  html  File  in  
[P1_Replace_Type]^char html = DataUtil.load ( in, charsetName ) ;^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load (  charsetName ) ;^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( in ) ;^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( charsetName, in ) ;^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P11_Insert_Donor_Statement]^String html = DataUtil.load ( url, timeoutMillis ) ;String html = DataUtil.load ( in, charsetName ) ;^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^String html = DataUtil.load ( in, html ) ;^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P14_Delete_Statement]^^85^^^^^84^87^String html = DataUtil.load ( in, charsetName ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( charsetName, in.getAbsolutePath (  )  ) ;^86^^^^^84^87^return parse ( html, in.getAbsolutePath (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^return parse (  in.getAbsolutePath (  )  ) ;^86^^^^^84^87^return parse ( html, in.getAbsolutePath (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( html.getAbsolutePath (  )  ) ;^86^^^^^84^87^return parse ( html, in.getAbsolutePath (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^return parse ( in, html.getAbsolutePath (  )  ) ;^86^^^^^84^87^return parse ( html, in.getAbsolutePath (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P14_Delete_Statement]^^86^^^^^84^87^return parse ( html, in.getAbsolutePath (  )  ) ;^[CLASS] Jsoup  [METHOD] parse [RETURN_TYPE] Document   File in String charsetName [VARIABLES] boolean  String  charsetName  html  File  in  
[P5_Replace_Variable]^return Parser.parseBodyFragment (  baseUri ) ;^99^^^^^98^100^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml String baseUri [VARIABLES] boolean  String  baseUri  bodyHtml  
[P5_Replace_Variable]^return Parser.parseBodyFragment ( bodyHtml ) ;^99^^^^^98^100^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml String baseUri [VARIABLES] boolean  String  baseUri  bodyHtml  
[P5_Replace_Variable]^return Parser.parseBodyFragment ( baseUri, bodyHtml ) ;^99^^^^^98^100^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml String baseUri [VARIABLES] boolean  String  baseUri  bodyHtml  
[P7_Replace_Invocation]^return Parser.parse ( bodyHtml, baseUri ) ;^99^^^^^98^100^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml String baseUri [VARIABLES] boolean  String  baseUri  bodyHtml  
[P14_Delete_Statement]^^99^^^^^98^100^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml String baseUri [VARIABLES] boolean  String  baseUri  bodyHtml  
[P7_Replace_Invocation]^return Parser.parse ( bodyHtml, "" ) ;^111^^^^^110^112^return Parser.parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml [VARIABLES] boolean  String  bodyHtml  
[P14_Delete_Statement]^^111^^^^^110^112^return Parser.parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] parseBodyFragment [RETURN_TYPE] Document   String bodyHtml [VARIABLES] boolean  String  bodyHtml  
[P5_Replace_Variable]^Document dirty = parseBodyFragment ( baseUri, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^Document dirty = parseBodyFragment ( bodyHtml, bodyHtml ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^Document dirty = parseBodyFragment (  baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^Document dirty = parseBodyFragment ( bodyHtml ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^Document dirty = parseBodyFragment ( baseUri, bodyHtml ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P7_Replace_Invocation]^Document dirty = parse ( bodyHtml, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P8_Replace_Mix]^Document dirty = parse ( baseUri, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^Document dirty = parseBodyFragment ( bodyHtml, "" ) ;Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P14_Delete_Statement]^^126^127^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ; Cleaner cleaner = new Cleaner ( whitelist ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^return Parser.parse ( html, baseUri ) ;Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^return Parser.parseBodyFragment ( bodyHtml, "" ) ;Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^126^^^^^125^130^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^Document clean = dirty.clean ( cleaner ) ;^128^^^^^125^130^Document clean = cleaner.clean ( dirty ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^Document clean = cleaner.clean ( clean ) ;^128^^^^^125^130^Document clean = cleaner.clean ( dirty ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P14_Delete_Statement]^^128^^^^^125^130^Document clean = cleaner.clean ( dirty ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^return cleaner.isValid ( dirty ) ;Document clean = cleaner.clean ( dirty ) ;^128^^^^^125^130^Document clean = cleaner.clean ( dirty ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^return dirty.body (  ) .html (  ) ;^129^^^^^125^130^return clean.body (  ) .html (  ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P14_Delete_Statement]^^129^^^^^125^130^return clean.body (  ) .html (  ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml String baseUri Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  baseUri  bodyHtml  Document  clean  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^return clean (  "", whitelist ) ;^143^^^^^142^144^return clean ( bodyHtml, "", whitelist ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  
[P5_Replace_Variable]^return clean ( bodyHtml, "" ) ;^143^^^^^142^144^return clean ( bodyHtml, "", whitelist ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  
[P5_Replace_Variable]^return clean ( whitelist, "", bodyHtml ) ;^143^^^^^142^144^return clean ( bodyHtml, "", whitelist ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  
[P7_Replace_Invocation]^return parse ( bodyHtml, "", whitelist ) ;^143^^^^^142^144^return clean ( bodyHtml, "", whitelist ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  
[P14_Delete_Statement]^^143^^^^^142^144^return clean ( bodyHtml, "", whitelist ) ;^[CLASS] Jsoup  [METHOD] clean [RETURN_TYPE] String   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  
[P7_Replace_Invocation]^Document dirty = parse ( bodyHtml, "" ) ;^155^^^^^154^158^Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^Document dirty = parseBodyFragment ( bodyHtml, baseUri ) ;Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^155^^^^^154^158^Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P14_Delete_Statement]^^155^^^^^154^158^Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^return Parser.parseBodyFragment ( bodyHtml, "" ) ;Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^155^^^^^154^158^Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P11_Insert_Donor_Statement]^return Parser.parseBodyFragment ( bodyHtml, baseUri ) ;Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^155^^^^^154^158^Document dirty = parseBodyFragment ( bodyHtml, "" ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P5_Replace_Variable]^return dirty.isValid ( cleaner ) ;^157^^^^^154^158^return cleaner.isValid ( dirty ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P8_Replace_Mix]^return cleaner .isValid ( dirty )  ;^157^^^^^154^158^return cleaner.isValid ( dirty ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  
[P14_Delete_Statement]^^157^^^^^154^158^return cleaner.isValid ( dirty ) ;^[CLASS] Jsoup  [METHOD] isValid [RETURN_TYPE] boolean   String bodyHtml Whitelist whitelist [VARIABLES] boolean  Whitelist  whitelist  String  bodyHtml  Document  dirty  Cleaner  cleaner  