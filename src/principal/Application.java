package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Nome do cliente: ");
			String nomeCliente = sc.nextLine();
			System.out.println("cpf do cliente: ");
			String cpf = sc.nextLine();
			System.out.println("Pedido do cliente: ");
			Pedido pedido = new Pedido("tv", 10, 1500.0);
			sc.nextLine();
			clientes.add(new Cliente(nomeCliente, cpf, pedido));
		}
		
		for(Cliente l: clientes) {
			System.out.println(l.nome + " " + l.pedido.toString());
		}
		sc.close();

	}

}
