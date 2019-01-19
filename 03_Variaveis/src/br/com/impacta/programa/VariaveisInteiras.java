package br.com.impacta.programa;

public class VariaveisInteiras {
	public static void main(String[] args) {
		//declarando variaveis 
		byte quantAlunos = 127;
		short quantFas = 32767;
		int quantGraos = 1000000; //int é o inteiro padrão
		long quantMoleculas = 1600000000;
		
		//variaveis duvidosas: soma
		byte operando1 = 120;
		byte operando2 = 10;
		byte soma = (byte)(operando1 + operando2);//typecast
		
		System.out.println(quantAlunos);
		System.out.println(quantFas);
		System.out.println(quantGraos);
		System.out.println(quantMoleculas);
		System.out.println(soma);
		
		
	
	}
}
