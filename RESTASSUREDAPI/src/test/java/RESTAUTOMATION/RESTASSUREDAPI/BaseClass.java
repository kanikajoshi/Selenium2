package RESTAUTOMATION.RESTASSUREDAPI;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;

public class BaseClass {

	@BeforeAll
	public static void init() {
		RestAssured.baseURI="http://localhost";
		RestAssured.basePath="/student";
		RestAssured.port = 7122;
		
	}
}
