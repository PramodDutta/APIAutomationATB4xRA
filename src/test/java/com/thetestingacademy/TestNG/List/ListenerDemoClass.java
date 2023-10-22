package com.thetestingacademy.TestNG.List;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(CustomListener.class)
@Listeners(CustomerListener2.class)
public class ListenerDemoClass {
// Execute Start
    @Test(groups = "school")

    public void test1(){
        System.out.println("test1");
        Assert.assertTrue(false);
    }

    @Test(groups = "party")
    public void test2(){
        System.out.println("test2");
        Assert.assertTrue(true);

    }

    // Execute Ends
}
