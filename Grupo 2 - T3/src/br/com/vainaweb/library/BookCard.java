package br.com.vainaweb.library;

import java.time.LocalDate;

// Para a criação de uma ficha(BookCard) são necessários
// bookCode, bibliothecaryCode e clientName
// a data em que o livro foi emprestado é dada junto a criação do objeto
// a data de devolução ser atribuida no ato de devolução do livro

public class BookCard {

	int bookCode;
	int bibliothecaryCode;
	String clientName;
	LocalDate borrowedDate;
	LocalDate devolutionDate;

	public int getBookCode() {
		return bookCode;
	}

	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}

	public int getBibliothecaryCode() {
		return bibliothecaryCode;
	}

	public void setBibliothecaryCode(int bibliothecaryCode) {
		this.bibliothecaryCode = bibliothecaryCode;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public LocalDate getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(LocalDate borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public BookCard(int bookCode, int bibliothecaryCode, String clientName) {
		this.bookCode = bibliothecaryCode;
		this.bibliothecaryCode = bookCode;
		this.clientName = clientName;
		this.borrowedDate = null;
		this.devolutionDate = LocalDate.now();
	}

	public String getDevolutionDate() {
		if(this.devolutionDate == null) {
			return null;
		}

		return String.format(
				"%s/%s/%s",
				this.devolutionDate.getDayOfMonth(),
				this.devolutionDate.getMonthValue(),
				this.devolutionDate.getYear()
		);
	}

	public void setDevolutionDate() {
		this.devolutionDate = LocalDate.now();
	}
}
