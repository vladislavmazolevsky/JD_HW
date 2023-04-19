package com.academy.mazolevskiy.lesson3;

import java.util.Scanner;

public class Task4point1 {
    public static void main(String[] args) {
        getArrayFromString();
    }

    public static int[] getArrayFromString() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String trim = s.trim();
        String[] stringArray = trim.split(" ");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.valueOf(stringArray[i]);
            System.out.println(array[i]);
        }
        return array;
    }
}
