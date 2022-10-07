package com.company;

import java.util.Scanner;

public class ConverterSwitch implements Converter{
    public String convertMonth(int monthNumber){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a monthNumber between 1 and 12");
        monthNumber = scan.nextInt();
        switch(monthNumber) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "That's not a month";
        }
    }

    public String convertDay(int dayNumber){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a dayNumber between 1 and 7");
        dayNumber = scan.nextInt();

        switch(dayNumber) {
            case 1:
                return "Sunday";

            case 2:
                return "Monday";

            case 3:
                return "Tuesday";

            case 4:
                return "Wednesday";

            case 5:
                return "Thursday";

            case 6:
                return "Friday";

            case 7:
                return "Saturday";

            default:
                return null;
        }
    }
}