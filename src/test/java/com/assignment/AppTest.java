package com.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    void testValidAccountSara() {
        assertTrue(app.createAccount("Sara", "Sidra", "sara@gmail.com", "123456", "123456"));
    }

    @Test
    void testValidAccountSidra() {
        assertTrue(app.createAccount("Sidra", "Sara", "sidra@gmail.com", "abcdef", "abcdef"));
    }

    @Test
    void testEmptyFirstName() {
        assertFalse(app.createAccount("", "Sidra", "sara@gmail.com", "123456", "123456"));
    }

    @Test
    void testEmptyLastName() {
        assertFalse(app.createAccount("Sara", "", "sidra@gmail.com", "123456", "123456"));
    }

    @Test
    void testInvalidEmailWithoutAtSymbol() {
        assertFalse(app.createAccount("Sara", "Sidra", "sara.com", "123456", "123456"));
    }

    @Test
    void testNullEmail() {
        assertFalse(app.createAccount("Sara", "Sidra", null, "123456", "123456"));
    }

    @Test
    void testShortPassword() {
        assertFalse(app.createAccount("Sidra", "Sara", "sidra@gmail.com", "123", "123"));
    }

    @Test
    void testPasswordWithExactlySixCharacters() {
        assertTrue(app.createAccount("Sara", "Sidra", "sara@gmail.com", "123456", "123456"));
    }

    @Test
    void testPasswordWithFiveCharacters() {
        assertFalse(app.createAccount("Sara", "Sidra", "sara@gmail.com", "12345", "12345"));
    }

    @Test
    void testPasswordMismatch() {
        assertFalse(app.createAccount("Sara", "Sidra", "sara@gmail.com", "123456", "654321"));
    }

    @Test
    void testNullFirstName() {
        assertFalse(app.createAccount(null, "Sidra", "sara@gmail.com", "123456", "123456"));
    }

    @Test
    void testNullLastName() {
        assertFalse(app.createAccount("Sara", null, "sara@gmail.com", "123456", "123456"));
    }

    @Test
    void testNullPassword() {
        assertFalse(app.createAccount("Sara", "Sidra", "sara@gmail.com", null, "123456"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(app.createAccount("Sara", "Sidra", "sara@gmail.com", "", ""));
    }

    @Test
    void testAllFieldsEmpty() {
        assertFalse(app.createAccount("", "", "", "", ""));
    }
}