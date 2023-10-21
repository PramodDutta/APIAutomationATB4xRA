package com.thetestingacademy.RestAssured;

import io.restassured.RestAssured;
public class RestAssuredHelloWorld {
    public static void main(String[] args) {
        // GET Request
        // Fetch URL
        RestAssured

                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()

                .then().log().all().statusCode(201);

           // Builder Pattern ->
           //  Ground -> First -> Second
    }
}
