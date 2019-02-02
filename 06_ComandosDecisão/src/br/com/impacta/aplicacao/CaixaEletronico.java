package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class CaixaEletronico {
	public static void main(String[] args) {		
		//valores das cédulas - constantes
		final int c50 = 50;
		final int c20 = 20;
		final int c10 = 10;
		final int c5 = 5;
		
		//quantidades de cédulas por saque
		int q50, q20, q10, q5;
		q50 = q20 = q10 = q5 = 0;
		
		//valor do saque
		double valor = Double.parseDouble( JOptionPane.showInputDialog("Informe o valor do saque"));
		
		int valorSaque = (int)valor;
		if (valorSaque % 5 != 0) {
			JOptionPane.showMessageDialog(null,"valor invalido para saque");
			return;
			
			
		}
		
		q50 = valorSaque / c50; 
		valorSaque %= c50;
		
		q20 = valorSaque / c20;
		valorSaque %= c20;
		
		q10 = valorSaque / c10;
		valorSaque %= c10;
		
		q5 = valorSaque / c5;
		
		String resposta = "Valor do saque: " + valor +
						  "\nNotas de 50: " + q50 +
						  "\nNotas de 20: " + q20 +
						  "\nNotas de 10: " + q10 +
						  "\nNotas de 5:" + q5;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
