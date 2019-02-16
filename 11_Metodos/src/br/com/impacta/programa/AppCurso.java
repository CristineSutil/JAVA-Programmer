package br.com.impacta.programa;

import javax.swing.JOptionPane;

import br.com.impacta.classes.exercicios.Curso;

public class AppCurso {
	public static void main(String[] args) {
 
		
		Curso curso = new Curso();
		String descricao = (JOptionPane.showInputDialog("Nome do Curso"));
		int ch = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária"));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
		
		curso.atribuir(descricao, ch, preco);
	
		JOptionPane.showMessageDialog(null, curso.apresentar());
}
}
