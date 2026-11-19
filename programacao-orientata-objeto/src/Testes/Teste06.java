package Testes;

import java.util.Scanner;

public class Teste06{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma Palavra/Texto: ");
		String palavra = sc.nextLine();
		
		System.out.println("Informe a Primeira Palavra/Texto deseja verificar se contem dentro da String anterior:");
		String p1 = sc.nextLine();
		
		System.out.println("Informe a Segunda Palavra/Texto deseja verificar se contem dentro da String anterior:");
		String p2 = sc.nextLine();
		
		System.out.println("A Palavra/Texto Original: "+palavra);
		
		if(palavra.contains(p1)) {
			System.out.println("A Palavra/Texto: ("+p1+") E substring dela!");
		}else System.out.println("A Palavra/Texto: ("+p1+") Nao e substring dela!");
		
		if(palavra.contains(p2)) {
			System.out.println("A Palavra/Texto: ("+p2+") E substring dela!");
		}else System.out.println("A Palavra/Texto: ("+p2+") Nao e substring dela!"); 
		
		sc.close();
	}
}