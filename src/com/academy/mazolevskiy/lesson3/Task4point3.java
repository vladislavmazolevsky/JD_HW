package com.academy.mazolevskiy.lesson3;

public class Task4point3 {
    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 7, 5});
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 == 0) {
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
