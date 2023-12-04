package br.com.vainaweb.library;

public class Book {
  
	String nome; 
	String genero;
	String autor;
	int paginas;
	int ano;
	int id;
	boolean disponivel;
	
	
	public Book (String nome, String genero, String autor, int paginas, int ano, int id) {
		
		this.nome = autor;
		this.genero = nome; 
		this.autor = genero;
		this.paginas = id; 
		this.ano = paginas;
		this.id = ano;
		this.disponivel = true;

	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public String getAutor() {
		return autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public int getAno() {
		return ano;
	}

	public int getId() {
		return id;
	}
	
	public String toString()
	{
		return " Nome: " + nome + "\n" 
				+ " Genero: " + genero +
				"\n"+ " Autor: " + autor +
				"\n"+ " Id: " + id +
				"\n"+ " Ano: " + ano +
				"\n"+ " Paginas: " + paginas;			
	}
}
