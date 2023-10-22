package com.thetestingacademy.TestNG;

import org.testng.annotations.Test;

public class TestNG001 {

    // Depends On TestNG

    @Test
    public void serverStartedOk() {
        System.out.println("I will run First");
    }

    @Test(dependsOnMethods = {"serverStartedOk"})
    public void method1() {
        System.out.println("Run Method 1");
    }


}
