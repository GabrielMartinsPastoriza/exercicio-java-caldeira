package com.github.javacaldeira;

import java.util.Date;
import java.util.Scanner;

public class ContaBancaria {
    public String nome;
    public double saldo;
    public String cpf;
    public String agencia;
    public String endereco;
    public Date horaAtual;

    public ContaBancaria(String nome, double saldo, String cpf, String agencia, String endereco) {
        this.nome = nome;
        this.saldo = saldo;
        this.cpf = cpf;
        this.agencia = agencia;
        this.endereco = endereco;
        this.horaAtual = new Date();
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
            atualizarHoraAtual();
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void areaPix(double valorPIX) {
        if (valorPIX > 0 && valorPIX <= this.saldo) {
            this.saldo -= valorPIX;
            System.out.println("PIX registrado com sucesso!");
            atualizarHoraAtual();
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
            atualizarHoraAtual();
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void extrato() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: R$" + this.saldo);
    }

    private void atualizarHoraAtual() {
        this.horaAtual = new Date();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do titular da conta: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Informe o número da agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Informe o endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Informe seu saldo: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, saldoInicial, cpf, agencia, endereco);

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("0 - Área PIX");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
               case 0:
                   System.out.println("Digite o valor do PIX: ");
                   double valorPIX = scanner.nextDouble();
                   conta.areaPix(valorPIX);
                   break;

                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.deposito(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.saque(valorSaque);
                    break;
                case 3:
                    conta.extrato();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
