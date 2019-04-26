package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.com.impacta.classes.ComparadorDeCursoPorCargaHoraria;
import br.com.impacta.classes.ComparadorDeCursoPorPrecoDec;
import br.com.impacta.classes.Curso;

public class AppColecaoDeCursos {

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
		
		//Listando os elementos na ordem decrescente de descricao
		System.out.println("--- LISTAGEM DE CURSOS por descricao (DESC) ---");
		cursos.forEach(System.out::println);
		
		//colocando os elementos numa lista para executar outras ordenações
		List<Curso> cursoList = new ArrayList<>();
		cursos.forEach(c -> cursoList.add(c));

		//Listando os elementos na ordem de crescente de carga horária
		//Collections.sort(cursoList, new ComparadorDeCursoPorCargaHoraria());
		Collections.sort(cursoList, (o1,o2) -> o1.getCargaHoraria() - o2.getCargaHoraria());
		System.out.println("\n--- LISTAGEM DE CURSOS por carga horaria (ASC) ---");
		cursoList.forEach(System.out::println);
		
		//listando os elementos na ordem decrescente de preço
		//Collections.sort(cursoList, new ComparadorDeCursoPorPrecoDec());
		
		Collections.sort(cursoList, (o1,o2) -> {
			if(o1.getPreco() < o2.getPreco()) {
				return 1;
			}else if (o1.getPreco() > o2.getPreco()){
				return -1;
			}else {
				return 0;
			}
		});
		
		System.out.println("\n--- LISTAGEM DE CURSOS por preco (DEC) ---");
		cursoList.forEach(System.out::println);
		
		
		
		
	}
}
