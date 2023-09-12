package com.github.javacaldeira;

import java.util.Scanner;

public class AnalisarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira os 3 números
        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double terceiroNumero = scanner.nextDouble();

        scanner.close();

        double maior = Math.max(primeiroNumero, Math.max(segundoNumero, terceiroNumero));

        double menor = Math.min(primeiroNumero, Math.min(segundoNumero, terceiroNumero));

        double media = (primeiroNumero + segundoNumero + terceiroNumero) / 3.0;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média aritmética é: " + media);
    }
}
