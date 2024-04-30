package com.testautomation.apitesting.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;
import com.testautomation.apitesting.utils.BaseTest;
import com.testautomation.apitesting.utils.FileNameConstants;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;

public class PostApiReqUsingFile extends BaseTest{

	@Test
	public void postApiRequest(){

    try {
		String postApiRequestBody = FileUtils.readFileToString(new File(FileNameConstants.POST_API_REQUEST_BODY),"UTF-8");
	
    Response res = RestAssured.given()
    .contentType(ContentType.JSON)
    .body(postApiRequestBody)
    .baseUri("https://restful-booker.herokuapp.com/booking")
    .when().post()
    .then()
    .assertThat()
    .statusCode(200)
    .extract().response()
		;
		
    JSONArray jsonArray = JsonPath.read(res.body().asString(), "$.booking..firstname");
    System.out.println(jsonArray.get(0));
    String name = (String) jsonArray.get(0);
    
    Assert.assertEquals(name, "shubham");

    int bookingId = JsonPath.read(res.body().asString(), "$.bookingid");
   
    
    RestAssured.given()
    .contentType(ContentType.JSON)
    .pathParam("bookingId", bookingId)
    .baseUri("https://restful-booker.herokuapp.com/booking/")
    .when().get("{bookingId}")
    .then()
    
    .assertThat().statusCode(100)
    
    ;
    
    
    
    
    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}