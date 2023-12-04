package br.com.vainaweb.library;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	  Library library = new Library();
	  Scanner sc = new Scanner(System.in);

	  library.getInventario().addBook("O iluminado", "Terror", "Stephen King", 464, 1977);
      library.getInventario().addBook("O simbolo perdido", "Suspense", "Dan Brown", 496, 2009);
      library.getInventario().addBook("O conde de monte cristo", "Aventura", "Alexandre Dumas", 1664, 1845);
      library.getInventario().addBook("In The Tall Grass", "Terror", "Stephen King", 468, 1980);

      library.addBibliothecary("Rámon");
      library.addBibliothecary("Arnaldo");
      library.addBibliothecary("Pequitro");

	  boolean repeat = false;
	  String operationResponse;
	  int op = 0;

	  System.out.println("---------------- Bem-vindo a Biblioteca VnW ----------------\n");

	  do {
		  System.out.print(" Entre com a opção desejada:\n\n");
		  System.out.println("	1. Buscar livro");
		  System.out.println("	2. Listar livro");
		  System.out.println("	3. Listar bibliotecários");
		  System.out.println("	4. Empréstimo de livro");
		  System.out.println("	5. Devolução de livro ");
		  System.out.println("	6. Encerrar Sistema \n");

		  if(sc.hasNextInt()) {
			  op = sc.nextInt();			  
		  } else {
			  op = 0;
		  }

		  int bookCode;
		  int bibliothecaryCode;
		  String userName;
		  
		  switch(op) {
			  case 1:
				  System.out.println("\n---------------- Pesquisa de Livros ----------------\n");
				  System.out.println("\n Entre com o tipo de busca desejada: \n");
				  System.out.println("	1. Buscar livro por nome");
				  System.out.println("	2. Buscar livro por gênero");
				  System.out.println("	3. Buscar livro por autor");
				  System.out.println("	4. Buscar livro por código");
				  System.out.println("	5. Buscar livro por mínimo de páginas");
				  System.out.println("	6. Buscar livro por ano \n");
	
				  bookSearch(library);
	
				  break;
			  case 2:
				  System.out.println("\n---------------- Livros ----------------\n");
	
				  List<Book> books = library.getInventario().getAvailableBooks();
	
				  for(Book book : books) {
					  System.out.println(book + "\n");
				  }
	
				  break;
			  case 3:
				  System.out.println("\n---------------- Bibliotecários ----------------\n");
	
				  List<Bibliothecary> bibliothecaries = library.getBibliotecarios();
	
				  for(Bibliothecary bibliothecary : bibliothecaries) {
					  System.out.println(bibliothecary + "\n");
				  }
	
				  break;
			  case 4:
				  // Para o empréstimo do livro é necessário:
				  // Nome do usuário, códigos válidos do livro e bibliotecário
				  System.out.println("\n---------------- Empréstimo de Livro ----------------\n");
				  System.out.print("\n Usuário: ");
				  userName = sc.next();

		  		  System.out.print(" Código do Livro: ");
				  if(sc.hasNextInt()) {
					  bibliothecaryCode = sc.nextInt();				  
				  } else {
					  System.out.println(" O código do bibliotecário dever ser um número inteiro");
					  break;
				  }

				  System.out.print(" Código do Bibliotecário: ");
				  if(sc.hasNextInt()) {
					  bookCode = sc.nextInt();
				  } else {
					  System.out.println(" O código do livro dever ser um número inteiro");
					  break;
				  }

	
				  Bibliothecary bibliothecary = library.findBibliothecaryByID(bibliothecaryCode);
	
				  operationResponse = library.inventario.borrowBook(
						  bookCode,
						  bibliothecaryCode,
						  userName,
						  bibliothecary
				  );
	
				  System.out.println(" " + operationResponse);
	
				  break;
			  case 5:
				  // Para a devolução do livro é necessário:
				  // Nome do usuário, códigos válidos do livro e bibliotecário
				  // sendo esses os mesmos informados quando foi feito o empréstimo
				  System.out.println("\n---------------- Devolução de Livro ----------------\n");
				  System.out.print("\n Usuário: ");
				  userName = sc.next();
				  System.out.print(" Código do Livro: ");
				  if(sc.hasNextInt()) {
					  bibliothecaryCode = sc.nextInt();				  
				  } else {
					  System.out.println(" O código do bibliotecário dever ser um número inteiro");
					  break;
				  }

				  System.out.print(" Código do Bibliotecário: ");
				  if(sc.hasNextInt()) {
					  bookCode = sc.nextInt();
				  } else {
					  System.out.println(" O código do livro dever ser um número inteiro");
					  break;
				  }

				  operationResponse = library.getInventario().returnBook(
						  bookCode,
						  bibliothecaryCode,
						  userName
				  );

				  System.out.println(" " + operationResponse);

				  break;
			  case 6:
				  System.out.print("\n Encerrando o sistema...");
				  break;
			  default:
				  System.out.print("\n Opção inválida, escolha uma opção válida. \n");
		  }

		  // Deve esperar o usuário apertar enter uma vez para mostrar o menu novamente
		  if(op != 6) {
			  System.out.print("\n Aperte Enter para continuar...");

			  try {
				  sc.next();
			  } catch (Exception e) {
				  e.printStackTrace();
			  }			  
		  }

	}while(repeat);
	  
	  sc.close();
  }

	// Esses são os métodos de busca para filtrar livros
	// Caso o usuário queira buscar um livro pelo nome
	// é necessário digitar o nome exatamente como registrado
	// por exemplo, se o nome do livro é "Clean Code"
	// o usuário deverá digitar "Clean Code", somente "Clean" não é suficiente
	// todavia ele pode digitar "cLeaN coDe" e ainda sim a busca deve funcionar
	// tal funcionalidade se dá em todas as buscas por String
	static void bookSearch(Library library) {
		Scanner sc = new Scanner(System.in);

		int option;
		int intToSearch;
		String toSearch;
		boolean again;
		List<Book> searchedBooks;

		do {
			again = false;

			if(sc.hasNextInt()) {
				  option = sc.nextInt();
			} else {
				  option = 0;
			}

			switch (option) {
				case 1:
					System.out.print("\n Entre com o nome do livro: ");
					toSearch = sc.next();

					searchedBooks = library.getInventario().buscaAutor(toSearch);

					showBooksList(searchedBooks, "Não foi encontrado nenhum livro com o nome informado");

					break;
				case 2:
					System.out.print("\n Entre com o nome do gênero: ");
					toSearch = sc.next();

					searchedBooks = library.getInventario().buscaNome(toSearch);

					showBooksList(searchedBooks, "Não foi encontrado nenhum livro com o gênero informado");

					break;
				case 3:
					System.out.print("\n Entre com o nome do autor: ");
					toSearch = sc.next();
	
					searchedBooks = library.getInventario().buscaGenero(toSearch);

					showBooksList(searchedBooks, "Não foi encontrado nenhum livro com o(a) autor(a) informado(a)");

					break;
				case 4:
					System.out.print("\n Entre com o código do livro: ");
					if(sc.hasNextInt()) {
						intToSearch = sc.nextInt();
					} else {
						System.out.println(" O código do livro dever ser um número inteiro");
						break;
					}
					
					searchedBooks = library.getInventario().buscaAno(intToSearch);

					showBooksList(searchedBooks, "Não foi encontrado nenhum livro com o código informado");

					break;
				case 5:
					System.out.print("\n Entre com o número mínimo de páginas: ");
					if(sc.hasNextInt()) {
						intToSearch = sc.nextInt();
					} else {
						System.out.println(" O número de páginas dever ser um número inteiro");
						break;
					}
					
					searchedBooks = library.getInventario().buscaId(intToSearch);

					showBooksList(searchedBooks, "Não foi encontrado nenhum livro a quantidade de páginas informada");

					break;
				case 6:
					System.out.print("\n Entre com o número do ano de publicação: ");
					if(sc.hasNextInt()) {
						intToSearch = sc.nextInt();
					} else {
						System.out.println(" O ano de publicação dever ser um número inteiro");
						break;
					}

					searchedBooks = library.getInventario().buscaMinimoPaginas(intToSearch);

					showBooksList(searchedBooks, "Não foi encontrado nenhum livro com o ano informado");

					break;
				default:
					System.out.println("\n Opção inválida, escolha uma opção válida.");
				}
		} while (again);

		sc.close();
	}

	public static void showBooksList(List<Book> books, String failMessage) {
		if(books.size() != 0) {
			for (Book book : books) {
				System.out.println(book + "\n");
			}					
		} else {
			System.out.println(" " + failMessage);
		}
	}
}