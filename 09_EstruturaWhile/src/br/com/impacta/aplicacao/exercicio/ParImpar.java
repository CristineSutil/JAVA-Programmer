package br.com.impacta.aplicacao.exercicio;

import javax.swing.JOptionPane;

public class ParImpar {
	public static void main(String[] args) {
		while(true) {
			int numero = Integer.parseInt(
					JOptionPane.showInputDialog("Informe o Numero"));
			
			if(numero == 0) {
				break;
				}
			if(numero < 0) {
				continue;
			}
			
			if(numero % 2 ==0){
			JOptionPane.showMessageDialog(null, "Numero par informado");
			
			}else JOptionPane.showMessageDialog(null,"Numero impar informado");
			
		}
			
			
	}
	
}

