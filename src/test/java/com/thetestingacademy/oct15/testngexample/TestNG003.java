package com.thetestingacademy.oct15.testngexample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG003 {

    @Test
    public void test1(){
        System.out.println("Test 1");

        // Verification
        // Assertion - Expect Result == Actual Result

        // Two Types of Assertion suported by the TesTNG

        // Soft
        // Hard

        // Rest Assured
        // id = 1 ,  name = "Pramod" with your Expected Result

        // Rest Assured
        String name = "Pramod";

//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals("Pramod",name);
//        System.out.println(" Please execute me");
//        softAssert.assertAll();


        // 80% - Hard Why?  You want to fail the testcase when something is not expected!!
        Assert.assertEquals("pramod",name,"Failed due to mismatch");
        System.out.println("End");





    }
}
