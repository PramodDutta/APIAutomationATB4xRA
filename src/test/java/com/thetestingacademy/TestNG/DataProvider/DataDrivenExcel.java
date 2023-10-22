package com.thetestingacademy.TestNG.DataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataDrivenExcel {


    @Test(dataProvider ="getData" ,dataProviderClass = UtilExcel.class)
    public void testLoginData(String username,String password){
        System.out.println("UserName - "+ username);
        System.out.println("Password - "+ password);
    }

}
