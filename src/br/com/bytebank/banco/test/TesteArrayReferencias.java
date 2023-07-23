package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
        //int[] idades = new int[10];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(23, 82);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
        //System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println( referenciaGenerica.getNumero() );
		
		//System.out.println( referencias[1].getNumero() );

		
		Conta ref = (ContaPoupanca) referencias[1];//type cast
	    System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
//		ContaPoupanca[] contas = new ContaPoupanca[10];
//		ContaPoupanca cp1 = new ContaPoupanca(11,22);
//		ContaPoupanca cp2 = new ContaPoupanca(33,44);
//
//		contas[0] = cp1;
//		contas[1] = cp1;
//		contas[4] = cp2;
//		contas[5] = cp2;
//
//		ContaPoupanca ref1 = contas[1];
//		ContaPoupanca ref2 = contas[4];
//		
//		System.out.println(ref2);
	}

}
