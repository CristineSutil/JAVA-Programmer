package br.com.impacta.programa;

public class ExemploWhileRandom {
	public static void main(String[] args) {
		
		int contador = (int)(Math.random() * 20);
		while(contador > 10) {
			System.out.println("Posição: " + contador--);
			
		}
			System.out.println("----Finalizado-----");
	}
}
