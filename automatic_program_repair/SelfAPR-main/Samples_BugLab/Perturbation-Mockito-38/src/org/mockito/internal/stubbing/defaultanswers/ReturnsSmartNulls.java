[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed " + invocation.getMethod (  >=  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] Answer  delegate  boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  
[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed "  ||  invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] Answer  delegate  boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  
[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed " + invocation.getMethod (  <<  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] Answer  delegate  boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  
[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed "  !=  invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] Answer  delegate  boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  
[BugLab_Argument_Swapping]^Object defaultReturnValue = invocation.answer ( delegate ) ;^60^^^^^59^69^Object defaultReturnValue = delegate.answer ( invocation ) ;^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] answer [RETURN_TYPE] Object   InvocationOnMock invocation [VARIABLES] Answer  delegate  Object  defaultReturnValue  Class  type  boolean  InvocationOnMock  invocation  Location  location  
[BugLab_Wrong_Operator]^if  ( defaultReturnValue == null )  {^61^^^^^59^69^if  ( defaultReturnValue != null )  {^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] answer [RETURN_TYPE] Object   InvocationOnMock invocation [VARIABLES] Answer  delegate  Object  defaultReturnValue  Class  type  boolean  InvocationOnMock  invocation  Location  location  
[BugLab_Argument_Swapping]^return ClassImposterizer.INSTANCE.imposterise ( new ThrowingInterceptor ( type ) , invocation ) ;^66^^^^^59^69^return ClassImposterizer.INSTANCE.imposterise ( new ThrowingInterceptor ( invocation ) , type ) ;^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] answer [RETURN_TYPE] Object   InvocationOnMock invocation [VARIABLES] Answer  delegate  Object  defaultReturnValue  Class  type  boolean  InvocationOnMock  invocation  Location  location  
[BugLab_Variable_Misuse]^if  ( ClassImposterizer.INSTANCE.canImposterise ( null )  )  {^65^^^^^59^69^if  ( ClassImposterizer.INSTANCE.canImposterise ( type )  )  {^[CLASS] ReturnsSmartNulls ThrowingInterceptor  [METHOD] answer [RETURN_TYPE] Object   InvocationOnMock invocation [VARIABLES] Answer  delegate  Object  defaultReturnValue  Class  type  boolean  InvocationOnMock  invocation  Location  location  
[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed " + invocation.getMethod (  <=  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  
[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed "  &&  invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  
[BugLab_Wrong_Operator]^return "SmartNull returned by unstubbed "  !=  invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^49^^^^^47^54^return "SmartNull returned by unstubbed " + invocation.getMethod (  ) .getName (  )  + " (  )  method on mock";^[CLASS] ThrowingInterceptor  [METHOD] intercept [RETURN_TYPE] Object   Object obj Method method Object[] args MethodProxy proxy [VARIABLES] boolean  InvocationOnMock  invocation  MethodProxy  proxy  Object  obj  Method  method  Object[]  args  Location  location  