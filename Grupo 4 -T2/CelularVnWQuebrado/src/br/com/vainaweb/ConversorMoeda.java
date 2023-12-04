package br.com.vainaweb;
import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int cotacaoDolar = 4.89; 

        do {
            exibirOpcoesConversor(cotacaoDolar);
            exibirOpcoesConversorUS(cotacaoDolar)
            float valor, resultado;           

            switch (opcao) {
                case 1;
                    System.out.println("Digite o valor em dólar: ");
                    valor = sc.nextFloat();
                    resultado = valor * cotacaoDolar;
                    System.out.println("O resultado é: R$" + resultado);
                    break;
                case 2;
                    System.out.println("Digite o valor em real: ");
                    valor = sc.nextFloat();
                    resultado = valor / cotacaoDolar;
                    System.out.println("O resultado é: US$" + resultado);
                    break;
                case 3;
                    OpcoesIniciais.main(args);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    exibirOpcoesConversor();
            }
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next();
                continue;
            }

        } while (opcao != 3);
        sc.close();
    }

    public static void exibirOpcoesConversor() {
        System.out.println("Escolha uma opção de conversão: ");
        System.out.println(" [1] Dólar para Real" + "\n [2] Real para Dólar" + "\n [3] Voltar");
    }
    
    public static void mainUS(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        float cotacaoDolar = 4.89f; 

        do {
            exibirOpcoesConversorUS();
            float valor, resultado;

            switch (opcao) {
                case 1;
                	System.out.println("Enter the value in dollars: ");
                    valor = sc.nextFloat();
                    resultado = valor / cotacaoDolar;
                    System.out.println("The result is: R$" + resultado);
                    break;
                case 2;
                	System.out.println("Enter the value in Brazilian real: ");
                    valor = sc.nextFloat();
                    resultado = valor * cotacaoDolar;
                    System.out.println("The result is: US$" + resultado);
                    break;
                case 3;
                    OpcoesIniciais.mainUS(args);
                    break;
                default:
                    System.err.println("Invalid Option!");
                    exibirOpcoesConversorUS();
            }
            
            if (sc.hasNextInt()) {
                opcao = sc.nextInt();
            } else {
            	System.out.println("Invalid input. Please enter an integer.");
                sc.next();
                continue;
            }

        } while (opcao != 3);
        sc.close();
    }

    public static void exibirOpcoesConversorUS() {
    	System.out.println("Choose a conversion option: ");
    	System.out.println(" [1] Dollar to Real" + "\n [2] Real to Dollar" + "\n [3] Back");

    }
    
}
