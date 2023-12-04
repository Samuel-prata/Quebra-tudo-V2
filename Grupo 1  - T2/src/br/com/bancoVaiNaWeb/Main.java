package br.com.bancoVaiNaWeb;

import br.com.bancoVaiNaWeb.conta.Conta;
import br.com.bancoVaiNaWeb.operacoes.CriarConta;

import java.util.InputMismatchException;
import com.java.util.Scanner;

import static br.com.bancoVaiNaWeb.operacoes.Calculadora.calcularGastos;
import static br.com.bancoVaiNaWeb.operacoes.RealizarDeposito.realizarDeposito;
import static br.com.bancoVaiNaWeb.operacoes.RealizarSaque.realizarSaque;


public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Conta conta = null;
        int opcao = -1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco vai na Web!\n" + "O que deseja fazer hoje ?\n" + "Escolha uma opção:");
        while (opcao != 0) {
            try {
                System.out.println("1: Calcular seus gastos;");
                System.out.println("2: Criar uma conta;"); // Crie uma conta
                System.out.println("3: Realizar um deposito; ");
                System.out.println("4: Realizar um saque; ");
                System.out.println("5: Verificar dados da sua conta; ");
                System.out.println("0: Sair.");

                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        calcularGastos();
                        separadorMenu();
                        break;
                    case 2:
                        conta = CriarConta.criarConta();
                        separadorMenu();
                        break;

                    case 3:
                        if (conta != null) {
                            System.out.println("Digite o valor que deseja depositar: ");
                            double valor = scanner.nextDouble();
                            realizarDeposito(conta, valor);
                        } else {
                            System.out.println("Crie uma conta primeiro!");
                        }
                        break;
                    case 4:
                        if (conta != null) {
                            System.out.println("Digite o valor que deseja sacar: ");
                            double valor = scanner.nextDouble();

                            realizarSaque(conta, valor);
                        } else {
                            System.out.println("Crie uma conta primeiro!");
                        }
                        break;
                    case 5:
                        if (conta != null) {
                            conta.visualizarDadosConta();
                        } else {
                            System.out.println("Crie uma conta primeiro!");
                        }
                        separadorMenu();
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Por favor, digite um número inteiro.");
                scanner.next();
            } catch (Exception err) {
                System.out.println("Ocorreu um erro inesperado: " + err.getMessage());
            }
        }
        scanner.close();
    }

    public static void separadorMenu() {
        System.out.println("**************");
    }
}
