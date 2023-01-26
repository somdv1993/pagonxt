package com.som.v1;
import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class get_single_user{
ResponseSpecification resSpecf = null;
comman c = new comman();
/*@BeforeClass
public void setresponsevalues() {
c.setResponseSpecs(); }*/
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
		given().when().get().then().spec(resSpecf).header("Connection", "keep-alive");
	}

}


