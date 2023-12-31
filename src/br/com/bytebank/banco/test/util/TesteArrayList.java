package br.com.bytebank.banco.test.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();//usa array por baixo
//		List<Conta> lista = new LinkedList<Conta>();//usa lista linkada
//		List<Conta> lista = new Vector<Conta>();//usa array por baixo, mas também é threadsafe
//		Collection<Conta> lista = new Vector<Conta>();// quando aplicamos o collection, alguns métodos como get() e remove() não compilam

		Conta cc = new ContaCorrente(101, 101);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(102, 102);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(103, 103);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(104, 104);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("----------------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
