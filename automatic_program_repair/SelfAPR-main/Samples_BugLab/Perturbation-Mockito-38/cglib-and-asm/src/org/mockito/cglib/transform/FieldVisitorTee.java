[BugLab_Variable_Misuse]^this.fv1 = fv2;^26^^^^^25^28^this.fv1 = fv1;^[CLASS] FieldVisitorTee  [METHOD] <init> [RETURN_TYPE] FieldVisitor)   FieldVisitor fv1 FieldVisitor fv2 [VARIABLES] FieldVisitor  fv1  fv2  boolean  
[BugLab_Variable_Misuse]^this.fv2 = fv1;^27^^^^^25^28^this.fv2 = fv2;^[CLASS] FieldVisitorTee  [METHOD] <init> [RETURN_TYPE] FieldVisitor)   FieldVisitor fv1 FieldVisitor fv2 [VARIABLES] FieldVisitor  fv1  fv2  boolean  
[BugLab_Variable_Misuse]^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv1.visitAnnotation ( desc, visible )  ) ;^31^32^^^^30^33^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  
[BugLab_Argument_Swapping]^return AnnotationVisitorTee.getInstance ( desc.visitAnnotation ( fv1, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^31^32^^^^30^33^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  
[BugLab_Argument_Swapping]^return AnnotationVisitorTee.getInstance ( visible.visitAnnotation ( desc, fv1 ) , fv2.visitAnnotation ( desc, visible )  ) ;^31^32^^^^30^33^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  
[BugLab_Argument_Swapping]^return AnnotationVisitorTee.getInstance ( fv2.visitAnnotation ( desc, visible ) , fv1.visitAnnotation ( desc, visible )  ) ;^31^32^^^^30^33^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  
[BugLab_Argument_Swapping]^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( visible, desc ) , fv2.visitAnnotation ( desc, visible )  ) ;^31^32^^^^30^33^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  
[BugLab_Variable_Misuse]^return AnnotationVisitorTee.getInstance ( fv2.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^31^32^^^^30^33^return AnnotationVisitorTee.getInstance ( fv1.visitAnnotation ( desc, visible ) , fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  
[BugLab_Argument_Swapping]^fv2.visitAnnotation ( visible, desc )  ) ;^32^^^^^30^33^fv2.visitAnnotation ( desc, visible )  ) ;^[CLASS] FieldVisitorTee  [METHOD] visitAnnotation [RETURN_TYPE] AnnotationVisitor   String desc boolean visible [VARIABLES] FieldVisitor  fv1  fv2  String  desc  boolean  visible  