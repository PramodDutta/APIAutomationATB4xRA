package com.thetestingacademy.RestAssured.Verify;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thetestingacademy.RestAssured.jacksonapi.Employee;
import org.testng.Assert;

import java.io.IOException;
import static org.assertj.core.api.Assertions.*;

public class Verify002 {
    public static void main(String[] args) throws IOException {

        String jsonString = "{\r\n" + "  \"firstName\" : \"Pramod\",\r\n" + "  \"lastName\" : \"Dutta\",\r\n" + "  \"gender\" : \"M\",\r\n" + "  \"age\" : 29,\r\n" + "  \"salary\" : 10987.77,\r\n" + "  \"married\" : false\r\n" + "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.readValue(jsonString, Employee.class);


        // employee - firstName should be pramod, not null and should be a String

        //Assert.assertEquals("pramod",employee.getFirstName()); - 80%


        // Untill you Test cases are more than 2000
        assertThat(employee.getFirstName()).isEqualTo("Prmaod").isNotEmpty().isNotNull(); // 20%

        System.out.println(employee.getFirstName());






    }
}
