package br.com.impacta.classes;

public class Filme {
	
	private String titulo;
	private String diretores;
	private double nota;
	private int duracao;
	private int ano;
	private String generos;
	private int votos;
	private String dataRegistro;
	private String url;
	
	public Filme() {}
	
	public Filme(String titulo, String diretores, double nota, 
					int duracao, int ano, String generos, int votos,
					String dataRegistro, String url) {

		this.titulo = titulo;
		this.diretores = diretores;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.generos = generos;
		this.votos = votos;
		this.dataRegistro = dataRegistro;
		this.url = url;
	}


	public String getTitulo() {
		return titulo;
	}

	public String getDiretores() {
		return diretores;
	}

	public double getNota() {
		return nota;
	}

	public int getDuracao() {
		return duracao;
	}

	public int getAno() {
		return ano;
	}

	public String getGeneros() {
		return generos;
	}

	public int getVotos() {
		return votos;
	}

	public String getDataRegistro() {
		return dataRegistro;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Filme other = (Filme) obj;
		if (ano != other.ano)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", diretores=" + diretores + ", nota=" + nota + ", duracao=" + duracao
				+ ", ano=" + ano + ", generos=" + generos + ", votos=" + votos + ", dataRegistro=" + dataRegistro
				+ ", url=" + url + "]";
	}
	
	
	

}
