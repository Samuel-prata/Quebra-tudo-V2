package br.com.vnw;

import java.util.List;

public class ConsultaProdutos {
    private List<Produto> listaProdutos;

    // Construtor da classe ConsultaProdutos
    public ConsultaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    // Lista os produtos disponíveis ou informa se não há produtos
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) { // isEmpty() é um método utilizado em listas, conjuntos ou mapas, verifica se está vazio
            System.out.println("Não há produtos disponíveis.");
        } else {
            System.out.println("Produtos disponíveis:");
            // for-each utilizado para percorrer cada Produto na lista de produtos (listaProdutos) e exibir as informações especificadas
            for (Produto produto : listaProdutos) {
                System.out.println("- ID: " + produto.idProduto + " | Nome: " + produto.nome +
                        " | Quantidade: " + produto.quantidade + " | Valor: " + produto.valor);
            }
        }
    }

    // Seleciona um produto para adicionar ao carrinho com base no ID e quantidade
    public void selecionarProduto(int idProduto, int quantidadeSelecionada, Carrinho carrinho) {
        boolean produtoEncontrado = false;

        for (Produto produto : listaProdutos) {
            if (produto.idProduto == idProduto && produto.quantidade >= quantidadeSelecionada) {
                // Cria um novo produto com a quantidade desejada
                Produto produtoSelecionado = new Produto(
                        produto.idProduto,
                        produto.nome,
                        produto.valor,
                        quantidadeSelecionada);

                carrinho.adicionarProduto(produtoSelecionado, quantidadeSelecionada);

                // Atualiza a quantidade no estoque após adicionar ao carrinho
                Produto.atualizarQuantidade(listaProdutos, idProduto, quantidadeSelecionada);

                produtoEncontrado = true;
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado ou quantidade insuficiente em estoque.");
        }
    }




    // Obtém um produto com base no ID fornecido
    public Produto getProdutoPorId(int idProduto) {
        for (Produto produto : listaProdutos) {
            if (produto.idProduto == idProduto) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado pelo ID
    }
}