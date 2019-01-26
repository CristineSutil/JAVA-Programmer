package br.com.impacta.programa;

import br.com.impacta.enumeracoes.DiasSemana;
import br.com.impacta.enumeracoes.Sexos;

public class VariaveisEnum {
	public static void main(String[] args) {
		DiasSemana dia = DiasSemana.SABADO;
		System.out.println("Dia: " + dia);
		System.out.println("Ordem na enumera��o: " + dia.ordinal());
		
		String curso = "Java Programmer";
		int cargaHoraria = 100;
		Sexos sexoProfessor = Sexos.MASCULINO;
		
		System.out.println("Curso: " + curso);
		System.out.println("Carga Hor�ria: " + cargaHoraria);
		System.out.println("Sexo do Professor: " + sexoProfessor);
	}
}
