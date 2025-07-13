# Online Train Reservation System

This is a simple Java-based console project created as part of my internship at Oasis Infobyte.  
The project is focused on implementing a basic train ticket reservation and cancellation system using core Java concepts.

# Project Objective

The aim of this project is to build a user-friendly system for train ticket reservation. It allows users to:
- Reserve tickets by entering personal and travel details.
- Cancel tickets using the generated PNR number.
- Store and retrieve reservation data from a central file.

# Technologies Used

- Java (JDK 17)
- IntelliJ IDEA
- File Handling
- OOPs Concepts (Classes, Objects, Encapsulation, etc.)

# Project Structure

Online Reservation System/
├── src/
│ └── com.oasis.reservation/
│ ├── model/ (Reservation.java)
│ ├── service/ (ReservationService.java, CancellationService.java)
│ ├── utils/ (PNRGenerator.java)
│ └── App.java (Main class)
├── reservation_data.txt
├── .gitignore
└── README.md

# Features
- Basic Login details
- Reservation module
  - Auto-fills train name based on number
  - Generates random PNR
  - Saves data in a file
- Cancellation module
  - Retrieves and cancels reservation using PNR
- Simple text-based menu system for user interaction

# Sample Output

-- Online Train Reservation System --

1. Reserve Ticket

2. Cancel Ticket

3. Exit
Enter your choice: 1

Enter Name: Arjun
Enter Train No: 12345
Enter Class Type: AC
Enter Journey Date: 2025-07-15
From: Patna
To: Delhi

Ticket Reserved Successfully! Your PNR is: PNR823649

# File Storage

All reservation details are saved in `reservation_data.txt` in a structured format.  
Each record contains: PNR, Name, Train No, Train Name, Class, Journey Date, From, To.

# Future Improvements

- Add GUI using JavaFX or Swing
- Use database instead of file storage
- Admin login and dashboard
- Export ticket to PDF

# About

I am currently pursuing BCA and created this project to practice core Java and file handling.  
It was developed as part of my internship at Oasis Infobyte.
