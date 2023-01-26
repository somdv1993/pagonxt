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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * Unit test for simple App.
 */
public class Create extends TestCase {
	RequestSpecification reqSpec;
	//@Test
	/*public void CreateUsr() {
		String payload = "{\"id\":50," + "\"email\":\"swethana.v@reqres.in\"," + "\"first_name\":\"swetha\","
				+ "\"last_name\":\"v\"," + "\"avatar\":\"https://regres.in/img/faces/8-image.jpg\"}";

		RestAssured.baseURI = "https://reqres.in/";
		given().header("Content-Type", "application/json").body(payload).when().post("api/users").then().log().all()
				.assertThat().statusCode(201).assertThat().body("email", equalTo("swethana.v@reqres.in"));
	}*/
	
	@Test
	public void CreateUsr() {
	   JSONParser jsonParser = new JSONParser();
	   RestAssured.baseURI="https://reqres.in/";
	   File payload = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\som\\v1\\data1.json"); 
	   RestAssured.baseURI="https://reqres.in/";
	   given().header("Content-Type", "application/json").body(payload).when().post("api/users").then().log().all()
	   .assertThat().statusCode(201);}
	   

	

}
