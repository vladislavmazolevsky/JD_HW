package com.academy.mazolevskiy.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int password = 5479;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        int userPassword = scanner.nextInt();
        while (userPassword != password) {
            System.out.println("Неверный пароль. Попробуйте еще раз.");
            userPassword = scanner.nextInt();
        }
        System.out.println("Ес!");
    }
}
