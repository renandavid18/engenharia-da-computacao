package Vetores;

import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[5];
		
		for(int i=0; i < numeros.length; i++) {
			System.out.println("Informe "+(i+1)+"- Numero: ");
			numeros[i] = sc.nextInt();
			
		}
		System.out.println("\n\nVetor: ");
		for(int i=0; i < numeros.length; i++) {
			System.out.println(" Posicao: "+i+"\nNumero: "+ numeros[i]);
			System.out.println();
		}
		
		System.out.println("\n\nImprimir Simplificado:");
		for(int numero : numeros) {
			System.out.println("\nNumero: "+numero);
		}
		sc.close();
	}
}