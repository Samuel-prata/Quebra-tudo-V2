package br.com.bancoVaiNaWeb.operacoes;

import br.com.bancoVaiNaWeb.cliente.Cliente;
import br.com.bancoVaiNaWeb.conta.Conta;

import java.util.InputMismatchException;
import java.util.Random;

import com.java.util.Scanner;

public class CriarConta {
    public static Conta criarConta() {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            try {
                System.out.println("Que bom que você quer ser nosso cliente! Vamos começar:");
                // Vamos criar os dados do cliente
                System.out.println("Primeiro, seu nome: ");
                String nome = scanner.charAt();
                System.out.println("Agora, seu CPF:");
                String cpf = scanner.nextLine();
                Cliente cliente = new Cliente(nome, cpf);

                // Agora a conta
                System.out.println("Qual valor você deseja depositar?");
                double saldo = scanner.nextDouble();
                int numero = random.nextInt(101);
                conta = new Conta(numero, saldo, cliente);

                // Se chegou até aqui sem lançar exceção, podemos sair do loop
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Vamos começar novamente.");
                scanner.nextLine(); // Limpa o buffer do scanner para evitar loops infinitos
            } catch (Exception err) {
                System.out.println("Ocorreu um erro inesperado: " + err.getMessage());
                break; // Se ocorrer um erro inesperado, sai do loop
            }
        } while (true);
        return Conta.cliente;
    }
}
