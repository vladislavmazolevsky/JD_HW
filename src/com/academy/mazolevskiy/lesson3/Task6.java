package com.academy.mazolevskiy.lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        Task5.getMinElement(array);
        Task5.getMaxElement(array);
    }
}
