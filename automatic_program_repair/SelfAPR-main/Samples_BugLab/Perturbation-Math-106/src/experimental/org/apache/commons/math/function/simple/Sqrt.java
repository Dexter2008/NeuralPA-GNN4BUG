[BugLab_Argument_Swapping]^return argument.evaluate ( Math.sqrt ( context.doubleValue ( context )  )  ) ;^43^44^^^^42^46^return context.evaluate ( Math.sqrt ( context.doubleValue ( argument )  )  ) ;^[CLASS] Sqrt  [METHOD] evaluate [RETURN_TYPE] Evaluation   EvaluationContext context [VARIABLES] Evaluation  argument  EvaluationContext  context  boolean  
[BugLab_Argument_Swapping]^Math.sqrt ( argument.doubleValue ( context )  )  ) ;^44^^^^^42^46^Math.sqrt ( context.doubleValue ( argument )  )  ) ;^[CLASS] Sqrt  [METHOD] evaluate [RETURN_TYPE] Evaluation   EvaluationContext context [VARIABLES] Evaluation  argument  EvaluationContext  context  boolean  