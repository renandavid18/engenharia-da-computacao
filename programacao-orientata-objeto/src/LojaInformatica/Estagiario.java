package LojaInformatica;

public class Estagiario extends Funcionario {
    protected double REAuxilioTransporte;
    


    public void setAuxilioTransporte(double REAuxilioTransporte){
        this.REAuxilioTransporte = REAuxilioTransporte;
    }

    public double getAuxilioTransporte(){
        return REAuxilioTransporte;
    }


    @Override 
    public void exibir(){
        System.out.println("ID: "+REid+"\nNome: "+REnome+"\nCPF: "+"\nSetor: "+REsetor+REcpf+"Salario: "+REsalarioBase+"R$ \nAuxilio Transporte: "+REAuxilioTransporte+"R$ \nSalario Liquido: "+REsalario+"R$");
    }

    @Override 
    public double calcularSalarioLiquido(){
        REsalario = 0;
        REsalario = REAuxilioTransporte + REsalarioBase;
        return REsalario;
    }


    public Estagiario(String REnome, int REid, String REcpf, double REsalarioBase, double REAuxilioTransporte, String REsetor){
        super(REnome, REid, REcpf, REsalarioBase);
        this.REsetor = REsetor;
        if(REAuxilioTransporte > 0){
            this.REAuxilioTransporte = REAuxilioTransporte;
        }else System.out.println("Erro: Auxilio Transporte menor que 0");
    }

    @Override
    public String toLinhaArquivo() {
        return "ESTAGIARIO;" + REid + ";" + REnome + ";" + REcpf + ";" + REsetor + ";" + REsalarioBase + ";" + REAuxilioTransporte;
    }
}

