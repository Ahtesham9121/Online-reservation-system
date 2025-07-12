package com.oasis.reservation.utils;
import java.util.Random;

public class PNRGenerator {
    public static String generatePNR(){
        Random r = new Random();
        return "PNR" + (100000 + r.nextInt(9000000));
    }
}
