package br.com.impacta.classes;

public class Curso {
	
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
	public Curso(String descricao, int ch, double preco) {
		this.setDescricao(descricao);
		this.setCargaHoraria(ch);
		this.setPreco(preco);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String exibir() {
		String resultado = "DADOS DO CURSO" +
					"\n\nDescrição: " + this.getDescricao() +
					"\nCarga Horária: " + this.getCargaHoraria() +
					"\nPreço: " + this.getPreco();
		
		return resultado;
				
	}
}











