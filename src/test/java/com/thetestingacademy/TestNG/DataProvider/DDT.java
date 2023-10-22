package com.thetestingacademy.TestNG.DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {

    // Data Driven Testing - Run a Method or a Code from data source - csv, excel , json
    // CSV - 10,000 -> Data Driven Testing -


    @DataProvider
    public Object[][] getData(){
        return new Object[][]{
                new Object[]{"admin","admin"},
                new Object[]{"admin2","password123"},
                new Object[]{"admin2","password123"},
                new Object[]{"admin2","password123"},
                new Object[]{"admin2","password123"},
                new Object[]{"admin2","password123"}
        };
    }

    @DataProvider(name = "LoginData", parallel = true)
    public Object[][] getDataParallel(){
        return new Object[][]{
                new Object[] { "admin", "admin"},
                new Object[] { "admin", "admin123"},
                new Object[] { "admin2", "admin12345"},
                new Object[] { "admin3", "admin"}
        };
    }


    @Test(dataProvider = "LoginData")
    public void loginTest(String username,String password){
        System.out.println(username+" --> "+password);
    }


}
