package br.com.impacta.classes;

public abstract class Documento {
	private String numero; 
	private int digitos;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if (numero.length() != this.getDigitos()) {
			throw new NumberFormatException("Documento Inválido");
		}
		this.numero = numero;
	}
	public int getDigitos() {
		return digitos;
	}
	//protected visivel na propria classe e nas subclasses
	protected void setDigitos(int digitos) {
		this.digitos = digitos;
	}
	
	public abstract String exibir();
}
