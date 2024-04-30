package com.testautomation.apitesting.tests;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testautomation.apitesting.pojos.Booking;
import com.testautomation.apitesting.pojos.BookingDates;
import com.testautomation.apitesting.utils.BaseTest;

public class PostApiRequestUsingPojos extends BaseTest{
	
	@Test
	public static void postApiRequest() {
		
		try {
			BookingDates bookingDates = new BookingDates("2018-01-01","2019-01-01");
			Booking booking = new Booking("shubham","singhal",1000,true,"super bowls",bookingDates);

			ObjectMapper objectMapper = new ObjectMapper();
			
			String body = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
			System.out.println(body);
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
