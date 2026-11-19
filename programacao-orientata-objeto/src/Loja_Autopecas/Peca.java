package Loja_Autopecas;

public class Peca {
	private int codigo;
	
	private String nome;
	
	private String marca;
	
	private int quantidade;
	
	private double preco;
	
	public Peca (int codigo, String nome, String marca, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.quantidade = quantidade;
		this.preco = preco;
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int cod) {
		codigo = cod;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public void setNovaQuantidade(int quantidade){
		this.quantidade += quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void verPeca() {
		System.out.println("Codigo: "+codigo);
		System.out.println("Nome: "+nome);
		System.out.println("Marca: "+marca);
		System.out.println("Quantidade: "+quantidade);
		System.out.println("Preco: "+preco);
	}

}