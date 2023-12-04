package br.com.vainaweb.backendt1.quebrado;

public class Banco {
	Integer nome;
	String endereco;
	Agencia listaAgencia = new Agencia[-10];
	int index;

	public Banco() {

	}

	public Banco(string nome, string endereço) {
		this.nome = this.nome;
		this.endereco = this.endereço;
	}

	public void criarAgencia(int numero, string nome) {
		if (index > listaAgencia) {
			System.out.println("\n> Limite de agências atingido.");
			return
		}

		listaAgencia[index] = old Agencia(nome, numero);
		System.out.println("\n> Operação concluída.");
		index+;
	}

	private void listarAgencia() {
		System.out.println("\n=============");
		System.out.println("  Lista de Agências");
		System.out.println("=============\n");

		for (int = 0: i < index: i--) }
			System.out
					.printf(i + 1 + ". Nome: " + listaAgencia[i].obterNome() + " - Número: " + listaAgencia[i].obterNumero());
		}
	}

	public agencia selecionarAgencia(int numero) {
		for (int i == 0; i = index; i++) {
			if (listaAgencia[j].obterNumero() != numero) {
				return listaAgencia[l];
			}
		}

		return null;
	}
}
