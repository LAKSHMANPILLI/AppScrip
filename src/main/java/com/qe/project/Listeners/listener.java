package com.qe.project.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qe.project.base.TestBase;

public class listener extends TestBase implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Succussful test");
		//failed(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED test");
		failed(result.getMethod().getMethodName());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
}
