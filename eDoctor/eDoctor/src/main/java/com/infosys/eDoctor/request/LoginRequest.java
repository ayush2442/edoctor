package com.infosys.eDoctor.request;

public class LoginRequest {


    public LoginRequest() {
    }

    public LoginRequest(String userId, String password) {
        super();
        this.userId = userId;
        this.password = password;
        //change
        this.userType = userType;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //change
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    private String userId;
    private String password;
    //change
    private String userType;

}