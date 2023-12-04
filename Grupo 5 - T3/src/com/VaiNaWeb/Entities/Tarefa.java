package com.VaiNaWeb.Entities;

import java.time.LocalDate;

public class Tarefa {
	public String titulo;
	public String descricao;
	public Integer prioridade;
	public LocalDate data;
	public Boolean concluida = true;

	public Tarefa() {
	}

	public Tarefa(String titulo, String descricao, Integer prioridade, LocalDate data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.data = data;
	}
	
	@Override
	public String toString() {
		if(this.concluida) {
			return "Título: " + titulo + ", descrição: " + descricao + ", prioridade: " + prioridade + ", data: "
					+ data + ", estado: " + "concluída";
		}
		return "Título: " + titulo + ", descrição: " + descricao + ", prioridade: " + prioridade + ", data: "
				+ data + ", estado da tarefa: " + "pendente";
	}
}
