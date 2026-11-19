package Turma;

import java.util.Scanner;

public class testAluno{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno turma[] = new Aluno[3];
		
		System.out.println("Cadastando Alunos na turma: ");
		for(int i=0; i < 3; i++){
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("media: ");
			double media = sc.nextDouble();
			sc.nextLine();
			
			turma[i] = new Aluno(nome, media);
		}
		System.out.println("\n");
		for(int i=0; i < 3; i++){
			System.out.println("\n"+(i+1)+"- Aluno: ");
			System.out.println("Nome: "+turma[i].getNome());
			System.out.println("media: "+turma[i].getMedia());
		}
		sc.close();
	}
}