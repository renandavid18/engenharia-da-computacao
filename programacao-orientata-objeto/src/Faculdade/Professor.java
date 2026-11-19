package Faculdade;

import java.util.ArrayList;

public class Professor{

    private String nome;
    private String turno;
    private int mes;
    private int dia; 
    private int ano;
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Professor(String nome, int dia, int mes, int ano, String turno){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.turno = turno;
    }

    public void adicionarDiciplina(Disciplina d){
        this.disciplinas.add(d);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public String getNome(){
        return nome;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getTurno(){
        return turno;
    }
}