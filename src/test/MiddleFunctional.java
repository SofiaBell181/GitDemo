package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MiddleFunctional {

	@BeforeMethod
	public void BeforeEveryMethod() {
		System.out.println("I run before every method in the MiddleFunctional class");
	}
	
	@Test(groups= {"Smoketest"})
	public void CheckLinks() {
		System.out.println("Checked links");
	}
	
	@Test
	public void CheckFooter() {
		System.out.println("Checked footer");
	}
	
	@Parameters({"url", "apiKey"})
	@Test
	public void CheckHeader(String urlname, String key) {
		System.out.println("Checked header");
		System.out.println(urlname);
		System.out.println(key);

	}
	
	@AfterMethod
	public void FillForm() {
		System.out.println("I run after each test method");
	}
	
	@BeforeSuite
	public void FirstMethod() {
		System.out.println("Set up variables for environment");
	}
}
