package br.com.impacta.aplicacao.exercicios;

import javax.swing.JOptionPane;

public class AnoVeiculo {
public static void main(String[] args) {
	/*
	 * Escreva um programa que solicite:
	 * - a marca
	 * -o modelo
	 * - o ano
	 * 
	 * de um veiculo. se o ano for inferior a 1999, não tera valor para IPVA .
	 * 
	 * alem disso, a marca e o modelo devem ser informados: se não o usuario receberá um mensagem e o programa será encerrado.
	 * 
	 * como resposta, mostrar na tela:
	 * a marca
	 * o modelo
	 * o ano
	 * se o IPVA sera ou não pago.
	 *  
	 */
	
	String marca = JOptionPane.showInputDialog("Marca do veiculo: ");
		if(marca == null || marca.trim().equals("")) {JOptionPane.showInputDialog(null, "marca invalida");
		return;
		}
		
	String modelo = JOptionPane.showInputDialog("Modelo do veiculo: ");
	if(marca == null|| modelo.trim().equals("")) { JOptionPane.showInputDialog(null, "modelo invalido");
	return;
	}
	
	int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do veiculo: "));
	
	boolean pago = ano <= 1999 ? false : true;
	
	// *if (ano <= 1999) {
	//*	pago = false;
	//}else {
	//	pago = true;
		
	String resposta = "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + (pago ? "paga IPVA" : "não Paga IPVA");
	
	JOptionPane.showMessageDialog(null,resposta);
	
	}
	
	}
	
	
