package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	@Test
	@Parameters({"MyName"})
	public void test( @Optional("Adrita") String name)
	{
		System.out.println("Test1: "+ name);
	}
}
