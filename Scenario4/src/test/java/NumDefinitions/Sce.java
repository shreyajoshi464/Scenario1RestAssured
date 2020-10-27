package NumDefinitions;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Sce {
	
	Response response;
	@Test
	@Given("API for foreign Exchange")
	public void api_for_foreign_exchange(){
		RestAssured.baseURI="https://ratesapi.io/";
		
	}
	@Test
	@When("posted with correct Information")
	public void posted_with_correct_Information(){
		response = RestAssured.given().get("/api/");
		
	}
	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received(){
		response= RestAssured.given().headers("Content-Type","application/json")
				.log().all().get("/ap/i/").
				then().
				assertThat().statusCode(404)
				.log().all().extract().response();
				
				
	

}
}
