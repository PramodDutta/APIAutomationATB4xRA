package com.thetestingacademy.RestAssured.MISC.SerDe.crud;

import com.google.gson.Gson;
import com.thetestingacademy.RestAssured.MISC.Pojo.Booking;
import com.thetestingacademy.RestAssured.MISC.Pojo.Bookingdates;
import com.thetestingacademy.RestAssured.MISC.SerDe.BookingRespons;
import com.thetestingacademy.RestAssured.MISC.SerDe.Employee;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class postRequest {

    @Test
    public void postRequestTC1() {

        Gson gson;

        com.thetestingacademy.RestAssured.MISC.Pojo.Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("BreakFast");

        com.thetestingacademy.RestAssured.MISC.Pojo.Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-01-01");
        bookingdates.setCheckout("2022-01-10");

        booking.setBookingdates(bookingdates);

        gson = new Gson();
        String bookingStringPayload = gson.toJson(booking);

        System.out.println(bookingStringPayload);


        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);

        Response response = r.when().body(bookingStringPayload).post();

        ValidatableResponse vr = response.then().log().all().statusCode(200);
        String responseString = response.asString();

        BookingRespons bookingRespons = gson.fromJson(responseString, BookingRespons.class);
        System.out.println(bookingRespons.getBookingid());



        Assert.assertEquals(bookingRespons.getBooking().getFirstname(),"Pramod");
        Assert.assertEquals(bookingRespons.getBooking().getBookingdates().getCheckin(),"2022-01-01");

    }
}
