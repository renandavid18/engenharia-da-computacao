package exercicio;

public class Exercicio {
    public static void main (String[] args){
        Produto produtos[] = new Produto[3];

        produtos[0] = new Produto();
        produtos[1] = new Produto();
        produtos[2] = new Produto();

        produtos[0].cod_p = 1;
        produtos[0].nome_p = "Lapis";
        produtos[0].quant_p = 12;
        produtos[0].preco_p = 1.20;

        produtos[1].cod_p = 2;
        produtos[1].nome_p = "Caneta";
        produtos[1].quant_p = 53;
        produtos[1].preco_p = 2.99;

        produtos[2].cod_p = 3;
        produtos[2].nome_p = "Borracha";
        produtos[2].quant_p = 23;
        produtos[2].preco_p = 3.75;


        for(int i=0; i<3; i++) {
            System.out.println("============== "+(i+1)+"- Produtos ============== \nCodigo: "+produtos[i].cod_p+"\nNome: "+produtos[i].nome_p+"\nQuantidade: "+produtos[i].quant_p+"\nPreco: "+produtos[i].preco_p+"Preco Pago: "+produtos[i].pPago_p);
        }
    }
}
    
