package br.com.impacta.excecoes;

import javax.swing.JOptionPane;

public class AppExcecoes02 {
	
	//usando o bloco try com multiplos blocos catch
	
	public static void main(String[] args) {
		try {
			String nome = JOptionPane.showInputDialog("seu nome:");
			System.out.println("Nome:" + nome.toUpperCase());
			
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua Idade:"));
				System.out.println("idade: " + idade);
					
				}catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
				}catch(NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());	
			}
}
}
