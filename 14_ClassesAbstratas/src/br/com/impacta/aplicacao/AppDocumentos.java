package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.DocCpf;
import br.com.impacta.classes.Documento;

public class AppDocumentos {
	public static void main(String[] args) {
		Documento cpf = new DocCpf();
		cpf.setNumero("11122233345");
		JOptionPane.showMessageDialog(null, cpf.exibir());
		
		
}
}

