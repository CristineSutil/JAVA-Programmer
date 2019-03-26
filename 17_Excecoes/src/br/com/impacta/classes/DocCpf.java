package br.com.impacta.classes;

public class DocCpf extends Documento{

	public DocCpf() {
		this.setDigitos(11);
		}
	
	@Override
	public String exibir() {
		String resposta = "Numero do CPF: " + this.getNumero() + "\nQuantidade de Dígitos: " + this.getDigitos();
		return resposta;
		
	}

}
