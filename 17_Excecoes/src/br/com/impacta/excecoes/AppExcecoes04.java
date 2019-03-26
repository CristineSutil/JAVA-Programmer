package br.com.impacta.excecoes;

import javax.swing.JOptionPane;

public class AppExcecoes04 {
	/*
	 * Se as providencais a serem tomadas quando as diversas 
	 * excecoes lancadas forem as mesmas é preferivel 
	 * que um unica exceção aseja lançada.
	 */
 public static void main(String[] args) {
	
	 try {
			String nome = JOptionPane.showInputDialog("seu nome:");
			System.out.println("Nome:" + nome.toUpperCase());
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua Idade:"));
				System.out.println("idade: " + idade);
				
			int divisao = 10 / idade;
			System.out.println("Divisão:" + divisao);
					
				
				}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro Geral" + e.getMessage());
				
				}
}
}
