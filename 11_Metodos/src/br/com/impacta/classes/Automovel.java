package br.com.impacta.classes;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;
	
	public void atribuir(String marca, String modelo, int ano){
		this.marca = marca;
		this.modelo = modelo;
			if(ano < 0) {
				this.ano =0;
			}else {
				this.ano = ano;
		}
		
	}
	
//		public void mostrar() {
//		System.out.println("Marca: " + marca);
//		System.out.println("Modelo: " + modelo);
//		System.out.println("Ano: " + ano);
//	}
	
	// agora em diante � esse m�todo 
	
	public String retornar() {
		String resposta = "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAnop: " + this.ano;
		
		return resposta;
		
		
	}
		
}
