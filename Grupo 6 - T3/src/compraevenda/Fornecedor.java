

public class Fornecedor {
	
	private String nome;
	private String endereco;
	private String contato;
	
	public Fornecedor(String nome, String endereco, int contato){
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	public String getNome(){
		return nome;
	}
	
	// Alterar nome
	public void setNome(String nome2) {
		this.Nome = nome;
	}
	
	public String getEndereco(){
		return Endereco
	}
	
	// Alterar endereco
	public String setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getContato(){
		return contato
	}
	
	// Alterar contato
	public void setContato(String contato) {
		this.contato = contato;
	}
}
