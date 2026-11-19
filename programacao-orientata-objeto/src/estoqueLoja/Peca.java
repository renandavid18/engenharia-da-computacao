package estoqueLoja;

public class Peca {
    private int ID;
    private String nome;
    private int quantidade;
    private double preco;
    private String marca;

    public Peca getPeca(){
        return this;
    }
    public String getNome(){
        return nome;
    }
    public int getQnt(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    public double getID(){
        return ID;
    }
    public String getMarca(){
        return marca;
    }

    /* 
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setQnt(int quantidade){
        this.quantidade = quantidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    */
    
    public void setPeca(String nome, int quantidade, double preco, int ID, String marca){
        this.ID = ID;
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
        this.marca = marca;
    }

}
