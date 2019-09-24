package socialnetworking.steps;

import com.socialnetworking.data.Comments;
import com.socialnetworking.data.Post_Data;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;


public class CucumberSteps {

    static ValidatableResponse response = null;
    static Post_Data dataItem = null;
    static Comments comments_post = null;


    @Given("^I navigate to the api URI$")
    public void i_navigate_to_the_api_URI() {
        RestAssured.baseURI = "http://dummy.restapiexample.com/";
    }

    @Then("^I get a list of users from the end point and verify the HTTP response \"([^\"]*)\"$")
    public void iGetAListOfUsersFromTheEndPointAndVerifyTheHTTPResponse(String arg0) throws Throwable {
        SerenityRest.given()
                .when()
                .post("/api/v1/create")
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
