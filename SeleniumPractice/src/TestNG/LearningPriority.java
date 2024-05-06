package TestNG;

import org.testng.annotations.Test;

public class LearningPriority {
	@Test
	public void chamak() {
		System.out.println("Family Drama");
	}

	@Test
	public void masterPiece() {
		System.out.println("Yash-Shanvi");
	}

	@Test(priority = -2)
	public void kgf() {
		System.out.println("Yash-Shetty");
	}
}
