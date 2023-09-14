//Escreva um programa que separa a string em duas metades e imprime a primeira parte.

package org.labs02;

import java.util.Scanner;

public class SeparandoStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        String[] partes = frase.split(" ");
        System.out.println("Primeira parte: " + partes[0]);

        input.close();
    }
}
