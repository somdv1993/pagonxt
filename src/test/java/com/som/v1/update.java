package com.som.v1;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import io.restassured.specification.RequestSpecification;
//import org.testng.annotations.Test;
import io.restassured.RestAssured;

/**
 * Unit test for simple App.
 */
public class update extends TestCase {
	RequestSpecification reqSpec;
	
	@BeforeClass
	public void request() {
		String payload = "{\"id\":50," + "\"email\":\"swethana.v@reqres.in\"," + "\"first_name\":\"swetha\","
				+ "\"last_name\":\"v\"," + "\"avatar\":\"https://regres.in/img/faces/8-image.jpg\"}";

		reqSpec = RestAssured.given();
		reqSpec.baseUri("https://reqres.in/"); 
		reqSpec.basePath("api/users/2");
		reqSpec.header("Content-Type", "application/json"); 
		reqSpec.body(payload);
	}
	/*@Test
	public void CreateUsr() {
	   RestAssured.baseURI="https://reqres.in/";
	   File payload = new File(System.getProperty("user.dir") + "\\src\\main\\java\\data.json");
	   given().header("Content-Type", "application/json").body(payload).
       when().post("api/users").then().log().all().assertThat()
             .statusCode(201).assertThat().body ("email", equalTo("som.dev@regres.in"));}*/
	@Test
	public void updatedata(){
	reqSpec.put()
	.then().assertThat().statusCode (200);
	}

	}


