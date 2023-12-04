package br.com.bancoVaiNaWeb.conta;

import br.com.bancoVaiNaWeb.cliente.Cliente;

public class Conta {

    private int numero;
    public double saldo;

    private Cliente cliente;

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Conta() {

    }

    public void visualizarDadosConta() {
        if (cliente != null) {
            System.out.println("Nome: " + cliente.nome);
            System.out.println("CPF: " + cliente.cpf);
            System.out.println("Numero da conta: " + numero);
            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("Cliente não encontrado para esta conta.");
        }
    }
}
