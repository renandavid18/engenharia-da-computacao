package Testes;

import java.util.Scanner;

public class Teste05{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma Palavra/Texto: ");
		String palavra = sc.nextLine();
		
		System.out.println("Informe a Posicao que deseja iniciar a Nova Palavra/Texto (0 ate "+palavra.length()+")");
		int p1 = sc.nextInt();
		
		System.out.println("Informe a Posicao que deseja Finalizar a Nova Palavra/Texto ("+(1+p1)+" ate "+palavra.length()+")");
		int p2 = sc.nextInt();
		
		System.out.println("A Palavra/Texto Original: "+palavra);
		System.out.println("A Nova Palavra/Texto: "+palavra.substring(p1, p2+1));
		
		sc.close();
	}
}