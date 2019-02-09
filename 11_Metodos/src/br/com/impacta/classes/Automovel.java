package br.com.impacta.classes;

public class Automovel {
	private String marca;
	private String modelo;
	private int ano;
	
	public void atribuir(String ma, String mo, int a){
		marca = ma;
		modelo = mo;
			if(a < 0) {
				ano =0;
			}else {
				ano = a;
		}
		
	}
	
	public void mostrar() {
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
	}
		
}
