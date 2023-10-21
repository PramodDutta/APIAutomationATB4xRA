package com.thetestingacademy.RestAssured.CRUD.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class PUT_REQUEST {

    // Get a Token - POST
    // Create a Booking and get ID
    // ID and Token in the PUT request
    // Then PUT -> Verify

    // Make a Post request to the /auth - get Token and
    // pass the token to the put requests
    // id -> 576
    // make a put request with the token and validate the response


    @Test
    public void putRequest(){


        // Step 1 - Create the Token an GET THE Token (Post)

        RequestSpecification r = RestAssured.given();

        r.baseUri("https://restful-booker.herokuapp.com/");

        // Auth to get Token
        String payloadAuth = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payloadAuth);

        Response response = r.when().post();
        ValidatableResponse vr = response.then().log().all();
        vr.statusCode(200);

        // {"token": "a1bf765f55ff067"}

        String token = response.then().extract().path("token");

        System.out.println(token);



        // Step 2 - Create Booking(POST) and Get ID

        String payload_post = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        r.basePath("booking");
        r.body(payload_post);
        response = r.when().post();
        vr = response.then().log().all();
        vr.statusCode(200);

        //Booking - ID
        Integer bookingid = response.then().extract().path("bookingid");



        // STEP 3
        // Token and ID
        // Change the name to James in PUT request and Verify
        // name = James


        String payloadPutRequest = "{\n" +
                "    \"firstname\" : \"Shubham\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";


        r.basePath("booking/"+bookingid);
        r.cookie("token",token);
        r.body(payloadPutRequest);


        response = r.when().put();
        vr = response.then().log().all();

        // TC #1
        vr.statusCode(200);
        vr.body("firstname", Matchers.equalTo("Shubham"));



        // delete
        r.basePath("booking/"+bookingid);
        r.cookie("token",token);
        response = r.when().delete();
        vr = response.then().log().all();
        vr.statusCode(201);






    }





}
