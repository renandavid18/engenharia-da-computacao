package Escola;

import java.util.Scanner;



public class alunoTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c=0, op, d=0, i, j=0;
		
		while(c<=0) {
			System.out.println("Irá adicionar quantos alunos? ");
			c = sc.nextInt();
		}
			
		aluno[] aluno = new aluno[d];	
		aluno[d] = new aluno(); 
			
		while(j==0) {
			System.out.println("Selecione: ");
			System.out.println("1- Cadastrar Aluno");
			System.out.println("2- Ver Alunos");
			System.out.println("3- Sair");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					if(d<c) {
						aluno[d].cadastrar_aluno();
						d++;
					}else System.out.println("Maximo de Alunos atingidos!");
				break;
					
				case 2:
					if(d<c) {
						for(i=0;i<d;i++) {
							aluno[i].exibir_aluno();
						}
					}else System.out.println("Não tem Alunos cadastrados!");
				break;
					
				case 3:
					System.out.println("Fechando o Sistema");
					j++;
				break;
					
				default:
					System.out.println("opção incorreta");
				break;
					
			}
		}
		sc.close();
	}
}