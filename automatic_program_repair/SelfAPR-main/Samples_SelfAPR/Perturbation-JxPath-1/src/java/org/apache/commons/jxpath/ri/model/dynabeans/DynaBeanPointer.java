[P14_Delete_Statement]^^39^40^^^^38^42^super ( null, locale ) ; this.name = name;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] Locale)   QName name DynaBean dynaBean Locale locale [VARIABLES] Locale  locale  boolean  DynaBean  dynaBean  QName  name  
[P8_Replace_Mix]^this.name =  null;^40^^^^^38^42^this.name = name;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] Locale)   QName name DynaBean dynaBean Locale locale [VARIABLES] Locale  locale  boolean  DynaBean  dynaBean  QName  name  
[P11_Insert_Donor_Statement]^this.dynaBean = dynaBean;this.name = name;^40^^^^^38^42^this.name = name;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] Locale)   QName name DynaBean dynaBean Locale locale [VARIABLES] Locale  locale  boolean  DynaBean  dynaBean  QName  name  
[P8_Replace_Mix]^this.dynaBean =  null;^41^^^^^38^42^this.dynaBean = dynaBean;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] Locale)   QName name DynaBean dynaBean Locale locale [VARIABLES] Locale  locale  boolean  DynaBean  dynaBean  QName  name  
[P11_Insert_Donor_Statement]^this.name = name;this.dynaBean = dynaBean;^41^^^^^38^42^this.dynaBean = dynaBean;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] Locale)   QName name DynaBean dynaBean Locale locale [VARIABLES] Locale  locale  boolean  DynaBean  dynaBean  QName  name  
[P14_Delete_Statement]^^48^^^^^47^51^super ( parent ) ;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] DynaBean)   NodePointer parent QName name DynaBean dynaBean [VARIABLES] NodePointer  parent  boolean  DynaBean  dynaBean  QName  name  
[P8_Replace_Mix]^this.name =  null;^49^^^^^47^51^this.name = name;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] DynaBean)   NodePointer parent QName name DynaBean dynaBean [VARIABLES] NodePointer  parent  boolean  DynaBean  dynaBean  QName  name  
[P11_Insert_Donor_Statement]^this.dynaBean = dynaBean;this.name = name;^49^^^^^47^51^this.name = name;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] DynaBean)   NodePointer parent QName name DynaBean dynaBean [VARIABLES] NodePointer  parent  boolean  DynaBean  dynaBean  QName  name  
[P8_Replace_Mix]^this.dynaBean =  null;^50^^^^^47^51^this.dynaBean = dynaBean;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] DynaBean)   NodePointer parent QName name DynaBean dynaBean [VARIABLES] NodePointer  parent  boolean  DynaBean  dynaBean  QName  name  
[P11_Insert_Donor_Statement]^this.name = name;this.dynaBean = dynaBean;^50^^^^^47^51^this.dynaBean = dynaBean;^[CLASS] DynaBeanPointer  [METHOD] <init> [RETURN_TYPE] DynaBean)   NodePointer parent QName name DynaBean dynaBean [VARIABLES] NodePointer  parent  boolean  DynaBean  dynaBean  QName  name  
[P8_Replace_Mix]^return new DynaBeanPropertyPointer ( null, dynaBean ) ;^54^^^^^53^55^return new DynaBeanPropertyPointer ( this, dynaBean ) ;^[CLASS] DynaBeanPointer  [METHOD] getPropertyPointer [RETURN_TYPE] PropertyPointer   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P3_Replace_Literal]^return true;^73^^^^^72^74^return false;^[CLASS] DynaBeanPointer  [METHOD] isCollection [RETURN_TYPE] boolean   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P3_Replace_Literal]^return -7;^80^^^^^79^81^return 1;^[CLASS] DynaBeanPointer  [METHOD] getLength [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P8_Replace_Mix]^return 1 + 0;^80^^^^^79^81^return 1;^[CLASS] DynaBeanPointer  [METHOD] getLength [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P3_Replace_Literal]^return true;^84^^^^^83^85^return false;^[CLASS] DynaBeanPointer  [METHOD] isLeaf [RETURN_TYPE] boolean   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P2_Replace_Operator]^return name != null ? 0 : name.hashCode (  ) ;^88^^^^^87^89^return name == null ? 0 : name.hashCode (  ) ;^[CLASS] DynaBeanPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P3_Replace_Literal]^return name == null ? 7 : name.hashCode (  ) ;^88^^^^^87^89^return name == null ? 0 : name.hashCode (  ) ;^[CLASS] DynaBeanPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P6_Replace_Expression]^return name ( name.hashCode (  ) ;^88^^^^^87^89^return name == null ? 0 : name.hashCode (  ) ;^[CLASS] DynaBeanPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P8_Replace_Mix]^return name == false ? 0 : name .hashCode (  )  ;^88^^^^^87^89^return name == null ? 0 : name.hashCode (  ) ;^[CLASS] DynaBeanPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P8_Replace_Mix]^return name == null ? 0 : name .hashCode (  )  ;^88^^^^^87^89^return name == null ? 0 : name.hashCode (  ) ;^[CLASS] DynaBeanPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P14_Delete_Statement]^^88^^^^^87^89^return name == null ? 0 : name.hashCode (  ) ;^[CLASS] DynaBeanPointer  [METHOD] hashCode [RETURN_TYPE] int   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P2_Replace_Operator]^if  ( object != this )  {^92^^^^^91^119^if  ( object == this )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P15_Unwrap_Block]^return true;^92^93^94^^^91^119^if  ( object == this )  { return true; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P16_Remove_Block]^^92^93^94^^^91^119^if  ( object == this )  { return true; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  ( iThis != iOther )  {     return false; }^92^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^return false;^93^^^^^91^119^return true;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  ( ! ( object  <=  DynaBeanPointer )  )  {^96^^^^^91^119^if  ( ! ( object instanceof DynaBeanPointer )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P15_Unwrap_Block]^return false;^96^97^98^^^91^119^if  ( ! ( object instanceof DynaBeanPointer )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P16_Remove_Block]^^96^97^98^^^91^119^if  ( ! ( object instanceof DynaBeanPointer )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^return true;^97^^^^^91^119^return false;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  ( parent > other.parent )  {^101^^^^^91^119^if  ( parent != other.parent )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( parent == null || parent)) )  {^101^^^^^91^119^if  ( parent != other.parent )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( parent == null )  {^101^^^^^91^119^if  ( parent != other.parent )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P8_Replace_Mix]^if  ( parent = other.parent )  {^101^^^^^91^119^if  ( parent != other.parent )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P15_Unwrap_Block]^if (((parent) == null) || (!(parent.equals(other.parent)))) {    return false;};^101^102^103^104^^91^119^if  ( parent != other.parent )  { if  ( parent == null || !parent.equals ( other.parent )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P16_Remove_Block]^^101^102^103^104^^91^119^if  ( parent != other.parent )  { if  ( parent == null || !parent.equals ( other.parent )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  (  (  (  ( name )  == null )  &&  (  ( other.name )  != null )  )  ||  (  (  ( name )  != null )  &&  ( ! ( name.equals ( other.name )  )  )  )  )  {     return false; }^101^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  (  (  ( parent )  == null )  ||  ( ! ( parent.equals ( other.parent )  )  )  )  {     return false; }^101^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  ( parent == null && !parent.equals ( other.parent )  )  {^102^^^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  ( parent != null || !parent.equals ( other.parent )  )  {^102^^^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( parent == null ) {^102^^^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  (  !parent.equals ( other.parent )  )  {^102^^^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P15_Unwrap_Block]^return false;^102^103^104^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P16_Remove_Block]^^102^103^104^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  (  ( parent )  !=  ( other.parent )  )  {     if  (  (  ( parent )  == null )  ||  ( ! ( parent.equals ( other.parent )  )  )  )  {         return false;     } }^102^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  (  (  (  ( name )  == null )  &&  (  ( other.name )  != null )  )  ||  (  (  ( name )  != null )  &&  ( ! ( name.equals ( other.name )  )  )  )  )  {     return false; }^102^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^return true;^103^^^^^91^119^return false;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P8_Replace_Mix]^if  ( parent == false || !parent.equals ( other.parent )  )  {^102^^^^^91^119^if  ( parent == null || !parent.equals ( other.parent )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  (  ( name == null && other.name != null ) &&  ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  (  ( name == null || other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  (  ( name != null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  (  ( name == null && other.name == null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  (  ( name == null && other.name == null ) ||  ( name == null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^if  (  ( other == null && name.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^if  (  ( other.name == null && name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^if  (  ( name == null && other != null ) ||  ( name != null && !name.equals ( other.name.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  (  ( name == null && other.name != null ) ) {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  (   ( name != null && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( name == null )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( other.name != null )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( (name != null && name))) )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^if  ( name != null )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P8_Replace_Mix]^if  (   ( name != false && !name.equals ( other.name )  )  )  {^107^108^^^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P15_Unwrap_Block]^return false;^107^108^109^110^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P16_Remove_Block]^^107^108^109^110^^91^119^if  (  ( name == null && other.name != null ) ||  ( name != null && !name.equals ( other.name )  )  )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  (  ( parent )  !=  ( other.parent )  )  {     if  (  (  ( parent )  == null )  ||  ( ! ( parent.equals ( other.parent )  )  )  )  {         return false;     } }^107^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  (  (  ( parent )  == null )  ||  ( ! ( parent.equals ( other.parent )  )  )  )  {     return false; }^107^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^return true;^109^^^^^107^110^return false;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^return true;^109^^^^^91^119^return false;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^||  ( other != null && !name.equals ( name.name )  )  )  {^108^^^^^91^119^||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^||  ( other.name != null && !name.equals ( name )  )  )  {^108^^^^^91^119^||  ( name != null && !name.equals ( other.name )  )  )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P14_Delete_Statement]^^108^109^^^^91^119^||  ( name != null && !name.equals ( other.name )  )  )  { return false;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P1_Replace_Type]^long  iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^int iThis =  ( index != WHOLE_COLLECTION ? 0 : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^int iThis =  ( index == WHOLE_COLLECTION ?  : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^int iThis =  ( other == WHOLE_COLLECTION ? 0 : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^int iThis =  ( index == other ? 0 : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^int iThis =  ( WHOLE_COLLECTION == index ? 0 : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^int iThis =  ( index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P11_Insert_Donor_Statement]^int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^112^^^^^91^119^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P1_Replace_Type]^long  iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^113^^^^^91^119^int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^int iOther =  ( other.index <= WHOLE_COLLECTION ? 0 : other.index ) ;^113^^^^^91^119^int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^int iOther =  ( other.index == WHOLE_COLLECTION ? -4 : other.index ) ;^113^^^^^91^119^int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P6_Replace_Expression]^int iOther =  ( other.index ) ;^113^^^^^91^119^int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P11_Insert_Donor_Statement]^int iThis =  ( index == WHOLE_COLLECTION ? 0 : index ) ;int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^113^^^^^91^119^int iOther =  ( other.index == WHOLE_COLLECTION ? 0 : other.index ) ;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  ( iThis >= iOther )  {^114^^^^^91^119^if  ( iThis != iOther )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^if  ( iOther != iThis )  {^114^^^^^91^119^if  ( iThis != iOther )  {^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P15_Unwrap_Block]^return false;^114^115^116^^^91^119^if  ( iThis != iOther )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P16_Remove_Block]^^114^115^116^^^91^119^if  ( iThis != iOther )  { return false; }^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P13_Insert_Block]^if  ( object ==  ( this )  )  {     return true; }^114^^^^^91^119^[Delete]^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P3_Replace_Literal]^return true;^115^^^^^91^119^return false;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^return dynaBean <= other.dynaBean;^118^^^^^91^119^return dynaBean == other.dynaBean;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^return dynaBean == other.dynaBean.dynaBean;^118^^^^^91^119^return dynaBean == other.dynaBean;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P5_Replace_Variable]^return other.dynaBean == dynaBean;^118^^^^^91^119^return dynaBean == other.dynaBean;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P8_Replace_Mix]^return dynaBean  ||  other.dynaBean;^118^^^^^91^119^return dynaBean == other.dynaBean;^[CLASS] DynaBeanPointer  [METHOD] equals [RETURN_TYPE] boolean   Object object [VARIABLES] Object  object  DynaBeanPointer  other  boolean  DynaBean  dynaBean  QName  name  int  iOther  iThis  
[P2_Replace_Operator]^if  ( parent == null )  {^125^^^^^124^129^if  ( parent != null )  {^[CLASS] DynaBeanPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P8_Replace_Mix]^if  ( parent != true )  {^125^^^^^124^129^if  ( parent != null )  {^[CLASS] DynaBeanPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P15_Unwrap_Block]^return super.asPath();^125^126^127^^^124^129^if  ( parent != null )  { return super.asPath (  ) ; }^[CLASS] DynaBeanPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P16_Remove_Block]^^125^126^127^^^124^129^if  ( parent != null )  { return super.asPath (  ) ; }^[CLASS] DynaBeanPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P7_Replace_Invocation]^return super .asPath (  )  ;^126^^^^^124^129^return super.asPath (  ) ;^[CLASS] DynaBeanPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  
[P14_Delete_Statement]^^126^^^^^124^129^return super.asPath (  ) ;^[CLASS] DynaBeanPointer  [METHOD] asPath [RETURN_TYPE] String   [VARIABLES] DynaBean  dynaBean  QName  name  boolean  