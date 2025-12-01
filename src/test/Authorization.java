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

	};
	
	@AfterTest
	public void Login() {
		System.out.println("You are Login");
	}
	
	@Test(timeOut=4000)
	public void SignIn() {
		System.out.println("You are SignIn");
	}
	
	@Test
	public void ChangePassword() {
		System.out.println("Change your password here");
	}
	
	@BeforeTest
	public void SignUp() {
		System.out.println("You are SignUp");
	}
	
	@AfterClass void SignOut() {
		System.out.println("After Class");

	}
	
}
