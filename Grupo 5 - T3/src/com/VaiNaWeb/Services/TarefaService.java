package com.VaiNaWeb.Services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import com.VaiNaWeb.Entities.Tarefa;

public class TarefaService {
	// printa opções
		public static void print() {
			System.out.println("----------------------------------");
			System.out.println("|        Escolha uma opção        |");
			System.out.println("----------------------------------");
			System.out.println("1        Adicionar tarefa");
			System.out.println("2        Apagar tarefa");
			System.out.println("3        Exibir tarefas");
			System.out.println("4        Marcar tarefa como concluída");
			System.out.println("5        Listar tarefas concluídas");
			System.out.println("6        Listar tarefas pendentes");
			System.out.println("7        Sair do sistema");
			System.out.println("----------------------------------");
		}

		// adiciona uma nova tarefa
		public static void adicionar(Scanner sc, List<Tarefa> listaTarefas) {
			System.out.println("Digite o título da tarefa");
			String titulo = sc.nextLine();

			System.out.println("Digite a descrição da tarefa");
			String descricao = sc.nextLine();

			System.out.println("-----------------------------");
			System.out.println("Qual o nível de prioridade da tarefa?");
			System.out.println("-----------------------------");
			System.out.println("1    Urgente");
			System.out.println("2    Pouco urgente");
			System.out.println("3    Não urgente");
			System.out.println("-----------------------------");
			int urgencia = sc.nextInt();
			

			System.out.println("Digite a data de entrega no formato yyyy-MM-dd:");
			String dataTarefa = sc.nextLine();

			try {
				// formata uma data do timo localDate
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate data = LocalDate.parse(dataTarefa, formatter);

				// cria uma nova instancia e adiciona o objeto na lista
				listaTarefas.add(new Tarefa(descricao, titulo, , urgencia, data));
				System.out.println("Tarefa adicionada com sucesso!");
				System.out.println(listaTarefas.get(listaTarefas.size())); // Mostra a última tarefa adicionada
				
			} catch (DateTimeParseException e) {
				// printa uma mensagem se data estiver errada 
				System.out.println(
						"Erro ao adicionar a tarefa. Certifique-se de fornecer uma data válida no formato yyyy-MM-dd.");
			}
			
			apertaEnterParaContinuar(sc);//enquanto o usuário não pressionar a tecla enter, o sistema não roda
		}

		
		// lógica para exibir tarefas
		public static void listar(Scanner sc ,List<Tarefa> listaTarefas) {
			int controle = 0;
			for(int x = 0 ; x < listaTarefas.size() ; x++) {
				System.out.println("id " + x + " , " + listaTarefas.get());
				controle++;
			}
			if(controle==0) {
				System.out.println("Não há tarefas cadastradas.");
			}
			apertaEnterParaContinuar(sc);//enquanto o usuário não pressionar a tecla enter, o sistema não roda
		}
		
		// remove uma tarefa da lista
		public static void remover(Scanner sc, List<Tarefa> listaTarefas) {
			listar(sc, listaTarefas); // chama outro método que lista as tarefas
			System.out.println("Digite o id da tarefa que deseja apagar!");
			int apagar = sc.nextInt();
			Tarefa tarefa = listaTarefas.remove(apagar);
			if(tarefa!=null) {
				System.out.println("Tarefa excluída: ");    
			}
			
			apertaEnterParaContinuar(sc);//enquanto o usuário não pressionar a tecla enter, o sistema não roda
		}
		
		// adiciona um true em tarefas que já estão concluídas
		public static void tarefaOk(Scanner sc, List<Tarefa> listaTarefas) {
			listar(sc, listaTarefas); // chama outro método que lista as tarefas
			System.out.println("Insira o índice da tarefa que deseja marcar como concluída");
			int concluida = sc.nextInt();
			boolean estadoTarefa = listaTarefas.get(concluida).concluida;
			listaTarefas.get(concluida).concluida = true;
			if(estadoTarefa!=listaTarefas.get(concluida).concluida) {
				System.out.println("Alteração feita com sucesso!!");
			}
			
			apertaEnterParaContinuar(sc);//enquanto o usuário não pressionar a tecla enter, o sistema não roda
		}
		
		// lista as tarefas concluídas
		public static void listarTarefasConcluidas(Scanner sc, List<Tarefa> listaTarefas) {
			int controle = 0;
			for (int x = 0; x < listaTarefas.size(); x++) {
				if (listaTarefas.get(x).concluida){// retorna verdadeiro se tarefa já foi concluída
					System.out.println("id " + x + " , " + listaTarefas.get(x));
					controle++;
				}	
			}
			if(controle==0) {
				System.out.println("Não há tarefas concluídas.");
			}
			apertaEnterParaContinuar(sc); //enquanto o usuário não pressionar a tecla enter, o sistema não roda
		}
		
		// lista tarefas pendentes
		public static void listarTarefasPendentes(Scanner sc, List<Tarefa> listaTarefas) {
			int controle = 0;
			for (int x = 0; x < listaTarefas.size(); x++) {
				if (!listaTarefas.get(x).concluida){// retorna negativo se ja foi concluida
					System.out.println("id " + x + " , " + listaTarefas.get(x));
					controle++;
				}
			}
			if(controle==0) {
				System.out.println("Não há tarefas pendentes.");
			}
			apertaEnterParaContinuar(sc); //enquanto o usuário não pressionar a tecla enter, o sistema não roda
		}
		
		// segura o sistema a até o usuário pressione Enter 
		private static void apertaEnterParaContinuar(Scanner sc) {
			System.out.println("Pressione Enter para continuar");
			String verifica = sc.nextLine();
		}
}
