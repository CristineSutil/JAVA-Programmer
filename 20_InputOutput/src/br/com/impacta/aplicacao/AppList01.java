package br.com.impacta.aplicacao;

import java.util.LinkedList;
import java.util.List;

public class AppList01 {
	public static void main(String[] args) {
		//Lista de nomes
		List<String> nomes = new LinkedList<>();
		
		//adicionando elementos na lista
		nomes.add("Miguel");
		nomes.add("Jonas");
		nomes.add("Patricia");
		nomes.add("Miguel");
		nomes.add("Gerson");
		
		nomes.add(0, "Basilio"); //adicionando um nome na posição 0
		
		nomes.remove(nomes.size() - 1); //remove o ultimo elemento
		
		//removendo os elementos que começam com "Mi"
		nomes.removeIf(s -> s.startsWith("Mi"));
		
		//apresentando os nomes através de expressões lambda
		nomes.forEach(s -> System.out.println(s));
		
		//metodo de pesquisa de elementos na coleção
		if(nomes.contains("Basilio")) {
			System.out.println("Encontrei o Basilio!");
		}else {
			System.out.println("Não encontrei!!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
