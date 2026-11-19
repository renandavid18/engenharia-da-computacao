package programacaoFuncional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exemplo1 {
    public static ArrayList<String> nomes = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int sair = 0;
        
        
        nomes.add("Caio");
        nomes.add("Renan");
        nomes.add("Luan");
        nomes.add("Juan");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Lucas");
        nomes.add("Joao");
        nomes.add("Fernanda");
        nomes.add("Yan");
        nomes.add("Yuri");

        while(sair == 0){
            System.out.println("\n\n===== Lista de Nomes =====");
            System.out.println("[1] Exibir Nomes");
            System.out.println("[2] Filtrar Nomes");
            System.out.println("[3] Mapear para Maiusculo");
            System.out.println("[4] Mapear para Minusculo");
            System.out.println("[5] Ordenar em Ordem Crescente");
            System.out.println("[6] Ordenar em Ordem Decrescente");
            System.out.println("[7] Contar ELementos");
            System.out.println("[8] Incluir Nome");
            System.out.println("[9] Remover Nome");
            System.out.println("[0] Encerrar o Programa");
            System.out.println("=============================");
            System.out.print("Escolha uma opcao: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    exibirNomes();
                    break;
                
                case 2:
                    filtrarNomes();
                    break;

                case 3:
                    mapearMaiuNomes();
                    break;

                case 4:
                    mapearMinuNomes();
                    break;

                case 5:
                    ordenarCrescNomes();
                    break;

                case 6:
                    ordenarDecrescNomes();
                    break;

                case 7:
                    contarNomes();
                    break;

                case 8:
                    incluirNomes();
                    break;

                case 9:
                    removerNomes();
                    break;

                case 0:
                    sair = 1;
                    break;

                
                default:
                    System.out.println("Opcao Invalida! \nSelecione outra opcao");
                    break;
            }
        }

        
    }

    public static void exibirNomes(){
        nomes.stream().forEach(nome -> System.out.println(nome));
    }

    public static void incluirNomes(){
        System.out.println("\n=========== Incluir Nome ============");
        System.out.println("Deseja Incluir qual Nome? ");
        String nome = sc.nextLine();

        long qnt = nomes.stream().count();

        for(String nomeLista : nomes){
            if (nomeLista.equalsIgnoreCase(nome)) {
                System.out.println("O Nome já existe!");
                return;
            }
        }

        nomes.add(nome);
        System.out.println("Nome Adicionado!");
    }

    public static void removerNomes(){
        System.out.println("\n=========== Remover Nome ============");
        System.out.println("Deseja Remover qual Nome? ");
        String nome = sc.nextLine();

        nomes.remove(nome);
    }

    public static void filtrarNomes(){
        System.out.println("\n============== Filtrar ===============");
        System.out.println("Deseja filtrar qual Letra? ");
        String letra = sc.nextLine().toUpperCase();

        nomes.stream().filter(nome -> nome.startsWith(letra)).forEach(System.out::println);
    }

    public static void mapearMaiuNomes(){
        System.out.println("\n======= Mapeamento Maiusculo ========");
        nomes.stream().map(nome -> nome.toUpperCase()).forEach(System.out::println);
    }

    public static void mapearMinuNomes(){
        System.out.println("\n======= Mapeamento Minusculo ========");
        nomes.stream().map(nome -> nome.toLowerCase()).forEach(System.out::println);
    }

    public static void ordenarCrescNomes(){
        System.out.println("\n======= Ordem Crescente ========");
        nomes.stream().sorted().forEach(System.out::println);
    }

    public static void ordenarDecrescNomes(){
        System.out.println("\n======= Ordem Decrescente ========");
        nomes.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void contarNomes(){
        System.out.println("\n======= Quantidade de Nomes ========");
        
        long quantidade = nomes.stream().count();
        System.out.println("Quantidade: "+quantidade);
    }
}
