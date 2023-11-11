package com.org.labs03.Banco;

import java.time.LocalTime;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private int identificaConta;
    private String endereco;
    private String banco;
    private double saldo;
    private LocalTime horaAtual;

    public ContaBancaria(String nome, String cpf, int identificaConta, String endereco, String banco, double saldo, LocalTime horaAtual) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificaConta = identificaConta;
        this.endereco = endereco;
        this.banco = banco;
        this.saldo = saldo;
        this.horaAtual = horaAtual;
    }

    public void saque(double valor) {
        String mensagem = (saldo >= valor) ? "realizado com sucesso." : "Não foi possível realizar o saque.";
        saldo = (saldo >= valor) ? saldo - valor : saldo;
        System.out.println("Saque de R$" + valor + mensagem);
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void pix(double valor) {
        String mensagem = (horaAtual.isAfter(LocalTime.of(8, 0)) && horaAtual.isBefore(LocalTime.of(19, 0))) ?
                (saldo >= valor ? "realizado com sucesso." : "Não foi possível realizar a transferência pix.") :
                "A transferência PIX só pode ser realizada entre 8h e 19h.";

        if (horaAtual.isAfter(LocalTime.of(8, 0)) && horaAtual.isBefore(LocalTime.of(19, 0))) {
            saldo = (saldo >= valor) ? saldo - valor : saldo;
        }
        System.out.println("Transferência PIX de R$" + valor + mensagem);
    }

    public void transfencia(double valor) {
        String mensagem = (horaAtual.isAfter(LocalTime.of(8, 0)) && horaAtual.isBefore(LocalTime.of(19, 0))) ?
                (saldo >= valor ? "realizado com sucesso." : "Não foi possível realizar a transferência.") :
                " A transferência só pode ser realizada entre 8h e 19h.";

        if (horaAtual.isAfter(LocalTime.of(9, 0)) && horaAtual.isBefore(LocalTime.of(19, 0))) {
            saldo = (saldo >= valor) ? saldo - valor : saldo;
        }
        System.out.println("A transferência de R$" + valor + mensagem);
    }

    public void verificaSaldo() {
        System.out.println("Seu saldo é de: R$" + saldo);
    }

    public void verificaHora() {
        System.out.println("Confira agora a hora atual: " + horaAtual);
    }

    public static ContaBancaria cadastrarUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastro de novo usuário:");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("CPF: ");
        String cpf = input.nextLine();
        System.out.print("Número da conta: ");
        int identificaConta = input.nextInt();
        input.nextLine(); // Limpar o buffer de entrada
        System.out.print("Endereço: ");
        String endereco = input.nextLine();
        System.out.print("Banco: ");
        String banco = input.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();

        return new ContaBancaria(nome, cpf, identificaConta, endereco, banco, saldo, LocalTime.now());
    }

    public static void painelMenu(ContaBancaria conta) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu de Operações:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Transferência");
            System.out.println("4. Transferência PIX");
            System.out.println("5. Verificar Saldo");
            System.out.println("6. Verificar Hora Atual");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser sacado: ");
                    double valorSaque = input.nextDouble();
                    conta.saque(valorSaque);
                    break;
                case 2:
                    System.out.println("Informe o valor para depósito: ");
                    double valorDeposito = input.nextDouble();
                    conta.deposito(valorDeposito);
                    break;
                case 3:
                    System.out.print("Informe o valor da transferência: ");
                    double valorTransferencia = input.nextDouble();
                    conta.transfencia(valorTransferencia);
                    break;
                case 4:
                    System.out.print("Informe o valor da transferência PIX: ");
                    double valorPix = input.nextDouble();
                    conta.pix(valorPix);
                    break;
                case 5:
                    conta.verificaSaldo();
                    break;
                case 6:
                    conta.verificaHora();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        input.close();
    }
}

  
