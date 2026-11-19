package Aula291026;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaDeAmigos {

    private static final String ARQUIVO = "agenda.txt";

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        do {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    incluirAmigo();
                    break;
                case 2:
                    consultarAmigo();
                    break;
                case 3:
                    listarTodosAmigos();
                    break;
                case 4:
                    listarAniversariantesDoMes();
                    break;
                case 5:
                    alterarAmigo();
                    break;
                case 6:
                    excluirAmigo();
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 7);
    }

    // Menu de Opções do Programa
    private static void exibirMenu() {
        System.out.println("=== AGENDA DE AMIGOS 2026 ===");
        System.out.println("[1] Incluir novo amigo");
        System.out.println("[2] Consultar um amigo");
        System.out.println("[3] Listar todos os amigos");
        System.out.println("[4] Listar aniversariantes");
        System.out.println("[5] Alterar dados de um amigo");
        System.out.println("[6] Excluir um amigo");
        System.out.println("[7] Encerrar o Progrma");
        System.out.println("=============================");
        System.out.print("Escolha uma opção: ");
    }

    // Leitura completa do arquivo texto para memória
    private static List<Amigo> carregarAmigos() {
        List<Amigo> lista = new ArrayList<>();
        File file = new File(ARQUIVO);

        if (!file.exists()) {
            return lista;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    Amigo amigo = Amigo.fromFileString(linha);
                    if (amigo != null) {
                        lista.add(amigo);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return lista;
    }

    // Gravação da lista completa no arquivo texto
    private static void salvarAmigos(List<Amigo> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Amigo amigo : lista) {
                writer.write(amigo.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
        }
    }

    // [1] Incluir novo amigo
    private static void incluirAmigo() {
        System.out.println("\n--- INCLUIR NOVO AMIGO ---");
        List<Amigo> amigos = carregarAmigos();

        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        // Verifica se ID já existe
        for (Amigo a : amigos) {
            if (a.getIdAmigo() == id) {
                System.out.println("Erro: Já existe um amigo cadastrado com este ID!");
                return;
            }
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Sexo (M/F): ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Data de Nascimento (DD/MM/AAAA): ");
        String datanasc = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Celular: ");
        String celular = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        Amigo novo = new Amigo(id, nome, sexo, datanasc, telefone, celular, email);
        amigos.add(novo);
        salvarAmigos(amigos);

        System.out.println("Amigo incluído com sucesso!");
    }

    // [2] Consultar um amigo por ID ou Nome
    private static void consultarAmigo() {
        System.out.println("\n--- CONSULTAR AMIGO ---");
        List<Amigo> amigos = carregarAmigos();

        System.out.print("Digite o ID ou o Nome do amigo para buscar: ");
        String termo = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (Amigo a : amigos) {
            if (String.valueOf(a.getIdAmigo()).equals(termo) ||
                a.getNomeAmigo().toLowerCase().contains(termo)) {
                System.out.println(a);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum amigo encontrado com o termo informado.");
        }
    }

    // [3] Listar todos os amigos
    private static void listarTodosAmigos() {
        System.out.println("\n--- LISTA DE TODOS OS AMIGOS ---");
        List<Amigo> amigos = carregarAmigos();

        if (amigos.isEmpty()) {
            System.out.println("Nenhum amigo cadastrado na agenda.");
            return;
        }

        for (Amigo a : amigos) {
            System.out.println(a);
        }
    }

        // [4] Listar aniversariantes do mês
    private static void listarAniversariantesDoMes() {
        System.out.println("\n--- ANIVERSARIANTES DO MÊS ---");
        List<Amigo> amigos = carregarAmigos();

        System.out.print("Digite o número do mês (01 a 12): ");
        String mes = scanner.nextLine().trim();
        if (mes.length() == 1) {
            mes = "0" + mes;
        }

        boolean encontrado = false;
        for (Amigo a : amigos) {
            String[] partesData = a.getDatanascAmigo().split("/");
            if (partesData.length == 3 && partesData[1].equals(mes)) {
                System.out.println(a);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum aniversariante encontrado para este mês.");
        }
    }

    // [5] Alterar dados de um amigo
    private static void alterarAmigo() {
        System.out.println("\n--- ALTERAR DADOS DE UM AMIGO ---");
        List<Amigo> amigos = carregarAmigos();

        System.out.print("Digite o ID do amigo que deseja alterar: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (Amigo a : amigos) {
            if (a.getIdAmigo() == id) {
                System.out.println("Amigo encontrado: " + a.getNomeAmigo());

                System.out.print("Novo Nome (atual: " + a.getNomeAmigo() + "): ");
                a.setNomeAmigo(scanner.nextLine());

                System.out.print("Novo Sexo M/F (atual: " + a.getSexoAmigo() + "): ");
                a.setSexoAmigo(scanner.nextLine().toUpperCase().charAt(0));

                System.out.print("Nova Data de Nascimento (atual: " + a.getDatanascAmigo() + "): ");
                a.setDatanascAmigo(scanner.nextLine());

                System.out.print("Novo Telefone (atual: " + a.getTelefoneAmigo() + "): ");
                a.setTelefoneAmigo(scanner.nextLine());

                System.out.print("Novo Celular (atual: " + a.getCelularAmigo() + "): ");
                a.setCelularAmigo(scanner.nextLine());

                System.out.print("Novo E-mail (atual: " + a.getEmailAmigo() + "): ");
                a.setEmailAmigo(scanner.nextLine());

                salvarAmigos(amigos);
                System.out.println("Dados alterados com sucesso!");
                return;
            }
        }

        System.out.println("Nenhum amigo encontrado com o ID informado.");
    }

    // [6] Excluir um amigo
    private static void excluirAmigo() {
        System.out.println("\n--- EXCLUIR AMIGO ---");
        List<Amigo> amigos = carregarAmigos();

        System.out.print("Digite o ID do amigo que deseja excluir: ");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < amigos.size(); i++) {
            if (amigos.get(i).getIdAmigo() == id) {
                System.out.println("Removendo: " + amigos.get(i).getNomeAmigo());
                amigos.remove(i);
                salvarAmigos(amigos);
                System.out.println("Amigo excluído com sucesso!");
                return;
            }
        }

        System.out.println("Nenhum amigo encontrado com o ID informado.");
    }
}
