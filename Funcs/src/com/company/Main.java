package com.company;

import java.util.Scanner;

public class Main {

    public static double getAnnual(double hoursPerWeek, double moneyPerHour, int vacationDays) {
        return (hoursPerWeek * 4 * 12 - (8 * vacationDays)) * moneyPerHour;
    }

    public static void main(String[] args) {
        System.out.println("calculate annual salary");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hours per week");
        double hoursPerWeek = in.nextDouble();
        System.out.println("Enter money per hour");
        double moneyPerHour = in.nextDouble();
        System.out.println("Enter vacation days");
        int vacationDays = in.nextInt();

        System.out.println("your annual salary is: " + getAnnual(hoursPerWeek, moneyPerHour, vacationDays));

    }
}
