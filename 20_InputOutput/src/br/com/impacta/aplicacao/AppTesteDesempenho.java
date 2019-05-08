package br.com.impacta.aplicacao;

import java.util.*;
/**
 *  Classe que verifica o tempo de execu��o de pesquisas sucessivas
 *  em cole��es usando uma implementa��o espec�fica.
 *  
 *  O tempo de pesquisa em todos os elementos da cole��o ser� dado em 
 *  milisegundos.
 *  
 */
public class AppTesteDesempenho {

	//numero de elementos da cole��o
	private static final int TAMANHO = 600_000;
	
	public static void main(String[] args) {
		Collection<Integer> numeros = new TreeSet<>();
		
		//inserindo os numeros na cole��o
		for(int i=0; i<TAMANHO; i++) {
			numeros.add(i);
		}
		
		long inicio = System.currentTimeMillis();
		
		//pesquisando na cole��o cada um dos n�meros
		System.out.println("Pesquisando...");
		for(int i=0; i<TAMANHO; i++) {
			numeros.contains(i);
		}
		
		long tfinal = System.currentTimeMillis();
		long duracao = tfinal - inicio;
		
		System.out.printf("A cole��o %s demorou %d ms.", 
										numeros.getClass().getSimpleName(), duracao);
	}	
}
