package br.com.impacta.classes.exercicios;

public class Curso {
	
	private String descricao;
	private int carga_horaria;
	private double preco;


	public void atribuir(String descricao, int carga_horaria, double preco) {
		this.descricao = descricao;
		
		
		//sempre o IF se refere ao int
		
		
		if (carga_horaria < 4){
			this.carga_horaria = 4;
	}else{ 
		this.carga_horaria = carga_horaria;
	}

		if (preco < 0){
			this.preco = 0;
	}else{ 
		this.preco = preco;
	}
		}
	
		public String apresentar(){
			String result = "Descrição: " + this.descricao + "\nCarga Horária: " + this.carga_horaria + "\nPreço: " + this.preco;
			
			return result;
					
		}
	}
	
	
				
	
		
