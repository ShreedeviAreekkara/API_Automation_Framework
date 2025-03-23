package Shreedevi_Automation_Projects.tests.crud;

import Shreedevi_Automation_Projects.BaseTest;
import Shreedevi_Automation_Projects.Modules.PayloadManager;
import Shreedevi_Automation_Projects.actions.AssertActions;
import Shreedevi_Automation_Projects.endpoints.APIConstants;
import Shreedevi_Automation_Projects.pojos.BookingResponse;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class createPostBooking extends BaseTest {

    @Test
    public void testCreateBooking(){
        rs.basePath(APIConstants.CREATE_UPDATE_URL);
        rs.body(payloadManager.createPayloadBooking());
        response = rs.when().log().all().post();
        vr = response.then();
        System.out.println("==============================================");
        System.out.println(response.asString());

        vr.statusCode(200);
        BookingResponse bookingResponse= new BookingResponse();
        bookingResponse=payloadManager.bookingResponseJava(response.asString());
        actions.verifyStatusCode(response);
        assertThat(bookingResponse.getBooking().getFirstName()).isNotNull().isEqualTo("Jim");

    }
}
