package br.com.impacta.classes.exercicios;

public class Imovel {
	
	private String descricao;
	private double area;
	private String endereco;
	private double preco;
	
	/*
	 * Regras de negócio para a classe Imovel:
	 * 
	 * - A área minima é de 20m2 e máxima de 200m2
	 * - O preco do imovel não pode ser superior R$ 400.000, se area
	 *   for até 60m2.
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
	
	//métodos de validação
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
	 * Essa validação SÓ funcionará se o valor da área for 
	 * previamente conhecido. Isso exige que a atribuição da
	 * área ocorra antes da atribuição do preço.
	 * 
	 * Esse processo não é bem vindo em POO, e deve ser evitado.
	 */
	private double validarPreco(double preco) {
		if(this.getArea() <= 60 && preco > 400000) {
			return 400000;
		}
		return preco;
	}
	
}








