package com.org.labs04.FigurasGeometricas;
import java.util.ArrayList;
import java.util.List;

/*  2.1 Crie uma classe abstrata chamada FormaGeométrica com um método abstrato calcularArea();

2.2 Crie três classes concretas que herdem de FormaGeométrica: Retangulo, Círculo, Triângulo, Quadrado e Losango. Implemente o método calcularArea() em cada uma dessas classes para calcular a área de forma específica.

2.3 Na classe Principal, crie uma lista de formas geométricas que inclua retângulos, círculos, triângulos, quadrados e losangos.

2.4 Use um loop para calcular e exibir a área de cada forma geométrica na lista, mesmo que sejam tipos diferentes, usando o polimorfismo. */

public abstract class formasGeometricas {
    abstract double calcularArea();
      
   public static class Retangulo extends formasGeometricas {
        
        private double base;
        private double altura;

        public Retangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
        
        @Override
       public double calcularArea() {
            return base * altura;
        }
    }

   public static class Circulo extends formasGeometricas {
        private double raio;

        public Circulo(double raio) {
            this.raio = raio;
        }

        @Override
        double calcularArea() {
            return Math.PI * raio * raio;
        }

    }

   public static class Triangulo extends formasGeometricas {
        private double base;
        private double altura;

        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        double calcularArea() {
            return (base * altura) / 2;
        }
    }

  public static class Quadrado extends formasGeometricas {
        private double lado;

        public Quadrado(double lado) {
            this.lado = lado;
        }

        @Override
        double calcularArea() {
            return lado * lado;
        }
    }

   public static class Losango extends formasGeometricas {
        private double diagonalMaior;
        private double diagonalMenor;

        public Losango(double diagonalMaior, double diagonalMenor) {
            this.diagonalMaior = diagonalMaior;
            this.diagonalMenor = diagonalMenor;
        }

        @Override
        double calcularArea() {
            return (diagonalMaior * diagonalMenor) / 2;
        }
    }

public class Principal {
   public static void main(String[] args) {
    
    List<formasGeometricas> formas = new ArrayList<formasGeometricas>();
    formas.add(new Retangulo(5, 10));
    formas.add(new Circulo(3));
    formas.add(new Triangulo(10, 20));
    formas.add(new Quadrado(6));
    formas.add(new Losango(6, 8));

    for (formasGeometricas forma : formas) {
        System.out.println("Área da forma: " + forma.calcularArea());
    }
   }
}

}
