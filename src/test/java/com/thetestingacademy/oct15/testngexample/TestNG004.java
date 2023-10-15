package com.thetestingacademy.oct15.testngexample;

import org.testng.annotations.Test;

public class TestNG004 {

    @Test(groups = {"smoke","qa", "login"})
    public void test1(){
        System.out.println("T1 - Smoke / QA");
    }

    @Test(groups = {"smoke","preprod","login"})
    public void test2(){
        System.out.println("T2 - Smoke / PrePrd");
    }

    @Test(groups = {"reg","qa","dashboard"})
    public void test3(){
        System.out.println("T3 - Reg / QA");

    }
}
