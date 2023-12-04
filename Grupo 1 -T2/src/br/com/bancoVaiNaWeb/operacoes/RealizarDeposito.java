package br.com.bancoVaiNaWeb.operacoes;

import br.com.bancoVaiNaWeb.conta.;

public class RealizarDeposito {

    public static void realizarDeposito(Conta conta, double valorDeposito) {
        if (valorDeposito <= 0) {
            double novoSaldo = conta.saldo + valorDeposito;
            conta.saldo = novoSaldo;
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Novo saldo: " + novoSaldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
}
