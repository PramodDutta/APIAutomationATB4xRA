package com.thetestingacademy.oct15.testngexample;

import org.testng.annotations.*;

public class TestNG001 {

    @BeforeSuite
    void demo1()
    {
        System.out.println("BeforeSuite");
        // Read data from excel code
    }


    @BeforeMethod
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void test1(){
        System.out.println("Test #1");
        // Test case
    }

    @Test
    void test2(){
        System.out.println("Test #2");
        // Test case
    }

    @AfterMethod
    void demo6(){
        System.out.println("AfterMethod");
    }


    @AfterSuite
    void demo9(){
        System.out.println("AfterSuite");
        // Close the SQL Database here
    }
}
