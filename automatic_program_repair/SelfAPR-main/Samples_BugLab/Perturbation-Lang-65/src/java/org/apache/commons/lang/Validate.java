[BugLab_Wrong_Operator]^if  ( expression <= false )  {^75^^^^^74^78^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message Object value [VARIABLES] boolean  expression  Object  value  String  message  
[BugLab_Wrong_Literal]^if  ( expression == true )  {^75^^^^^74^78^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message Object value [VARIABLES] boolean  expression  Object  value  String  message  
[BugLab_Wrong_Operator]^if  ( expression != false )  {^101^^^^^100^104^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message long value [VARIABLES] boolean  expression  String  message  long  value  
[BugLab_Wrong_Literal]^if  ( expression == true )  {^101^^^^^100^104^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message long value [VARIABLES] boolean  expression  String  message  long  value  
[BugLab_Wrong_Operator]^if  ( expression <= false )  {^128^^^^^127^131^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message double value [VARIABLES] boolean  expression  double  value  String  message  
[BugLab_Wrong_Literal]^if  ( expression == true )  {^128^^^^^127^131^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message double value [VARIABLES] boolean  expression  double  value  String  message  
[BugLab_Wrong_Operator]^if  ( expression != false )  {^155^^^^^154^158^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message [VARIABLES] boolean  expression  String  message  
[BugLab_Wrong_Literal]^if  ( expression == true )  {^155^^^^^154^158^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression String message [VARIABLES] boolean  expression  String  message  
[BugLab_Wrong_Operator]^if  ( expression <= false )  {^179^^^^^178^182^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression [VARIABLES] boolean  expression  
[BugLab_Wrong_Literal]^if  ( expression == true )  {^179^^^^^178^182^if  ( expression == false )  {^[CLASS] Validate  [METHOD] isTrue [RETURN_TYPE] void   boolean expression [VARIABLES] boolean  expression  
[BugLab_Wrong_Operator]^if  ( object != null )  {^201^^^^^200^204^if  ( object == null )  {^[CLASS] Validate  [METHOD] notNull [RETURN_TYPE] void   Object object String message [VARIABLES] boolean  Object  object  String  message  
[BugLab_Wrong_Operator]^if  ( object != null )  {^220^^^^^219^223^if  ( object == null )  {^[CLASS] Validate  [METHOD] notNull [RETURN_TYPE] void   Object object [VARIABLES] boolean  Object  object  
[BugLab_Wrong_Operator]^if  ( array == null && array.length == 0 )  {^241^^^^^240^244^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  
[BugLab_Wrong_Operator]^if  ( array != null || array.length == 0 )  {^241^^^^^240^244^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  
[BugLab_Wrong_Operator]^if  ( array == null || array.length != 0 )  {^241^^^^^240^244^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  
[BugLab_Argument_Swapping]^if  ( array.length == null || array == 0 )  {^260^^^^^259^263^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  
[BugLab_Wrong_Operator]^if  ( array == null && array.length == 0 )  {^260^^^^^259^263^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  
[BugLab_Wrong_Operator]^if  ( array != null || array.length == 0 )  {^260^^^^^259^263^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  
[BugLab_Wrong_Operator]^if  ( array == null || array.length != 0 )  {^260^^^^^259^263^if  ( array == null || array.length == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  
[BugLab_Wrong_Operator]^if  ( collection == null && collection.size (  )  == 0 )  {^281^^^^^280^284^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection String message [VARIABLES] boolean  Collection  collection  String  message  
[BugLab_Wrong_Operator]^if  ( collection != null || collection.size (  )  == 0 )  {^281^^^^^280^284^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection String message [VARIABLES] boolean  Collection  collection  String  message  
[BugLab_Wrong_Operator]^if  ( collection == null || collection.size (  )  != 0 )  {^281^^^^^280^284^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection String message [VARIABLES] boolean  Collection  collection  String  message  
[BugLab_Wrong_Operator]^if  ( collection == null && collection.size (  )  == 0 )  {^300^^^^^299^303^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Collection  collection  
[BugLab_Wrong_Operator]^if  ( collection != null || collection.size (  )  == 0 )  {^300^^^^^299^303^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Collection  collection  
[BugLab_Wrong_Operator]^if  ( collection == null || collection.size (  )  != 0 )  {^300^^^^^299^303^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Collection  collection  
[BugLab_Wrong_Literal]^if  ( collection == null || collection.size (  )  == -1 )  {^300^^^^^299^303^if  ( collection == null || collection.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Collection  collection  
[BugLab_Wrong_Operator]^if  ( map == null && map.size (  )  == 0 )  {^321^^^^^320^324^if  ( map == null || map.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Map map String message [VARIABLES] boolean  String  message  Map  map  
[BugLab_Wrong_Operator]^if  ( map != null || map.size (  )  == 0 )  {^321^^^^^320^324^if  ( map == null || map.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Map map String message [VARIABLES] boolean  String  message  Map  map  
[BugLab_Wrong_Operator]^if  ( map == null || map.size (  )  != 0 )  {^321^^^^^320^324^if  ( map == null || map.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Map map String message [VARIABLES] boolean  String  message  Map  map  
[BugLab_Wrong_Operator]^if  ( map == null && map.size (  )  == 0 )  {^340^^^^^339^343^if  ( map == null || map.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Map map [VARIABLES] boolean  Map  map  
[BugLab_Wrong_Operator]^if  ( map != null || map.size (  )  == 0 )  {^340^^^^^339^343^if  ( map == null || map.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Map map [VARIABLES] boolean  Map  map  
[BugLab_Wrong_Operator]^if  ( map == null || map.size (  )  != 0 )  {^340^^^^^339^343^if  ( map == null || map.size (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   Map map [VARIABLES] boolean  Map  map  
[BugLab_Wrong_Operator]^if  ( string == null && string.length (  )  == 0 )  {^361^^^^^360^364^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string String message [VARIABLES] boolean  String  message  string  
[BugLab_Wrong_Operator]^if  ( string != null || string.length (  )  == 0 )  {^361^^^^^360^364^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string String message [VARIABLES] boolean  String  message  string  
[BugLab_Wrong_Operator]^if  ( string == null || string.length (  )  != 0 )  {^361^^^^^360^364^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string String message [VARIABLES] boolean  String  message  string  
[BugLab_Variable_Misuse]^if  ( message == null || string.length (  )  == 0 )  {^361^^^^^360^364^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string String message [VARIABLES] boolean  String  message  string  
[BugLab_Wrong_Operator]^if  ( string == null && string.length (  )  == 0 )  {^380^^^^^379^383^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string [VARIABLES] boolean  String  string  
[BugLab_Wrong_Operator]^if  ( string != null || string.length (  )  == 0 )  {^380^^^^^379^383^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string [VARIABLES] boolean  String  string  
[BugLab_Wrong_Operator]^if  ( string == null || string.length (  )  != 0 )  {^380^^^^^379^383^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string [VARIABLES] boolean  String  string  
[BugLab_Wrong_Literal]^if  ( string == null || string.length (  )  == 1 )  {^380^^^^^379^383^if  ( string == null || string.length (  )  == 0 )  {^[CLASS] Validate  [METHOD] notEmpty [RETURN_TYPE] void   String string [VARIABLES] boolean  String  string  
[BugLab_Wrong_Operator]^if  ( array[i] != null )  {^408^^^^^405^412^if  ( array[i] == null )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  int  i  
[BugLab_Argument_Swapping]^for  ( array.lengthnt i = 0; i < i; i++ )  {^407^^^^^405^412^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  int  i  
[BugLab_Argument_Swapping]^for  ( arraynt i = 0; i < i.length; i++ )  {^407^^^^^405^412^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  int  i  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= array.length; i++ )  {^407^^^^^405^412^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  int  i  
[BugLab_Wrong_Literal]^for  ( int i = i; i < array.length; i++ )  {^407^^^^^405^412^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array String message [VARIABLES] boolean  String  message  Object[]  array  int  i  
[BugLab_Wrong_Operator]^if  ( array[i] != null )  {^435^^^^^432^439^if  ( array[i] == null )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Argument_Swapping]^for  ( array.lengthnt i = 0; i < i; i++ )  {^434^^^^^432^439^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Argument_Swapping]^for  ( arraynt i = 0; i < i.length; i++ )  {^434^^^^^432^439^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Argument_Swapping]^for  ( int i = 0; i < array; i++ )  {^434^^^^^432^439^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Wrong_Operator]^for  ( int i = 0; i <= array.length; i++ )  {^434^^^^^432^439^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Wrong_Operator]^for  <=  ( int i = 0; i < array.length; i++ )  {^434^^^^^432^439^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Wrong_Literal]^for  ( int i = i; i < array.length; i++ )  {^434^^^^^432^439^for  ( int i = 0; i < array.length; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Object[] array [VARIABLES] boolean  Object[]  array  int  i  
[BugLab_Wrong_Operator]^if  ( it.next (  )  != null )  {^464^^^^^461^468^if  ( it.next (  )  == null )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection String message [VARIABLES] boolean  Iterator  it  Collection  collection  String  message  
[BugLab_Argument_Swapping]^for  ( Iterator collection = it.iterator (  ) ; it.hasNext (  ) ; )  {^463^^^^^461^468^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection String message [VARIABLES] boolean  Iterator  it  Collection  collection  String  message  
[BugLab_Wrong_Literal]^int i = 1;^489^^^^^487^495^int i = 0;^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Argument_Swapping]^if  ( i.next (  )  == null )  {^491^^^^^487^495^if  ( it.next (  )  == null )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Argument_Swapping]^if  ( itt.next (  )  == null )  {^491^^^^^487^495^if  ( it.next (  )  == null )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Wrong_Operator]^if  ( it.next (  )  != null )  {^491^^^^^487^495^if  ( it.next (  )  == null )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Argument_Swapping]^for  ( Iterator collectiont = i.iterator (  ) ; it.hasNext (  ) ; i++ )  {^490^^^^^487^495^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Argument_Swapping]^for  ( Iterator collection = it.iterator (  ) ; it.hasNext (  ) ; i++ )  {^490^^^^^487^495^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Argument_Swapping]^for  ( Iterator itt = collection.iterator (  ) ; i.hasNext (  ) ; i++ )  {^490^^^^^487^495^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Wrong_Operator]^for  &&  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^490^^^^^487^495^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] noNullElements [RETURN_TYPE] void   Collection collection [VARIABLES] boolean  Iterator  it  Collection  collection  int  i  
[BugLab_Argument_Swapping]^if  ( it.isInstance ( clazz.next (  )  )  == false )  {^515^^^^^511^519^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz String message [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  String  message  
[BugLab_Wrong_Operator]^if  ( clazz.isInstance ( it.next (  )  )  >= false )  {^515^^^^^511^519^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz String message [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  String  message  
[BugLab_Wrong_Literal]^if  ( clazz.isInstance ( it.next (  )  )  == true )  {^515^^^^^511^519^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz String message [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  String  message  
[BugLab_Argument_Swapping]^for  ( Iterator collection = it.iterator (  ) ; it.hasNext (  ) ;  )  {^514^^^^^511^519^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ;  )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz String message [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  String  message  
[BugLab_Wrong_Operator]^if  ( clazz.isInstance ( it.next (  )  )  <= false )  {^515^^^^^511^519^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz String message [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  String  message  
[BugLab_Argument_Swapping]^if  ( it.isInstance ( clazz.next (  )  )  == false )  {^546^^^^^541^551^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Argument_Swapping]^if  ( clazz.isInstance ( i.next (  )  )  == false )  {^546^^^^^541^551^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Argument_Swapping]^if  ( i.isInstance ( clazzt.next (  )  )  == false )  {^546^^^^^541^551^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^if  ( clazz.isInstance ( it.next (  )  )  <= false )  {^546^^^^^541^551^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Literal]^if  ( clazz.isInstance ( it.next (  )  )  == true )  {^546^^^^^541^551^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Argument_Swapping]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + i.getName (  )  + " at clazzndex: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  ||  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  <  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  <<  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  <<  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  >>  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Argument_Swapping]^for  ( Iterator collectiont = i.iterator (  ) ; it.hasNext (  ) ; i++ )  {^545^^^^^541^551^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Argument_Swapping]^for  ( Iterator i = collection.iterator (  ) ; itt.hasNext (  ) ; i++ )  {^545^^^^^541^551^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^for  &&  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^545^^^^^541^551^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^for  |  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^545^^^^^541^551^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^for  <=  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^545^^^^^541^551^for  ( Iterator it = collection.iterator (  ) ; it.hasNext (  ) ; i++ )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^if  ( clazz.isInstance ( it.next (  )  )  != false )  {^546^^^^^541^551^if  ( clazz.isInstance ( it.next (  )  )  == false )  {^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  >=  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  >  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  <=  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  ^  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  ^  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  &  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  !=  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  |  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  &&  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (   instanceof   )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  &&  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  ==  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  
[BugLab_Wrong_Operator]^throw new IllegalArgumentException ( "The validated collection contains an element not of type "  >=  clazz.getName (  )  + " at index: " + i ) ;^547^548^^^^541^551^throw new IllegalArgumentException ( "The validated collection contains an element not of type " + clazz.getName (  )  + " at index: " + i ) ;^[CLASS] Validate  [METHOD] allElementsOfType [RETURN_TYPE] void   Collection collection Class clazz [VARIABLES] boolean  Iterator  it  Collection  collection  Class  clazz  int  i  