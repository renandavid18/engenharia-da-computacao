package aula;

public class CalculadoraTeste{
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		calc.somar(10, 20);
		
		int resultado = calc.somar2(10, 20);
		
		System.out.println("\n\n");
		System.out.println(resultado);
		
	}
} 