package LojaInformatica;

public class Gerente extends Funcionario {
    protected double REbonus;


    public void setBonus(double REbonus){
        this.REbonus = REbonus;
    }

    public double getBonus(){
        return REbonus;
    }


    @Override 
    public void exibir(){
        System.out.println("ID: "+REid+"\nNome: "+REnome+"\nCPF: "+"\nSetor: "+REsetor+REcpf+"Salario: "+REsalarioBase+"R$ \nBonus: "+REbonus+"R$\nSalario Liquido: "+REsalario+"R$");
    }

    @Override 
    public double calcularSalarioLiquido(){
        REsalario = 0;
        REsalario = REbonus + REsalarioBase;
        return REsalario;
    }


    public Gerente(String REnome, int REid, String REcpf, double REsalarioBase, double REbonus, String REsetor){
        super(REnome, REid, REcpf, REsalarioBase);
        this.REsetor = REsetor;
        if(REbonus > 0){
            this.REbonus = REbonus;
        }else System.out.println("Erro: Bonus menor que 0");
    }


    
    @Override 
    public String toLinhaArquivo(){
        return "GERENTE;" + REid + ";" + REnome + ";" + REcpf + ";" + REsetor + ";" + REsalarioBase + ";" + REbonus;
    }
}
