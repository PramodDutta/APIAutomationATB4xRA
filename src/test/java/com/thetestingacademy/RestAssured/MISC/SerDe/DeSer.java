package com.thetestingacademy.RestAssured.MISC.SerDe;

import com.google.gson.Gson;

public class DeSer {
    public static void main(String[] args) {




        String bookingReponse = "{\n" +
                "    \"bookingid\": 1161,\n" +
                "    \"booking\": {\n" +
                "        \"firstname\": \"Pramod\",\n" +
                "        \"lastname\": \"Dutta\",\n" +
                "        \"totalprice\": 432,\n" +
                "        \"depositpaid\": false,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2022-01-01\",\n" +
                "            \"checkout\": \"2022-01-01\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"Lunch\"\n" +
                "    }\n" +
                "}";


        Gson gson = new Gson();
        BookingRespons bookingRespons = gson.fromJson(bookingReponse,BookingRespons.class);
        System.out.println(bookingRespons.getBookingid());
        System.out.println(bookingRespons.getBooking().getFirstname());




    }



}
