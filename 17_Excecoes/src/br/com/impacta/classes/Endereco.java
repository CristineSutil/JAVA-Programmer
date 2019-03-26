package br.com.impacta.classes;

public class Endereco {
	
	private String logradouro;
	private int numero;
	private String cidade;
	private String cep;
	
	public Endereco(String logradouro, int numero, String cidade, String cep) {
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
		this.setCep(cep);
	}
		
	public String getCep() {
		return cep.substring(0, 5) + "-" + cep.substring(5);
	}

	
	public void setCep(String cep) {
		if(!cep.matches("[0-9]{8} ")) {
			throw new NumberFormatException("Cep invalido: deve ter 8 digitos");
		}
		this.cep = cep;
	}


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








