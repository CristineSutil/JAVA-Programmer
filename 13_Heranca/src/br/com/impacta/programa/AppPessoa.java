package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		//Objeto Funcionario, referencia Funcionario
		Funcionario func1 = new Funcionario(Sexo.MASCULINO, 65, 1.75);
		func1.setNome("Gerson");
		func1.setIdade(25);
		
		func1.setCpf("12344576500");		
		func1.setCargo("Motoboy");
		func1.setSalario(3000);
		
		//Objeto Pessoa, referencia Pessoa
		Pessoa pessoa = new Pessoa(null, 0, 0);
		pessoa.setNome("Andreia");
		pessoa.setIdade(89);
		
		JOptionPane.showMessageDialog(null, pessoa.exibir());
		
		//Objeto Funcionario, referencia Pessoa
		pessoa = func1;
		
		JOptionPane.showMessageDialog(null, pessoa.exibir());
		
	}
}




























