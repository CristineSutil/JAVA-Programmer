package br.com.impacta.interfaces;

public interface Figura {
	/*
	 * todos os atributos de uma interface s�o publicos estaticos e constante (final) por defini��o
	 * 
	 */
	String DESCRICAO = "Interface figura de ser implementada";
	
	/*
	 * todos os metodos de um interface s�o publicos e abstratos por defini��o
	 *
	 */
	double calcularArea();
	default String exibirFigura() {
		String resposta = "Classe: " + this.getClass().getSimpleName() +
		 "\nArea da Figura: " + this.calcularArea();
		return resposta;
	}
	
	
}
