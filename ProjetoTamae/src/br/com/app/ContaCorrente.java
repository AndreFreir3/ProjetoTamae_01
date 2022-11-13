package br.com.app;

public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("\n=== Extrato da conta corrente === ");
		System.out.printf("Titular da conta: %s \n", super.cliente.getNome());
		System.out.printf("Agência: %d \n", getAgencia());
		System.out.printf("Conta: %d \n", getNumero());
		System.out.printf("Saldo: %.2f", getSaldo());
	}

}
