package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class Bilheteria {
public static void main(String[] args) {
	/*
	 * Em um evento, o valor do bilhete é cobrado da seguinte forma:
	 * - se o participante tiver ate 5 anos, não paga nada
	 * - Se ele tiver acima de 5 anos até 17: paga R$20,00
	 * - Acima de 17 ate 59 anos, paga R$ 40,00
	 * - Acima de 59 anos, paga R4 15,00
	 * 
	 * Escreva um programa que solicite o nome e a idade do participante.
	 * 
	 * o programa deve mostrar:
	 * - O nome do participante
	 * - A idade 
	 * - O valor do bilhete.
	 * 
	 */
	
	String nome = JOptionPane.showInputDialog("Nome do participante");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do participante"));
	
	double bilhete;
	if (idade <= 5) {
		//R$ 0,00
		bilhete = 0;
		
		}else if(idade > 5 && idade >= 17) {
			//R$ 20,00
			bilhete = 20;	
			
		}else if(idade > 17 && idade >= 59) {
			//R$ 40,00
			bilhete = 40;	
			
		}else{
			//R$15,00
			bilhete = 15;			
		}
	
	String resposta = "Nome do participante: " + nome + "\nIdade do participante: " + idade + "\nValor do Bilhete: " + bilhete;
	JOptionPane.showMessageDialog(null,resposta);
		
}
}
