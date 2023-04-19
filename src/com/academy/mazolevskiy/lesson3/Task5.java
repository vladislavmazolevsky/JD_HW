package com.academy.mazolevskiy.lesson3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int givenArray[] = {3, 5, 2, 1, 4};
        getMaxElement(givenArray);
        getMinElement(givenArray);
    }

    /**
     * Этот метод находит максимальное значение массива
     * и выводит его на экран.
     *
     * @param array Заданный целочисленный массив элементов.
     */
    public static void getMaxElement(int array[]) {
        Arrays.sort(array);
        int max = array[array.length - 1];
        System.out.println(max);
    }

    /**
     * Этот метод находит минимальное значение массива
     * и выводит его на экран.
     *
     * @param array Заданный целочисленный массив элементов.
     */
    public static void getMinElement(int array[]) {
        Arrays.sort(array);
        int min = array[0];
        System.out.println(min);
    }
}
