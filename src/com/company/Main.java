package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = readNumberOfNumbers();
        getPythagoreanNumbers(n);
    }

    public static int readNumberOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n = ");
        return scanner.nextInt();
    }

    public static void displayConclusion(int i, int j, int d){
        System.out.printf("%d %d %d\n", i, j, d);
    }

    public static boolean checkTheNumberOnTheIntegrity(int i, int j) {
        double z = Math.sqrt((i*i+j*j));
        return Math.floor(z) == z;
    }

    public static void getPythagoreanNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                double z = Math.sqrt((i*i+j*j));
                int d = (int) z;
                if (checkTheNumberOnTheIntegrity(i,j) && Math.floor(z)<= n) {
                    displayConclusion(i, j, d);
                }
            }
        }
    }
}

