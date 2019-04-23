package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Mensagem;

public class AppMensagem {
	public static void main(String[] args) {
		
		//String calcular(int x);
		Mensagem msg1 = item -> "Texto: " + item;
		System.out.println(msg1.calcular(120));
		
		Mensagem msg2 = item -> {
			String texto = "";
			for (int i = 0; i < item; i++) {
				texto += i + ",";
			}
			return texto;
		};
		System.out.println(msg2.calcular(5));
	}
}
