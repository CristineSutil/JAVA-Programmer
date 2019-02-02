package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class CalculoImposto {
public static void main(String[] args) {
	
	/*  -->>> exemplo = de objetos nulos - String curso = JOptionPane.showInputDialog("Curso");
	JOptionPane.showMessageDialog(null, curso.toUpperCase());*/
	
	
	/*
	 * SE um funcionario receber como salario um valor superior a 1000,00, ele tera um desconto de 10% sobre o que ultrapassar R4 100,00
	 * Escreva um programa que solicite o nome e o salaráio e apresente como resposta:
	 * -o nome
	 * -o salario
	 * -o valor de desconto
	 */
	
	String nome = JOptionPane.showInputDialog("Nome do Funcionário");
	double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
	
	if(nome == null || nome.equals("")) {
		JOptionPane.showMessageDialog(null,"o nome deve ser informado");
		return;
	} 
	
	
	double desconto;
	
	if (salario > 1000) {
		desconto = (salario - 1000) * 0.1;	
	} else	{
		desconto = 0;
	}
	
	String resposta = "Nome do Funcionário: " + nome + "\nSalário: " + salario + "\nDesconto: " + desconto;
	JOptionPane.showMessageDialog(null, resposta);
			
	
}

}
