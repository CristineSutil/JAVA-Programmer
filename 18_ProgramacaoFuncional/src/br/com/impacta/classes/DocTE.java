package br.com.impacta.classes;

public class DocTE extends Documento {

	public DocTE() {
		this.setDigitos(12);
	}
	
	
	@Override
	public String exibir() {
		String resposta = "Numero do Titulo de Eleitor: " + 
				this.getNumero() +
				"\nQuantidade de D�gitos: " + 
				this.getDigitos();
		return resposta;
	}
	
}
