package test;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DownloadItems {
	
	@Parameters({"url"})
	@Test(groups= {"Smoketest"})
	
	public void LogOut(String urlname) {
		System.out.println("Before Class");
		System.out.println(urlname);

	};
	
	@AfterTest
	public void Login() {
		System.out.println("you are Login");
	}
	
	@Test
	public void SignIn() {
		System.out.println("you are SignIn");
	}
	
	@BeforeTest
	public void SignUp() {
		System.out.println("you are SignUp");
		Assert.assertTrue(false);
	}
	
	@Test(dataProvider = "getData", groups= {"Smoketest"})
	public void SignOut(String username, Integer password) {
		System.out.println(username);
		System.out.println(password);

	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[][]{{"Ann", 12345}, {"David@mail", 2234}};
		return data;
	}
	
}
