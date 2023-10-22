package com.thetestingacademy.TestNG.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.ITestAnnotation;

public class CustomerListener2 implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started, Report to Mother");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case Pass!!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Fail Testcase");
        // Write a Code to Take a SCREENSHOT?
        // Write a Code to EMAIL THE TEST CASES FAILURE
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Started, Report to Mother");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finish, Report to Mother");
    }
}
