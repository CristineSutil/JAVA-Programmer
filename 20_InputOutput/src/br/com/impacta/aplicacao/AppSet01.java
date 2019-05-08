package br.com.impacta.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		//Lista de nomes
		Set<String> nomes = new HashSet<>(); //LinkedHashSet ou TreeSet
		
		//adicionando elementos na lista
		nomes.add("Miguel");
		nomes.add("Jonas");
		nomes.add("Patricia");
		nomes.add("Miguel");
		nomes.add("Gerson");
		nomes.add("Braulio");
		nomes.add("Claudia");
		nomes.add("Otto");
		
		//removendo os elementos que começam com a letra A
		nomes.removeIf(s -> s.startsWith("A"));
		
		//apresentando os nomes através de expressões lambda
		nomes.forEach(s -> System.out.println(s));
		//nomes.forEach(System.out::println);
		
	}
}
