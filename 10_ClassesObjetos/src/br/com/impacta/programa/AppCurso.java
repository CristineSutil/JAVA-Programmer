package br.com.impacta.programa;

import br.com.impacta.classes.exercicios.Curso;

public class AppCurso {
public static void main(String[] args) {
	

	 	Curso curso1 = new Curso();
	 	curso1.descricao = "Curso de Java";
	 	curso1.carga_horaria = 150;
	 	curso1.preco = 1000.00;
	 	
	 	Curso curso2 = new Curso();
	 	curso2.descricao = "Curso de JavaScript";
	 	curso2.carga_horaria = 50;
	 	curso2.preco = 100.00;
	 	
		System.out.println("Curso 1");
		System.out.println("Carga Horaria " + curso1.carga_horaria);
		System.out.println("Descricao " + curso1.descricao);
		System.out.println("Preço " + curso1.preco);
		System.out.println("------------");
		
		System.out.println("Curso 2");
		System.out.println("Carga Horaria " + curso2.carga_horaria);
		System.out.println("Descricao " + curso2.descricao);
		System.out.println("Preço " + curso2.preco);
		System.out.println("------------");
			 
		
		
		
}



}

