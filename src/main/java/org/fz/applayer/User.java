package org.fz.applayer;

public class User {
    public boolean isValid(String username,String password)
    {
        if(username.equals("fazil") && password.equals("1234"))
            return true;
        else return false;
    }
}
