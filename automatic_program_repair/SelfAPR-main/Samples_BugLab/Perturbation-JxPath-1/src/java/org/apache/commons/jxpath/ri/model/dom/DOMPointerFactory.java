[BugLab_Wrong_Literal]^public static final int DOM_POINTER_FACTORY_ORDER = null;^34^^^^^29^39^public static final int DOM_POINTER_FACTORY_ORDER = 100;^[CLASS] DOMPointerFactory   [VARIABLES] 
[BugLab_Wrong_Operator]^if  ( bean  ||  Node )  {^45^^^^^40^49^if  ( bean instanceof Node )  {^[CLASS] DOMPointerFactory  [METHOD] createNodePointer [RETURN_TYPE] NodePointer   QName name Object bean Locale locale [VARIABLES] Locale  locale  Object  bean  boolean  int  DOM_POINTER_FACTORY_ORDER  QName  name  
[BugLab_Wrong_Operator]^if  ( bean  &  Node )  {^56^^^^^51^60^if  ( bean instanceof Node )  {^[CLASS] DOMPointerFactory  [METHOD] createNodePointer [RETURN_TYPE] NodePointer   NodePointer parent QName name Object bean [VARIABLES] Object  bean  NodePointer  parent  boolean  int  DOM_POINTER_FACTORY_ORDER  QName  name  