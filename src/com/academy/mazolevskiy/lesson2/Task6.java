package com.academy.mazolevskiy.lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        double x1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите коэффицент А: ");
        int coefficientA = scanner.nextInt();
        System.out.print("Введите коэффицент B: ");
        int coefficientB = scanner.nextInt();
        System.out.print("Введите коэффицент C: ");
        int coefficientC = scanner.nextInt();
        double discriminant = Math.pow(coefficientB, 2) - 4 * coefficientA * coefficientC;
        if (discriminant < 0) {
            System.out.println("Уровнение не имеет вещественных корней.");
        } else if (discriminant == 0) {
            x1 = (double) -(coefficientB) / (2 * coefficientA);
            System.out.println("Уровнение имеет один вещественный корень.");
            System.out.println("x = " + x1);
        } else {
            x1 = (-(coefficientB) + Math.sqrt(discriminant)) / (2 * coefficientA);
            double x2 = (-(coefficientB) - Math.sqrt(discriminant)) / (2 * coefficientA);
            System.out.println("Уровнение имеет два вещественных корня.");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
