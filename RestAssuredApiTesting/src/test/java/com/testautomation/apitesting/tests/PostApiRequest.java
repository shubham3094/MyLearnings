package com.testautomation.apitesting.tests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.testautomation.apitesting.utils.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class PostApiRequest extends BaseTest{

	@Test
	public void createBooking(){


		//prepare request
		JSONObject booking = new JSONObject();
		JSONObject bookingDates = new JSONObject();

		booking.put("firstname", "shubham");
		booking.put("lastname", "singhal");
		booking.put("totalprice", "1000");
		booking.put("depositpaid", "true");
		booking.put("additionalneeds", "super bowls");
		booking.put("bookingdates", bookingDates);

		bookingDates.put("checkin", "2018-01-01");
		bookingDates.put("checkout", "2019-01-01");

		Response res  = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(booking.toString())
				.baseUri("https://restful-booker.herokuapp.com/booking")
				.log().all()
				.when()
				.post()
				.then()
				.assertThat()
				.log().all()
				.statusCode(200)
				.body("booking.firstname", Matchers.equalTo("shubham"))
				.body("booking.totalprice", Matchers.equalTo(1000))
				.body("booking.bookingdates.checkin", Matchers.equalTo("2018-01-01"))
				.extract().response()
				;
		
		int  bookingId = res.path("bookingid");

		RestAssured.given().contentType(ContentType.JSON)
		.pathParam("bookingid", bookingId)
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.when().get("{bookingid}")
		.then().assertThat()
		.statusCode(200)
		.body("firstname", Matchers.equalTo("shubham"))
		.body("lastname", Matchers.equalTo("singhal"))
		;
	}
}
