[BugLab_Argument_Swapping]^mv.visitJumpInsn ( label, opcode.getLabel (  )  ) ;^83^^^^^82^84^mv.visitJumpInsn ( opcode, label.getLabel (  )  ) ;^[CLASS] JumpInsnNode  [METHOD] accept [RETURN_TYPE] void   MethodVisitor mv [VARIABLES] LabelNode  label  MethodVisitor  mv  boolean  
[BugLab_Argument_Swapping]^return new JumpInsnNode ( labels, clone ( label, opcode )  ) ;^87^^^^^86^88^return new JumpInsnNode ( opcode, clone ( label, labels )  ) ;^[CLASS] JumpInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  label  Map  labels  boolean  
[BugLab_Argument_Swapping]^return new JumpInsnNode ( label, clone ( opcode, labels )  ) ;^87^^^^^86^88^return new JumpInsnNode ( opcode, clone ( label, labels )  ) ;^[CLASS] JumpInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  label  Map  labels  boolean  
[BugLab_Argument_Swapping]^return new JumpInsnNode ( opcode, clone ( labels, label )  ) ;^87^^^^^86^88^return new JumpInsnNode ( opcode, clone ( label, labels )  ) ;^[CLASS] JumpInsnNode  [METHOD] clone [RETURN_TYPE] AbstractInsnNode   Map labels [VARIABLES] LabelNode  label  Map  labels  boolean  