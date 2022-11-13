package br.com.app;

public abstract class Conta implements IConta {
	// Definindo uma agencia padrão que simularia 1 banco
	private static int agenciaPadrao = 1;
	// Criando uma variavel para usar como incrementador nas contas
	private static int sequencial = 1;

	private int agencia;
	private int numero;
	private double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.agenciaPadrao;
		this.numero = Conta.sequencial++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
