package Loja_Autopecas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
	private Scanner sc;
	
	public Estoque(Scanner scPrin) {
	    this.sc = scPrin;
	}

	List<Peca> pecas = new ArrayList<Peca>();
	
	
	public void cadastrarPeca(int codigo, String nome, String marca, int quantidade, double preco) {
		Peca peca = new Peca(codigo, nome, marca, quantidade, preco);
		
		for(int i=0; i< pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getNome().equals(nome) && pecaAtual.getMarca().equals(marca)) {
				pecaAtual.setNovaQuantidade(quantidade);
				System.out.println("A quantidade de peças foi aumentada!");
				System.out.println("Nova quantidade: " + pecaAtual.getQuantidade());
				return;
			}
			if (pecaAtual.getCodigo() == codigo){
				System.out.println("Esse Codigo ja foi cadastrado em outra peca");
				return;
			}
			
		}
		pecas.add(peca);
		System.out.println("Peça cadastrada com sucesso!");
	}
	
	public void consultarPorCodigo(int codigo) {
		boolean encontrado = false;
		for(int i=0; i < pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getCodigo() == codigo) {
				pecaAtual.verPeca();
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("Peca nao encontrada!");
		}
	}
	
	public void consultarPorNome(String nome) {
		boolean encontrado = false;
		for(int i=0; i< pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getNome().equals(nome)) {
				pecaAtual.verPeca();
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("Peca nao encontrada!");
		}
	}
	
	public void consultarPorMarca(String marca) {
		int g=0;
		for(int i=0; i< pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getMarca().equals(marca)) {
				pecaAtual.verPeca();
				g++;
			}
		}
		if(g==0) {
			System.out.println("Nenhuma Peca Encontrada!");
		}
	}
	
	public void atualizarPeca(int codigo) {
		boolean existe = false, positivo = false;
		for(int i=0; i < pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getCodigo() == codigo) {
				pecaAtual.verPeca();
				System.out.println("Deseja alterar:");
				System.out.println("1- Nome");
				System.out.println("2- Marca");
				System.out.println("3- Quantidade");
				System.out.println("4- Preco");
				System.out.println("5- Alterar tudo (Impossivel alterar o Codigo)");
				System.out.println("6- Cancelar");
				int op = sc.nextInt();
				sc.nextLine();
				
				switch(op) {
					case 1:
						System.out.println("Informe o  novo Nome: ");
						String novoNome = sc.nextLine();
						
						pecaAtual.setNome(novoNome);
						break;
						
					case 2:
						System.out.println("Informe a nova Marca: ");
						String novaMarca = sc.nextLine();
						
						pecaAtual.setMarca(novaMarca);
						break;
						
					case 3:
						while(!positivo) {
							System.out.println("Informe a  nova Quantidade: ");
							int novaQuantidade = sc.nextInt();
							if(novaQuantidade >= 0) {
								pecaAtual.setQuantidade(novaQuantidade);
								positivo = true;
							}else System.out.println("Impossivel cadastrar Quantidade negativa");
						}
						positivo = false;
						break;
					case 4:
						while(!positivo) {
							System.out.println("Informe o  novo Preco: ");
							double novoPreco = sc.nextDouble();
							if(novoPreco > 0) {
								pecaAtual.setPreco(novoPreco);
								positivo = true;
							}else System.out.println("Impossivel cadastrar Preco negativo");
						}
						positivo = false;
						break;
						
					case 5:
						System.out.println("Deseja prosseguir em alterar tudo\n(Apos confirmacao nao tem volta)\n(1) Sim | (2) Nao");
						int continuar = sc.nextInt();
						sc.nextLine();
						
						if(continuar == 1) {
							System.out.println("Informe o  novo Nome: ");
							String novoNome1 = sc.nextLine(); 
							
							System.out.println("Informe a nova Marca: ");
							String novaMarca1 = sc.nextLine(); 
							
							boolean duplicado = false; 
							for(int j = 0; j < pecas.size(); j++) { 
								Peca outraPeca = pecas.get(j); 
								if(outraPeca != pecaAtual && outraPeca.getNome().equals(novoNome1) && outraPeca.getMarca().equals(novaMarca1)) { 
									duplicado = true; 
									break; 
								} 
							} 
							if(duplicado) { 
								System.out.println("Ja existe outra peca com esse Nome e Marca."); 
								System.out.println("Operacao cancelada!"); 
							}else { 
								while(!positivo) {
									System.out.println("Informe a  nova Quantidade: ");
									int novaQuantidade1 = sc.nextInt();
									if(novaQuantidade1 >= 0) {
										pecaAtual.setQuantidade(novaQuantidade1);
										positivo = true;
									}else System.out.println("Impossivel cadastrar Quantidade negativa");
								}
								positivo = false;
								
								while(!positivo) {
									System.out.println("Informe o  novo Preco: ");
									double novoPreco1 = sc.nextDouble();
									if(novoPreco1 > 0) {
										pecaAtual.setPreco(novoPreco1);
										positivo = true;
									}else System.out.println("Impossivel cadastrar Preco negativo");
								}
								positivo = false;
								
								pecaAtual.setNome(novoNome1); 
								pecaAtual.setMarca(novaMarca1); 
								System.out.println("Peca atualizada com sucesso!");
							} 
							break; 
						}else { 
								System.out.println("Operacao Cancelada!");
								break; 
						}
						
					case 6:
						System.out.println("Operacao Cancelada!");
						break;
						
					default:
						System.out.println("Opcao Invalida!");
						break;
						
				}	
				existe = true;
				break;
			}
		}
		if(existe == false) {
			System.out.println("Peca nao Encontrada!");
		}
	}

	public void removerPorCodigo(int codigo) {
		boolean removido = false;
		for(int i=0; i< pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getCodigo() == codigo) {
				pecas.remove(i);
				removido = true;
				break;
			}
		}
		if(removido == false) {
			System.out.println("Peca nao foi encontrada!");
		}else System.out.println("Peca Removida!");
	}
	
	public void removerPorNomeeMarca(String nome, String marca) {
		boolean removido = false;
		for(int i=0; i< pecas.size(); i++) {
			Peca pecaAtual = pecas.get(i);
			
			if(pecaAtual.getNome().equals(nome) && pecaAtual.getMarca().equals(marca)) {
				pecas.remove(i);
				removido = true;
				break;
			}
		}
		if(removido == false) {
			System.out.println("Peca nao foi encontrada!");
		}else System.out.println("Peca Removida!");
	}
	
	public void imprimirInventario() {
		if(pecas.size() == 0) {
			System.out.println("Nao existe Pecas Registradas no Inventario!");
		}else {
			for(int i=0; i< pecas.size(); i++) {
				Peca pecaAtual = pecas.get(i);
				System.out.println("\n\n============== Estoque ==============");
				System.out.println((i+1)+"- Peca");
				pecaAtual.verPeca();
			}
		}
	}
}