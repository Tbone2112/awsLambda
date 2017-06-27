package test.lambda.service;

import com.amazonaws.services.lambda.invoke.LambdaFunction;

import java.util.List;

/**
 * Created by toddtellman on 6/27/17.
 */
public interface TestService {

    @LambdaFunction(functionName="todd-NameFunction")
    public List<String> getNames(Integer numberOfNames);
}
