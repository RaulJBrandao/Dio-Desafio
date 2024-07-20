public class Main {
    public static void main(String[] args) throws SaldoInsuficienteException, ValorInvalidoException {
		Cliente raul = new Cliente();
		raul.setNome("Raul");
		
		ContaCorrente cc = new ContaCorrente(raul);

		//polimorfismo
		//Conta poupanca = new ContaPoupanca(elania); ou 
		ContaPoupanca poupanca = new ContaPoupanca(raul);
		//IConta poupanca = new ContaPoupanca(elania);

		cc.depositar(000);
		cc.transferir(100, poupanca);
		cc.sacar(300);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
