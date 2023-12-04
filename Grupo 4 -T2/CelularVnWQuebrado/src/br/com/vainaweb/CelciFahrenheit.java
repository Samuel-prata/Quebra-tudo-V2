package br.com.vainaweb;

import java.util.Scanner;

public class CelciFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		opcao = sc.nextInt();
		exibirOpcoesConversor();
		float TC, TF, resultado;
		
		do {
			if (sc.hasNextInt()) {
	            opcao = sc.nextInt();
	        } else {
	            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
	            sc.next();
	            continue;  
	        }
		
		switch (opcao) {
		case 1:
			System.out.println("Digite a temperatura em Celcius: ");
			TC = sc.nextInt();
			resultado = (TC * 1.8f) + 32 ;
			System.out.println("O resultado é: " + resultado + "ºF");
			break;
		case 2: 
			System.out.println("Digite a temperatura em Fahrenheit: ");
			TF = sc.nextInt();
			resultado = (TF - 32) / 1.8f;
			System.out.println("O resultado é: " + resultado + "ºC");
			break;
		case 3: 
			OpcoesIniciais.main(args);;
			break;
		default: 
			System.err.println("Opcão Inválida!");
			exibirOpcoesConversor();
		}
	}while(opcao != 3);
		
	}
	
	public static void exibirOpcoesConversor() {
		System.out.println("Escolha uma opção de conversão: ");
		System.out.println(" [1] Celcius para Fahrenheit" + "\n [2] Fahrenheit para Celcius" + "\n [3] Voltar");
	}
	
	public static void mainUS(String[] args) {
		Scanner sc = new Scanner(System.in);
		opcao = sc.nextInt();
		exibirOpcoesConversorUS();
		float TC, TF, resultado;
		
		do {
			if (sc.hasNextInt()) {
	            opcao = sc.nextInt();
	        } else {
	            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
	            sc.next();
	            continue;  
	        }
		
		switch (opcao) {
		case 1:
			System.out.println("Enter the temperature in Celsius: ");
			TC = sc.nextInt();
			resultado = (TC * 1.8f) + 32 ;
			System.out.println("The result is: " + resultado + "ºF");
			break;
		case 2: 
			System.out.println("Enter the temperature in Fahrenheit: ");
			TF = sc.nextInt();
			resultado = (TF - 32) / 1.8f;
			System.out.println("The result is: " + resultado + "ºC");
			break;
		case 3: 
			OpcoesIniciais.mainUS(args);;
			break;
		default: 
			System.err.println("Invalid Option!");
			exibirOpcoesConversorUS();
		}
	} while (opcao != 3);
		sc.close();
		sc.close();
	}
	
	public static void exibirOpcoesConversorUS() {
		System.out.println("Choose a conversion option: ");
		System.out.println(" [1] Celsius to Fahrenheit" + "\n [2] Fahrenheit to Celsius" + "\n [3] Back");

	}

}

