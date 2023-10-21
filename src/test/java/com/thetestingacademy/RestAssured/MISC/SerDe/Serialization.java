package com.thetestingacademy.RestAssured.MISC.SerDe;

import com.google.gson.Gson;
import com.thetestingacademy.RestAssured.MISC.Pojo.Booking;
import com.thetestingacademy.RestAssured.MISC.Pojo.Bookingdates;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Serialization {


    public static void main(String[] args) {

        // JAVA Object to String

        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("BreakFast");

        com.thetestingacademy.RestAssured.MISC.Pojo.Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-01-01");
        bookingdates.setCheckout("2022-01-10");

        booking.setBookingdates(bookingdates);

        Gson gson = new Gson();
        String bookingStringPayload = gson.toJson(booking);

        System.out.println(bookingStringPayload);


        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .when().body(bookingStringPayload).post()
                .then().log().all().statusCode(200);



    }

}
