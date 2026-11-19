package Biblioteca.Livro;

public class Livro {
	
	String titulo;
	String autor;
	int paginas;
	
	Livro(String titulo,String autor,int paginas){
		this.titulo=titulo;
		this.autor=autor;
		this.paginas=paginas;
	}
	
	void apresentar() {
		System.out.println("Titulo: "+titulo);
		System.out.println("Autor: "+autor);
		System.out.println("paginas: "+paginas);
	}
}