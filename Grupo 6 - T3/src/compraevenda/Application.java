package compraevenda;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<Cliente> listaClientes = new ArrayList<>();
		List<Produto> listaProdutos = new ArrayList<>();
		Cliente cliente01 = new Cliente("Angelica", "111.111", "1111");//nome, cpf e contato
		Cliente cliente02 = new Cliente("Barbara", "222.222", "2222");
		Cliente cliente03 = new Cliente("Felipi", "333.333", "3333");
		
		Fornecedor fornecedor1 = new Fornecedor("Amazon", "Rua treze", "1111");
		Estoque estoque01 = new Estoque();
		
		
		Produto produto01 = new Produto("Mouse", 90, estoque01, fornecedor1);
		Produto produto02 = new Produto("Teclado", 200, estoque01, fornecedor1);
		Produto produto03 = new Produto("Câmera", 250, estoque01, fornecedor1);
		
		listaClientes.add(cliente01);
		listaClientes.add(cliente02);
		listaClientes.add(cliente03);
		
		listaProdutos.add(produto01);
		listaProdutos.add(produto02);
		listaProdutos.add(produto03);
		
		Pedido pedido01 = new Pedido(cliente01);
		ItemPedido item01 = new ItemPedido(produto02,2);
		ItemPedido item02 = new ItemPedido(produto03,2);
		pedido01.getItens().add(item01);
		pedido01.getItens().add(item02);
		
		System.out.println("\n###### *** ######\n");
		System.out.println("Testando Entidade Cliente");
		for(Cliente cliente : listaClientes) {
			System.out.println("Clientes: " + cliente.getNome() );
		}
		System.out.println("\n###### *** ######\n");
		
		System.out.println("Testando Entidade Pedido");
		for(Produto produto : listaProdutos) {
			System.out.println("Produtos: " + produto.getNome() );
		}
		
		System.out.println("\n###### *** ######\n");
		System.out.println("Total do pedido 01: " + pedido01.getTotal());
		
		
		// Estoque estoque = new Estoque();
		// estoque.imprimirEstoque();
	}

}
