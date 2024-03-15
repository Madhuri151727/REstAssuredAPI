package api.Test;

import org.testng.annotations.BeforeClass;

import com.github.javafaker.Faker;

import api.PayLoad.User;

public class UserTests {

	Faker faker;
	User userPayLoad;
	@BeforeClass
	public void setUpData()
	{
		faker=new Faker();
		userPayLoad.setId(faker.idNumber().hashCode());
		userPayLoad.
	}
	
}
