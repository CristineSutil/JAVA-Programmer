package br.com.impacta.programa;

public class ExemploDoWhileRandom {
	public static void main(String[] args) {
		
		//aleatoriamente//
		
		int contador = (int)(Math.random() * 20);
		
		do {
			System.out.println("Posi��o: " + contador--);
		}while(contador > 10);
		
	
			System.out.println("----Finalizado-----");
			
			
		}
			
	}
