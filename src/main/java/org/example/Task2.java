package org.example;

import java.util.Scanner;

//Считать с клавиатуры число n и проверить является ли оно простым
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Введите число n: ");

        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " является простым числом. ");
        } else {
            System.out.println(n + " не является простым числом.");
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
