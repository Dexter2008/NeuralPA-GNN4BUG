[P3_Replace_Literal]^public static final WebServiceCallSpec PLACE_ORDER = new WebServiceCallSpec.Builder ( new CallPath ( "/" )  ) .supportsHttpMethod ( HttpMethod.POST ) .addRequestParam ( TypedKeys.Request.AUTH_TOKEN )^29^30^31^32^^29^35^public static final WebServiceCallSpec PLACE_ORDER = new WebServiceCallSpec.Builder ( new CallPath ( "/placeOrder" )  ) .supportsHttpMethod ( HttpMethod.POST ) .addRequestParam ( TypedKeys.Request.AUTH_TOKEN )^[CLASS] SampleJsonService   [VARIABLES] 
[P8_Replace_Mix]^public  final WebServiceCallSpec PLACE_ORDER = new WebServiceCallSpec.Builder ( new CallPath ( "/placeOrder" )  ) .supportsHttpMethod ( HttpMethod.POST ) .addRequestParam ( TypedKeys.Request.AUTH_TOKEN )^29^30^31^32^^29^35^public static final WebServiceCallSpec PLACE_ORDER = new WebServiceCallSpec.Builder ( new CallPath ( "/placeOrder" )  ) .supportsHttpMethod ( HttpMethod.POST ) .addRequestParam ( TypedKeys.Request.AUTH_TOKEN )^[CLASS] SampleJsonService   [VARIABLES] 