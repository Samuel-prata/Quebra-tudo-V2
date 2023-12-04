package br.com.vainaweb;
import java.util.Scanner;

public class CalculadoraRefatorada {
	

	public static void main(String[] args) {
		
		exibirOpcoesCalculadoraUS();
		
		do {
			Scanner sc = new Scanner(System.in);
			int opcao = sc.nextInt();
			
			exibirOpcoesCalculadora();
			int n1, n2, resultado;
			
			if (sc.hasNextInt()) {
	            opcao = sc.nextInt();
	        } else {
	            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
	            sc.next();
	            continue;  
	        } 
			switch (opcaoUS) {
			case 1:
				System.out.println("Enter the first number: ");
				n1 = sc.nextInt();
				System.out.println("Enter the second number: ");
				n2 = sc.nextInt();
				resultado = somar();
				System.out.println("Sum result: " + resultado);
				break;
			case 2: 
				System.out.println("Enter the first number: ");
				n1 = sc.nextInt();
				System.out.println("Enter the second number: ");
				n2 = sc.nextInt();
				resultado = subtrair();
				System.out.println("Subtraction result: " + resultado);
				break;
			case 3: 
				System.out.println("Enter the first number: ");
				n1 = sc.nextInt();
				System.out.println("Enter the second number: ");
				n2 = sc.nextInt();
				resultado = multiplicar();
				System.out.println("Multiplication result: " + resultado);
				break;
			case 4:
				System.out.println("Enter the first number: ");
				n1 = sc.nextInt();
				System.out.println("Enter the second number: ");
				n2 = sc.nextInt();
				resultado = dividir();
				System.out.println("Division result: " + resultado);
				break;
			case 5:
				OpcoesIniciais.mainUS(args);
				break;
			default: 
				System.out.println("Invalid Option!");
			} 
			switch (opcao) {
				case 1:
					System.out.println("Digite o primeiro número: ");
					n1 = sc.nextInt();
					System.out.println("Digite o segundo número: ");
					n2 = sc.nextInt();
					resultado = somar();
					System.out.println("Resultado da soma: " + resultado);
					break;
				case 2: 
					System.out.println("Digite o primeiro número: ");
					n1 = sc.nextInt();
					System.out.println("Digite o segundo número: ");
					n2 = sc.nextInt();
					resultado = subtrair();
					System.out.println("Resultado da subtração: " + resultado);
					break;
				case 3: 
					System.out.println("Digite o primeiro número: ");
					n1 = sc.nextInt();
					System.out.println("Digite o segundo número: ");
					n2 = sc.nextInt();
					resultado = multiplicar();
					System.out.println("Resultado da multiplicação: " + resultado);
					break;
				case 4:
					System.out.println("Digite o primeiro número: ");
					n1 = sc.nextInt();
					System.out.println("Digite o segundo número: ");
					n2 = sc.nextInt();
					resultado = dividir();
					System.out.println("Resultado da divisão: " + resultado);
					break;
				case 5:
					OpcoesIniciais.main(args);
					break;
				default: 
					System.out.println("Opcão Inválida!");
				}
			
		} while(opcao != 5);
		

		sc.close();
	}
	
		public static void exibirOpcoesCalculadora() {
			System.out.println("Escolha uma operacao matemática: ");
			System.out.println(" [1] SOMA" + "\n [2] SUBTRAÇÃO" + "\n [3] MULTIPLICACAO" + "\n [4] DIVISAO" + "\n [5] VOLTAR");
		}
		
		static int somar(int n1, int n2) {
			return n1 + n2;
		}
		
		static int subtrair(int n1, int n2) {
			return n1 - n2;
		}
		
		static int multiplicar(int n1, int n2) {
			return n1 * n2;
		}
		
		static int dividir(int n1, int n2) {
			return n1 / n2;
		}
		
		public static void mainUS(String[] args) {

			
			Scanner sc = new Scanner(System.in);
			int opcao = 0;
			
			
			do {
				
				
				int n1, n2, resultado;
				
				if (sc.hasNextInt()) {
		            opcao = sc.nextInt();
		        } else {
		        	System.out.println("Invalid input. Please enter an integer.");
		            sc.next();
		            continue;  
		        }
			
			}while(opcao != 5);

			sc.close();
		}
		public static void exibirOpcoesCalculadoraUS() {
			System.out.println("Choose a mathematical operation: ");
			System.out.println(" [1] SUM" + "\n [2] SUBTRACTION" + "\n [3] MULTIPLICATION" + "\n [4] DIVISION" + "\n [5] BACK");

		}
}
