package org.example;

import java.util.Scanner;

public class temperatureSwitch {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahreheit) {
        double celsius = (fahreheit - 32) * (5.0 / 9);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double celsius;
        double fahrenheit;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Celsius to Fahrenheit.");
            System.out.println("2. Fahrenheit to Celius.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Celius:");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit:");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
