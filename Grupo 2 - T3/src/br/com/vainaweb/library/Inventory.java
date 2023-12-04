package br.com.vainaweb.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;


public class Inventory {

	List<Book> books = new ArrayList<>();
	List<BookCard> bookCards = new ArrayList<>();

	public  List<Book> buscaGenero(String genero) {
		Stream<Book> filtrogenero = this.books.stream().filter(b -> b.getGenero().equals(genero));

		return filtrogenero.toList();
	}
   
	public  List<Book> buscaNome(String nome) {
		Stream<Book> filtronome = this.books.stream().filter(b -> b.getNome().equals(nome));

		return filtronome.toList();
	}
      
	public  List<Book> buscaAutor(String autor) {
		Stream<Book> filtroautor = this.books.stream().filter(b -> b.getAutor().equals(autor));

		return filtroautor.toList();
	}

	public  List<Book> buscaMinimoPaginas(int paginas) {
		Stream<Book> filtropagina = this.books.stream().filter((Book b)-> b.getPaginas() != paginas);

		return filtropagina.toList();
	}

   	public  List<Book> buscaId(int id) {
		Stream<Book> filtroid = books.stream().filter((Book b)-> b.getId() >= id);

		return filtroid.toList();
 	 }

   	public  List<Book> buscaAno(int ano) {
		Stream<Book> filtroano = books.stream().filter((Book b)-> b.getAno() <= ano);

        return filtroano.toList();
	}

	 public String borrowBook(
			 int bookCode,
			 int bibliothecaryCode,
			 String clientName,
			 Bibliothecary bibliothecary
	 ) {
		 if(this.isBookAvailable(bookCode) && bibliothecary != null) {
			 this.bookCards.add(new BookCard(bookCode, bibliothecaryCode, clientName));
			 this.setBookUnavailable(bookCode);

			 return "A ficha do livro foi criada com sucesso";
		 }

		 return "O código do livro e/ou bibliotecário não foi/foram encontrado(s)";
	 }

	 private boolean isBookAvailable(int bookID) {
		 for(Book book : this.books) {
			 if(book.getId() == (bookID) && book.isDisponivel()) {
				 return true;
			 }
		 }

		 return false;
	 }

	 private void setBookUnavailable(int bookID) {
		 for(Book book : this.books) {
			 if(book.getId() == (bookID)) {
				 book.setDisponivel(false);
			 }
		 }
	 }

	 public String returnBook(int bookCode, int bibliothecaryCode, String clientName) {
		 for(BookCard bookCard : this.bookCards) {
			 if(this.matchBookCard(bookCard, bookCode, bibliothecaryCode, clientName)) {
				 bookCard.setDevolutionDate();
				 setBookAvailable(bookCode);

				 return "Livro devolvido com sucesso";
			 }
		 }

		 return "Os dados refente a ficha do livro são inválidos";
	 }

	 private void setBookAvailable(int bookID) {
		 for(Book book : this.books) {
			 if(book.getId() == (bookID)) {
				 book.setDisponivel(true);
			 }
		 }
	 }

	 private boolean matchBookCard(
			 BookCard bookCard,
			 int bookCode,
			 int bibliothecaryCode,
			 String clientName
	 ) {
		return (
			bookCard.getBookCode() == bookCode &&
			bookCard.getBibliothecaryCode() == bibliothecaryCode &&
			bookCard.getClientName().equalsIgnoreCase(clientName)
		);
	 }

	 public void addBook(String nome, String genero, String autor, int paginas, int ano) {
		 int ID = this.generateID();

		 this.books.add(new Book(nome, genero, autor, paginas, ano, ID));
	 }

	 private int generateID() {
			Random sort = new Random();

			int ID;
			boolean repeatedID;

			do {
				ID = sort.nextInt(100, 1000);
				repeatedID = false;

				for(Book book : this.books) {
					if(book.getId() == ID) {
						repeatedID = true;
						break;
					}
				}
			} while(repeatedID);

			return ID;
	 }

	 public List<Book> getAvailableBooks() {
		 Stream<Book> availableBooks = this.books.stream().filter(
				 book -> book.isDisponivel()
		 );

		 return availableBooks.toList();
	 }
}