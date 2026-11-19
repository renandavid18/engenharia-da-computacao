package Testes;

import java.util.Scanner;

public class Teste01{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe uma palavra ou texto que retornaremos o seu comprimento\n(Os Espacos sao contados!)\nTexto / Palavra: ");
		String palavra = sc.nextLine();
		
		System.out.println("O Texto / Palavra: "+palavra+"\nPossui o comprimento: "+palavra.length());
		
		sc.close();
	}
}