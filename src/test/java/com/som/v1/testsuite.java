package com.som.v1;

//import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
//import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

/**
 * Unit test for simple App.
 */
public class testsuite extends TestCase {
	RequestSpecification reqSpec;
	ResponseSpecification resSpecf = null;
	comman c = new comman();
	@Test
	public void CreateUsr() {
		RestAssured.baseURI="https://reqres.in/";
		File payload = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\som\\v1\\data1.json");
		RestAssured.baseURI = "https://reqres.in/";
		given().header("Content-Type", "application/json").body(payload).when().post("api/users").then().log().all()
				.assertThat().statusCode(201);
	}
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
	public void update(){
	reqSpec.put()
	.then().assertThat().statusCode (200);
	}

	@Test
	public void delete() {
	reqSpec.delete()
	.then()
	.assertThat().statusLine("HTTP/1.1 204 No Content");
	}
	@BeforeClass
	public void setResponseSpecs(){
		//ResponseSpecification
			resSpecf = RestAssured.expect();
			resSpecf.contentType (ContentType.JSON); 
			resSpecf.statusCode (200);
			resSpecf.time(Matchers.lessThan(5000L));
			resSpecf.statusLine("HTTP/1.1 200 OK");
		}

	@Test
	public void getsingleuser() {
			RestAssured.baseURI = "https://reqres.in/api/users/2";
			given().when().get().then().spec(resSpecf).header("Connection", "keep-alive");}
	@Test
	public void getUserList() {
		RestAssured.baseURI = "https://reqres.in/api/users?=2";
		given().when().get().then().spec (resSpecf). body ("size()", Matchers.lessThanOrEqualTo(6));
		}

	
	

}
