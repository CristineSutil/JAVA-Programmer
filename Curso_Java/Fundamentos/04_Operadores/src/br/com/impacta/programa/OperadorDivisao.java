package br.com.impacta.programa;

public class OperadorDivisao {
	public static void main(String[] args) {
		
		int op1 = 5, op2 = 2;
		double valor1 = op1 / op2;
		System.out.println("valor1: " + valor1);
		
		double v1 = 5, v2 = 2;
		double valor2 = v1 / v2;
		System.out.println("valor2: " + valor2);
		
		double valor3 = (double)op1 / op2;
		System.out.println("valor3: " + valor3);
	}
}
