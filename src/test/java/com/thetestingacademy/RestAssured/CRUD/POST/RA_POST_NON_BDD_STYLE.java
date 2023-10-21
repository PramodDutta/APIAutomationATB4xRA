package com.thetestingacademy.RestAssured.CRUD.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RA_POST_NON_BDD_STYLE {

    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;
    Response response;
    ValidatableResponse validatableResponse;


    @BeforeTest
    public void prePostRequestCode(){
        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
    }

    @Test
    public void postRequest(){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        response =  requestSpecification.when().post();

        // Verification - Status code and Token
        String responseString = response.asString();
        System.out.println(responseString);
        validatableResponse = response.then();
        validatableResponse.statusCode(200);

    }

    @Test
    public void postRequest2(){
        String payload = "{\n" +
                "    \"username\" : \"admin2\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload);
        response =  requestSpecification.when().post();

        // Verification - Status code and Token
        String responseString = response.asString();
        System.out.println(responseString);
        validatableResponse = response.then();
        validatableResponse.statusCode(200);

    }




}
