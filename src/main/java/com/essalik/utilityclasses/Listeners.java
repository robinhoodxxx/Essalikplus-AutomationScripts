package com.essalik.utilityclasses;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		//test = extent.createTest(result.getName());
		System.out.println("teststart");
	}

	public void onTestSuccess(ITestResult result) {
//		if (result.getStatus() == ITestResult.SUCCESS) {
//			//test.log(Status.PASS, "Pass Test case is: " + result.getName());
//		}
		System.out.println("testsucess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("fail");
	}

	public void onTestSkipped(ITestResult result) {
//		if (result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
//		}
		System.out.println("skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
