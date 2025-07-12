package com.oasis.reservation.service;

import java.util.Scanner;

public class LoginService {
 private static final String VALID_USER = "admin";
 private static final String VALID_PASS = "password123";

 public boolean authenticate() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Login ID: ");
     String id = sc.nextLine();
     System.out.println("Enter Password: ");
     String pass = sc.nextLine();

     if (id.equals(VALID_USER) && pass.equals(VALID_PASS)){
         System.out.println("Login Successful !");
     return true;
 } else {
         System.out.println("Invalid credentials. ");
         return false;
     }
 }
}
