package br.com.impacta.aplicacao;

public class AppArrayInteiros01 {
	public static void main(String[] args) {
		int[] numeros = new int [5];
		
		numeros[2] = 31;
		numeros[0] = 42;
		numeros[3] = -7;
		numeros[4] = 5;
		numeros[1] = 34;
		
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

}
