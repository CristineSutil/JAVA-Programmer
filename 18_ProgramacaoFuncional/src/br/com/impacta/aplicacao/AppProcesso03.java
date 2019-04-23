package br.com.impacta.aplicacao;

import br.com.impacta.interfaces.Processo03;

public class AppProcesso03 {
	public static void main(String[] args) {
		//T buscar(int x, T[] elementos);
		
		Processo03<Integer> p1 = (posicao, lista) -> lista[posicao];
		int valor = p1.buscar(3, new Integer[] {3, 4, 8, 7, 9, 2});
		System.out.println("Valor na posição 3: " + valor);
		
		
		
		Processo03<String> p2 = (posicao, lista) -> lista[posicao];
		String item = p2.buscar(3, new String[] {"Um","Dois","Tres","Quatro"});
		System.out.println("Valor na posição 3: " + item);
		
		
	}
}
