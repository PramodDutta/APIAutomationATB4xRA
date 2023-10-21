package com.thetestingacademy.RestAssured.MISC.Pojo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RA002 {

    @Test
    public void postRequest(){


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


        // 200>
        // Class and Object - Best

        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("BreakFast");

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-01-01");
        bookingdates.setCheckout("2022-01-10");


        booking.setBookingdates(bookingdates);

//        System.out.println(booking.getFirstname());


        Auth_Payload auth = new Auth_Payload();
        auth.setUsername("admin");
        auth.setPassword("password123");

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .when().body(auth).post()
                .then().log().all().statusCode(200);

        // To Extract Use Non BDD sTYLE

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(booking).post()
                .then().log().all().statusCode(200);







    }


}
