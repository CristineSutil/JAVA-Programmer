package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		//pessoa1
		Pessoa pessoa1 = new Pessoa(Sexo.MASCULINO, 75, 1.8);				
		Endereco endereco = new Endereco("Av Paulista", 1009, "São Paulo");	
		pessoa1.setEndereco(endereco);
		
		//alterando a idade de pessoa1:
		pessoa1.setIdade(25);
				
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
		//pessoa2
		Pessoa pessoa2 = new 
			Pessoa("Antenor", 30, Sexo.MASCULINO, 80, 1.8, 
				new Endereco("Al Santos", 954, "SP"));
		
		//alterando o numero do endereço de pessoa2
		pessoa2.getEndereco().setNumero(94);
		
		JOptionPane.showMessageDialog(null, pessoa2.exibir());

	}
}













