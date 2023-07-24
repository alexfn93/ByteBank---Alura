package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.ArrayList;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		//array do tipo int primitivo
		int[] idades = new int[5]; 		
		String[] nomes = new String[5];
		
		int idade = 29;//Integer
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		
		System.out.println("double value: " + idadeRef.doubleValue());
		
		System.out.println("max value: " + Integer.MAX_VALUE);
		
		System.out.println("min value: " +Integer.MIN_VALUE);
		
		System.out.println("size: " +Integer.SIZE);
		
		System.out.println("bytes: " +Integer.BYTES);
		
		int valor = idadeRef.intValue();//unboxing
		
		String s = args[0];//"10"
		
		//	Integer numero = Integer.valueOf(s);
		
		int numero = Integer.parseInt(s);
		
		System.out.println("parsetInt: " + numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);//Autoboxing
	}

}
