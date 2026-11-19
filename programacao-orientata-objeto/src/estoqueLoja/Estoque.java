package estoqueLoja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private static Scanner sc = new Scanner(System.in);
    private static List<Peca> pecas = new ArrayList<>();
    public static void main(String[] args){
        

        int sair = 0,op = 0;

        while(sair == 0){
            exibirMenu();
            op = sc.nextInt();

            switch(op){
                case 1:
                    adicionarPeca();
                    break;
                
                case 2:
                    consultarPeca();
                    break;

                case 3:
                    alterarPeca();
                    break;
                
                case 4:
                    removerPeca();
                    break;

                case 5:
                    ListarEstoque();
                    break;

                case 6:
                    sair = 1;
                    System.out.println("Encerrando Programa...");
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
                
            }
        }

    }

    public static void exibirMenu(){
        System.out.println("=== EStoque de Peca ===");
        System.out.println("[1] Incluir Peca");
        System.out.println("[2] Consultar Peca");
        System.out.println("[3] Atualizar dados da Peca");
        System.out.println("[4] Remover Pecas");
        System.out.println("[5] Imprimir Iventário");
        System.out.println("[6] Encerrar o programa");
        System.out.println("=============================");
        System.out.print("Escolha uma opcao: ");
    }

    public static void adicionarPeca(){
        System.out.println("\n===== Adicionar Peca =====");

        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        for(Peca p : pecas){
            if(p.getID() == id){
                System.out.println("Erro: Ja existe um Amigo Cadastrado com esse ID!");
                return;
            }
        }

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Marca: ");
        String marca = sc.nextLine();
        

        System.out.println("Preco: ");
        int preco = sc.nextInt();

        System.out.println("Quantidade: ");
        int qnt = sc.nextInt();

        Peca novaPeca = new Peca();
        novaPeca.setPeca(nome, qnt, preco, id, marca);
        pecas.add(novaPeca);
    }

    public static void mostrarPeca(Peca p){
        System.out.println("ID: "+ p.getID()+"\nNome: "+p.getNome()+"\nMarca: "+p.getMarca()+"\nQuantidade: "+p.getQnt()+"\nPreco: "+p.getPreco()+" R$");
    }

    public static void listarEstoque(){
        for(Peca p : pecas){
            System.out.println("===== Estoque =====");
            System.out.println(p.getPeca());
        }
    }

    public static void consultarPeca(){
        System.out.println("Informe o ID da peca: ");
        int id = sc.nextInt();

        for(Peca p : pecas){
            if(p.getID() == id){
                mostrarPeca(p);
            }
        }
    }

    public static void alterarPeca(){
        System.out.println("Informe o ID da peca: ");
        int id = sc.nextInt();

        for(Peca p : pecas){
            if(p.getID() == id){
                System.out.println("Peca Selecionada: ");
                mostrarPeca(p);
                break;
            }else{
                System.out.println("Nenhuma Peca cadastrada com esse ID!");
                return;
            }
        }

        


    }

}
