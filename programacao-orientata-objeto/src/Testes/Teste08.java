package Testes;

import java.util.Scanner;

public class Teste08{
	public static void limpaTela() {
		for(int j=0; j <= 100; j++) {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login = "RN23";
		String senha = "2310";
		int i=0;
		
		while(i==0) {
			boolean loginCerto = false, senhaCerta = false;
			while(!loginCerto) {
				System.out.println("Informe Seu Login:  ");
				String login1 = sc.nextLine();
				if(login.equals(login1)) {
					loginCerto = true;
				}else {
					System.out.println("Tente Novamente! Login Incorreto");
					System.out.println("\nDeseja alterar seu Login? ");
					System.out.println("(1)-Sim | (0)-Nao");
					int loginCondicao = sc.nextInt();
					sc.nextLine();
					limpaTela();
					
					if(loginCondicao == 1) {
						System.out.println("Informe Seu Novo Login:  ");
						String login2 = sc.nextLine();
						
						login = login.replace(login, login2);
						limpaTela();
					}
				}
			}
			while(!senhaCerta) {
				System.out.println("Informe Sua Senha: ");
				String senha1 = sc.nextLine();
				if(senha.equals(senha1)){
					senhaCerta = true;
				}else {
					System.out.println("Tente Novamente! Senha Incorreta");
					
					System.out.println("\nDeseja alterar sua senha? ");
					System.out.println("(1)-Sim | (0)-Nao");
					int senhaCondicao = sc.nextInt();
					sc.nextLine();
					limpaTela();
					
					if(senhaCondicao == 1) {
						System.out.println("Informe Sua Nova Senha:  ");
						String senha2 = sc.nextLine();
						
						senha = senha.replace(senha, senha2);
						limpaTela();
						break;
					}
				}
			}
			if(loginCerto && senhaCerta) {
				System.out.println("\n\nLogando no Sistema!");
			}
		}
		sc.close();
	}
}