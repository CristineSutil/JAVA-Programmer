package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo2 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Aluno(Sexo.MASCULINO, 72, 1.75);
		if(p1 instanceof Aluno) {
		((Aluno)p1).setCurso(new Curso ("PHP", 40, 1200));
		((Aluno)p1).setMatricula(12345);
		JOptionPane.showMessageDialog(null,  p1.exibir());
		}
		
		p1 = new Funcionario(Sexo.FEMININO, 50 , 1.65);
		
		if (p1 instanceof Funcionario) {
			
		((Funcionario)p1).setCpf("11122233301");
		((Funcionario)p1).setCargo("Professor");
		((Funcionario)p1).setSalario(1500);		
		JOptionPane.showMessageDialog(null,  p1.exibir());
		}
		
		p1 = new Pessoa(Sexo.FEMININO, 60, 1.70);
		JOptionPane.showMessageDialog(null,  p1.exibir());
		
		//p1.setNome("Nestor");
		//p1.setIdade(28);
		
		//if(p1 instanceof Aluno) {
			//((Aluno) p1).setMatricula(12345);
			//((Aluno) p1).setCurso(new Curso("PHP", 40, 1200));
			
		//} else if (p1 instanceof Funcionario) {
			//((Funcionario) p1).setCpf("11122233301");
		//	((Funcionario) p1).setCargo("Professor");
			//((Funcionario) p1).setSalario(1500);
		//}
		
		//JOptionPane.showMessageDialog(null, p1.exibir());
	}
}











