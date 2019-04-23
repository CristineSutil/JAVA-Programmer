package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Calculo;

public class AppCalculo {
	public static void main(String[] args) {
		
		//int calcular(String s);
		
		Calculo calc1 = p -> p.replace(" ", "").length();
		System.out.println(calc1.calcular("hoje é         sábado"));
		
		//retorna o numero de palavras: levando em conta que 
		//não existem espaços antes ou depois
		Calculo calc2 = p -> {
			String[] itens = p.split(" ");
			int contador = 0;
			for (String item : itens) {
				if(item.length() > 0) {
					contador++;
				}
			}
			return contador;
		};

		int n1 = calc2.calcular("Meu texto preferido");
		int n2 = calc2.calcular("Hoje é   sábado e amanhã, domingo");
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		
	}
}









