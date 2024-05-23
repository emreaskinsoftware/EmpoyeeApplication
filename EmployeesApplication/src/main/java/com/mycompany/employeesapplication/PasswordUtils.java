package com.mycompany.employeesapplication;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

public class PasswordUtils {
    public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            StringBuilder hash = new StringBuilder();
            for (byte b : hashBytes) {
                hash.append(String.format("%02x", b));
            }
            return hash.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static boolean isValidPassword(String password) {
        // En az 8 karakter olmalı
        if (password.length() < 8) {
            return false;
        }
        // En az bir büyük harf içermeli
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {

            return false;
        }
        return true;
    }

}
