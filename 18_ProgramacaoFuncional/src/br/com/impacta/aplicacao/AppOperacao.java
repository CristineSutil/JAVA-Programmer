package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Operacao;

public class AppOperacao {
	public static void main(String[] args) {
		
		//double calcular(double a, double b);
		
		Operacao op1 = (a, b) -> a + b;
		double resposta = op1.calcular(10, 12);
		System.out.println("Resposta de op1: " + resposta);
		
		Operacao op2 = (x1, x2) -> x1 - x2;
		resposta = op2.calcular(10,  12);
		System.out.println("Resposta de op2: " + resposta);
		
	}
}
