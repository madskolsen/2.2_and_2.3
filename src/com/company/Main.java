package com.company;

public class Main {

    public static void main(String[] args) {
	String day = "Tuesday";
    String month = "September";
    int year = 2021;
    int date = 7;
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);

        double hour = 13.0;
        double minute = 50.0;
        double second = 30.0;
        double hourdecimal = (hour+minute/60);

        System.out.println("Seconds since midnight: " + (hour*60*60+minute*60+second));
        System.out.println("Percentage of day passed: " + (hourdecimal/24*100));



    }
}
