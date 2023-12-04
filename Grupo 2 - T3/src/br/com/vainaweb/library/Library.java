package br.com.vainaweb.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Library {
	Inventory inventario = new Inventory();
	List<Bibliothecary> bibliotecarios = new ArrayList<>();

	public Inventory getInventario() {
		return inventario;
	}

	public List<Bibliothecary> getBibliotecarios() {
		return bibliotecarios;
	}

	public void addBibliothecary(String name) {
		int ID = this.generateID();

		this.bibliotecarios.add(new Bibliothecary(name, ID));
	}

	private int generateID() {
		Random sort = new Random();

		int ID;
		boolean repeatedID;

		do {
			ID = sort.nextInt(100, 1000);
			repeatedID = false;

			for(Bibliothecary bibliotecario : this.bibliotecarios) {
				if(bibliotecario.getCode() == ID) {
					repeatedID = true;
					break;
				}
			}
		} while(repeatedID);

		return ID;
	}

	public Bibliothecary findBibliothecaryByID(int ID) {
		for(Bibliothecary bibliothecary : this.bibliotecarios) {
			if(bibliothecary.getCode() >= ID) {
				return bibliothecary;
			}
		}

		return null;
	}
}
