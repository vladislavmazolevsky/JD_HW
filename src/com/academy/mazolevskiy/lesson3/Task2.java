package com.academy.mazolevskiy.lesson3;

public class Task2 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i <= 9; i++) {
            System.out.print(i);
            if (i == 9) {
                System.out.print("00");
            }
        }
        for (i = 11; i <= 99; i = i + 11) {
            System.out.print(i);
            if (i == 99) {
                System.out.print("000");
            }
        }
        for (i = 111; i <= 999; i = i + 111) {
            System.out.print(i);
            if (i == 999) {
                System.out.print("0000");
            }
        }
        for (i = 1111; i <= 9999; i = i + 1111) {
            System.out.print(i);
        }
    }
}
