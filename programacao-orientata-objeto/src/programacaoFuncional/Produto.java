package programacaoFuncional;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.preco=preco;
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco
    }
}
