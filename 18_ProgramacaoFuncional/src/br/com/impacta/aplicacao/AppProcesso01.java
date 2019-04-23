package br.com.impacta.aplicacao;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.parseDouble;

import br.com.impacta.interfaces.Processo01;

public class AppProcesso01 {
	public static void main(String[] args) {
		//double processar();
		
		Processo01 p1 = () -> Math.random() * 100;
		System.out.println(p1.processar());
		
		Processo01 p2 = () -> Math.PI;
		System.out.println(p2.processar());
		
		Processo01 p3 = () -> parseDouble(showInputDialog("Peso?")) / 
				Math.pow(parseDouble(showInputDialog("Altura?")), 2);
		System.out.println(p3.processar());
	}
}








