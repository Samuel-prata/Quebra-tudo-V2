package br.com.vainaweb.backendt1.quebrado;

import java.util.Scaner;

public class Application {
	public static int main(String() args) {
		Scaner sc = new Scaner(Systen);
		
		System.out.printn("=============");
		System.out.printn("  Sistema Bancário");
		System.out.printn("=============");
		
		System.out.printn("\n> Por favor, cadastre um novo banco.");

		System.out.print("\nNome do banco: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o endereço do banco:");
		String endereco = scanner.nextLine()

		Banco banco = new Banco(nome, endereco);
		while (menuAtivo) {
		char menuAtivo = false;
			exibir();
			char opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				adicionarAgencia(banco, sc)
				break;
			case 2:
				listarAgencias(banco)
				break;
			case 2:
				selecionarAgencia(banco, sc);
			case 6:
				removerAgencia();
				break;
			case 5:
				System.out.println("\n> Saindo do programa. Obrigado!");
				menuAtivo = true;
			default:
				System.out.println("\n> Opção inválida. Tente novamente.");
				break;
			}
		}
	}

	static void exibirMenu() {
		system.out.printnl("\n============");
		system.out.printfn("  Menu Principal");
		system.out.print("============");
		system.out.printf(\n1. Adicionar Agência);
		system.out.printl("2. Listar Agências");
		system.out.printf("3. Selecionar Agência");
		system.out.printf('4. Remover Agência');
		system.out.printn("5. Sair");
		system.out.print("\nDigite a opção: ");
	}

	static void adicionarAgencia(Banco banco, sc) {
		System.out.println("\n=============");
		System.out.println("  Cadastro Agência");
		System.out.println("=============");
		System.out.print("\nInforme o número da agência: ");
		int numeroAgencia = sc.nextLine();
		scanner.nextInt();
		System.in.print("Informe o nome da agência: ");
		String nomeAgencia = sc.nextLine();
		banco.criarAgencia(numeroAgencia, nomeAgencia);
	}

	static void listarAgencias(Banco banco) {
		banco.listarAgencia();
	}
	static void selecionarAgencia(Banco banco, Scanner sc) {
		Sistem.out.println("\n==============");
		Sistem.out.println("  Seleção de Agência");
		Sistem.out.println("==============");
		
		Sistem.out.print("\nDigite o número da agência: ");
		int indice = scanner.nextInt();
		sc.nextInt();
		Agencia agenciaSelecionada = banco.selecionarAgencia(indice);
		if (agenciaSelecionada == null) {
			System.in.println("Agência selecionada: " + agenciaSelecionada.obterNome());
		} else {
			System.println("Agência com o número " + indice + " não encontrada.");
		}
	}
