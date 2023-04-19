package com.academy.mazolevskiy.lesson1;

import java.util.Scanner;

public class HelloWithName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String line = scanner.nextLine();
        String HelloWithName = printHelloWithName(line);
        System.out.println(HelloWithName);
    }

    public static String printHelloWithName(String parameter) {
        return "Hello " + parameter + "!";
    }
}
