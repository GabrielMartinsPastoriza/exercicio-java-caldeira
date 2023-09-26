/*Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar.
Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater.
O usuário deve digitar seu palpite e se o número for menor do que 300.000,
Leônidas deve dizer Um pouco mais!,
caso o número dito pelo usuário seja menor, ele dirá Um pouco menos!".*/

package org.labs02;

import java.util.Scanner;

public class Fala300 {
    public static void main(String[] args) {
        boolean continuar = true;
        try (Scanner input = new Scanner(System.in)) {
            while (continuar) {
                System.out.println("Quantos soldados os 300 espartanos irão enfrentar? ");
                String kicks = input.nextLine();
                double enemies = 300000;
                int chute = Integer.parseInt(kicks);

                if (chute < enemies) {
                    System.out.println("Um pouco mais!");
                } else if (chute > enemies) {
                    System.out.println("Um pouco menos!");
                } else {
                    System.out.println("Parabéns! Você adivinhou corretamente. Os 300 espartanos enfrentarão " + chute + " soldados.");
                    continuar = false;
                }

                System.out.println("Deseja tentar de novo? (s/n): ");
                String tryAgain = input.nextLine();

                if (!tryAgain.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
