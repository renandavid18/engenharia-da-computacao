package Loja_Autopecas;
import java.util.Scanner;

public class Test_loja{
	public static void main(String[] args) {
		Scanner scPrin = new Scanner(System.in);
		boolean continuar = true;
		Estoque estoque = new Estoque(scPrin);
		
		while(continuar) {
			System.out.println("========== Loja de Auto Pecas ==========");
			System.out.println("Qual operacao desja fazer?");
			System.out.println("1- Cadastro de Peca");
			System.out.println("2- Consulta de Peca");
			System.out.println("3- Atualizacao de Dados da Peca");
			System.out.println("4- Remocao de Peca");
			System.out.println("5- Imprimir Inventario");
			System.out.println("6- Encerrar Programa");
			int opcao = scPrin.nextInt();
			scPrin.nextLine();
			
			switch (opcao) {
				case 1:
					System.out.println("\nDigite as seguintes inforcoes sobre a nova peca: ");
					
					System.out.println("Codigo: ");
					int codigo = scPrin.nextInt();
					scPrin.nextLine();
					
					System.out.println("Nome: ");
					String nome = scPrin.nextLine();
					
					System.out.println("Marca: ");
					String marca = scPrin.nextLine();
					
					System.out.println("Quantidade: ");
					int quantidade = scPrin.nextInt();
					
					System.out.println("Preco: ");
					double preco = scPrin.nextDouble();
					scPrin.nextLine();
					
					estoque.cadastrarPeca(codigo, nome, marca, quantidade, preco);
					break;
					
				case 2:
					System.out.println("Deseja Consultar a Peca por qual meio?\n(1) Codigo | (2) Nome | (3) Marca");
					int escolha = scPrin.nextInt();
					
					if(escolha == 1) {
					System.out.println("Informe o Codigo: ");
					int cod = scPrin.nextInt();
					
					estoque.consultarPorCodigo(cod);
					
					}else if(escolha == 2) {
						scPrin.nextLine();
						System.out.println("Informe o Nome: ");
						String Nome = scPrin.nextLine();
						
						estoque.consultarPorNome(Nome);
					}else if(escolha == 3) {
						scPrin.nextLine();
						System.out.println("Informe a Marca: ");
						String Marca = scPrin.nextLine();
						
						estoque.consultarPorMarca(Marca);
						
					}else System.out.println("Opcao Invalida");
					break;
				
				case 3:
					System.out.println("Informe o Codigo da Peca que sera alterada: ");
					int cod = scPrin.nextInt();
					scPrin.nextLine();
					estoque.atualizarPeca(cod);
					break;
					
				case 4:
					System.out.println("Como deseja selecionar a Peca que sera Removida?\n(1) Codigo | (2) Nome e Marca");
					int escolha1 = scPrin.nextInt();
					
					if(escolha1 == 1) {
					System.out.println("Informe o Codigo: ");
					int cod1 = scPrin.nextInt();
					
					estoque.removerPorCodigo(cod1);
					
					}else if(escolha1 == 2) {
						scPrin.nextLine();
						System.out.println("Informe o Nome: ");
						String Nome = scPrin.nextLine();
						
						System.out.println("Informe a Marca: ");
						String Marca = scPrin.nextLine();
						
						estoque.removerPorNomeeMarca(Nome, Marca);
						
					}else System.out.println("Opcao Invalida"); 
					break;
					
				case 5:
					estoque.imprimirInventario();
					break;
				
				case 6:
					continuar = false;
					break;
					
				default:
					System.out.println("Opcao Invalida");
					break;
			}
		}
	}
}