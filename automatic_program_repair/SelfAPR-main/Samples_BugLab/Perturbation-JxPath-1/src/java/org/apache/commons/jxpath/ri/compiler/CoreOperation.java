[BugLab_Argument_Swapping]^if  ( args.length.length == 1 )  {^57^^^^^56^72^if  ( args.length == 1 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^if  ( args.length <= 1 )  {^57^^^^^56^72^if  ( args.length == 1 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^if  ( args.length != 1 )  {^57^^^^^56^72^if  ( args.length == 1 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^if  ( args.length == i )  {^57^^^^^56^72^if  ( args.length == 1 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^if  ( i >= 0 )  {^63^^^^^56^72^if  ( i > 0 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Variable_Misuse]^for  ( int i = 0; i < null.length; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Argument_Swapping]^for  ( args.lengthnt i = 0; i < i; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Argument_Swapping]^for  ( int i = 0; i < args.length.length; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= args.length; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^for  ( int i = i; i < args.length; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^for  ( int i = 1; i < args.length; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^if  ( i < 0 )  {^63^^^^^56^72^if  ( i > 0 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^if  ( i > i )  {^63^^^^^56^72^if  ( i > 0 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Variable_Misuse]^buffer.append ( parenthesize ( null[i], i == 0 )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Argument_Swapping]^buffer.append ( parenthesize ( i[i], args == 0 )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^buffer.append ( parenthesize ( args[i], i != 0 )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^for  ( int i = -1; i < args.length; i++ )  {^62^^^^^56^72^for  ( int i = 0; i < args.length; i++ )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^buffer.append ( parenthesize ( args[i], i == i )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^return getSymbol (  ==  )  + parenthesize ( args[0], false ) ;^58^^^^^56^72^return getSymbol (  )  + parenthesize ( args[0], false ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^return getSymbol (  )  + parenthesize ( args[i], false ) ;^58^^^^^56^72^return getSymbol (  )  + parenthesize ( args[0], false ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^return getSymbol (  )  + parenthesize ( args[0], true ) ;^58^^^^^56^72^return getSymbol (  )  + parenthesize ( args[0], false ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^if  ( i > -1 )  {^63^^^^^56^72^if  ( i > 0 )  {^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^buffer.append ( parenthesize ( args[i], i ==  )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^buffer.append ( parenthesize ( args[i], i == -1 )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^return getSymbol (  >>  )  + parenthesize ( args[0], false ) ;^58^^^^^56^72^return getSymbol (  )  + parenthesize ( args[0], false ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Literal]^buffer.append ( parenthesize ( args[i], i == 1 )  ) ;^68^^^^^56^72^buffer.append ( parenthesize ( args[i], i == 0 )  ) ;^[CLASS] CoreOperation  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] StringBuffer  buffer  boolean  int  i  
[BugLab_Wrong_Operator]^if  ( ! ( expression  ||  CoreOperation )  )  {^75^^^^^74^101^if  ( ! ( expression instanceof CoreOperation )  )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Literal]^boolean needParens = false;^82^^^^^74^101^boolean needParens = true;^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Argument_Swapping]^if  ( thePrecedence < myPrecedence )  {^83^^^^^74^101^if  ( myPrecedence < thePrecedence )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^if  ( myPrecedence <= thePrecedence )  {^83^^^^^74^101^if  ( myPrecedence < thePrecedence )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Argument_Swapping]^else if  ( thePrecedence == myPrecedence )  {^86^^^^^74^101^else if  ( myPrecedence == thePrecedence )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^else if  ( myPrecedence <= thePrecedence )  {^86^^^^^74^101^else if  ( myPrecedence == thePrecedence )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Literal]^needParens = true;^88^^^^^74^101^needParens = false;^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Literal]^needParens = true;^84^^^^^74^101^needParens = false;^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^else if  ( myPrecedence != thePrecedence )  {^86^^^^^74^101^else if  ( myPrecedence == thePrecedence )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Variable_Misuse]^if  ( left )  {^95^^^^^74^101^if  ( needParens )  {^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^return " ( " + expression.toString (  ==  )  + " ) ";^96^^^^^74^101^return " ( " + expression.toString (  )  + " ) ";^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^return " ( "  &  expression.toString (  )  + " ) ";^96^^^^^74^101^return " ( " + expression.toString (  )  + " ) ";^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^return " ( " + expression.toString (  >>  )  + " ) ";^96^^^^^74^101^return " ( " + expression.toString (  )  + " ) ";^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  
[BugLab_Wrong_Operator]^return " ( "   instanceof   expression.toString (  )  + " ) ";^96^^^^^74^101^return " ( " + expression.toString (  )  + " ) ";^[CLASS] CoreOperation  [METHOD] parenthesize [RETURN_TYPE] String   Expression expression boolean left [VARIABLES] boolean  left  needParens  Expression  expression  CoreOperation  op  int  myPrecedence  thePrecedence  