package br.com.impacta.excecoes;

import javax.swing.JOptionPane;

public class AppExcecoes {
	public static void main(String[] args) {
		try {
	String nome = JOptionPane.showInputDialog("seu nome:");
	System.out.println("Nome:" + nome.toUpperCase());
	
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua Idade:"));
		System.out.println("idade: " + idade);
			
		}catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		
		}
	}
}