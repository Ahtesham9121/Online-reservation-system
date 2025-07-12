package com.oasis.reservation.model;

public class Reservation {
    private String pnr;
    private String name;
    private String trainNo;
    private String trainName;
    private String classType;
    private String journeyDate;
    private String from;
    private String to;

    public Reservation(String pnr, String name, String trainNo, String trainName,
                       String classType, String journeyDate, String from, String to) {
        this.pnr = pnr;
        this.name = name;
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.classType = classType;
        this.journeyDate = journeyDate;
        this.from = from;
        this.to = to;
    }

    public String getPnr() {
        return pnr;
    }

    @Override
    public String toString() {
        return "PNR: " + pnr + "\nName: " + name + "\nTrain No: " + trainNo +
                "\nTrain Name: " + trainName + "\nClass: " + classType +
                "\nDate: " + journeyDate + "\nFrom: " + from + "\nTo: " + to;
    }

    public String toFileString() {
        return String.join(",", pnr, name, trainNo, trainName, classType, journeyDate, from, to);
    }

    public static Reservation fromFileString(String data) {
        String[] parts = data.split(",");
        return new Reservation(parts[0], parts[1], parts[2], parts[3],
                parts[4], parts[5], parts[6], parts[7]);
    }
}
