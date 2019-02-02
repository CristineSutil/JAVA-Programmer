package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class DescontoMensalidade {
public static void main(String[] args) {
	/*
	 * em uma escola , o desconto na mensalidade ocorre da seguinte forma:
	 * - existem dois periodos , se o peridodo for diurno, haverá um desconto de 10%
	 * - alem disso, se a media final do aluno for superior a 9, havera um desconto de 15%
	 * - os descontos sãop cumulativos 
	 * 
	 * escreva  um programa que solicite:
	 * - o periodo do aluno (1- diurno, 2- noturno)
	 * - o valor da mensalidade
	 * - a media final
	 * 
	 * em seguida, apresente:
	 * - o valor da mensalidade
	 * - o valor do desconto
	 * - a mensalidade final
	 * 
	 */
	
	int periodo = Integer.parseInt(JOptionPane.showInputDialog("Periodo (1 ou 2)"));
	double mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Valor da mensalidade"));
	double media = Double.parseDouble(JOptionPane.showInputDialog("Media final"));
	
	double desconto = 0;
	
	if(periodo ==1) {
		desconto = mensalidade * 0.1;
	}
	
	if(media > 9) {
		desconto += mensalidade * 0.15;
	}
	
	String resposta = "Mensalidade original: " + mensalidade + "\nDesconto: " + desconto + "\nMensalidade final: " + (mensalidade - desconto);
	JOptionPane.showMessageDialog(null,resposta);
	
}



}
