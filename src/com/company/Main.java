package com.company;

public class Main {

    public static void main(String[] args) {
       readPythagoreanNumbers();
    }

    public static void displayPythagoreanNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("%d %d %d\n", firstNumber, secondNumber, thirdNumber);
    }

    public static void readPythagoreanNumbers() {
        int maxNumber = 20;
        for (int i = 1; i < maxNumber; i++) {
            for (int j = i; j < maxNumber; j++) {
                double sqrt = Math.sqrt(i * i + j * j);
                if ((int) sqrt == sqrt && sqrt <= maxNumber) {
                    displayPythagoreanNumbers(i, j, (int) sqrt);
                }
            }
        }
    }
}

