package br.com.vnw;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private String nomeUsuario; // para trazer o nome do usuário
    private List<Produto> produtosNoCarrinho;

    // Construtor para referenciar a variável com o nome informado pelo usuário na Classe Principal
    public Carrinho(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.produtosNoCarrinho = new ArrayList<>();
    }
    
    // Construtor da classe Carrinho para inicializar a lista de produtos
    public Carrinho() {
        this.produtosNoCarrinho = new ArrayList<>();
    }

    // Adiciona um produto ao carrinho com base na quantidade especificada
    public boolean adicionarProduto(Produto produto, int quantidade) {
        if (produto != null && quantidade > 0) {
            boolean produtoJaNoCarrinho = false;

            // Verifica se o produto já está no carrinho
            for (Produto p : produtosNoCarrinho) {
                if (p.idProduto == produto.idProduto) {
                    p.quantidade += quantidade; // Atualiza a quantidade do produto existente no carrinho
                    produtoJaNoCarrinho = true;
                    break;
                }
            }

            // Se o produto não estiver no carrinho, adiciona-o
            if (!produtoJaNoCarrinho) {
                Produto copiaProduto = new Produto(
                        produto.idProduto,
                        produto.nome,
                        produto.valor,
                        quantidade);

                produtosNoCarrinho.add(copiaProduto);
            }

            System.out.println("\nProduto(s) adicionado(s) ao carrinho com sucesso!");
            System.out.println("Pressione 'Enter' para voltar ao Menu principal.");
            return true; // Produto(s) adicionado(s) com sucesso
        } else {
            System.out.println("Não foi possível adicionar o produto ao carrinho.");
            System.out.println("Pressione 'Enter' para voltar ao Menu principal.");
            return false; // Produto não pôde ser adicionado
        }
    }



    // Exibe os itens presentes no carrinho ou informa se está vazio
    public void exibirItensNoCarrinho() {
        if (produtosNoCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println(nomeUsuario + ", estes são os produtos atualmente no carrinho:");
            for (Produto produto : produtosNoCarrinho) {
                double valorTotalItem = produto.valor * produto.quantidade;
                String valorTotalFormatado = String.format("%.2f", valorTotalItem); // formata o valor total com 2 casas decimais. Sintaxe: String nomeDaVariavel = String.format("%.qtdcasasf, variavelQueEstáSendoConvertida)
                System.out.println("- " + produto.nome + " | Quantidade: " + produto.quantidade + " | Valor Total: " + valorTotalFormatado);
            }
        }
    }


    // Calcula o valor total dos itens presentes no carrinho
	/* usa um loop para olhar cada produto que está no carrinho. Para cada produto,
	 * ele pega o valor do produto e multiplica pela quantidade desse produto no
	 * carrinho. Em seguida, soma isso ao valor total. Dessa forma, ao final do
	 * loop, o total vai ser o custo de todos os itens no carrinho juntos. */
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtosNoCarrinho) {
            total += produto.valor * produto.quantidade;
        }
        return total;
    }

    // Limpa o carrinho removendo todos os produtos
    public void limparCarrinho() {
        produtosNoCarrinho.clear();
        System.out.println("\nCarrinho limpo. Todos os produtos foram removidos.");
    }

    // Retorna a lista de produtos no carrinho
    public List<Produto> getProdutosNoCarrinho() {
        return produtosNoCarrinho;
    }
}