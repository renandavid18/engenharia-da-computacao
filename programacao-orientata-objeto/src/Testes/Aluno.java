package Testes;

public class Aluno{
    private String nome;
    private double notaFinal;

    public Aluno(String nome, double notaFinal) {
    	this.nome = nome;
    	setNotaFinal(notaFinal);
    }
    
    public String getNome() {
    	return nome;
    }
    
    public double getNotaFinal() {
    	return notaFinal;
    }
    
    public void setNotaFinal(double NF) {
    	if(NF >= 0 && NF <= 10) {
    		notaFinal = NF;
    	}else System.out.println("Por favor informe um valor entre 0 e 10");
    }
}