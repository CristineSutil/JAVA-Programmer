package br.com.impacta.programa;

public class OperadorTernario {
	public static void main(String[] args) {
		
		int idade = 18;
		
		String status = idade < 18 ? "Menor" : "Maior";
		System.out.println("Idade = " +idade);
		System.out.println(status);
		System.out.println("-------------------");
		
		System.out.println("Idade = " + idade + '\n' + (idade < 18 ? "Menor" : "Maior"));
		System.out.println("-------------------");
		
		//Se o salario de um funcionario for até 3.000 reais, ele
		//pagara 10% de imposto. Se o salario for superior a 3.000
		//reais, ele pagará 10% sobre 3.000, mais 15% sobre o que
		//exceder 3.000.
		
		double salario = 3200;
		double salarioBase = 3000;
		double imposto = 
				(salario <= salarioBase ? 
				salario * 0.1 : 
				(salario - salarioBase) * 0.15 + salarioBase * 0.1);
		
		System.out.println("salario: " + salario);
		System.out.println("imposto: " + imposto);
		
		
	}
}





