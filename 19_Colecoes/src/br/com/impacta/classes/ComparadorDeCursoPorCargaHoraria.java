package br.com.impacta.classes;

import java.util.Comparator;

public class ComparadorDeCursoPorCargaHoraria implements Comparator<Curso>{

	@Override
	public int compare(Curso o1, Curso o2) {
		return o1.getCargaHoraria() - o2.getCargaHoraria();		
	}
}
