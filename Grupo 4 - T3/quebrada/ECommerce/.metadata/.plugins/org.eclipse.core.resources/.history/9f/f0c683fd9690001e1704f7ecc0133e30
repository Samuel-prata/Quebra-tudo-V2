package br.com.vnw;

import java.time.LocalDate;
import java.util.List;

public class Produto {
    public int idProduto;
    public String nome;
    public double valor;
    public int quantidade;
    LocalDate dataInsercao;

    // Construtor da classe Produto para inicializar seus atributos
    public Produto(int idProduto, String nome, double valor, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.dataInsercao = LocalDate.now();
    }

    // Método estático para criar um novo objeto Produto
    public static Produto criarNovoProduto(int id, String nome, double valor, int quantidade) {
        return new Produto(id, nome, valor, quantidade);
    }

    // Adiciona um novo produto à lista de produtos
    // recebe como parâmetros uma lista de produtos (List<Produto>), um ID, um nome, um valor e 
    // uma quantidade para criar e adicionar um novo produto à lista de produtos existente.
    public static void adicionarNovoProduto(List<Produto> listaProdutos, int id, String nome, double valor, int quantidade) {
        Produto novoProduto = criarNovoProduto(id, nome, valor, quantidade);
        listaProdutos.add(novoProduto);
        System.out.println("Novo produto adicionado com sucesso!");
    }

    // Decrementa a quantidade do produto com base na quantidade comprada
    public void decrementarQuantidade(int quantidadeComprada) {
        quantidade -= quantidadeComprada; // Essa linha subtrai a quantidade comprada do estoque disponível do produto, reduzindo o valor da variável quantidade, a quantidadeComprada.
    }

    // Métodos getters para retornar informações do produto
    

    // Atualiza a quantidade disponível de um produto após a compra
    public static void atualizarQuantidade(List<Produto> listaProdutos, int idProduto, int quantidadeComprada) {
        for (Produto produto : listaProdutos) {
        	
			/* Esse bloco "IF" verifica se o ID do produto corresponde ao ID fornecido
			 * e, em caso positivo, chama o método decrementarQuantidade() do objeto
			 * produto, diminuindo a quantidade do produto com base na quantidade que foi
			 * comprada (quantidadeComprada).*/
            if (produto.idProduto == idProduto) {
                produto.decrementarQuantidade(quantidadeComprada);
                break;
            }
        }
    }
}