package com.example.chatapp;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.chatapp.activities.MainActivity;

public class LoginUnitTest {

    @Test
public void testLogin() {
    // Simulate login process
    String username = "q@m.m";
    String password = "1";

    // Call the login method with the provided credentials
        boolean result = LoginUtils.login(username, password);
        // Assert that the login was successful
    assertTrue(result);
}
}
