package testng;

import org.testng.annotations.Test;

@Test (groups= {"AllClassTests"})
public class TestNG_GroupDemo {
	@Test (groups= {"sanity"})
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test (groups= {"sanity", "smoke"})
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test (groups= {"windows.regression"})
	public void test3()
	{
		System.out.println("Test3");

	}
	@Test (groups= {"linux.regression"})
	public void test4()
	{
		System.out.println("Test4");

	}

}
