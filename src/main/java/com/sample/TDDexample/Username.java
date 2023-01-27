package com.sample.TDDexample;

public class Username {

    public boolean isValid(String username) {
        if (username.length() >= 5 && username.length() <=10) {
            return  true;
        } else {
            return  false;
        }
    }
}
