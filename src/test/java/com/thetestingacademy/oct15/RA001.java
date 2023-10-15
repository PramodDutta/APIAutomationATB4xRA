package com.thetestingacademy.oct15;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class RA001 {


    // REST Assured very small
    // Step
    // prepare a request - Given
    // Make a request - When
    // Verify the request - Then()


    // TestNG concepts -
    // Annotations and How TestNG Works with Rest Assured.



    // Make a POST Request ?
    // To Create A Token  - Post
    // URL - https://restful-booker.herokuapp.com/auth
    // BaseURI - https://restful-booker.herokuapp.com
    // BasePath - /auth


    // Payload - {
    //    "username" : "admin",
    //    "password" : "password123"
    //}

    // HTTP Method - POST
    // Header - Content-type- application json

    // Verfiy ->
    // TC#1 Status Code,
    // TC#2 - Token should not be null


    @Test
    public void postRequest(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        // Payload - String, Hashmap, Class

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)

                .when().body(payload).post()


                .then().log().all().statusCode(200);


    }




}
