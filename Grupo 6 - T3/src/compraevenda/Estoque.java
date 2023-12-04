package compraevenda;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> estoque;

    public Estoque() {
        this.estoque = new ArrayList<>();
    }

    public List<Produto> getEstoque() {
        return estoque;
    }

    public void adicionarProdutos(Produto produto) {
        estoque.add(produto);
    }

    public void atualizarEstoque(List<Produto> produtos, List<Integer> quantidadesVendidas) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidadeVendida = quantidadesVendidas.get(i);

            int indiceProduto = encontrarIndiceProduto(produto);

            if (indiceProduto == -1) {
                System.out.println("Produto " + produto.getNome() + " não encontrado no estoque.");
                continue;
            }

            int quantidadeEmEstoque = produto.getQtdEmEstoque();

            if (quantidadeVendida > quantidadeEmEstoque) {
                System.out.println("Produto " + produto.getNome() + " fora de estoque.");
                continue;
            }

            estoque.get(indiceProduto).setQtdEmEstoque(quantidadeEmEstoque);
        }
    }

    private int encontrarIndiceProduto(Produto produto) {
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).equals(produto)) {
                return i;
            }
        }
        return -1;
    }

    public void imprimirEstoque() {
        System.out.println("=== Conteúdo do Estoque ===");
        for (Produto produto : estoque) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Categoria: " + produto.getCategoria());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade em Estoque: " + produto.getQtdEmEstoque());
            System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
            System.out.println("-----");
        }
        System.out.println("===========================");
    }
}
