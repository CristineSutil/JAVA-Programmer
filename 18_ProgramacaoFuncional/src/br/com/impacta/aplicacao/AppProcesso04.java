package br.com.impacta.aplicacao;

import br.com.impacta.classes.DocCnpj;
import br.com.impacta.classes.Documento;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Processo04;

public class AppProcesso04 {
	public static void main(String[] args) {
		//int processar(T elemento);
		
		Processo04<Documento> p1 = p -> p.getDigitos();
		int v1 = p1.processar(new DocCnpj());
		System.out.println("v1 = " + v1);
		
		try {
			Processo04<Pessoa>    p2 = p -> p.getIdade();
			Pessoa pessoa = new Pessoa("Pedro", Sexo.MASCULINO, 80, 1.8);
			pessoa.setIdade(25);
			
			int v2 = p2.processar(pessoa);
			System.out.println("v2 = " + v2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Processo04<String[]>  p3 = p -> p.length; 
		String[] nomes = {"Bernardo", "Adriana", "Moacir", "Fatima"};
		int v3 = p3.processar(nomes);
		System.out.println("v3 = " + v3);		
	}
}





