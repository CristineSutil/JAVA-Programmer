package br.com.impacta.classes;

import java.util.Comparator;

public class ComparadorDeCursoPorPrecoDec implements Comparator<Curso>{

	@Override
	public int compare(Curso o1, Curso o2) {
		//retornos invertidos por ser ordenação decrescente
		if(o1.getPreco() > o2.getPreco()) {
			return -1; 
		}else if(o1.getPreco() < o2.getPreco()) {
			return 1;
		}else {
			return 0;
		}
	}
}
