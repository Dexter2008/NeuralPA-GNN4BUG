[BugLab_Variable_Misuse]^this.resourceType = resourceType;^33^^^^^31^34^this.resourceType = resourceClass;^[CLASS] RestRequestSpec  [METHOD] <init> [RETURN_TYPE] Type)   HeaderMapSpec headersSpec Type resourceClass [VARIABLES] Type  resourceClass  resourceType  HeaderMapSpec  headersSpec  boolean  
[BugLab_Variable_Misuse]^return resourceClass;^37^^^^^36^38^return resourceType;^[CLASS] RestRequestSpec  [METHOD] getResourceType [RETURN_TYPE] Type   [VARIABLES] Type  resourceClass  resourceType  HeaderMapSpec  headersSpec  boolean  
[BugLab_Variable_Misuse]^return String.format ( "{headersSpec:%s,resourceType:%s}", headersSpec, resourceClass ) ;^46^^^^^45^47^return String.format ( "{headersSpec:%s,resourceType:%s}", headersSpec, resourceType ) ;^[CLASS] RestRequestSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceClass  resourceType  HeaderMapSpec  headersSpec  boolean  
[BugLab_Argument_Swapping]^return String.format ( "{headersSpec:%s,resourceType:%s}", resourceType, headersSpec ) ;^46^^^^^45^47^return String.format ( "{headersSpec:%s,resourceType:%s}", headersSpec, resourceType ) ;^[CLASS] RestRequestSpec  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] Type  resourceClass  resourceType  HeaderMapSpec  headersSpec  boolean  