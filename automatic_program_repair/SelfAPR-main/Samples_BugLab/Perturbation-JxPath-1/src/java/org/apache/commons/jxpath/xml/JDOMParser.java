[BugLab_Wrong_Operator]^throw new JXPathException ( "JDOM parser configuration error. JDOM "  >=  "does not support the namespaceAware=false setting." ) ;^34^35^^^^32^49^throw new JXPathException ( "JDOM parser configuration error. JDOM " + "does not support the namespaceAware=false setting." ) ;^[CLASS] JDOMParser  [METHOD] parseXML [RETURN_TYPE] Object   InputStream stream [VARIABLES] SAXBuilder  builder  boolean  InputStream  stream  Exception  ex  
[BugLab_Wrong_Operator]^throw new JXPathException ( "JDOM parser configuration error. JDOM "  ||  "does not support the namespaceAware=false setting." ) ;^34^35^^^^32^49^throw new JXPathException ( "JDOM parser configuration error. JDOM " + "does not support the namespaceAware=false setting." ) ;^[CLASS] JDOMParser  [METHOD] parseXML [RETURN_TYPE] Object   InputStream stream [VARIABLES] SAXBuilder  builder  boolean  InputStream  stream  Exception  ex  
[BugLab_Wrong_Operator]^throw new JXPathException ( "JDOM parser configuration error. JDOM "  <=  "does not support the namespaceAware=false setting." ) ;^34^35^^^^32^49^throw new JXPathException ( "JDOM parser configuration error. JDOM " + "does not support the namespaceAware=false setting." ) ;^[CLASS] JDOMParser  [METHOD] parseXML [RETURN_TYPE] Object   InputStream stream [VARIABLES] SAXBuilder  builder  boolean  InputStream  stream  Exception  ex  
[BugLab_Wrong_Operator]^throw new JXPathException ( "JDOM parser configuration error. JDOM "  <  "does not support the namespaceAware=false setting." ) ;^34^35^^^^32^49^throw new JXPathException ( "JDOM parser configuration error. JDOM " + "does not support the namespaceAware=false setting." ) ;^[CLASS] JDOMParser  [METHOD] parseXML [RETURN_TYPE] Object   InputStream stream [VARIABLES] SAXBuilder  builder  boolean  InputStream  stream  Exception  ex  
[BugLab_Argument_Swapping]^return stream.build ( builder ) ;^44^^^^^32^49^return builder.build ( stream ) ;^[CLASS] JDOMParser  [METHOD] parseXML [RETURN_TYPE] Object   InputStream stream [VARIABLES] SAXBuilder  builder  boolean  InputStream  stream  Exception  ex  