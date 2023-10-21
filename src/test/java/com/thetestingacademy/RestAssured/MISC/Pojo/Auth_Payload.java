package com.thetestingacademy.RestAssured.MISC.Pojo;

public class Auth_Payload {
    private String username;
    private String password;

    public Auth_Payload() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
