package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class VariaveisString {
	public static void main(String[] args) {
		String nome = "Cristine Hoff Sutil";
		String email = "cristinesutil@hotmail.com";
		String curso =
				"curso: \"Java programmer\"\nCarga Horária: '100 horas'";
		
		String resposta ="Nome: " + nome +
				"\nEmail: " + email +
				'\n' + curso;
		
		//como concatenar tudo junto num mesmo local
		System.out.println(resposta);
		JOptionPane.showMessageDialog(null, resposta);
		
		
	}
	
	
	
}
