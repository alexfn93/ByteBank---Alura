package br.com.bytebank.banco.modelo;

public class ObjectGuardadorDeContas {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public ObjectGuardadorDeContas() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	public Object getReferencias(int pos) {
		return this.referencias[pos];
	}
}
