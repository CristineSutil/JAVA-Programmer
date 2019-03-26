package br.com.impacta.aplicacao;

import java.text.ParseException;

import br.com.impacta.classes.DocCpf;
import br.com.impacta.classes.Documento;

public class AppDocumentos {
	public static void main(String[] args) {
		
		Documento doc1 = new DocCpf();
		try {
			doc1.setNumero("12312312312");
			System.out.println(doc1.exibir());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
