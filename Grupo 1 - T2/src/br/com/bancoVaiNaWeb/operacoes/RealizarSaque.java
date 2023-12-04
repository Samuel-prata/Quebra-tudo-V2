package br.com.bancoVaiNaWeb.operacoes;

import br.com.bancoVaiNaWeb.conta.Conta;

import java.util.Scanner;

public class RealizarSaque {

    public static void realizarSaque(Conta conta, double valorSaque) {
        if (valorSaque > 0 && valorSaque <= conta.saldo) {
            double novoSaldo = conta.saldo - valorSaque;
            conta.saldo = novoSaldo;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo: " + novoSaldo);
        } else {
            System.out.println("Valor inválido para saque ou saldo insuficiente.");
        }
    }
}
