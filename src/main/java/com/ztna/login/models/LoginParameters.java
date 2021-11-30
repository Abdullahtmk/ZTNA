package com.ztna.login.models;
import com.google.gson.annotations.SerializedName;

import indexed.pojo.model.IndexedPojo;

public class LoginParameters extends IndexedPojo {

    public static final String EMAIL_ADDRESS_KEY = "Email Address";
    @SerializedName(EMAIL_ADDRESS_KEY)
    public String emailAddress = "";

    public static final String PASSWORD_KEY = "Password";
    @SerializedName(PASSWORD_KEY)
    public String password = "";
}