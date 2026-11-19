package LojaInformatica;

public abstract class Funcionario implements Formatavel {
    protected int REid;
    protected String REnome;
    protected String REsetor;
    protected String REcpf;
    protected double REsalarioBase;
    protected double REsalario;


    public void setSetor(String REsetor){
        this.REsetor = REsetor;
    }

    public String getSetor(){
        return REsetor;
    }

    public void setNome(String REnome){
        this.REnome = REnome;
    }

    public String getNome(){
        return REnome;
    }

    public void setId(int REid){
        this.REid = REid;
    }

    public int getId(){
        return REid;
    }

    public void setCpf(String REcpf){
        this.REcpf = REcpf;
    }

    public String getCpf(){
        return REcpf;
    }
    
    public void setSalarioBase(double REsalarioBase){
        if(REsalarioBase > 0){
            this.REsalarioBase = REsalarioBase;
        } else System.out.println("Erro: Salario menor que 0");
        
    }

    public double getSalarioBase(){
        return REsalarioBase;
    }


    public abstract void exibir();

    public abstract double calcularSalarioLiquido();


    public Funcionario(String REnome, int REid, String REcpf, double REsalarioBase){
        this.REnome = REnome;
        this.REid = REid;
        this.REcpf = REcpf;
        this.REsalarioBase = REsalarioBase;
    }
}
