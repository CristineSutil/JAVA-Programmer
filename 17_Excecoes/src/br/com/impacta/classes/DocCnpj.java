package br.com.impacta.classes;

public class DocCnpj extends Documento {

	public DocCnpj() {
		this.setDigitos(14);
		}
		
	@Override
	public String exibir() {
		String resposta = "Numero do CNPJ: " + this.getNumero() + "\nQuantidade de Dígitos: " + this.getDigitos();
		return resposta;
	}

}
