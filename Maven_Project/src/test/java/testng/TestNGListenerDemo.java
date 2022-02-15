package testng;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListenerDemo {
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
		Assert.assertTrue(false);
	}
	@Test
	public void test3()
	{
		System.out.println("Test3");
		throw new SkipException("skipped");
	}



}
