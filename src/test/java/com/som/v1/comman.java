package com.som.v1;
import static io.restassured.RestAssured.given;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class comman{
ResponseSpecification resSpecf = null;

@BeforeClass
public void setResponseSpecs(){
//ResponseSpecification
	resSpecf = RestAssured.expect();
	resSpecf.contentType (ContentType.JSON); 
	resSpecf.statusCode (200);
	resSpecf.time(Matchers.lessThan(5000L));
	resSpecf.statusLine("HTTP/1.1 200 OK");
}
}