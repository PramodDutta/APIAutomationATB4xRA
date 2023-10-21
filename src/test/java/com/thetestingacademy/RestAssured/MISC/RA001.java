package com.thetestingacademy.RestAssured.MISC;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RA001 {

    @Test
    public void postRequest(){

        // Keep your Payload in Three ways -
        // 1. String format
        // Hashmap - ?

        Map h = new HashMap();
        h.put("name","pramod");
        System.out.println(h);

//        {
//          "firstname" : "Pramod",
//          "lastname" : "Dutta",
//          "totalprice" : 432,
//          "depositpaid" : false,
//          "additionalneeds" : "Lunch",
//          "bookingdates" : {
//            "checkin" : "2022-01-01",
//            "checkout" : "2022-01-01"
//          }
//        }

        Map<String,Object> jsonBodyUsingMap = new LinkedHashMap();
        jsonBodyUsingMap.put("firstname","Pramod");
        jsonBodyUsingMap.put("lastname", "Brown");
        jsonBodyUsingMap.put("totalprice", 111);
        jsonBodyUsingMap.put("depositpaid", true);
        jsonBodyUsingMap.put("additionalneeds", "Lunch");


        Map<String,Object> bookingDatesMap = new LinkedHashMap();
        bookingDatesMap.put("checkin", "2021-07-01");
        bookingDatesMap.put("checkout", "2021-07-01");



        jsonBodyUsingMap.put("bookingdates",bookingDatesMap);

        System.out.println(jsonBodyUsingMap);





        // JSON - Map?
        // 100 to 200 - LinkedHashMap -> InputStream


        // 200>
        // Class and Object - Best


        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(jsonBodyUsingMap).post()
                .then().log().all().statusCode(200);
    }

}
