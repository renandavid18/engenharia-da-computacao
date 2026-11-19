package Calculadora;

public class calculadora {
    
	public static double calcular(int num1, int num2, int opcao){
        double resultado = 0;

        switch(opcao){
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                if (num2 == 0)System.out.println("Nao e possivel dividir por 0");
                else resultado = (double) num1 / num2;
                break;

            default:
                System.out.println("Opcao invalida");
                break;
        }
        return resultado;
    }

}
