/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.dto;

/**
 *
 * @author Chetabist
 */
public class UserDetails {
    private String username;
    private String userid;
    private String email;
    private long mobile;
    private String password;
    @Override
    public String toString() {
        return "UserDetails{" + "username=" + username + ", userid=" + userid + ", email=" + email + ", mobile=" + mobile + ", password=" + password + '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDetails(String username, String userid, String email,long mobile,String password) {
        this.username = username;
        this.userid = userid;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }
    public UserDetails()
    {
        
    }
}

