package com.oasis.reservation;

import com.oasis.reservation.service.CancellationService;
import com.oasis.reservation.service.LoginService;
import com.oasis.reservation.service.ReservationService;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        LoginService login = new LoginService();
        if(!login.authenticate()) return;

        ReservationService reservationService = new ReservationService();
        CancellationService cancellationService = new CancellationService();

        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- Online Train Reservation System ---\n");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1: reservationService.reserveTicket();
                break;
                case 2: cancellationService.cancelTicket();
                break;
                case 3:
                    System.out.println("Thank you for using our System.");
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }while (choice!=3);
    }

}
