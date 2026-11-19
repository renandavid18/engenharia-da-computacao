package programacaoFuncional;

import java.util.ArrayList;

public class principal20 {
    public static void main(Strin[] args){
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new produto("Notebook", 5000));
        produtos.add(new produto("Mouse", 80));
        produtos.add(new produto("Monitor", 1500));

        produtos.stream().filter(produto->produto.getPreco()>100).forEach(produto>System.out.prinln(produto.getNome()));
    }
}
