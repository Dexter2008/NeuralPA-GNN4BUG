[BugLab_Argument_Swapping]^Preconditions.checkArgument ( callPath.get ( resources )  == null ) ;^35^^^^^34^38^Preconditions.checkArgument ( resources.get ( callPath )  == null ) ;^[CLASS] ResourceMap Builder  [METHOD] set [RETURN_TYPE] ResourceMap$Builder   CallPath callPath RestCallSpec spec [VARIABLES] boolean  RestCallSpec  spec  Map  resources  CallPath  callPath  
[BugLab_Wrong_Operator]^Preconditions.checkArgument ( resources.get ( callPath )  != null ) ;^35^^^^^34^38^Preconditions.checkArgument ( resources.get ( callPath )  == null ) ;^[CLASS] ResourceMap Builder  [METHOD] set [RETURN_TYPE] ResourceMap$Builder   CallPath callPath RestCallSpec spec [VARIABLES] boolean  RestCallSpec  spec  Map  resources  CallPath  callPath  
[BugLab_Argument_Swapping]^resources.put ( spec, callPath ) ;^36^^^^^34^38^resources.put ( callPath, spec ) ;^[CLASS] ResourceMap Builder  [METHOD] set [RETURN_TYPE] ResourceMap$Builder   CallPath callPath RestCallSpec spec [VARIABLES] boolean  RestCallSpec  spec  Map  resources  CallPath  callPath  
[BugLab_Argument_Swapping]^return callPath.get ( resources ) ;^52^^^^^51^53^return resources.get ( callPath ) ;^[CLASS] ResourceMap Builder  [METHOD] get [RETURN_TYPE] RestCallSpec   CallPath callPath [VARIABLES] Map  resources  CallPath  callPath  boolean  
[BugLab_Argument_Swapping]^Preconditions.checkArgument ( callPath.get ( resources )  == null ) ;^35^^^^^34^38^Preconditions.checkArgument ( resources.get ( callPath )  == null ) ;^[CLASS] Builder  [METHOD] set [RETURN_TYPE] ResourceMap$Builder   CallPath callPath RestCallSpec spec [VARIABLES] boolean  RestCallSpec  spec  Map  resources  CallPath  callPath  
[BugLab_Wrong_Operator]^Preconditions.checkArgument ( resources.get ( callPath )  != null ) ;^35^^^^^34^38^Preconditions.checkArgument ( resources.get ( callPath )  == null ) ;^[CLASS] Builder  [METHOD] set [RETURN_TYPE] ResourceMap$Builder   CallPath callPath RestCallSpec spec [VARIABLES] boolean  RestCallSpec  spec  Map  resources  CallPath  callPath  