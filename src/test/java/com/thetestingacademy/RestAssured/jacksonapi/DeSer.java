package com.thetestingacademy.RestAssured.jacksonapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DeSer {

    public static void main(String[] args) throws IOException {

        String jsonString = "{\r\n" + "  \"firstName\" : \"Pramod\",\r\n" + "  \"lastName\" : \"Dutta\",\r\n" + "  \"gender\" : \"M\",\r\n" + "  \"age\" : 29,\r\n" + "  \"salary\" : 10987.77,\r\n" + "  \"married\" : false\r\n" + "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(jsonString, Employee.class);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getGender());
        System.out.println(employee.getMarried());




    }

}
