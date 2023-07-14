package br.com.bytebank.banco.modelo;

public class ContaPix extends Conta {
	
	public ContaPix(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}
