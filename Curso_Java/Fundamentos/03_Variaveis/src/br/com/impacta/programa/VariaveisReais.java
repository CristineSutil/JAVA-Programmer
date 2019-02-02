package br.com.impacta.programa;

public class VariaveisReais {
	public static void main(String[] args) {
		
		float peso1 = 10;
		double peso2 = 10;
		
		float peso3 = (float)10.2; //coerção - typecast
		double peso4 = 10.2;
		
		int pesoInt = (int)peso4;  //obtem a parte inteira de peso4
		
		System.out.println("peso1: " + peso1);
		System.out.println("peso2: " + peso2);
		System.out.println("peso3: " + peso3);
		System.out.println("peso4: " + peso4);
		System.out.println("pesoInt: " + pesoInt);
		
		
	}
}
