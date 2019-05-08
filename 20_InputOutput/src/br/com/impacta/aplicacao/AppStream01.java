package br.com.impacta.aplicacao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import br.com.impacta.classes.Curso;

public class AppStream01 {
	
	public static void main(String[] args) {
		Set<Curso> cursos = new TreeSet<>();
		
		//criando as diferentes instâncias...
		Curso c0 = new Curso("História da Arte", 40, 765.45);
		Curso c1 = new Curso("Cinema e Política", 25, 234.51);
		Curso c2 = new Curso("Expressão Verbal", 60, 1013.44);
		Curso c3 = new Curso("Estrutura de Dados", 80, 1500.02);
		Curso c4 = new Curso("Algoritmos", 88, 1865.98);
		Curso c5 = new Curso("Bases da Economia", 44, 812.55);
		Curso c6 = new Curso("Matemática Financeira", 140, 2200.87);
		Curso c7 = new Curso("Reiki nível 1", 16, 334.56);
		Curso c8 = new Curso("Astrologia Básica", 100, 888.88);
		Curso c9 = new Curso("Direção Defensiva", 25, 356.65);
		
		//Adicionando as instâncias na coleção
		cursos.add(c0);
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		cursos.add(c5);
		cursos.add(c6);
		cursos.add(c7);
		cursos.add(c8);
		cursos.add(c9);
		
		//Obtendo um stream de cursos
		Stream<Curso> streamCurso = cursos.stream();
				
		//Limita aos dois primeiros elementos da coleção
		System.out.println("---- Dois primeiros cursos da coleção ---- ");
		streamCurso.limit(2)
				   .forEach(System.out::println);
		
		//Pula os 4 primeiros cursos da coleção
		System.out.println("\n---- Pulando os 4 primeiros cursos da coleção ---- ");
		streamCurso = cursos.stream();
		streamCurso.skip(4)
				   .forEach(System.out::println);
		
		//Ordena a coleção usando o critério natural 
		System.out.println("\n---- Coleção de cursos na ordem \"natural\" ---- ");
		streamCurso = cursos.stream();
		streamCurso.sorted()
				   .forEach(System.out::println);
		
				
		//Ordena a coleção usando o critério preço ascendente
		System.out.println("\n---- Coleção de cursos na ordem por preço ---- ");
		streamCurso = cursos.stream();
		streamCurso.sorted(Comparator.comparing(Curso::getPreco))
		   		   .forEach(System.out::println);
		
		
		//Listar os cursos aplicando um filtro 
		System.out.println("\n---- Cursos com preços superiores a 1000 ---- ");
		streamCurso = cursos.stream();
		streamCurso.filter(c -> c.getPreco() > 1000)
				   .forEach(System.out::println);
		
		
		//Curso com maior carga horária
		streamCurso = cursos.stream();
		Curso cursoMaisDemorado = streamCurso.max
									(Comparator.comparing(Curso::getCargaHoraria))
									.get();
		System.out.println("\n--- Curso com maior carga horária ---");
		System.out.println(cursoMaisDemorado);
		
		
		//listagem dos cursos com carga horaria entre 30 e 60 horas
		System.out.println("\n--- Cursos com carga horária entre 30 e 60 horas ---");
		streamCurso = cursos.stream();
		streamCurso.filter(c -> (c.getCargaHoraria() >= 30 && 
									c.getCargaHoraria() <=60 ))
				   .forEach(System.out::println);
		
	
		//Contando os cursos da coleção
		System.out.println("\n--- Quantidade de cursos ---");
		streamCurso = cursos.stream();
		long quantidade = streamCurso.count();
		System.out.printf("Há %d cursos na coleção! \n",quantidade);

		
		//Gerando e listando um stream de inteiros (cargas horarias)
		System.out.println("\n--- Listando somente as cargas horarias isoladas ---");
		streamCurso = cursos.stream();
		Stream<Integer> cargasHorarias = streamCurso.map(c -> c.getCargaHoraria());
		cargasHorarias.forEach(System.out::println);
		
		//Calculando a média da carga horária dos cursos
		System.out.println("\n--- Mostrando a média de carga horária ---");
		double mediaCH = cursos.stream()
							   .mapToInt((c -> c.getCargaHoraria()))
							   .average()
							   .getAsDouble();		  	
		
		System.out.printf("A média de carga horária é de %.2f horas. \n",mediaCH);	   	
		
		
	}

}
