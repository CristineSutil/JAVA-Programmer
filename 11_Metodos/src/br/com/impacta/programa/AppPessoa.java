package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Endereco;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {
 public static void main(String[] args) {
	Pessoa pessoa1 = new Pessoa();
	pessoa1.setNome(" Nestor");
	pessoa1.setIdade(40);
	pessoa1.setSexo(Sexo.MASCULINO);
	pessoa1.setAltura(1.8);
	pessoa1.setPeso(75);
	
	Endereco endereco = new Endereco();
	endereco.setLogradouro("Av Paulista");
	endereco.setNumero(1009);
	endereco.setCidade("São Paulo");
	
	pessoa1.setEndereco(endereco);
	
	JOptionPane.showMessageDialog(null, pessoa1.exibir());
	
 	}
}
