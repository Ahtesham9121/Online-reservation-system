package com.oasis.reservation.service;

import com.oasis.reservation.model.Reservation;
import com.oasis.reservation.utils.PNRGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
public class ReservationService {
    public void reserveTicket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Train No.: ");
        String trainNo=sc.nextLine();
        String trainName = getTrainName(trainNo);
        System.out.println("Enter Class Type (Sleeper / AC ): ");
        String classType = sc.nextLine();
        System.out.println("Enter date of Journey (yyyy-mm-dd); ");
        String journeyDate = sc.nextLine();
        System.out.println("From: ");
        String from=sc.nextLine();
        System.out.println("To: ");
        String to=sc.nextLine();

        String pnr = PNRGenerator.generatePNR();

        Reservation r = new Reservation(pnr,name,trainNo,trainName,classType,journeyDate,from,to );
        saveReservation(r);

        System.out.println("\nTicket Reserved Successfully ! Your PNR is: "+pnr);
    }
    private String getTrainName(String trainNo){
        switch(trainNo){
            case"12345": return "Rajdhani Express";
            case"23456": return "Shatabdi Express";
            default:return "Generic Express";
        }
    }
    private void saveReservation(Reservation res){
        try(FileWriter writer= new FileWriter("reservation_data.txt",true)){
            writer.write(res.toFileString()+"\n");
        } catch (IOException e){
            System.out.println("Error saving reservation ");
        }
    }

}
