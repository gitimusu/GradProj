package com.example.user.ca_simulation;
import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by user on 2017-05-22.
 * Firebase DB read write.
 */
@IgnoreExtraProperties
public class UserInfo {
    public String id;
    public String pwd;

    // constructor for calls
    public UserInfo(){
    }
    public UserInfo(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
    }
}
