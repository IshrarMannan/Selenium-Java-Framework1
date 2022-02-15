package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{

	public void onTestStart(ITestResult tr) {
		System.out.println("Started: "+tr.getName());

	}

	public void onTestSuccess(ITestResult tr) {
		System.out.println("Success: "+tr.getName());
	}

	public void onTestFailure(ITestResult tr) {
		System.out.println("failed: "+tr.getName());
	}

	public void onTestSkipped(ITestResult tr) {
		System.out.println("Skipped: "+tr.getName());
	}
	public void onStart(ITestContext context)
	{}
	public void onFinish(ITestContext context)
	{
		System.out.println("finished: "+context.getName());
	}



}
