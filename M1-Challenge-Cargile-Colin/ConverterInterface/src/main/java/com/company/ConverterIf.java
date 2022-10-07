package com.company;

import java.util.Scanner;

public class ConverterIf implements Converter{
    public String convertMonth(int monthNumber){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a monthNumber between 1 and 12");
        monthNumber = scan.nextInt();
        if(monthNumber == 1){
            return "January";
        } else if (monthNumber == 2){
            return "February";
        } else if (monthNumber == 3){
            return "March";
        } else if (monthNumber == 4){
            return "April";
        } else if (monthNumber == 5){
            return "May";
        } else if (monthNumber == 6){
            return "June";
        } else if (monthNumber == 7){
            return "July";
        } else if (monthNumber == 8){
            return "August";
        } else if (monthNumber == 9){
            return "Sep";
        } else if (monthNumber == 10){
            return "October";
        } else if (monthNumber == 11){
            return "November";
        } else if (monthNumber == 12){
            return "December";
        } else if (monthNumber <= 0 || monthNumber >= 13) {
            return "You don't follow instructions!!";
        } return null;
    }

    public String convertDay(int dayNumber) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a dayNumber between 1 and 7");
        dayNumber = scan.nextInt();
        if (dayNumber == 1) {
            return "Sunday";
        } else if (dayNumber == 2) {
            return "Monday";
        } else if (dayNumber == 3) {
            return "Tuesday";
        } else if (dayNumber == 4) {
            return "Wednesday";
        } else if (dayNumber == 5) {
            return "Thursday";
        } else if (dayNumber == 6) {
            return "Friday";
        } else if (dayNumber == 7) {
            return "Saturday";
        } else if (dayNumber <= 0 || dayNumber >= 8) {
            return "You don't follow instructions!";
        } return null;
    }


}

