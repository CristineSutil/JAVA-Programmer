package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa {

	private String nome;
	private int idade;
	private Sexo sexo;
	private double peso;
	private double altura;
	private Endereco endereco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String exibir() {
		String resultado = "DADOS DA PESSOA:" + 
				"\n\nNome" + this.getNome() +
				"\nIdade: " + this.getIdade() +
				"\nSexo: " + this.getSexo() +
				"\nPeso: " + this.getPeso() +
				"\nAltura: " + this.getAltura() +
				"\n\n: " + 
				(this.getEndereco() == null ? "Endereço não informado" : this.getEndereco().exibir());
		
		return resultado;
		
 	}
	
	
		
	
	
}
