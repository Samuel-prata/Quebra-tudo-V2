package compraevenda;

public class Produto {
	
    private String nome;
    private String categoria;
    private double preco;
    private Estoque estoque;
    private Fornecedor fornecedor;
    private int qtdEmEstoque;

    //Construtor
    public Produto(String nome2, double preco2,
    		Estoque estoque2, Fornecedor fornecedor2) {
    	estoque = estoque2;
    	fornecedor = fornecedor2;
    	setNome(nome2);
    	setPreco(preco2);
    	
    }
    
    public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public int getQtdEmEstoque() {
		return qtdEmEstoque;
	}

	public void setQtdEmEstoque(int qtdEmEstoque) {
		this.qtdEmEstoque = qtdEmEstoque;
	}

	public void exibirInformacoes() {  
        System.out.println("Nome: " + nome);
        System.out.println("Categoria: " + categoria);
        System.out.println("Preço: R$" + preco);
        //System.out.println("Quantidade em Estoque: " + quantEmEstoque);
    }
    
    //Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

  
    // Metodo para realizar o cadastro de um produto no sistema
    public void cadastrarProduto(String nome, String categoria, double preco, int quantidadeEmEstoque) {
    	this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        //this.quantEmEstoque = quantidadeEmEstoque;
        System.out.println("Produto cadastrado com sucesso!");
    }

    
    // Metodo para atualizar a quantidade em estoque apos uma venda
    /*public void realizarVenda(int quantidadeVendida) {
        if (quantidadeVendida > quantEmEstoque) {
            System.out.println("Quantidade insuficiente em estoque!");
        } else {
            quantEmEstoque -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso!");
        }
    }*/

}
