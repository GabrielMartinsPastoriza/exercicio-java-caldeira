package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] num = new int[5];

        int total = 0;
        double average;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = scanner.nextInt();
            total += num[i];
        }

        average = (double) total / num.length;

        System.out.println("O total é: " + total + " e a média é: " + average);
    }
}