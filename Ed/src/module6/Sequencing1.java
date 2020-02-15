package module6;

import org.testng.annotations.Test;

public class Sequencing1
{

@Test(priority=0)      // assigning priority
	public void Pune() {
		System.out.println("This is the Test Case 1");
	}

	@Test(priority=1)
	public void Banglore() {
		System.out.println("This is the Test Case 2");
	}

	@Test(priority=2)
	public void Mumbai() {
		System.out.println("This is the Test Case 3");
	}

	@Test(priority=3)
	public void Hyderabad() {
		System.out.println("This is the Test Case 4");
	}
	
	@Test(priority=4)
	public void Chennai() {
		System.out.println("This is the Test Case 5");
	}	
}