package Calculadora;
import java.util.Scanner;

public class calculadora_test {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	calculadora calc = new calculadora();
    	int j=0, i;
    	
    	while(j==0) {
    		System.out.println("Informe o primeiro numero INTEIRO: ");
    		int n1 = sc.nextInt();
    		
    		System.out.println("Informe o segundo numero INTEIRO: ");
    		int n2 = sc.nextInt();
    		i=0;
	    	while(i==0) {
	    		System.out.println("\nSelecione:");
	    		System.out.println("1- Somar");
	    		System.out.println("2- Subtrair");
	    		System.out.println("3- Multiplicar");
	    		System.out.println("4- Dividir");
	    		System.out.println("5- Trocar de numeros");
	    		System.out.println("6- Sair");
	    		int op = sc.nextInt();
	    		
	    		if(op==5) i++;
	    		
	    		if(op==6) {
	    			i++;
	    			j++;
	    		}
	    		
	    		double resultado = calc.calcular(n1, n2, op);
	    		
	    		
	    		System.out.println("\nResultado: "+resultado);
	    		
	    	}
	    	
    	}
    	System.out.println("Programa terminado");
    	sc.close();
    }
}
