package com.oasis.reservation.service;

import com.oasis.reservation.model.Reservation;
import java.io.*;
import java.util.*;

public class CancellationService {
    public void cancelTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PNR number: ");
        String inputPNR = sc.nextLine();

        List<Reservation> reservations = new ArrayList<>();
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("reservation_data.txt"))){
            String line;
            while((line = br.readLine()) !=null){
                Reservation res = Reservation.fromFileString(line);
                if (res.getPnr().equals(inputPNR)){
                    found = true;
                    System.out.println("\nReservation Found : ");
                    System.out.println(res);
                    System.out.println("Do you want to cancel it ? (Yes / No ): ");
                    String confirm = sc.nextLine();
                    if (!confirm.equalsIgnoreCase("Yes")){
                        reservations.add(res);
                    }
                }else {
                    reservations.add(res);
                }
            }
        }
        catch (IOException e){
            System.out.println("Erro reading reservations. ");
        }
        try(FileWriter fw = new FileWriter("reservation_data.txt",false)){
            for (Reservation r : reservations){
                fw.write(r.toFileString()+ "\n");
            }
        } catch (IOException e) {
            System.out.println("Erro writing resercations.");
        }
        if (found){
            System.out.println("Cancellation processed. ");
        }else {
            System.out.println("PNR not found. ");
        }
    }
}
