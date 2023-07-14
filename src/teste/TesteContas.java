package teste;

public class TesteContas {

	public static void main(String[] args) throws modelo.SaldoInsuficienteException {
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		modelo.ContaPix cpx = new modelo.ContaPix(333, 333);
		cpx.deposita(150.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		System.out.println("Conta Pix: " + cpx.getSaldo());

	}

}
