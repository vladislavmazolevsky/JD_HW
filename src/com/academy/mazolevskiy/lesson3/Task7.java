package com.academy.mazolevskiy.lesson3;

public class Task7 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (100 - 5 + 1) + 5);
            }
        }
        findMaxString(matrix);
    }

    public static void findMaxString(int[][] matrix) {
        int maxIndex = 0;
        int maxSum = 0;
        int tempSum;
        for (int i = 0; i < matrix.length; i++) {
            tempSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                tempSum = tempSum + matrix[i][j];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxIndex = i;
            }
        }
        System.out.println("Индекс строки: " + maxIndex);
    }
}
