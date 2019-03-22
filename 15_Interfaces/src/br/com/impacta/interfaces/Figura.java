package br.com.impacta.interfaces;

public interface Figura {
	/*
	 * todos os atributos de uma interface são publicos estaticos e constante (final) por definição
	 * 
	 */
	String DESCRICAO = "Interface figura de ser implementada";
	
	/*
	 * todos os metodos de um interface são publicos e abstratos por definição
	 *
	 */
	double calcularArea();
	default String exibirFigura() {
		String resposta = "Classe: " + this.getClass().getSimpleName() +
		 "\nArea da Figura: " + this.calcularArea();
		return resposta;
	}
	
	
}
