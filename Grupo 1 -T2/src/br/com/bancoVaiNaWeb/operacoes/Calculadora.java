package br.com.bancoVaiNaWeb.operacoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {


    public static void calcularGastos() {
        double num1 = 0, num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("0. Para sair");

        int escolhaDaOperacao = lerEscolhaDaOperacao(scanner);

        if (escolhaDaOperacao != 0) {
            System.out.println("Digite o primeiro número: ");
            num1 = lerNumero(scanner);
            System.out.println("Digite o segundo número: ");
            num2 = lerNumero(scanner);
        }
        double resultado = 0;

        switch (escolhaDaOperacao) {
            case 1:
                resultado = soma(num1, num2);
                break;
            case 2:
                resultado = subtracao(num1, num2);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                break;
            case 4:
                resultado = divisao(num1, num2);
                break;
            case 0:
                System.out.println("Fim");
                break;
        }
        System.out.println(resultado);
    }

    // Função de soma
    public static double soma(double a, double b) {
        return a + b;
    }

    // Função de subtração
    public static double subtracao(double a, double b) {
        return a - b;
    }

    // Função de multiplicação
    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    // Função de divisão
    public static double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
    }

    // Método para ler a escolha da operação
    private static int lerEscolhaDaOperacao(Scanner scanner) {
        int escolha;
        while (true) {
            try {
                escolha = scanner.nextInt();
                if (escolha >= 0 && escolha <= 4) {
                    break;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Tente novamente.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }
        return escolha;
    }

    // Método para ler os números digitados
    private static double lerNumero(Scanner scanner) {
        double numero;
        while (true) {
            try {
                numero = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                scanner.next();
            }
        }
        return numero;
    }
}
