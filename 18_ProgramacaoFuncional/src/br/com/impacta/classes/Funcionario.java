package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.excecoes.CpfInvalidoException;
import br.com.impacta.excecoes.SalarioInvalidoException;

public class Funcionario extends Pessoa {
	
	private String cpf;
	private String cargo;
	private double salario;
	
	public Funcionario(Sexo sexo, double peso, double altura) 
			throws Exception {
		super(sexo, peso, altura);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf == null || cpf.length() != 11) {
			throw new CpfInvalidoException("O CPF deve ter 11 dígitos");
		}
		this.cpf = cpf;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) throws SalarioInvalidoException {
		if(salario < 1000) {
			throw new SalarioInvalidoException("O salário deve ser de R$ 1.000,00 no mínimo");
		}
		this.salario = salario;
	}
	
	@Override
	public String exibir() {
		String resultado = super.exibir() + "\nDADOS DO FUNCIONARIO" +
						   "\nCpf: " + this.getCpf() +
						   "\nCargo: " + this.getCargo() +
						   "\nSalario: " + this.getSalario();
		
		return resultado;
	}
	
}










