package br.com.vainaweb.backend.t3quebratudo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner	sc = new Scanner(System.in);
	private boolean	login = false;
	static User			activeUser;
	
	static public void Main(String args[]) {
		List<Course>	courses = new ArrayList<>();
		List<User>		users = new ArrayList<>();
		String					option;
		boolean			menu = true;
		
		loginMenu(users);
		
		courses.add( new Course("(1) Curso de Java", "Desvende os misterios dessa linguagem maravilhosa", 49.99, 100));
		courses.add( new Course("(2) Curso de Python", "Ssss Sss ssSSS ssssSs ssSss ssssS (Tá em cobres)", 9.99, 80));
		courses.add( new Course("(3) Curso de UI/UX", "Desenvolva as telas mais brabas do mercado", 49.99, 50));
		courses.add( new Course("(4) Curso de Javascript", "Um pouquinho de web é sempre bom né?", 200, 10));
		courses.add( new Course("(5) Curso de Curso", "Seja o curseiro mais cursador do país", 50, 300));
		courses.add( new Course("(6) Curso de Palhaço", "Receba pra fazer gracinha", 20, 80));
		courses.add( new Course("(7) Curso de Binario", "Aprenda a diferença entre 0 e 1", 110, 101));
		courses.add( new Course("(8) Curso de Suporte", "Pra suportar quem você não aguenta mais", 39.99, 100));
		courses.add( new Course("(9) Curso de Paciencia", "Essencial pra quem comprou o curso 1", 20, 400));
		courses.add( new Course("(10) Curso de Porrada", "Pra estar sempre preparado pra tudo", 59.99, 250));
		
		while (menu) 
		{
			System.out.println("Seja muito bem-vindo " + activeUser.getUsername() + " escolha a opção desejada: "
					+ "\n1 - Lista de cursos disponíveis"
					+ "\n2 - Comprar cursos"
					+ "\n3 - Meus cursos"
					+ "\n4 - Adicionar Saldo"
					+ "\n5 - Logout"
					+ "\n6 - Fechar");
			
			try {
				option = sc.nextInt();
				sc.nextLine();
				
				switch (option) {	
				case 1: 
					System.out.println("\n");
			    	for (Course course : courses) {
			    		if !activeUser.myCourses.contains(course) {
			    			System.out.println(course);
			    		}
			    	
			    	if (activeUser.myCourses.size() == 10) {
			    		System.out.println("Você já comprou todos os cursos disponiveis!\n")
			    	}
			    	System.out.println("Pressione ENTER para voltar ao menu principal");
			    	sc.nextLine();
			    	break;
					
				case 2:
			    	if (activeUser.myCourses.size() < 10) {
			    		shoppingCart(courses);
			    	} else {
			    		System.out.println("Você já comprou todos os cursos disponiveis!\n");
			    	}
			    	break;
				case 3:
					if (activeUser.myCourses.size() > 0) {
						System.out.println("\n");
						activeUser.showCourses();
					} else {
						System.out.println("Você não possui nenhum curso!\n");
					}
					break;
					
				case 4:
					System.out.println("\nSeu saldo atual é de: R$" + String.format("%.2f",activeUser.getBalance())
					+ "\nQual o valor que gostaria de acrescentar?");
					double value = sc.nextDouble();
					sc.nextLine();
					activeUser.addFunds(value); // atualização do saldo
					System.out.println("Seu novo saldo é de: R$" + String.format("%.2f",activeUser.getBalance()));
			    	System.out.println("\nPressione ENTER para voltar ao menu principal");
			    	sc.nextLine();
					break;
					
				case 5:
					login = false;
					System.out.println("\n");
					loginMenu(users);
					break;
					
				case 6:
					System.out.println("Volte sempre!");
					menu = false;
					break;
			    	
			    default:
			    	System.out.println("Opção invalida!\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nOpção inválida\n");
				sc.nextLine();
				}
		}
		sc.close()
	}
	
	public static void shoppingCart(List<Course> courses) {
		boolean	back = false;
		int			option;
		
		while(!back) {
			System.out.println("\nEscolha a opção desejada: "
					+ "\n1 - Vizualizar carrinho"
					+ "\n2 - Adicionar ao carrinho"
					+ "\n3 - Limpar carrinho"
					+ "\n4 - Finalizar compra"
					+ "\n5 - Voltar ao menu principal");
			option = sc.nextInt();
			
			switch (option) {	
			case 1: 
				System.out.println("\n");
				activeUser.showShoppingCart();
		    	break;
				
			case 2:
				System.out.println("\n");
		    	for (Course course : courses) {
		    		if (!activeUser.myCourses.contains(course) && !activeUser.myShoppingCart.contains(course)) {
		    			System.out.println(course);
		    		}
		    	}
		    	
			    System.out.println("Digite o numero do curso: ");
			    int	number = sc.nextInt();		    	
		    	if (!activeUser.myCourses.contains(courses.get(number - 1)) && !activeUser.myShoppingCart.contains(courses.get(number -1))) {
		    		activeUser.addCourseToCart(courses.get(number - 1));
		    	} else {
		    		System.out.println("Você já possui esse curso ou ele já está no carrinho!");
		    	}
				break;
		    	
			case 3:
				activeUser.clearCart();
				System.out.println("Carrinho esvaziado!");
				break;
				
			case 4:
				double	total = 0;
				String		choice;
				
				System.out.println("\n");
				activeUser.showShoppingCart();
				
				for (Course course : activeUser.myShoppingCart) {
					total += course.getPrice();
				}
				System.out.println("\nSaldo: R$" + String.format("%.2f",activeUser.getBalance()));
				System.out.println("\nValor total: R$" + String.format("%.2f", total));
				System.out.println("\nConfirma? s/n");
				choice = sc.next();
				
				if (activeUser.getBalance() > total) {
					activeUser.addFunds(choice.equals("s") ? -total : 0);
					
					for (Course course : activeUser.myShoppingCart) {
						activeUser.addCourse(course);
					}
					
					activeUser.clearCart();
					if (choice.equals("s")) 
						System.out.println("Compra efeituada com sucesso!");
						back = true;
						System.out.println("\n");
				} else {
					System.out.println("Saldo insuficiente!");
				}
				break;
				
			case 5:
				back = true;
				System.out.println("\n");
				break;
		    	
		    default:
		    	System.out.println("Opção invalida!\n");
			}
		}
	}
	
	public static void loginMenu(List<User> userList) {
		int	option;
		
		while (!login) {
			try {
				System.out.println("1 - Login \n2 - Registro\n");
				option = sc.nextInt();
				
				switch (option) {	
				case 1: 
					login(userList);
					break;
					
				case 2:
			    	register(userList);
			    	break;
			    	
			    default:
			    	System.out.println("Opção invalida!\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nOpção inválida!\n");
				sc.nextLine();
				}
		}
	} 
	
	
	public static void register(List<User> userList) {
		String		username;
		String		password;
		boolean	alright = false;
		boolean	used = false;
		
		while (!alright) {
			System.out.println("Usuário: ");
			username = sc.next().toLowerCase();
			System.out.println("Senha: ");
			password = sc.next();
			while (password.length() < 6) {
				System.out.println("Sua senha deve ter mais de 5 caracteres");
				System.out.println("Senha: ");
				password = sc.next();
			}
			
			 for (int i = 0; i < userList.size(); i++) {
				 if (userList.get(i).verifyUser(username)) {
					 System.out.println("Nome de usuário já em uso!!!\n");
					 used = true;
					 i = userList.size();
				 } else {
					 used = false;
				 }
			 }
			 
			 if (!used) {
				System.out.println("Conta criada com sucesso!!!\n");
				userList.add(new User(username, password));
				alright = true;
			 }
		}
	}
	
	
	public static void login(List<User> userList) {
		String		username;
		String		password;
		
		System.out.println("Usuário: ");
		username = sc.next().toLowerCase();
		System.out.println("Senha: ");
		password = sc.next();
		
		if (verify(userList, username, password)) {
			System.out.println("Login realizado com sucesso!\n");
			 for (int i = 0; i < userList.size(); i++) {
				 if (userList.get(i).verifyUser(username)) {
					 activeUser = userList.get(i);
				 }
				 login = true;
			 }
		} else {
			System.out.println("Usuário inexistente ou senha incorreta!!!\n");
		}
	}
	
	
	public static boolean verify(List<User> userList, String username, String password) {
		 int	j = 0;
		 
		 for (int i = 0; i <= userList.size(); i++) {
			 if (i == userList.size()) {
				 return false;
			 }
			 
			 if (userList.get(i).verifyUser(username)) {
				 j = i;
				 break;
			 }
		 }
		 
		 return userList.get(j).verifyPass(password);
	}
}
