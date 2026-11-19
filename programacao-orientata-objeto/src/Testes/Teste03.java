package Testes;

import java.util.Scanner;

public class Teste03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma palavra ou texto que ela será convertida para Minuscula\nTexto / Palavra: ");
		String palavra = sc.nextLine();
		
		System.out.println("O (Texto / Palavra) Minuscula: "+palavra.toLowerCase());
		
		sc.close();
	}
}