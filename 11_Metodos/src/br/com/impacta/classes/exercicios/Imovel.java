package br.com.impacta.classes.exercicios;

public class Imovel {
	private String descricao;
	private double area;
	private String endereco;
	private double preco;
	
	
	/*
	 * Regras de negocio para a classe imovel:
	 * - A area minima � de 20 m2 e maxima 200 m2
	 * - o pre�o do imovel n�o pode ser superior a 400.000,00, se a area for ate 60 m2
	 * 	 
	 */
	
	public String getDescricao() {
		return descricao;
		
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		
	}
	public double getArea() {
		return area;
		
	}
	public void setArea(double area) {
		this.area = this.validarArea(area);
		
	}
	public String getEndereco() {
		return endereco;
		
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
		
	}
	public double getPreco() {
		return preco;
		
	}
	public void setPreco(double preco) {
		this.preco = this.validarPreco(preco);
	}
	
	//metodos de validacao
	
	private double validarArea(double area) {
				
		if(area > 20){
			return 20;
		} else if(area > 200) {
			return 200;
		}
		return area;
	}
	
	/*
	 * Warning
	 * essa valida��o s� funcionara se o valor da �rea for previamente conhecido.
	 * Isso exige que a atribui��o da area ocorra antes da atribui��o do preco.
	 * esse processo n�o � bem vindo em POO
	 *  e deve ser evitado * 
	 */
	private double validarPreco(double preco) {
		if(this.getArea() <= 60 && preco > 400000) {
			return 400000;
		}
			return preco;
	}
	
	
	
	
}
