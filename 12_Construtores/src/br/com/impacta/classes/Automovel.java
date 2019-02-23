package br.com.impacta.classes;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = this.validarAno(ano);
	}
	
	//metodos validadores do ano
	private boolean anoEhNegativo(int ano) {
		return ano < 0;
	}
	
	private boolean anoEhMenor1970(int ano) {
		return ano < 1970;
	}
	
	private int validarAno(int ano) {
		if(this.anoEhNegativo(ano)) {
			return 0;
		} else if(this.anoEhMenor1970(ano)) {
			return 1970;
		} else {
			return ano;
		}
	}
	

	public void atribuir(String marca, String modelo, int ano) {		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
	}
	
	public String retornar() {
		String resposta = "Marca: " + this.getMarca() +
				          "\nModelo: " + this.getModelo() +
				          "\nAno: " + this.getAno();
		
		return resposta;
	}
}







