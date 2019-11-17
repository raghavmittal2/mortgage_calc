package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaring constants
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        //taking inputs from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Rate of Interest(Percent): ");
        float annualRate = scanner.nextFloat();
        float monthlyInterest = annualRate / MONTH_IN_YEAR / PERCENT;

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        int numberOfMonths = years * MONTH_IN_YEAR;

        //calculating mortgage
        double temp = Math.pow((1 + monthlyInterest), numberOfMonths);
        double mortgage = principle * ((monthlyInterest * temp) / (temp - 1));

        //displaying the result
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + result);
    }
}
