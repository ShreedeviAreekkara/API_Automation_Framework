package Shreedevi_Automation_Projects.actions;

import io.restassured.response.Response;
import org.testng.Assert;

public class AssertActions {
    public void verifyResponseBody(String actual, String expected, String description){
        Assert.assertEquals(actual,expected,description);
    }
    public void verifyResponseBody(int actual, int expected, String description){
        Assert.assertEquals(actual,expected,description);
    }
    public void verifyResponseBody(float actual, float expected, String description){
        Assert.assertEquals(actual,expected,description);
    }
    public void verifyResponseBody(double actual, double expected, String description){
        Assert.assertEquals(actual,expected,description);
    }
    public void verifyStatusCodeInvalid(Response response){
       Assert.assertEquals(String.valueOf(response.getStatusCode()).startsWith("50"),true,"value of status code is "+ response.getStatusCode());

    }
    public void verifyStatusCode(Response response){
        Assert.assertEquals(String.valueOf(response.getStatusCode()).startsWith("20"),true,"value of status code is "+ response.getStatusCode());

    }


}
