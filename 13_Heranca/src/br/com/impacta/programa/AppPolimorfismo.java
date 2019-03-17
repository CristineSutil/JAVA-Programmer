package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario(Sexo.MASCULINO, 72, 1.75);
		p1.setNome("Nestor");
		p1.setIdade(28);
		
		((Funcionario)p1).setCpf("12345678901");
		((Funcionario)p1).setCargo("Atendente");
		((Funcionario)p1).setSalario(3000);
		
		JOptionPane.showMessageDialog(null, p1.exibir());
//		Funcionario f1 = (Funcionario)p1;
//		f1.setCpf("12345678901");
//		f1.setCargo("Atendente");
//		f1.setSalario(3000);
	}
}















