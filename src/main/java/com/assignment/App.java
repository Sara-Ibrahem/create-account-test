package com.assignment;

public class App {

    public boolean createAccount(String firstName, String lastName, String email, String password, String confirmPassword) {

        if (firstName == null || firstName.isEmpty())
            return false;

        if (lastName == null || lastName.isEmpty())
            return false;

        if (email == null || !email.contains("@"))
            return false;

        if (password == null || password.length() < 6)
            return false;

        if (!password.equals(confirmPassword))
            return false;

        return true;
    }
}