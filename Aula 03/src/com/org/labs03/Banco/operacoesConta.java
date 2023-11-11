package com.org.labs03.Banco;

public class operacoesConta {
    public static void main(String[] args) {
        ContaBancaria conta = ContaBancaria.cadastrarUsuario();
        ContaBancaria.painelMenu(conta);
    }
}
