package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class LeituraPositivos {
	public static void main(String[] args) {
		/*
		 * o usuario informa alguns numeros. 
		 * Enquanto ele informar um numero positivo, 
		 * o programa apresenta na tela o numero informado,
		 *  se ele informar 0 ou negativo, o programa é interrompido
		 */
		while(true) {
			int	numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um numero"));
			if(numero <= 0) {
				break;
			}
			System.out.println(numero);
		}
		System.out.println("-----Finalizado---");
	}
}
