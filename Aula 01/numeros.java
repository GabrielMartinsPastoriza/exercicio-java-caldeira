import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();

        scanner.close();

        double resultado = somar(primeiroNumero, segundoNumero);

        //Identifica se o resultado é um número inteiro, afim de evitar resultado.0
        if (resultado == (int) resultado){
            System.out.println("O resultado da soma destes números é: " + (int)resultado);
        } else {
            System.out.println("O resultado da soma destes números é: " + resultado);
        }

          }
        public static double somar(double primeiroNumero, double segundoNumero){
           return primeiroNumero + segundoNumero;

      }
    };

