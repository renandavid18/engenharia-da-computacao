package Testes;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Teste09{
	public static void limpaTela() {
		for(int j=0; j <= 100; j++) {
			System.out.println();
		}
	}
	
	public String getNome(String nome){
		return nome;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> nome = new ArrayList<String>();
		
		for(int i=0; i < 3; i++) {
			System.out.println((i+1)+"- Nome: ");
			nome.add(sc.nextLine());
		}
		
		System.out.println(nome.get(0).compareTo(nome.get(1)));
		System.out.println(nome.get(2).compareTo(nome.get(1)));
		System.out.println(nome.get(0).compareTo(nome.get(2)));
		
		sc.close();
	}
}