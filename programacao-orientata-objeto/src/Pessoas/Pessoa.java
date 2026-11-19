package Pessoas;

public class Pessoa{
	public String nome, sexo;
	public int idade;
	public double peso, altura;
	
	public void exibirpessoa() {
		System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo+"\nAltura: "+altura+"\nPeso: "+peso);
	}
	
	public void feliz() {
		System.out.println("Estado: Feliz!");
	}
	
	public void raiva() {
		System.out.println("Estado: Raiva!");
	}
	
	public void triste() {
		System.out.println("Estado: Triste!");
	}
	
	public void choro() {
		System.out.println("Estado: Chorando!");
	}
	
	public void doente() {
		System.out.println("Estado: Doente!");
	}
}
