package com.thetestingacademy;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RATestNG {

    @Test
    public void getRequest(){
        RestAssured

                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);
    }

    @Test
    public void getRequest2(){
        RestAssured

                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);
    }
}
