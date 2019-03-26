package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Aluno extends Pessoa {
	private int matricula;
	private Curso curso;
	
	public Aluno(Sexo sexo, double peso, double altura) throws Exception {
		super(sexo, peso, altura);
		this.setCurso(curso);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		if(curso == null) {
			throw new NumberFormatException("o curso deve ser informado");
		}
		this.curso = curso;
	}
	
	@Override
	public String exibir() {
		String resultado = super.exibir() + "\nDADOS DO ALUNO" +
					"\n\nMatrícula: " + this.getMatricula() +
					"\n" + this.getCurso().exibir();
		return resultado;
					
	}
	
}









