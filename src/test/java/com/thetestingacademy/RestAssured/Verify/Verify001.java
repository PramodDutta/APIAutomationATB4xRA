package com.thetestingacademy.RestAssured.Verify;

import org.testng.Assert;

public class Verify001 {

    public static void main(String[] args) {

        String responseName = "pramod";
        Assert.assertEquals("pramod", responseName);
        Assert.assertTrue(false);


    }
}
