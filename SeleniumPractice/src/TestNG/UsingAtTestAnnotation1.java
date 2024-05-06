package TestNG;

import org.testng.annotations.Test;

public class UsingAtTestAnnotation1 {
@Test
public void demo()
{
	System.out.println("Hai");
}

@Test(dependsOnGroups = "smoke")
public void happy()
{
	System.out.println("Hello");
}
}
