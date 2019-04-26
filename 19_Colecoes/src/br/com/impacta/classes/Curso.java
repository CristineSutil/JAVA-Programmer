package br.com.impacta.classes;

public class Curso implements Comparable<Curso>{
	
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

	@Override
	public int compareTo(Curso outro) {
		return -1 * this.getDescricao().compareTo(outro.getDescricao());
	}

	@Override
	public String toString() {
		return "Curso [descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
}











