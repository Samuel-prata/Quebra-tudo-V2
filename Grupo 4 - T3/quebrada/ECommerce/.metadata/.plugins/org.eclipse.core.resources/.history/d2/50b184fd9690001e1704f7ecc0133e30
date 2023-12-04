package br.com.vnw;

import java.util.List;
import java.util.Scanner;

public class Pagamento {
    private Scanner leitor;
    int opcao = 0;

    public Pagamento() {
        leitor = new Scanner(System.in); // Inicializar o Scanner
    }
    
    // O código verifica se o usuário inseriu um número válido de 1 a 4 para as opções de pagamento (Dinheiro, Cartão, Pix, Boleto).
    public boolean FormaDePagamento() {
        int tentativas = 0;
        while (tentativas < 3) { // Definindo um limite de 3 tentativas para entrada do usuário
            System.out.println("\nDigite a forma de pagamento: "
                + "\n1- Dinheiro"
                + "\n2- Cartão"
                + "\n3- Pix"
                + "\n4- Boleto");

            // verifica se o número informado é INT
            if (leitor.hasNextInt()) {
                opcao = leitor.nextInt();
                leitor.nextLine(); // Limpar o buffer
                
                if (opcao >= 1 && opcao <= 4) {
                    SwitchDePagamento();
                    return true; // Forma de pagamento válida
                }
            } else {
                leitor.nextLine(); // Limpar o buffer
            }

            System.out.println("Opção inválida. Tente novamente.");
            tentativas++;
        }
        System.out.println("Limite de tentativas excedido. Operação cancelada.");
        return false; // Se exceder o limite de tentativas, retorna falso
    }



    public void SwitchDePagamento() {
        switch(opcao) {
            case 1:
                System.out.println("Dinheiro");
                break;
            case 2:
                System.out.println("Cartão");
                break;
            case 3:
                System.out.println("Pix");
                break;
            case 4:
                System.out.println("Boleto");
                break;
            default:
                System.out.println("Opção Inválida. Tente novamente.");
        }
    }


    public void validarPagamento() {
        FormaDePagamento();
		 /*Comentário abaixo se refere a função ENUM removida do código para utilização de Switch-Case
    	 * 
    	 * verifica se a string formaPagamento fornecida corresponde a algum dos valores da
		 * enumeração FormaDePagamento (função acima). Ele percorre cada valor da enumeração e compara,
		 * ignorando maiúsculas ou minúsculas. Se encontrar uma correspondência, retorna true;
		 * caso contrário, retorna false, indicando se a forma de pagamento é válida ou não
         * for (FormaDePagamento formaPagamento : FormaDePagamento.values()) {
         *     if (formaPagamento.name().equalsIgnoreCase(forma)) {
         *         return true;
         *     }
         * }
         * return false;
 		 */
    }
    
    // Finaliza a compra, exibe o total e realiza a lógica do pagamento
    public void finalizarCompra(Carrinho carrinho, List<Produto> listaProdutos) {
        carrinho.exibirItensNoCarrinho();
        double totalCompra = carrinho.calcularTotal();

        // Mensagem de encerramento
        System.out.println("\nCompra finalizada. O total da compra foi: " + totalCompra + ".\n" 
                		   + "Obrigado por comprar conosco!");

        // Atualiza a quantidade disponível dos produtos comprados
        for (Produto produtoCarrinho : carrinho.getProdutosNoCarrinho()) {
            Produto.atualizarQuantidade(listaProdutos, produtoCarrinho.idProduto, produtoCarrinho.quantidade);
        }
        
        // Limpa o carrinho após a compra ser concluída
        carrinho.limparCarrinho();
        }
    }