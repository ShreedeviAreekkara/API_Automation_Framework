package Shreedevi_Automation_Projects;

import Shreedevi_Automation_Projects.Modules.PayloadManager;
import Shreedevi_Automation_Projects.actions.AssertActions;
import Shreedevi_Automation_Projects.endpoints.APIConstants;
import com.beust.ah.A;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public RequestSpecification rs;
    public ValidatableResponse vr;
    public Response response;
    public PayloadManager payloadManager;
    public AssertActions actions;

    @BeforeTest
    public void setUp() {
        payloadManager = new PayloadManager();
        actions = new AssertActions();

        //We can either use RequestSpecBuilder class or RestAssured normal way of initialisation

//    rs= new RequestSpecBuilder().setBaseUri(APIConstants.Base_URL)
//            .addHeader("Content-Type","application/json")
//            .build().log().all();

                                       //OR

        rs = RestAssured.given().baseUri(APIConstants.Base_URL).contentType(ContentType.JSON);

    }
}