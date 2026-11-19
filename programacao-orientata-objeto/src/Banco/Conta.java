package Banco;

public class Conta{
	private double saldo;

	public double VerSaldo() {
		return saldo;
	}
	
	public void deposito(double valor_dep) {
		if (valor_dep > 0) {
			saldo += valor_dep;
		}else System.out.println("Valor invalido");
	}
	
	public void saque(double valor_saq) {
		if(valor_saq < saldo) {
			saldo -= valor_saq;
		}else System.out.println("Saldo insuficiente");
	}
}