[BugLab_Variable_Misuse]^this.lineNumber = characterIndex;^29^^^^^28^31^this.lineNumber = lineNumber;^[CLASS] Position  [METHOD] <init> [RETURN_TYPE] Position(int,int)   int lineNumber int characterIndex [VARIABLES] int  characterIndex  lineNumber  boolean  
[BugLab_Variable_Misuse]^this.characterIndex = lineNumber;^30^^^^^28^31^this.characterIndex = characterIndex;^[CLASS] Position  [METHOD] <init> [RETURN_TYPE] Position(int,int)   int lineNumber int characterIndex [VARIABLES] int  characterIndex  lineNumber  boolean  
[BugLab_Variable_Misuse]^return characterIndex;^37^^^^^36^38^return lineNumber;^[CLASS] Position  [METHOD] getLineNumber [RETURN_TYPE] int   [VARIABLES] int  characterIndex  lineNumber  boolean  
[BugLab_Variable_Misuse]^return lineNumber;^45^^^^^44^46^return characterIndex;^[CLASS] Position  [METHOD] getCharacterIndex [RETURN_TYPE] int   [VARIABLES] int  characterIndex  lineNumber  boolean  