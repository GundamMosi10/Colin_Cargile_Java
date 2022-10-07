package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        System.out.println(converterIf.convertMonth(3));
        System.out.println(converterIf.convertDay(3));


        ConverterSwitch converterSwitch = new ConverterSwitch();
        System.out.println(converterSwitch.convertMonth(3));
        System.out.println(converterSwitch.convertDay(7));

    }
}

//Priyanka, Yi and Colin

