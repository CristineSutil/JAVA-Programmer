package br.com.impacta.aplicacao;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import br.com.impacta.classes.Curso;

public class AppStream01 {
	
	public static void main(String[] args) {
		Set<Curso> cursos = new TreeSet<>();
		
		//criando as diferentes inst�ncias...
		Curso c0 = new Curso("Hist�ria da Arte", 40, 765.45);
		Curso c1 = new Curso("Cinema e Pol�tica", 25, 234.51);
		Curso c2 = new Curso("Express�o Verbal", 60, 1013.44);
		Curso c3 = new Curso("Estrutura de Dados", 80, 1500.02);
		Curso c4 = new Curso("Algoritmos", 88, 1865.98);
		Curso c5 = new Curso("Bases da Economia", 44, 812.55);
		Curso c6 = new Curso("Matem�tica Financeira", 140, 2200.87);
		Curso c7 = new Curso("Reiki n�vel 1", 16, 334.56);
		Curso c8 = new Curso("Astrologia B�sica", 100, 888.88);
		Curso c9 = new Curso("Dire��o Defensiva", 25, 356.65);
		
		//Adicionando as inst�ncias na cole��o
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
				
		//Limita aos dois primeiros elementos da cole��o
		System.out.println("---- Dois primeiros cursos da cole��o ---- ");
		streamCurso.limit(2)
				   .forEach(System.out::println);
		
		//Pula os 4 primeiros cursos da cole��o
		System.out.println("\n---- Pulando os 4 primeiros cursos da cole��o ---- ");
		streamCurso = cursos.stream();
		streamCurso.skip(4)
				   .forEach(System.out::println);
		
		//Ordena a cole��o usando o crit�rio natural 
		System.out.println("\n---- Cole��o de cursos na ordem \"natural\" ---- ");
		streamCurso = cursos.stream();
		streamCurso.sorted()
				   .forEach(System.out::println);
		
				
		//Ordena a cole��o usando o crit�rio pre�o ascendente
		System.out.println("\n---- Cole��o de cursos na ordem por pre�o ---- ");
		streamCurso = cursos.stream();
		streamCurso.sorted(Comparator.comparing(Curso::getPreco))
		   		   .forEach(System.out::println);
		
		
		//Listar os cursos aplicando um filtro 
		System.out.println("\n---- Cursos com pre�os superiores a 1000 ---- ");
		streamCurso = cursos.stream();
		streamCurso.filter(c -> c.getPreco() > 1000)
				   .forEach(System.out::println);
		
		
		//Curso com maior carga hor�ria
		streamCurso = cursos.stream();
		Curso cursoMaisDemorado = streamCurso.max
									(Comparator.comparing(Curso::getCargaHoraria))
									.get();
		System.out.println("\n--- Curso com maior carga hor�ria ---");
		System.out.println(cursoMaisDemorado);
		
		
		//listagem dos cursos com carga horaria entre 30 e 60 horas
		System.out.println("\n--- Cursos com carga hor�ria entre 30 e 60 horas ---");
		streamCurso = cursos.stream();
		streamCurso.filter(c -> (c.getCargaHoraria() >= 30 && 
									c.getCargaHoraria() <=60 ))
				   .forEach(System.out::println);
		
	
		//Contando os cursos da cole��o
		System.out.println("\n--- Quantidade de cursos ---");
		streamCurso = cursos.stream();
		long quantidade = streamCurso.count();
		System.out.printf("H� %d cursos na cole��o! \n",quantidade);

		
		//Gerando e listando um stream de inteiros (cargas horarias)
		System.out.println("\n--- Listando somente as cargas horarias isoladas ---");
		streamCurso = cursos.stream();
		Stream<Integer> cargasHorarias = streamCurso.map(c -> c.getCargaHoraria());
		cargasHorarias.forEach(System.out::println);
		
		//Calculando a m�dia da carga hor�ria dos cursos
		System.out.println("\n--- Mostrando a m�dia de carga hor�ria ---");
		double mediaCH = cursos.stream()
							   .mapToInt((c -> c.getCargaHoraria()))
							   .average()
							   .getAsDouble();		  	
		
		System.out.printf("A m�dia de carga hor�ria � de %.2f horas. \n",mediaCH);	   	
		
		
	}

}
