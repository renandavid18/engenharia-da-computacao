package Escola;

import java.util.Scanner;

public class aluno{
	
	public Scanner sc = new Scanner(System.in);
	
	public String nome, sexo, matricula;
	public int idade;
	public double[][] notas = new double[4][4];
	public double[] soma = new double[4];
	public double[] media = new double[4];
	
	public void cadastrar_aluno() {
		System.out.println("Nome: ");
		nome = sc.nextLine();
		
		System.out.println("Sexo: ");
		sexo = sc.nextLine();
		
		System.out.println("Matricula: ");
		matricula = sc.nextLine();
		
		System.out.println("Idade: ");
		idade = sc.nextInt();
		
		sc.nextLine();
		
		nota_mat();
		
		nota_port();
		
		nota_hist();
		
		nota_geo();
	}
	
	public void exibir_aluno() {
		System.out.println("Nome: "+nome); 
		
		System.out.println("Sexo: "+sexo); 
		
		System.out.println("Matricula: "+matricula); 
		
		System.out.println("Idade: "+idade); 
		
		exibir_mat();
		
		exibir_port();
		
		exibir_hist();
		
		exibir_geo();
		
		
	}
	
	public void nota_mat() {
		System.out.println("Notas Matemática");
		for(int i=0;i<4;i++) {
		System.out.println((i+1)+"- Nota: ");
		
		notas[0][i] = sc.nextDouble();
		soma[0] += notas[2][i];
		}	
		media[0] = soma[0] / 4;
		sc.nextLine();
	}
	
	public void nota_port() {
		System.out.println("Notas Português");
		for(int i=0;i<4;i++) {
		System.out.println((i+1)+"- Nota: ");
		
		notas[1][i] = sc.nextDouble();
		soma[1] += notas[2][i];
		}	
		media[1] = soma[1] / 4;
		sc.nextLine();
	}
	
	public void nota_hist() {
		System.out.println("Notas História");
		for(int i=0;i<4;i++) {
		System.out.println((i+1)+"- Nota: ");
		
		notas[2][i] = sc.nextDouble();
		soma[2] += notas[2][i];
		}	
		media[2] = soma[2] / 4;
		sc.nextLine();
	}
	
	public void nota_geo() {
		System.out.println("Notas Geografia");
		for(int i=0;i<4;i++) {
		System.out.println((i+1)+"- Nota: ");
		
		notas[3][i] = sc.nextDouble();
		soma[3] += notas[2][i];
		}	
		media[3] = soma[3] / 4;
		sc.nextLine();
	}
	
	
	public void exibir_mat(){
		System.out.println("Notas Matemática");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"- Nota: "+notas[0][i]);
			System.out.println("Media: "+media[0]);
		}
	}
	
	public void exibir_port() {
		System.out.println("Notas Português");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"- Nota: "+notas[1][i]);
			System.out.println("Media: "+media[1]);
			}
	}
	
	public void exibir_hist() {
		System.out.println("Notas História");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"- Nota: "+notas[2][i]);
			System.out.println("Media: "+media[2]);
			}
	}
	
	public void exibir_geo() {
		System.out.println("Notas Geografia");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"- Nota: "+notas[3][i]);
			System.out.println("Media: "+media[3]);
			}
	}
}


