package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";//object literal
//		//String outro = new String("Alura");
		
//		String vazio = "     Alura      ";
//		String outroVazio = vazio.trim();
//		
//		System.out.println(vazio.contains("Alu"));
//		System.out.println(outroVazio);
		
//		System.out.println(nome.length());
//		
//		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);

		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);S
//		
//		char c = 'A';
//		char d = 'a';
//		String teste = nome.replace(c, d);
//		
//		//String outra = nome.replace("A", "a");//Veremos que um dos replace() recebe CharSequence e outro um char; o primeiro está relacionado a conversão de um conjunto de caracteres
//		
//		String outra = nome.toLowerCase();//converte as letras para minusculas
//		String out = nome.toUpperCase();// converte as letras para maiúsculas.
//		
//		System.out.println(nome);
//		System.out.println(outra);
//		System.out.println(out);
//		//System.out.println("teste: " + teste);
		
//		String texto = "Socorram";
//		texto = texto.concat("-");
//		texto = texto.concat("me");
//		texto = texto.concat(", ");
//		texto = texto.concat("subi ");
//		texto = texto.concat("no ");
//		texto = texto.concat("ônibus ");
//		texto = texto.concat("em ");
//		texto = texto.concat("Marrocos");
//		System.out.println(texto); 
		
//		StringBuilder builder = new StringBuilder("Socorram");
//		builder.append("-");
//		builder.append("me");
//		builder.append(", ");
//		builder.append("subi ");
//		builder.append("no ");
//		builder.append("ônibus ");
//		builder.append("em ");
//		builder.append("Marrocos");
//		String texto = builder.toString();
//		System.out.println(texto);

	}

}
