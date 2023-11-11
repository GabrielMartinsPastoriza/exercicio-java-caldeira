//Escreva um programa que receba uma string do usuário e imprima ela ao contrário

package org.labs02;

import java.util.Scanner;

public class InvertedString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String phrase = input.nextLine();

            for (int i = phrase.length() - 1; i >= 0; i--) {
                System.out.print(phrase.charAt(i));

                input.close();
        }
    }
}
