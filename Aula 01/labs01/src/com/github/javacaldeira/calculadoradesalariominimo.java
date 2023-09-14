package com.github.javacaldeira;

import java.util.Scanner;

public class calculadoradesalariominimo {
    public static void main(String[] args) {

        double salariominimo = 1.320;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salariodigitado = scanner.nextDouble();

        double soma = salariominimo + salariodigitado;


        scanner.close();

    }
}
