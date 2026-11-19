package Testes;

import java.util.Scanner;

public class Teste07{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra1 = "Carlos da Silva";
		
		System.out.println("Esse e o Seu Nome? "+palavra1);
		System.out.println("(1)-Sim | (0)-Nao");
		int condicao = sc.nextInt();
		sc.nextLine();
		
		if(condicao == 0) {
			System.out.println("Informe Seu Nome: ");
			String palavra = sc.nextLine();
			
			
			System.out.println("Nome Excluido: "+palavra1);
			System.out.println("Novo Nome: "+palavra1.replace(palavra1, palavra));
		}else System.out.println("Cancelando troca de Nome!");
		
		sc.close();
	}
}