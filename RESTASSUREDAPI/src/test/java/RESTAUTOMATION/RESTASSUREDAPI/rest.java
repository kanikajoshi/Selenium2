package RESTAUTOMATION.RESTASSUREDAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class rest extends BaseClass{

	@Test
	@DisplayName("Get the list of students")
	public void getAllStudents () {

		RequestSpecification reqSpec = RestAssured.given();
		Response res	 = reqSpec.get("/list");
		res.prettyPrint();//to print the body
		ValidatableResponse val = res.then();
		//val.statusCode(200);


		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
	}
	
	@Test
	@DisplayName("student with programe computer science")
	public void queryParameter() {

		Map<String,Object>parametersMap = new HashMap<String,Object>();
		parametersMap.put("programme","Computer Science");
		parametersMap.put("limit", 1);
		Response res =	given()
				.queryParams(parametersMap)
				.when()
				.get("/list");

		res.prettyPrint();
	}
	
	@Test
	public void pathparam() {
		
		Response res =given()
		.pathParam("id", 1)
		.when()
		.get("/{id}");
		
		res.prettyPrint();
	}

	@Test
	public void addNewStudent() {
		
String payload="{\"firstName\":\"kanika1\",\"lastName\":\"use1\",\"email\":\"kaunika@gmail.com\",\"programme\":\"Financial Analysis\",\"courses\":[\"Accounting\",\"Statistics\"]}";
		given()
		.when()
		.contentType(ContentType.JSON)
		.when()
		.body(payload)
		.post()
		.then()
		.statusCode(201);
	}

}

