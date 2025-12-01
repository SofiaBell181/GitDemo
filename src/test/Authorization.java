package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Authorization {
	@BeforeClass
	public void LogOut() {
		System.out.println("Before Class method");
		System.out.println("Before Class method 2");

	};
	
	@AfterTest
	public void Login() {
		System.out.println("you are Login");
	}
	
	@Test(timeOut=4000)
	public void SignIn() {
		System.out.println("you are SignIn");
	}
	
	@BeforeTest
	public void SignUp() {
		System.out.println("you are SignUp");
	}
	
	@AfterClass void SignOut() {
		System.out.println("After Class");

	}
	
}
