package com.org.labs03.Circulo;

/* Crie uma classe chamada Circulo com os seguintes atributos:

raio (representando o raio do círculo)
Implemente os seguintes métodos na classe:

calcularArea(): Este método deve calcular a área do círculo com base no raio e retornar o resultado.

calcularCircunferencia(): Este método deve calcular a circunferência do círculo com base no raio e retornar o resultado.

Crie objetos da classe Circulo e utilize os métodos para calcular e exibir os resultados. */

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        System.out.println("Area do circulo: " + c.calcularArea());
        System.out.println("Circunferencia do circulo: " + c.calcularCircunferencia());

        Circulo c2 = new Circulo(10);
        System.out.println("Area do circulo: " + c2.calcularArea());
        System.out.println("Circunferencia do circulo: " + c2.calcularCircunferencia());
    }
}
