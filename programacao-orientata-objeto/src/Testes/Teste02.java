package Testes;

import java.util.Scanner;

public class Teste02{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma palavra ou texto que ela será convertida para maiuscula\nTexto / Palavra: ");
		String palavra = sc.nextLine();
		
		System.out.println("O (Texto / Palavra) Maiuscula: "+palavra.toUpperCase());
		
		sc.close();
	}
}