package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.ObjectGuardadorDeContas;

public class ObjectTeste {

	public static void main(String[] args) {
		
		ObjectGuardadorDeContas referencias = new ObjectGuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		referencias.adiciona(cc);
		
		Conta cp = new ContaPoupanca(85, 11);
		referencias.adiciona(cp);
		
		Cliente cliente = new Cliente();
		referencias.adiciona(cliente);
		
		int tamanho = referencias.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = (Conta)referencias.getReferencias(0);
		System.out.println(ref.getNumero());
	}

}
