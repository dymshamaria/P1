package org.example;

//Вывести на экран следующую последовательность: 1, 2, 4, 8, 16... где каждое следующее
// число вдвое больше предыдущего
public class Task1 {
    public static void main(String[] args) {
        int limit = 10;
        int number = 1;

        System.out.println("Последовательность чисел, вдвое больше предыдущего: ");

        for (int i = 1; i <= limit; i++) {
            System.out.println(number);
            number += 2;
        }
    }
}
