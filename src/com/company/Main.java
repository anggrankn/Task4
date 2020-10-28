package com.company;

public class Main {

    public static void main(String[] args) {
       readPythagoreanNumbers();
    }

    public static void displayPythagoreanNumbersToTwenty(int firstNumber, int secondNumber, int thirdNumber) {
        System.out.printf("%d %d %d\n", firstNumber, secondNumber, thirdNumber);
    }

    public static boolean getRoundingDown(double z) {
        return Math.floor(z) == z;
    }

    public static void readPythagoreanNumbers() {
        int maxNumber = 20;
        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <=maxNumber; j++) {
                double z = Math.sqrt(i*i+j*j);
                if (getRoundingDown(z) && z <= maxNumber) {
                    displayPythagoreanNumbersToTwenty(i, j,(int) z);
                }
            }
        }
    }
}

