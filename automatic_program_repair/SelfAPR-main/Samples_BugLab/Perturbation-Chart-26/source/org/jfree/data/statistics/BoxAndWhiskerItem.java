[BugLab_Variable_Misuse]^this.median = minRegularValue;^117^^^^^106^126^this.median = median;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^this.q1 = minRegularValue;^118^^^^^106^126^this.q1 = q1;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^this.q3 = minOutlier;^119^^^^^106^126^this.q3 = q3;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^this.minRegularValue = q1;^120^^^^^106^126^this.minRegularValue = minRegularValue;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^this.maxRegularValue = minRegularValue;^121^^^^^106^126^this.maxRegularValue = maxRegularValue;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^this.minOutlier = minRegularValue;^122^^^^^106^126^this.minOutlier = minOutlier;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^this.maxOutlier = q3;^123^^^^^106^126^this.maxOutlier = maxOutlier;^[CLASS] BoxAndWhiskerItem  [METHOD] <init> [RETURN_TYPE] List)   Number mean Number median Number q1 Number q3 Number minRegularValue Number maxRegularValue Number minOutlier Number maxOutlier List outliers [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return q3;^134^^^^^133^135^return this.mean;^[CLASS] BoxAndWhiskerItem  [METHOD] getMean [RETURN_TYPE] Number   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return q3;^143^^^^^142^144^return this.median;^[CLASS] BoxAndWhiskerItem  [METHOD] getMedian [RETURN_TYPE] Number   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return minOutlier;^161^^^^^160^162^return this.q3;^[CLASS] BoxAndWhiskerItem  [METHOD] getQ3 [RETURN_TYPE] Number   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return minRegularValue;^170^^^^^169^171^return this.minRegularValue;^[CLASS] BoxAndWhiskerItem  [METHOD] getMinRegularValue [RETURN_TYPE] Number   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return q1;^188^^^^^187^189^return this.minOutlier;^[CLASS] BoxAndWhiskerItem  [METHOD] getMinOutlier [RETURN_TYPE] Number   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return minOutlier;^197^^^^^196^198^return this.maxOutlier;^[CLASS] BoxAndWhiskerItem  [METHOD] getMaxOutlier [RETURN_TYPE] Number   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^if  ( outliers == null )  {^206^^^^^205^210^if  ( this.outliers == null )  {^[CLASS] BoxAndWhiskerItem  [METHOD] getOutliers [RETURN_TYPE] List   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( this.outliers != null )  {^206^^^^^205^210^if  ( this.outliers == null )  {^[CLASS] BoxAndWhiskerItem  [METHOD] getOutliers [RETURN_TYPE] List   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Variable_Misuse]^return Collections.unmodifiableList ( outliers ) ;^209^^^^^205^210^return Collections.unmodifiableList ( this.outliers ) ;^[CLASS] BoxAndWhiskerItem  [METHOD] getOutliers [RETURN_TYPE] List   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  |  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  >=  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  &  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  !=  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  &&  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  >>  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^return super.toString (  )   <=  "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^219^220^^^^218^221^return super.toString (  )  + "[mean=" + this.mean + ",median=" + this.median + ",q1=" + this.q1 + ",q3=" + this.q3 + "]";^[CLASS] BoxAndWhiskerItem  [METHOD] toString [RETURN_TYPE] String   [VARIABLES] List  outliers  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  
[BugLab_Wrong_Operator]^if  ( obj != this )  {^232^^^^^217^247^if  ( obj == this )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return false;^233^^^^^218^248^return true;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Operator]^if  ( ! ( obj  >=  BoxAndWhiskerItem )  )  {^235^^^^^220^250^if  ( ! ( obj instanceof BoxAndWhiskerItem )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^236^^^^^221^251^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minOutlier, that.mean )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.mean.mean )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.mean, that )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^240^^^^^225^255^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( q3, that.mean )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.mean, q3 )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.mean, that.mean.mean )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.mean, this.mean )  )  {^239^^^^^224^254^if  ( !ObjectUtilities.equal ( this.mean, that.mean )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minRegularValue, that.median )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.median.median )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.median, this.median )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^243^^^^^228^258^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minOutlier, that.median )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.median, q1 )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.median, that.median.median )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.median, that )  )  {^242^^^^^227^257^if  ( !ObjectUtilities.equal ( this.median, that.median )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( q3, that.q1 )  )  {^245^^^^^230^260^if  ( !ObjectUtilities.equal ( this.q1, that.q1 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.q1, minRegularValue )  )  {^245^^^^^230^260^if  ( !ObjectUtilities.equal ( this.q1, that.q1 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.q1.q1 )  )  {^245^^^^^230^260^if  ( !ObjectUtilities.equal ( this.q1, that.q1 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.q1, this.q1 )  )  {^245^^^^^230^260^if  ( !ObjectUtilities.equal ( this.q1, that.q1 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^246^^^^^231^261^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.q1, that.q1.q1 )  )  {^245^^^^^230^260^if  ( !ObjectUtilities.equal ( this.q1, that.q1 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( q1, that.q3 )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.q3, q3 )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.q3.q3 )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.q3, this.q3 )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^249^^^^^234^264^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minOutlier, that.q3 )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.q3, minOutlier )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.q3, that.q3.q3 )  )  {^248^^^^^233^263^if  ( !ObjectUtilities.equal ( this.q3, that.q3 )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( q3, that.minRegularValue )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.minRegularValue, q3 )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue.minRegularValue )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.minRegularValue, this.minRegularValue )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^253^^^^^251^254^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^253^^^^^238^268^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minOutlier, that.minRegularValue )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.minRegularValue.minRegularValue )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.minRegularValue, that )  )  {^251^252^^^^236^266^if  ( !ObjectUtilities.equal ( this.minRegularValue, that.minRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minRegularValue, that.maxRegularValue )  )  {^255^256^^^^240^270^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.maxRegularValue, q3 )  )  {^255^256^^^^240^270^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue.maxRegularValue )  )  {^255^256^^^^240^270^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.maxRegularValue.maxRegularValue )  )  {^255^256^^^^240^270^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.maxRegularValue, this.maxRegularValue )  )  {^255^256^^^^240^270^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^257^^^^^255^258^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^257^^^^^242^272^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( q3, that.maxRegularValue )  )  {^255^256^^^^240^270^if  ( !ObjectUtilities.equal ( this.maxRegularValue, that.maxRegularValue )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minRegularValue, that.minOutlier )  )  {^259^^^^^244^274^if  ( !ObjectUtilities.equal ( this.minOutlier, that.minOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.minOutlier.minOutlier )  )  {^259^^^^^244^274^if  ( !ObjectUtilities.equal ( this.minOutlier, that.minOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.minOutlier, this.minOutlier )  )  {^259^^^^^244^274^if  ( !ObjectUtilities.equal ( this.minOutlier, that.minOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^260^^^^^245^275^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( q1, that.minOutlier )  )  {^259^^^^^244^274^if  ( !ObjectUtilities.equal ( this.minOutlier, that.minOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( minOutlier, that.maxOutlier )  )  {^262^^^^^247^277^if  ( !ObjectUtilities.equal ( this.maxOutlier, that.maxOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.maxOutlier, q3 )  )  {^262^^^^^247^277^if  ( !ObjectUtilities.equal ( this.maxOutlier, that.maxOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.maxOutlier, that.maxOutlier.maxOutlier )  )  {^262^^^^^247^277^if  ( !ObjectUtilities.equal ( this.maxOutlier, that.maxOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.maxOutlier, this.maxOutlier )  )  {^262^^^^^247^277^if  ( !ObjectUtilities.equal ( this.maxOutlier, that.maxOutlier )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^263^^^^^248^278^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( outliers, that.outliers )  )  {^265^^^^^250^280^if  ( !ObjectUtilities.equal ( this.outliers, that.outliers )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Variable_Misuse]^if  ( !ObjectUtilities.equal ( this.outliers, outliers )  )  {^265^^^^^250^280^if  ( !ObjectUtilities.equal ( this.outliers, that.outliers )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( this.outliers, that.outliers.outliers )  )  {^265^^^^^250^280^if  ( !ObjectUtilities.equal ( this.outliers, that.outliers )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that, this.outliers.outliers )  )  {^265^^^^^250^280^if  ( !ObjectUtilities.equal ( this.outliers, that.outliers )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Argument_Swapping]^if  ( !ObjectUtilities.equal ( that.outliers, this.outliers )  )  {^265^^^^^250^280^if  ( !ObjectUtilities.equal ( this.outliers, that.outliers )  )  {^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return true;^266^^^^^251^281^return false;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  
[BugLab_Wrong_Literal]^return false;^268^^^^^253^283^return true;^[CLASS] BoxAndWhiskerItem  [METHOD] equals [RETURN_TYPE] boolean   Object obj [VARIABLES] List  outliers  Object  obj  boolean  Number  maxOutlier  maxRegularValue  mean  median  minOutlier  minRegularValue  q1  q3  long  serialVersionUID  BoxAndWhiskerItem  that  