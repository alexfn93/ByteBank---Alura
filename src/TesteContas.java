
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		ContaPix cpx = new ContaPix(333, 333);
		cpx.deposita(150.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		System.out.println("Conta Pix: " + cpx.getSaldo());

	}

}
