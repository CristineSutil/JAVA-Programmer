package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.enumeracoes.MesesAno;

public class DiasRestantes01 {
	public static void main(String[] args) {
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
		int[] meses = {31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		MesesAno ma = (MesesAno) JOptionPane.showInputDialog(null, "Selecione o mês", "Meses", JOptionPane.QUESTION_MESSAGE, null, MesesAno.values(), MesesAno.MARÇO);
			
		int mes = ma.ordinal();
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
		if(dia < 1 || dia > meses[mes]) {
			JOptionPane.showMessageDialog(null, "Dia invalido para o mês informaod");
			return;
		}
		
		int diasRestantes = meses[mes] - dia;
		for (int i = mes + 1; i < meses.length; i++) {
			diasRestantes += meses[i];
			
		}
		JOptionPane.showMessageDialog(null, "Restam " + diasRestantes + "dias");
	}
	}

