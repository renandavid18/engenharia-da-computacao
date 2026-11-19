package Pessoas;

import java.io.IOException; 


public class pessoa_test{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Ana";
		p1.idade = 25;
		p1.sexo = "Feminino";
		p1.altura = 1.58;
		p1.peso = 78.532;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Antonio";
		p2.idade = 28;
		p2.sexo = "Masculino";
		p2.altura = 1.88;
		p2.peso = 75.300;
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Pedro";
		p3.idade = 22;
		p3.sexo = "Masculino";
		p3.altura = 1.97;
		p3.peso = 81.104;
		
		if(System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
		
		System.out.println("Verificando os Objetos em Ação:\n");
		System.out.println();
		p1.exibirpessoa();
		p1.feliz();
		
		System.out.println();
		p2.exibirpessoa();
		p2.raiva();
		
		System.out.println();
		p3.exibirpessoa();
		p3.doente();
		p3.triste();
		p3.choro();
	}
}