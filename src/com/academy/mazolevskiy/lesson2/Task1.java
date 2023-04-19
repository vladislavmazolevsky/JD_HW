package com.academy.mazolevskiy.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        System.out.println("Десятичный формат: " + sum);
        System.out.println("Двоичный формат: " + Integer.toBinaryString(sum));
        System.out.println("Восьмеричный формат: " + Integer.toOctalString(sum));
        System.out.println("Шестнадцатиричный формат: " + Integer.toHexString(sum));
    }
}