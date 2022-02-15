package testng;

import org.testng.annotations.Test;

public class TestNGDependency {
	
	@Test (dependsOnMethods={"test2"})
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test (dependsOnGroups={"Newgrp"})
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test (groups= {"Newgrp"})
	public void test3()
	{
		System.out.println("Test3");

	}
}
