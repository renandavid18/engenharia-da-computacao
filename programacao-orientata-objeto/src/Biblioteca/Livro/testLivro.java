package Biblioteca.Livro;


public class testLivro{
	public static void main(String[] args) {
		Livro l1 = new Livro("Como vencer suas guerras pela fé", "Bispo Renato Cardoso", 203);
		 
		
		Livro l2 = new Livro("Entre o Ouro e o Altar", "Bispo Renato Cardoso", 321);
		 
		
		Livro l3 = new Livro("Nos Passos de Jesus", "Bispo Edir Macedo", 179); 
		
		
		System.out.println("Livros Registrados: \n");
		
		l1.apresentar();
		System.out.println();
		
		l2.apresentar();
		System.out.println();
		
		l3.apresentar();
		System.out.println();
	}
}