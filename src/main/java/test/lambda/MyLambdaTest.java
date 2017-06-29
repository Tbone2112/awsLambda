package test.lambda;

import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import test.lambda.service.TestService;

import java.util.List;
import java.util.Map;

/**
 * Created by toddtellman on 6/29/17.
 */
public class MyLambdaTest implements RequestHandler<Map<String, String>,List<String>> {
    public List<String> handleRequest(Map<String, String> input, Context context) {
        TestService testService = LambdaInvokerFactory.builder()
                .lambdaClient(AWSLambdaClientBuilder.defaultClient())
                .build(TestService.class);
        return testService.getNames(Integer.valueOf(input.get("nameCount")));
    }

//{
//        "key" : "$input.params('nameCount')"
//}
}
