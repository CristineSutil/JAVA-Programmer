package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class MesesAnoIf {
public static void main(String[] args) {
	int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês (1 a 12"));
	
	if(mes < 1 || mes > 12) {
		JOptionPane.showMessageDialog(null, "Mês invalido");
		return;
	}
	
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
	
	int dias;
	
	if(mes == 1) {
		dias = 31;
	}else if(mes == 2) {
		dias = ano % 4 == 0 ? 29 : 28;
	}else if(mes == 3) {
			dias = 31;
	}else if(mes == 4) {
		dias = 30;
	}else if(mes == 5) {
		dias = 31;
	}else if(mes == 6) {
		dias = 30;
	}else if(mes == 7) {
		dias = 31;
	}else if(mes == 8) {
		dias = 31;
	}else if(mes == 9) {
		dias = 30;
	}else if(mes == 10) {
		dias = 31;
	}else if(mes == 11) {
		dias = 30;
	}else{
		dias = 31;
	}
	
	JOptionPane.showMessageDialog(null, "o mes informado possui " + dias + " dias");	
}
}
