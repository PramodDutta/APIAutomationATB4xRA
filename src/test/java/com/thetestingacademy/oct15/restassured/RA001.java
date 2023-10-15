package com.thetestingacademy.oct15.restassured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RA001 {

    @Test(groups = {"positive"},priority = 1)
    public void getRequest_Positive(){
        RestAssured

                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);
    }

    @Test(groups = {"negative"},priority = 2)
    public void getRequest_Negative(){
        RestAssured

                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(200);
    }
}


// Install NODEJS
// npm i -g allure-commandline
// go to the folder where you have run the TestNGXML FILE
// allure generate --clean
//allure serve allure-results

