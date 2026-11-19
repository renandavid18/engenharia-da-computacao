package LojaInformatica;

public class Desenvolvedor extends Funcionario {
    protected double REMetaBatida;


    public void setHorasExtras(double REMetaBatida){
        this.REMetaBatida = REMetaBatida;
    }

    public double getMetaBatida(){
        return REMetaBatida;
    }


    @Override 
    public void exibir(){
        System.out.println("ID: "+REid+"\nNome: "+REnome+"\nCPF: "+REcpf+"\nSetor: "+REsetor+"\nSalario: "+REsalarioBase+"R$ \nValor Meta Batida: "+REMetaBatida+"R$\nSalario Liquido: "+REsalario+"R$");
    }

    @Override 
    public double calcularSalarioLiquido(){
        REsalario = 0;
        REsalario = REMetaBatida + REsalarioBase;
        return REsalario;
    }


    public Desenvolvedor(String REnome, int REid, String REcpf, double REsalarioBase, double REMetaBatida, String REsetor){
        super(REnome, REid, REcpf, REsalarioBase);
        this.REsetor = REsetor;
        if(REMetaBatida > 0){
            this.REMetaBatida = REMetaBatida;
        }else System.out.println("Erro: Valor da Meta Batida menor que 0");
    }

    @Override 
    public String toLinhaArquivo(){
        return "DESENVOLVEDOR;" + REid + ";" + REnome + ";" + REcpf + ";" + REsetor + ";" + REsalarioBase + ";" + REMetaBatida;
    }
}
