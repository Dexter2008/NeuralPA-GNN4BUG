[BugLab_Argument_Swapping]^A annotation = annotationClass.getAnnotation ( annotated ) ;^86^^^^^71^101^A annotation = annotated.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotation == null )  {^87^^^^^72^102^if  ( annotation != null )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotated  <  AnnotatedParameter )  {^91^^^^^76^106^if  ( annotated instanceof AnnotatedParameter )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotated  &&  AnnotatedParameter )  {^91^^^^^76^106^if  ( annotated instanceof AnnotatedParameter )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotated  |  AnnotatedParameter )  {^91^^^^^76^106^if  ( annotated instanceof AnnotatedParameter )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annType  ==  Member )  {^95^^^^^91^108^if  ( annType instanceof Member )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annType  <=  Member )  {^95^^^^^91^108^if  ( annType instanceof Member )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^} else if  ( annType  &  Class<?> )  {^103^^^^^91^108^} else if  ( annType instanceof Class<?> )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^if  ( includeSuperclasses )  {^97^^^^^91^108^if  ( includeClass )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotation == null )  {^99^^^^^91^108^if  ( annotation != null )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Argument_Swapping]^annotation =  ( A )  annotationClass.getAnnotation ( memberClass ) ;^98^^^^^91^108^annotation =  ( A )  memberClass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  null.getAnnotation ( annotationClass ) ;^98^^^^^91^108^annotation =  ( A )  memberClass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  memberClass.getAnnotation ( this ) ;^98^^^^^91^108^annotation =  ( A )  memberClass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^} else if  ( annType  ==  Class<?> )  {^103^^^^^91^108^} else if  ( annType instanceof Class<?> )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annType  <=  Member )  {^95^^^^^80^110^if  ( annType instanceof Member )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annType  ||  Member )  {^95^^^^^80^110^if  ( annType instanceof Member )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^} else if  ( annType  |  Class<?> )  {^103^^^^^88^118^} else if  ( annType instanceof Class<?> )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^if  ( includeSuperclasses )  {^97^^^^^82^112^if  ( includeClass )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotation == null )  {^99^^^^^84^114^if  ( annotation != null )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Argument_Swapping]^annotation =  ( A )  annotationClass.getAnnotation ( memberClass ) ;^98^^^^^83^113^annotation =  ( A )  memberClass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  memberClass.getAnnotation ( 3 ) ;^98^^^^^83^113^annotation =  ( A )  memberClass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^} else if  ( annType  !=  Class<?> )  {^103^^^^^88^118^} else if  ( annType instanceof Class<?> )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  memberClass.getAnnotation ( null ) ;^98^^^^^83^113^annotation =  ( A )  memberClass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^while  ( supersuperclass != null && superclass != Object.class )  {^112^^^^^97^127^while  ( superclass != null && superclass != Object.class )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^while  ( superclass != null || superclass != Object.class )  {^112^^^^^97^127^while  ( superclass != null && superclass != Object.class )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^while  ( superclass == null && superclass != Object.class )  {^112^^^^^97^127^while  ( superclass != null && superclass != Object.class )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( annotation == null )  {^114^^^^^99^129^if  ( annotation != null )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Argument_Swapping]^annotation =  ( A )  annotationClass.getAnnotation ( superclass ) ;^113^^^^^98^128^annotation =  ( A )  superclass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( memberClass == null )  {^109^^^^^94^124^if  ( memberClass != null )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^if  ( includePackage )  {^110^^^^^95^125^if  ( includeSuperclasses )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^Class<?> superclass = this.getSuperclass (  ) ;^111^^^^^96^126^Class<?> superclass = memberClass.getSuperclass (  ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^if  ( includeSuperclasses )  {^120^^^^^105^135^if  ( includePackage )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( pkg == null )  {^122^^^^^107^137^if  ( pkg != null )  {^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^return 0.getPackage (  ) .getAnnotation ( annotationClass ) ;^123^^^^^108^138^return memberClass.getPackage (  ) .getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Argument_Swapping]^return annotationClass.getPackage (  ) .getAnnotation ( memberClass ) ;^123^^^^^108^138^return memberClass.getPackage (  ) .getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^return 2.getPackage (  ) .getAnnotation ( annotationClass ) ;^123^^^^^108^138^return memberClass.getPackage (  ) .getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^return memberClass.getPackage (  ) .getAnnotation ( 2 ) ;^123^^^^^108^138^return memberClass.getPackage (  ) .getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  2.getAnnotation ( annotationClass ) ;^113^^^^^98^128^annotation =  ( A )  superclass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  3.getAnnotation ( annotationClass ) ;^113^^^^^98^128^annotation =  ( A )  superclass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^return null.getPackage (  ) .getAnnotation ( annotationClass ) ;^123^^^^^108^138^return memberClass.getPackage (  ) .getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^Package pkg = null.getPackage (  ) ;^121^^^^^106^136^Package pkg = memberClass.getPackage (  ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  
[BugLab_Variable_Misuse]^annotation =  ( A )  superclass.getAnnotation ( null ) ;^113^^^^^98^128^annotation =  ( A )  superclass.getAnnotation ( annotationClass ) ;^[CLASS] XmlJaxbAnnotationIntrospector  [METHOD] findAnnotation [RETURN_TYPE] <A   Class<A> annotationClass Annotated annotated boolean includePackage boolean includeClass boolean includeSuperclasses [VARIABLES] Annotated  annotated  A  annotation  boolean  includeClass  includePackage  includeSuperclasses  AnnotatedElement  annType  Class  annotationClass  memberClass  superclass  Package  pkg  long  serialVersionUID  