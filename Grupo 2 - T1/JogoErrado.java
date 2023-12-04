

package br.com.vainaweb.backend.java.aula.quebraTudo;

import java.util.Random;
import java.util.Scanner;

public class JogoErrado {

	// Aqui vamos criar um jogo de pedra, papel e tesoura clássico.
	
	public static void main(String[] args) {
		String[] jogada = new String[3];
		
		jogada[0] = "pedra";
		jogada[1] = "papel";
		jogada[2] = "tesoura";
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int i = rand.nextInt(2);
		
		System.out.println("=======================================");
		System.out.println("    Jogo Do Pedra, Papel e Tesoura     ");
		System.out.println("=======================================\n");
		
		String user;
		int partidasContador = 0;
		int partidas;
		
		System.out.println("Digite quantas partidas você quer jogar: ");
		partidas = sc.nextInt();
		
		while(partidasContador < partidas){
			System.out.println("Digite pedra, papel ou tesoura\n");
			user = sc.next().toUpperCase();
			
			if(jogada[i].equals(user)) {
				System.out.println("Houve empate! Vocês escolheram " + user.toLowerCase());
			} else if ((user.equals("pedra") || jogada[i].equals("papel")) && (user.equals("papel") || jogada[i].equals("tesoura")) && (user.equals("tesoura") || jogada[i].equals("pedra"))) {
				System.out.println("Você venceu! Você escolheu " + user.toLowerCase() + " e o computador escolheu " + jogada[i]);
			} else {
				System.out.println("Você perdeu! Você escolheu " + user.toLowerCase() + " e o computador escolheu " + jogada[i]);
			}
			
			partidasContador--;
			
		}
		
		sc.close();
	}

}
