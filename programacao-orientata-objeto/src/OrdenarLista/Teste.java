package OrdenarLista;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		
		for(int i=0; i < 3; i++) {
			System.out.println((i+1)+"- Produto: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			lista.add(new Produto(nome, preco));
			sc.nextLine();
		}
		System.out.println("\n");
		Collections.sort(lista);
		
		for(Produto p : lista) {
			System.out.println(p);
		}
		sc.close();
	}
}