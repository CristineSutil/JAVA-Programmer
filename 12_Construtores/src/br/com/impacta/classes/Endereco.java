package br.com.impacta.classes;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String cidade;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String exibir() {
		return exibir("DADOS DO ENDEREÇO:");
	}

	public String exibir(String titulo) {
		String resposta = titulo +
						"\n\nLogradouro: " + this.getLogradouro() +
						"\nNúmero: " + this.getNumero() +
						"\nCidade: " + this.getCidade();
		
		return resposta;
	}	
	
	
	

}








