package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		//pessoa1
		Pessoa pessoa1 = new Pessoa(Sexo.MASCULINO, 75, 1.8);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av Paulista");
		endereco.setNumero(1009);
		endereco.setCidade("São Paulo");
		
		pessoa1.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
		//pessoa2
		Pessoa pessoa2 = new 
			Pessoa("Antenor", 30, Sexo.MASCULINO, 80, 1.8, endereco);
		
		JOptionPane.showMessageDialog(null, pessoa2.exibir());

	}
}













