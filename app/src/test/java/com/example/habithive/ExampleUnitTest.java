package com.example.habithive;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    @Test
    public void testLogIn() {
        String userName = "test";
        String passWord = "1234";

        boolean isLoggedIn = LogInActivity.validateLogIn(userName, passWord);

        assertTrue(isLoggedIn);
    }

    @Test
    public void testSignUp(){
        String newUserName = "newtest123";
        String newPassWord = "newtest123";

        boolean isUniqueUser = SignUpActivity.validateUniqueUser(newUserName, newPassWord);

        assertTrue(isUniqueUser);
    }
}