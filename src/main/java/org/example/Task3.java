package org.example;

//Ввести нужное число, и вывести все делители этого числа на экран
public class Task3 {
    public static void main(String[] args) {

        int n = 7;
        System.out.println("Делители числа n: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
