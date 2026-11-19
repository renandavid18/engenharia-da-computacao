package Testes;

import java.util.Scanner;

public class Teste04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma Palavra / Texto: ");
		String palavra = sc.nextLine();
		
		System.out.println("Informe a Primeira Posicao dessa Palavra / Texto (0 ate "+(palavra.length()-1)+")");
		int p1 = sc.nextInt();
		
		System.out.println("Informe a Segunda Posicao dessa Palavra / Texto (0 ate "+(palavra.length()-1)+")");
		int p2 = sc.nextInt();
		
		System.out.println("A Palavra / Texto: "+palavra);
		System.out.println("1- Posicao: "+palavra.charAt(p1));
		System.out.println("2- Posicao: "+palavra.charAt(p2));
		
		sc.close();
	}
}