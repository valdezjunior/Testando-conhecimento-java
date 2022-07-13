
public class Main {

	public static void main(String[] args) {
		
		Cliente valdez = new Cliente();
		valdez.setNome("Valdez");
		
		Conta cc = new ContaCorrente(valdez);
		Conta poupanca = new ContaPoupanca(valdez);
		
		
		cc.depositar(100);
		cc.transferir(30, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
