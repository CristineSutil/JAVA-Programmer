package br.com.impacta.classes.exercicios;

public class Imovel {
	
	private String descricao;
	private double area;
	private String endereco;
	private double preco;
	
	/*
	 * Regras de neg�cio para a classe Imovel:
	 * 
	 * - A �rea minima � de 20m2 e m�xima de 200m2
	 * - O preco do imovel n�o pode ser superior R$ 400.000, se area
	 *   for at� 60m2.
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
	
	//m�todos de valida��o
	private double validarArea(double area) {
			
		if(area < 20) {
			return 20;
		} else if(area > 200) {
			return 200;
		}
		return area;
	}
	
	
	/*
	 * WARNING!!!!
	 * Essa valida��o S� funcionar� se o valor da �rea for 
	 * previamente conhecido. Isso exige que a atribui��o da
	 * �rea ocorra antes da atribui��o do pre�o.
	 * 
	 * Esse processo n�o � bem vindo em POO, e deve ser evitado.
	 */
	private double validarPreco(double preco) {
		if(this.getArea() <= 60 && preco > 400000) {
			return 400000;
		}
		return preco;
	}
	
}








