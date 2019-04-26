package br.com.impacta.aplicacao;

import java.util.*;
/**
 *  Classe que verifica o tempo de execução de pesquisas sucessivas
 *  em coleções usando uma implementação específica.
 *  
 *  O tempo de pesquisa em todos os elementos da coleção será dado em 
 *  milisegundos.
 *  
 */
public class AppTesteDesempenho {

	//numero de elementos da coleção
	private static final int TAMANHO = 600_000;
	
	public static void main(String[] args) {
		Collection<Integer> numeros = new TreeSet<>();
		
		//inserindo os numeros na coleção
		for(int i=0; i<TAMANHO; i++) {
			numeros.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		//pesquisando na coleção cada um dos números
		System.out.println("Pesquisando...");
		for(int i=0; i<TAMANHO; i++) {
			numeros.contains(i);
		}
		
		long tfinal = System.currentTimeMillis();
		long duracao = tfinal - inicio;
		
		System.out.printf("A coleção %s demorou %d ms.", 
										numeros.getClass().getSimpleName(), duracao);
	}	
}
