package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class LeituraDadosPessoais {
	public static void main(String[] args) {
		
		//obtendo o nome de uma pessoa
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		
		//obtendo o CPF da pessoa
		String cpf = JOptionPane.showInputDialog("Informe seu CPF:");
		
		//int idade = JOptionPane.showInputDialog("Informe sua idade:");
		int idade = Integer.parseInt(
			JOptionPane.showInputDialog("Informe sua idade:"));
		
		double salario = Double.parseDouble(
			JOptionPane.showInputDialog("Informe seu sal�rio:"));
		
		//produzindo a resposta para o usu�rio
		double salarioBase = 3000;
		double imposto = 
				(salario <= salarioBase ? 
				salario * 0.1 : 
				(salario - salarioBase) * 0.15 + salarioBase * 0.1);		
				
		String resposta = "Nome informado: " + nome +
					      "\nCPF informado: " + cpf +
						  "\nIdade Informada: " + idade +
						  "\nSal�rio informado: " + salario +
						  "\nImposto: " + imposto;
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}













