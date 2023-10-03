package org.example;

import java.util.Scanner;

//Считать с клавиатуры число и вывести на экран его бинарное представление в двоичной системе
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вывести число: ");

        int n = scanner.nextInt();

        String binary = Integer.toBinaryString(n);
        System.out.println("Бинарное представление числа " + n + ": " + binary);
        scanner.close();
    }
}
