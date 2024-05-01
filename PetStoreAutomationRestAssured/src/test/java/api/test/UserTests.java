package api.test;

import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;

import api.payload.User;

public class UserTests {

	Faker faker;
	User userPayload;
	
	@BeforeClass
	public void setupData() {
		
		faker = new Faker();
		userPayload = new User();
		
		
		
		
	}
}
