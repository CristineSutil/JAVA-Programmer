package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class DiasRestantes {
	public static void main(String[] args) {
		/*
		 * Neste exercicio, o usuario informa: dia, mes e ano.
		 * o ano � usado para dterminar qtos dias tem no mes de fevereiro.
		 * 
		 * com base nestas informa��es, apresentar na tela quantos dias rest�o para terminar o ano.
		 * 
		 */
		
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		int[] meses = {31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o m�s"));
		if(mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null,"M�s Invalido");
			return;
		}
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
		if(dia < 1 || dia > meses[mes - 1]) {
			JOptionPane.showMessageDialog(null, "Dia invalido para o m�s informaod");
			return;
		}
		
		int diasRestantes = meses[mes - 1] - dia;
		for (int i = mes; i < meses.length; i++) {
			diasRestantes += meses[i];
			
		}
		JOptionPane.showMessageDialog(null, "Restam " + diasRestantes + "dias");
	}
}

