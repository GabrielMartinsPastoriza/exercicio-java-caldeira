/*Implemente uma calculadora,
onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar.
 Durante a execução o programa deve perguntar ao usuário se ele deseja continuar,
  se ele não quiser, deve digitar ‘n’ para o programa encerrar.
 */

package org.labs02;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //passa os parametros
        int num1, num2;
        char operacao;
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite o primeiro número: ");
                num1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = input.nextInt();
                System.out.println("Digite a operação (+, -, *, /): ");
                operacao = input.next().charAt(0);
                // operação da calculadora
            switch (operacao) {
                case '+' -> System.out.println(num1 + num2);
                case '-' -> System.out.println(num1 - num2);
                case '*' -> System.out.println(num1 * num2);
                case '/' -> System.out.println(num1 / num2);
                default -> System.out.println("Operação inválida.");
            }
                //pergunta ao usuario se deseja continuar, se sim ele prossegue com as operações.
                System.out.println("Deseja continuar? (s/n)");
                continuar = input.next().charAt(0) == 's'; }


        }

    }

