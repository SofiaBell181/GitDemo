package test;

import org.testng.annotations.Test;

public class MainFunctional {
	
	@Test
	public void GetItems() {
		System.out.println("you add items in a list");
	}
	
	@Test(dependsOnMethods= {"GetItems", "DeleteOneItem"})
	public void DeleteItems() {
		System.out.println("you delete items in a list");

	}

	@Test
	public void DeleteOneItem() {
		System.out.println("you delete 1 item in a list");
	}
	
	@Test
	public void DeleteTwoItems() {
		System.out.println("you delete 2 items in a list");

	}
}
