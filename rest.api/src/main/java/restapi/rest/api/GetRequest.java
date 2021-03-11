package restapi.rest.api;


	import static org.testng.Assert.assertEquals;
	import org.testng.annotations.Test;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;

	public class GetRequest {

		 @Test
		 public void retrieveSpecificEmployee() {

			 String id = "2";
			  RestAssured.baseURI = "https://reqres.in/api/users";

		  Response response = null;

		  try {
			
			  response = RestAssured.given() .when().queryParam("page", 2) .get();
			 
			/*RestAssured.baseURI = "https://reqres.in/api/users/"+id;
			 *   response =RestAssured.given().when().get();
		  
		  */
		  } catch (Exception e) {
		   e.printStackTrace();
		  }

		  System.out.println("Response :" + response.asString());
		  System.out.println("Status Code :" + response.getStatusCode());
		  //System.out.println("Does Reponse contains 'employee_salary'? :" + response.asString().contains("employee_salary"));


		  //assertEquals(200, response.getStatusCode());
		 }
		}