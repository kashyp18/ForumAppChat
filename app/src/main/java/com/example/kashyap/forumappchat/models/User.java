package com.example.kashyap.forumappchat.models;



import com.google.firebase.database.IgnoreExtraProperties;
/**
 *
 * Created by kashyap on 13/6/17.
 */

@IgnoreExtraProperties
public class User {
    public String uid;
    public String email;
    public String firebaseToken;

    public User() {
    }

    public User(String uid, String email, String firebaseToken) {
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}