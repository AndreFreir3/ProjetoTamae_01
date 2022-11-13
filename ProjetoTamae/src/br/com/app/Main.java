package br.com.app;

public class Main {

	public static void main(String[] args) {
		// FAZENDO A INSTANCIAÇÃO E PREENCHENDO O NOME DOS CLIENTES
		Cliente Andre = new Cliente();
		Andre.setNome("André Freire");
		Cliente Mateus = new Cliente();
		Mateus.setNome("Mateus Teste");

		Conta ccorrente = new ContaCorrente(Andre);
		Conta ccorrente1 = new ContaCorrente(Mateus);
		// TESTANDO
		ccorrente.depositar(100);
		ccorrente.sacar(102);
		ccorrente.imprimirExtrato();

		ccorrente1.depositar(200);
		ccorrente1.sacar(150);
		ccorrente1.imprimirExtrato();
	}

}
