package Vetores;

import java.util.Scanner;

public class mediaNotas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double soma = 0, media = 0, maior = 0, menor = 0;
		int posicaoMaior = 0, posicaoMenor = 0;
		System.out.println("Informe a Quantidade de Notas: ");
		int Qnt = sc.nextInt();
		
		double notas[] = new double[Qnt];
		
		for(int i=0; i < notas.length; i++) {
			System.out.println("Informe "+(i+1)+"- Nota: ");
			notas[i] = sc.nextDouble();
			soma += notas[i];
			if(i==0) {
				maior = notas[i];
				posicaoMaior = (i+1);
				
				menor = notas[i];
				posicaoMenor = (i+1);
			}else if(notas[i] > maior) {
				maior = notas[i];
				posicaoMaior = (i+1);
			}else if(notas[i] < menor) {
				menor = notas[i];
				posicaoMenor = (i+1);
			}
			
		}
		media = soma / Qnt;
		
		System.out.println("\n\nNotas: ");
		for(int i=0; i < notas.length; i++) {
			System.out.println((i+1)+"- Nota: "+notas[i]);
			System.out.println();
			
		}
		System.out.println("=============================");
		System.out.println("Media das Notas: "+media);
		System.out.println("Maior Nota: "+maior+"\nPosicao: "+posicaoMaior);
		System.out.println("Menor Nota: "+menor+"\nPosicao:"+posicaoMenor);
		sc.close();
	}
}