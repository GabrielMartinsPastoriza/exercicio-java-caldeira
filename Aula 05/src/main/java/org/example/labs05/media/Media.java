package org.example.labs05;
import java.util.Scanner;

import static java.lang.System.*;

public class Media {
    public static void main(String[] args) {

        int[] num = new int[5];

        int total = 0;
        double average;

        Scanner scanner = new Scanner(in);

        for (int i = 0; i < num.length; i++) {
            out.print("Digite um número: ");
            num[i] = scanner.nextInt();
            total += num[i];
        }

        average = (double) total / num.length;

        out.println("O total é: " + total + " e a média é: " + average);
    }
}