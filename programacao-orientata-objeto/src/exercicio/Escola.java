package exercicio;

public class Escola {
    public String nome;
    public int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;
    
    
    public void registrarNotas(double n1, double n2, double n3, double n4){
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
        this.nota4 = n4;         
        
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;
    }
    
    public void exibirAluno(){
        System.out.println("\nNome: "+nome+"\nMatricula: "+"\n1- Nota: "+nota1+"\n2- Nota: "+nota2+"\n3- Nota: "+nota3+"\n4- Nota: "+nota4+"\nMedia: "+media); 
        
        if(media>=6){
             System.out.println("Situacao: APROVADO");
        }else  System.out.println("Situacao: REPROVADO");
    }
}
