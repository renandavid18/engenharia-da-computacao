package LojaInformatica;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Loja{
    private static String REARQUIVO = "loja.txt";
    private static ArrayList<Funcionario> RElista = new ArrayList<>();
    private static Scanner REscanner = new Scanner(System.in);
    public static int REid;
    
    public static void main(String[] args){
        int opcao;
        carregarFuncionario();
        do{
            System.out.println("====== Funcionarios da Loja de Informatica ======");
            System.out.println("[1] Adicionar Funcionario");
            System.out.println("[2] Remover Funcionario");
            System.out.println("[3] Alterar Dados Funcionario");
            System.out.println("[4] Lista dos Funcionario");
            System.out.println("[5] Verificar Funcionario ");
            System.out.println("[6] Salvar Arquivo");
            System.out.println("[7] Encerrar o Progrma");
            System.out.println("=============================");
            System.out.print("Escolha uma opcao: ");
            try{
                opcao = Integer.parseInt(REscanner.nextLine());
            }catch(NumberFormatException REerro){
                opcao = 0;
            }

            switch(opcao){
                case 1:
                    adicionarFuncionario();
                    break;
                    
                case 2:
                    removerFuncionario();
                    break;

                case 3:
                    alterarFuncionario();
                    break;

                case 4:
                    listarFuncionarios();
                    break;

                case 5:
                    consultarFuncionario();
                    break;

                case 6:
                    salvarArquivo();
                    break;

                case 7:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opcao invalida tente novamente!");
            }
            System.out.println();
        }while(opcao != 7);
    }

    private static void carregarFuncionario(){
        File REarquivo = new File(REARQUIVO);
        
        if(!REarquivo.exists()){
            File REalt1 = new File("src/LojaInformatica/loja.txt");
            File REalt2 = new File("LojaInformatica/loja.txt");
            
            if(REalt1.exists()){
                REarquivo = REalt1;
                REARQUIVO = "src/LojaInformatica/loja.txt";
            }else if(REalt2.exists()){
                REarquivo = REalt2;
                REARQUIVO = "LojaInformatica/loja.txt";
            }else{
                return;
            }
        }

        try{
            FileReader REfr = new FileReader(REarquivo);
            BufferedReader REbr = new BufferedReader(REfr);
            String RElinha;

            while((RElinha = REbr.readLine()) != null){
                if(!RElinha.trim().isEmpty()){
                    String[] REdados = RElinha.split(";");

                    String REcargo = REdados[0];
                    int REid = Integer.parseInt(REdados[1]);
                    String REnome = REdados[2];
                    String REcpf = REdados[3];
                    double REsalarioBase = Double.parseDouble(REdados[5]);

                    if(REcargo.equals("GERENTE")){
                        String REsetor = REdados[4];
                        double REbonus = Double.parseDouble(REdados[6]);
                        RElista.add(new Gerente(REnome, REid, REcpf, REsalarioBase, REbonus, REsetor));
                    }else if(REcargo.equals("ESTAGIARIO")){
                        double REauxilio = Double.parseDouble(REdados[6]);
                        String REsetor = REdados[4];
                        RElista.add(new Estagiario(REnome, REid, REcpf, REsalarioBase, REauxilio, REsetor));
                    }else if(REcargo.equals("DESENVOLVEDOR")){
                        String REsetor = REdados[4];
                        double REMetaBatida = Double.parseDouble(REdados[6]);
                        RElista.add(new Desenvolvedor(REnome, REid, REcpf, REsalarioBase, REMetaBatida, REsetor));
                    }
                }
            }
            REbr.close();
        }catch(IOException REerro){
            System.out.println("Erro ao carregar o arquivo: " + REerro.getMessage());
        }
    }

    private static void adicionarFuncionario(){
        System.out.println("\n===== Adicionar Novo Funcionario =====");
        int REopcao1, REopcao2, REcontinuar=0;
        boolean REconcluido = true;
        try {
            System.out.print("ID: ");
            REid = Integer.parseInt(REscanner.nextLine());

            for(Funcionario REfuncionario : RElista){
                if(REfuncionario.getId() == REid){
                    System.out.println("Existe um funcionario cadastrado com este ID!");
                    return;
                }
            }
            while(REcontinuar==0){ 
                System.out.println("Nome: ");
                String REnome = REscanner.nextLine();

                System.out.println("CPF: ");
                String REcpf = REscanner.nextLine();

                System.out.println("Salario Base: ");
                double REsalarioBase = Double.parseDouble(REscanner.nextLine());

                System.out.print("Setor: ");
                String REsetor = REscanner.nextLine();

                System.out.println("Cargo: [1] Gerente | [2] Estagiario | [3] Desenvolvedor");
                System.out.println("Escolha o cargo: ");
                int REcargo = Integer.parseInt(REscanner.nextLine());

                switch(REcargo){
                    case 1:
                        System.out.println("Bônus: ");
                        double REbonus = Double.parseDouble(REscanner.nextLine());
                        
                        System.out.println("ID: "+REid+"Nome: "+REnome+"| CPF: "+REcpf+"| Salario: "+REsalarioBase+"R$ | Valor Bonus: "+REbonus+"R$ | Setor: "+REsetor);
                        System.out.println("Dados Corretos do funcionario?");
                        System.out.println("(1) Sim | (0) Nao");
                        REopcao1 = Integer.parseInt(REscanner.nextLine());
                        if(REopcao1==1){
                            RElista.add(new Gerente(REnome, REid, REcpf, REsalarioBase, REbonus, REsetor));
                            REcontinuar=1;
                        }else{
                            System.out.println("Deseja recomecar? (com Mesmo ID)");
                            System.out.println("(1) Sim | (0) Nao");
                            REopcao2 = Integer.parseInt(REscanner.nextLine());

                            if(REopcao2==0){
                                REcontinuar=1;
                                REconcluido = false;
                            }
                        } 
                        break;

                    case 2:
                        System.out.println("Auxilio Transporte: ");
                        double REauxilio = Double.parseDouble(REscanner.nextLine());
                        
                        System.out.println("ID: "+REid+"Nome: "+REnome+"| CPF: "+REcpf+"| Salario: "+REsalarioBase+"R$ | Valor Auxilio Transporte: "+REauxilio+"R$ | Setor: "+REsetor);
                        System.out.println("Dados Corretos do funcionario?");
                        System.out.println("(1) Sim | (0) Nao");
                        REopcao1 = Integer.parseInt(REscanner.nextLine());
                        if(REopcao1==1){
                            RElista.add(new Estagiario(REnome, REid, REcpf, REsalarioBase, REauxilio, REsetor));
                            REcontinuar=1;
                        }else{
                            System.out.println("Deseja recomecar? (com Mesmo ID)");
                            System.out.println("(1) Sim | (0) Nao");
                            REopcao2 = Integer.parseInt(REscanner.nextLine());

                            if(REopcao2==0){
                                REcontinuar=1;
                                REconcluido = false;
                            }
                        }              
                        break;

                    case 3:
                        System.out.println("Valor Meta Batida: ");
                        double REMetaBatida = Double.parseDouble(REscanner.nextLine());
                        
                        System.out.println("ID: "+REid+"Nome: "+REnome+"| CPF: "+REcpf+"| Salario: "+REsalarioBase+"R$ | Valor Meta Batida: "+REMetaBatida+"R$ | Setor: "+REsetor);
                        System.out.println("Dados Corretos do funcionario?");
                        System.out.println("(1) Sim | (0) Nao");
                        REopcao1 = Integer.parseInt(REscanner.nextLine());
                        if(REopcao1==1){
                            RElista.add(new Desenvolvedor(REnome, REid, REcpf, REsalarioBase, REMetaBatida, REsetor));
                            REcontinuar=1;
                        }else{
                            System.out.println("Deseja recomecar? (com Mesmo ID)");
                            System.out.println("(1) Sim | (0) Nao");
                            REopcao2 = Integer.parseInt(REscanner.nextLine());
                            
                            if(REopcao2==0){
                                REcontinuar=1;
                                REconcluido = false;
                            }
                        }              
                        break;


                    default:
                        System.out.println("Cargo invalido! Cadastro cancelado.");
                        return;
                }
            }
            if(REconcluido){
                System.out.println("Funcionario incluido com sucesso!");
            }
        } catch(NumberFormatException REerro){
            System.out.println("Erro: Digite um valor numérico valido!");
        }
    }


    private static void removerFuncionario(){
        System.out.println("\n===== Remover Funcionario =====");

        try{
            System.out.println("Digite o ID do Funcionario que deseja excluir: ");
            REid = Integer.parseInt(REscanner.nextLine());

            for(Funcionario REfuncionario : RElista){
                if(REfuncionario.getId() == REid){
                    System.out.println("Removendo: "+REfuncionario.getNome());
                    RElista.remove(REfuncionario);
                    System.out.println("Funcionario excluido!");
                    return;
                }
            }

        }catch(NumberFormatException REerro){
            System.out.println("Erro: Digite um valor valido!");
            return;
        }
        System.out.println("Nenhum Funcionario encontrado com esse ID");
    }


    private static void consultarFuncionario(){
        System.out.println("\n===== Consultar Funcionario =====");

        try{
            System.out.println("Informe o ID do Funcionario para buscar: ");
            REid = Integer.parseInt(REscanner.nextLine());

            boolean encontrado = false;
            for(Funcionario REfuncionario : RElista){
                if(REfuncionario.getId() == REid){
                    REfuncionario.exibir();
                    encontrado = true;
                }
            }
            if(encontrado == false){
                System.out.println("Nenhum Funcionario com esse ID");
            }
        }catch(NumberFormatException REerro){
            System.out.println("Valor Invalido!");
        }
    }
    
    private static void alterarFuncionario(){
        int REopcao2=0, REopcao3=0, REcontinuar=0, REpos;
        boolean REachado=false, REconcluido=true;
        System.out.println("\n===== ALTERAR DADOS DE UM Funcionario =====");
        
        try{
            System.out.println("Informe o ID do Funcionario que sera alterado: ");
            REid = Integer.parseInt(REscanner.nextLine());
            
            for(Funcionario REfuncionario : RElista){
                if(REfuncionario.getId()==REid){
                    REachado = true;
                    while(REcontinuar==0){      
                        System.out.println("Dados do Funcionario Encontrado:");
                        REfuncionario.exibir();
                        int REconfirmar=0;

                        while(REconfirmar==0){
                            System.out.println("Deseja alterar os dados desse funcionario?");
                            System.out.println("(1) Sim | (0) Nao");
                            REopcao2 = Integer.parseInt(REscanner.nextLine());
                            if(REopcao2==0 || REopcao2==1){
                                REconfirmar=1;
                            }
                        }
                        if(REopcao2==0){
                            return;
                        }
                            
                        System.out.println("Novo Nome: ");
                        String REnome = REscanner.nextLine();

                        System.out.println("Novo CPF: ");
                        String REcpf = REscanner.nextLine();

                        System.out.println("Novo Salario: ");
                        double REsalario = Double.parseDouble(REscanner.nextLine());

                        System.out.println("Novo Setor: ");
                        String REsetor = REscanner.nextLine();

                        System.out.println("Cargo: [1] Gerente | [2] Estagiario | [3] Desenvolvedor");
                        System.out.println("Escolha o Novo Cargo: ");
                        int REcargo = Integer.parseInt(REscanner.nextLine());

                        switch(REcargo){
                            case 1:
                                System.out.println("Novo Bonus: ");
                                double REbonus = Double.parseDouble(REscanner.nextLine());
                                    
                                System.out.println("\nNome: "+REnome+"| CPF: "+REcpf+"| Salario: "+REsalario+"R$ | Valor Bonus: "+REbonus+"R$ | Setor: "+REsetor);
                                System.out.println("Dados Corretos do Funcionario?");
                                System.out.println("(1) Sim | (0) Nao");
                                REopcao2 = Integer.parseInt(REscanner.nextLine());
                                if(REopcao2==1){
                                    REpos = RElista.indexOf(REfuncionario);
                                    RElista.set(REpos, new Gerente(REnome, REid, REcpf, REsalario, REbonus, REsetor));
                                    REcontinuar=1;
                                }else{
                                    System.out.println("Deseja recomecar?");
                                    System.out.println("(1) Sim | (0) Nao");
                                    REopcao3 = Integer.parseInt(REscanner.nextLine());

                                    if(REopcao3==0){
                                        REcontinuar=1;
                                        REconcluido = false;
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Novo Auxilio Transporte: ");
                                double REauxilio = Double.parseDouble(REscanner.nextLine());
                                
                                System.out.println("\nNome: "+REnome+"| CPF: "+REcpf+"| Salario: "+REsalario+"R$ | Valor Auxilio Transporte: "+REauxilio+"R$ | Setor: "+REsetor);
                                System.out.println("Dados Corretos do funcionario?");
                                System.out.println("(1) Sim | (0) Nao");
                                REopcao2 = Integer.parseInt(REscanner.nextLine());
                                if(REopcao2==1){
                                    REpos = RElista.indexOf(REfuncionario);
                                    RElista.set(REpos, new Estagiario(REnome, REid, REcpf, REsalario, REauxilio, REsetor));
                                    REcontinuar=1;
                                }else{
                                    System.out.println("Deseja recomecar? (com Mesmo ID)");
                                    System.out.println("(1) Sim | (0) Nao");
                                    REopcao2 = Integer.parseInt(REscanner.nextLine());

                                    if(REopcao2==0){
                                        REcontinuar=1;
                                        REconcluido = false;
                                    }
                                } 
                                break;

                            case 3:
                                System.out.println("Novo Valor Meta Batida: ");
                                double REMetaBatida = Double.parseDouble(REscanner.nextLine());
                                
                                System.out.println("\nNome: "+REnome+"| CPF: "+REcpf+"| Salario: "+REsalario+"R$ | Valor Meta Batida: "+REMetaBatida+"R$ | Setor: "+REsetor);
                                System.out.println("Dados Corretos do Funcionario?");
                                System.out.println("(1) Sim | (0) Nao");
                                REopcao2 = Integer.parseInt(REscanner.nextLine());
                                if(REopcao2==1){
                                    REpos = RElista.indexOf(REfuncionario);
                                    RElista.set(REpos, new Desenvolvedor(REnome, REid, REcpf, REsalario, REMetaBatida, REsetor));
                                    REcontinuar=1;
                                }else{
                                    System.out.println("Deseja recomecar? (com Mesmo ID)");
                                    System.out.println("(1) Sim | (0) Nao");
                                    REopcao2 = Integer.parseInt(REscanner.nextLine());

                                    if(REopcao2==0){
                                        REcontinuar=1;
                                        REconcluido = false;
                                    }
                                } 
                                break;

                            default:
                                System.out.println("Cargo invalido! Cadastro cancelado");
                                return;
                        }
                    }
                    if(REconcluido){ 
                        System.out.println("Funcionario Alterado!"); 
                        return;
                    }
                }    
            }
            if(!REachado){
                System.out.println("Funcionario Nao Encontrado!");
            }
        }catch(NumberFormatException REerro){
            System.out.println("Valor Invalido!");
        } 
    }


    private static void listarFuncionarios(){
        System.out.println("\n========= LISTA DOS FUNCIONARIOS =========");

        if(RElista.isEmpty()){
            System.out.println("\nLISTA VAZIA\n");
            return;
        }

        ArrayList<String> REsetores = new ArrayList<>();
        for(Funcionario REfuncionario : RElista){
            if(!REsetores.contains(REfuncionario.getSetor())){
                REsetores.add(REfuncionario.getSetor());
            }
        }

        for(String REsetorAtual : REsetores){
            System.out.println("---- "+REsetorAtual.toUpperCase()+" ----");
            for(Funcionario REfuncionario : RElista){
                if(REfuncionario.getSetor().equalsIgnoreCase(REsetorAtual)){
                    REfuncionario.exibir();
                    System.out.println("-----------------------------");
                }
            }
        }
    }


    private static void salvarArquivo(){
        try(BufferedWriter REwriter = new BufferedWriter(new FileWriter(REARQUIVO))) {
            for (Funcionario REfuncionario : RElista) {
                REwriter.write(REfuncionario.toLinhaArquivo());
                REwriter.newLine();
            }
            System.out.println("========= ARQUIVO SALVO =========");
        }catch(IOException REerro){
            System.out.println("Erro ao Salvar Arquivo: "+REerro.getMessage());
        }
    }
}