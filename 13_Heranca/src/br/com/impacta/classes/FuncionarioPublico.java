package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Categoria;
import br.com.impacta.enumeracoes.Sexo;

public class FuncionarioPublico extends Funcionario {
	private Categoria categoria;

	public FuncionarioPublico(Sexo sexo, double peso, double altura) {
		super(sexo, peso, altura);
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String exibir() {
		return super.exibir() + "\n" + this.getCategoria();
	}
}
