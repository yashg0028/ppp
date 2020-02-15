package module6;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 110)
	public void Pune() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority = 71)
	public void Banglore() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority = 25)
	public void Mumbai() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority = 93)
	public void Hyderabad() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority = 44)
	public void Chennai() {
		System.out.println("This is the Test Case 5");
	}
	
	
}
