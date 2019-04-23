package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Processo02;

public class AppProcesso02 {
	public static void main(String[] args) {
		//void processar(String s, int n);
		
		Processo02 p1 = (x, y) -> System.out.println(x.toUpperCase() + ": " + y);
		p1.processar("Java", 100);
		
	}
}
