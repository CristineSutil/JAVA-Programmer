package br.com.impacta.aplicacao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppColecaoPessoas {
	
	public static void main(String[] args) throws Exception {
		
		Set<Pessoa> pessoas = new TreeSet<>();
		
		Pessoa p1 = new Pessoa("Otto", Sexo.MASCULINO, 67.3, 1.71);
		Pessoa p2 = new Pessoa("Patricia", Sexo.FEMININO, 51.8, 1.63);
		Pessoa p3 = new Pessoa("Basilio", Sexo.MASCULINO, 75.2, 1.75);
		Pessoa p4 = new Pessoa("Amanda", Sexo.FEMININO, 49.5, 1.57);
		Pessoa p5 = new Pessoa("Joanna", Sexo.FEMININO, 73.1, 1.80);
		Pessoa p6 = new Pessoa("Romulo", Sexo.MASCULINO, 88.3, 1.92);
		Pessoa p7 = new Pessoa("Camila", Sexo.FEMININO, 56.7, 1.52);
		//Mesma pessoa?
		Pessoa p8 = new Pessoa("Camila", Sexo.FEMININO, 56.7, 1.52);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);
		pessoas.add(p7);
		pessoas.add(p8);
		
		pessoas.forEach(p->System.out.println(p));
		
		//1. Ordenar por ordem crescente de altura
		System.out.println("\n---Ordenadas por altura---");
		pessoas.stream()
			   .sorted(Comparator.comparing(Pessoa::getAltura))
			   .forEach(System.out::println);

		//2. Informar a média de peso das pessoas
		System.out.println("\n---Média de peso das pessoas---");
		double mediaPeso = pessoas.stream()
								  .mapToDouble(p-> p.getPeso())
								  .average()
								  .getAsDouble();
		System.out.printf("A média de peso das pessoas é %.2f Kg \n",mediaPeso);
				
		//3. Contar quantas mulheres existem na coleção
		System.out.println("\n---Contando as mulheres---");
		long quantMulheres = pessoas.stream()
								  .filter(p -> (p.getSexo() == Sexo.FEMININO))
								  .count();
		System.out.printf("Há %d mulheres na lista. \n",quantMulheres);

		
		//4. Exibir os dados da pessoa mais baixa 
		System.out.println("\n---A pessoa mais baixa---");
		System.out.println(pessoas.stream()
								  .min(Comparator.comparing(Pessoa::getAltura))
								  .get());
		
		
	}

}
