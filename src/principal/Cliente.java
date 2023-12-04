package principal;

public class Cliente {
	String nome;
	String cpf; 
	Pedido pedido;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, Pedido pedido) {
		this.nome = nome;
		this.cpf = cpf;
		this.pedido = pedido;
	}
}
