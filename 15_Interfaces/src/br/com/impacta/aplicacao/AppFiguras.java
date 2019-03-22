package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppFiguras {
	public static void main(String[] args) {
		
		
		Retangulo r1 = new Retangulo(10, 5);
		JOptionPane.showMessageDialog(null, r1.exibirFigura());
		
		Figura r2 = new Retangulo(3, 2);
		JOptionPane.showMessageDialog(null, r2.exibirFigura());
		
		Circulo c1 = new Circulo(10);
		JOptionPane.showMessageDialog(null, c1.exibirFigura());
		
		Figura c2 = new Circulo(5);
		JOptionPane.showMessageDialog(null, c2.exibirFigura());
		
	}
}
