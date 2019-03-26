package br.com.impacta.excecoes;

import javax.swing.JOptionPane;

public class AppExcecoes03 {
	
	//podemos ter varios blocos Catch() incluindo o bloco que captura Exception. Neste caso, temos que ser 
	//cuidadosos para que uma exceção reresentando uma superclasse (exception) não capture as
	// exceções da spossiveis subclassses
	
 public static void main(String[] args) {
	
			try {
				String nome = JOptionPane.showInputDialog("seu nome:");
				System.out.println("Nome:" + nome.toUpperCase());
				
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua Idade:"));
					System.out.println("idade: " + idade);
					
				int divisao = 10 / idade;
				System.out.println("Divisão:" + divisao);
						
					}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Erro de conversão: " + e.getMessage());
					}catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Erro de referencia nula: " + e.getMessage());	
					}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Erro Geral" + e.getMessage());
					}
}
}
