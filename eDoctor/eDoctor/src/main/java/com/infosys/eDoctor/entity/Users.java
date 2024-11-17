package com.infosys.eDoctor.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {

    public Users() {

    }


    public Users(String email, String name, String password) {
        super();
        this.email = email;
        this.name = name;
        this.password = password;
        //change
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    private String email;

    private String name;

    private String password;

    //change
    private String userType;

    //what is this doing here <who added it??>
//    public void setUsername(String janedoe) {
//    }
}