package br.com.vnw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Super hiper mega blaster master plus advanced Ecommerce Grupo 4 - VNW");
        // Solicita e armazena o nome do usuário
        System.out.print("Digite o nome do usuário: ");
        String nomeDigitado = scanner.nextLine();
        Usuario usuario = new Usuario(nomeDigitado); // cria uma instância da classe Usuario e atribui a essa instância o nome informado pelo usuário, capturado pela variável nomeDigitado.
        double totalCompra = 0; // Inicializando com 0

        // Inicializa a lista de produtos com alguns produtos de exemplo
        List<Produto> listaProdutos = inicializarListaProdutos();

        ConsultaProdutos consultaProdutos = new ConsultaProdutos(listaProdutos);
        Carrinho carrinho = new Carrinho(nomeDigitado);
        Pagamento pagamento = new Pagamento();
        
        // Exibe uma mensagem de boas vindas
        System.out.printf("\nOlá " + usuario.mostrarNome() + "! " + "Bem vindo(a) a loja online do Grupo 4 VNW.%n"
                          + "Por favor, selecione uma das opções abaixo: \n");

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
//            scanner.nextLine(); // Limpar o buffer após a leitura do inteiro
            System.out.println();

            
            // Realiza ações com base na opção escolhida
            switch (opcao) {
                case 1:
                    consultaProdutos.listarProdutos();
                    System.out.println("\nPressione 'Enter' para voltar ao Menu principal.");
                    scanner.nextLine(); // Limpa o buffer após a exibição dos produtos
                    break;
                case 2:
                    System.out.println("Opção selecionada: Adicionar produto ao carrinho");
                    System.out.print("Digite o ID do produto: ");
                    int idProdutoSelecionado = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer após a leitura do inteiro
                    System.out.print("Digite a quantidade desejada: ");
                    int quantidadeSelecionada = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer após a leitura do inteiro

                    // Encontrar o produto na lista de acordo com o ID informado
                    Produto produtoSelecionado = null;
                    for (Produto produto : listaProdutos) {
                        if (produto.idProduto == idProdutoSelecionado) {
                            produtoSelecionado = produto;
                            break;
                        }
                    }
                    
                    // Calcula o valor de acordo com ID acima, buscando o valor e multiplicando pela quantidade
                    if (produtoSelecionado != null) {
                        double valorTotal = produtoSelecionado.valor * quantidadeSelecionada;
                        System.out.println("\nValor total: " + valorTotal + "\n");

                        System.out.print("Confirma adicionar ao carrinho (S/N)? ");
                        String confirmacao = scanner.nextLine().toUpperCase();

                        if (confirmacao.equals("S")) {
                            consultaProdutos.selecionarProduto(idProdutoSelecionado, quantidadeSelecionada, carrinho);
                        } else {
                            System.out.println("Operação cancelada pelo usuário.");
                        }
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    adicionarNovoProduto(scanner, listaProdutos);
//                    System.out.println("\nPressione 'Enter' para voltar ao Menu principal.");
                    break;
                case 4:
                    carrinho.exibirItensNoCarrinho();
                    System.out.println("\nPressione 'Enter' para voltar ao Menu principal.");
                    scanner.nextLine(); // Limpa o buffer após exibir o carrinho
                    break;
                case 5:
                    totalCompra = finalizarCompra(carrinho, listaProdutos, pagamento, totalCompra);
                    System.out.println("\nPressione 'Enter' para voltar ao Menu principal.");
//                    scanner.nextLine(); // Limpa o buffer após finalizar a compra
                    break;
                case 6:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 6);
    }

    // Inicializa a lista de produtos com alguns produtos de exemplo
    private static List<Produto> inicializarListaProdutos() {
        List<Produto> listaProdutos = new ArrayList<>();
        Produto.adicionarNovoProduto(listaProdutos, 1, "Cadeira", 129.99, 10);
        Produto.adicionarNovoProduto(listaProdutos, 2, "Mesa", 499.99, 15);
        Produto.adicionarNovoProduto(listaProdutos, 3, "Teclado", 79.99, 8);
        return listaProdutos;
    }

    // Exibe o menu de opções para o usuário
    private static void exibirMenu() {
        System.out.println("\n╔═════════════ MENU ═════════════╗");
        System.out.println("╟1. Consultar produtos	         ╢");
        System.out.println("╟2. Adicionar produto ao carrinho╢");
        System.out.println("╟3. Adicionar produto ao estoque ╢");
        System.out.println("╟4. Exibir carrinho	         ╢");
        System.out.println("╟5. Finalizar compra             ╢");
        System.out.println("╟6. Sair do sistema              ╢");
        System.out.println("╚════════════════════════════════╝\n");
        System.out.print("Escolha uma opção: ");
    }

    // Permite ao usuário adicionar um novo produto à lista de produtos
    // estão sendo recebidos dois parâmetros: um objeto do tipo Scanner chamado scanner para coletar dados do usuário e uma lista do tipo Produto chamada listaProdutos para adicionar novos produtos.
    private static void adicionarNovoProduto(Scanner scanner, List<Produto> listaProdutos) {
        System.out.print("Digite o ID do produto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após a leitura do inteiro

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer após a leitura do double

        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer após a leitura do inteiro
        
        // chama um método estático chamado adicionarNovoProduto da classe Produto, responsável por criar e 
        // adicionar um novo produto à lista de produtos existente, utilizando os parâmetros id, nome, valor e quantidade.
        Produto.adicionarNovoProduto(listaProdutos, id, nome, valor, quantidade);
    }

    // Finaliza a compra e realiza o pagamento
    private static double finalizarCompra(Carrinho carrinho, List<Produto> listaProdutos, Pagamento pagamento, double totalCompra) {
        carrinho.exibirItensNoCarrinho();
        totalCompra = carrinho.calcularTotal(); // Atualizando o valor de totalCompra
        System.out.println("Total da compra: " + totalCompra);

        boolean formaPagamentoValida = pagamento.FormaDePagamento();
        if (formaPagamentoValida) {
            pagamento.finalizarCompra(carrinho, listaProdutos);
        } else {
            System.out.println("Forma de pagamento inválida. A compra foi cancelada.");
        }
        
        return totalCompra;
    }
    	
//        pagamento.FormaDePagamento(); correção de exceção pela lógica acima
//        System.out.print("Digite a forma de pagamento (Dinheiro, Cartao, PIX, Boleto): ");
//        // String formaPagamento = scanner.nextLine();
//
//       
//        pagamento.finalizarCompra(carrinho, listaProdutos);
// 
//        
//        carrinho.limparCarrinho();
//        return totalCompra;
//        
 }