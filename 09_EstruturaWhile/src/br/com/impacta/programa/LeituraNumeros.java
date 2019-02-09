package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class LeituraNumeros {
	public static void main(String[] args) {
		/*
		 * o usuario informa varios numeros. apenas os numeros positivos 
		 * serão mostrados. Se um numero negativo for informado o programas
		 * o ignorará.
		 * o programa sera interrompido apenas se for informado o valor 0.
		 */
		
		while(true) {
			int	numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe um numero"));
			if(numero == 0) {
				break;
			}
			if(numero < 0) {
				continue;
			}
			System.out.println(numero);
		}
		System.out.println("-----Finalizado---");
	}
	}

