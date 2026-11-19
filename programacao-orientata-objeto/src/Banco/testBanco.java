package Banco;
import java.util.Scanner;

public class testBanco{
	public static void main(String[] args) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.println("Informe seu Nome: ");
		String nome = sc.nextLine();
		
		while(i == 0) {
    		System.out.println("\nSelecione:");
    		System.out.println("1- depositar");
    		System.out.println("2- Sacar ");
    		System.out.println("3- Ver Saldo");
    		System.out.println("4- Sair");
    		int op = sc.nextInt();
    		
    		switch (op) {
    			case 1:
    				System.out.println("Valor Deposito: ");
    				double dep = sc.nextDouble();
    				
    				conta.deposito(dep);
    				break;
    				
    			case 2:
    				System.out.println("Valor Saque: ");
    				double saq = sc.nextDouble();
    				
    				conta.saque(saq);
    				break;
    				
    			case 3:
    				System.out.println("Titular: "+nome+"\nSaldo Atual: \n");
    				System.out.println(conta.VerSaldo());
    				break;
    				
    			case 4:
    				System.out.println("Saindo...");
    				i++;
    				break;
    		}
		}
		sc.close();
	}
}