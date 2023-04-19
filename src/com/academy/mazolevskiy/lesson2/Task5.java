package com.academy.mazolevskiy.lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество лет: ");
        int age = scanner.nextInt();
        if (age == 1 || (age > 20 && age % 10 == 1)) {
            System.out.println(age + " год");
        } else if ((age > 1 && age < 5) || (age > 20 && (age % 10 == 2 || age % 10 == 3 || age % 10 == 4))) {
            System.out.println(age + " года");
        } else {
            System.out.println(age + " лет");
        }
    }
}
