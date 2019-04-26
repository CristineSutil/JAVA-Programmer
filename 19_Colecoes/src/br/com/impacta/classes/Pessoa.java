package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private Sexo sexo;
	private double peso;
	private double altura;
	private Endereco endereco;

	// construtores
	public Pessoa(Sexo sexo, double peso, double altura) throws Exception {
		super();
		this.setSexo(sexo);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setNome("não informado");
	}

	public Pessoa(String nome, Sexo sexo, double peso, double altura) throws Exception {
		this(sexo, peso, altura);
		this.setNome(nome);
	}

	public Pessoa(String nome, // nome da pessoa
			int idade, // idade da pessoa
			Sexo sexo, // Sexo, que é um enum
			double peso, // peso da pessoa, e deve ser positivo
			double altura // altura da pessoa, positiva
	) throws Exception {
		this(nome, sexo, peso, altura);
		this.setIdade(idade);
	}

	public Pessoa(String nome, int idade, Sexo sexo, double peso, double altura, Endereco endereco) throws Exception {

		this(nome, idade, sexo, peso, altura);
		this.setEndereco(endereco);
	}

	// getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().length() == 0) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade inválida");
		}

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
		if (peso <= 0) {
			throw new IllegalArgumentException("O peso deve ser positivo");
		}
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws Exception {

		try {
			if (altura <= 0) {
				throw new Exception("A altura deve ser positiva");
			}
			this.altura = altura;
		} catch (Exception e) {
			e.initCause(new NumberFormatException(
					"O valor \"" + altura + "\" é inválido para este objeto"));
			throw e;
		}
	}

	
	
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereço inválido");
		}
		this.endereco = endereco;
	}

	public String exibir() {
		String resultado = "DADOS DA PESSOA" + "\n\nNome: " + this.getNome() + "\nIdade: " + this.getIdade()
				+ "\nSexo: " + this.getSexo() + "\nPeso: " + this.getPeso() + "\nAltura: " + this.getAltura() + "\n\n"
				+ (this.getEndereco() == null ? "Endereço não informado"
						: this.getEndereco().exibir("MEUS PROPRIOS DADOS"));

		return resultado;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Pessoa pessoa) {
		//return this.getNome().compareTo(pessoa.getNome());
		
		if(this.getPeso() > pessoa.getPeso()) {
			return 1;
		}else if(this.getPeso() < pessoa.getPeso()) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	

	
	
	
	
	
	
	
	

}
