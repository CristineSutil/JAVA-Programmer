package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.FuncionarioPublico;
import br.com.impacta.enumeracoes.Sexo;

public class AppFuncionarioPublico {

	public static void main(String[] args) {
		try {
			FuncionarioPublico funcionariopublico = new FuncionarioPublico(Sexo.MASCULINO,60, -1.75);
			JOptionPane.showMessageDialog(null, funcionariopublico.exibir());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
}
}
