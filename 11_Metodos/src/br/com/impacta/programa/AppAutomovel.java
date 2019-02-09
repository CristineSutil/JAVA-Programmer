package br.com.impacta.programa;

import br.com.impacta.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {
		
		
		Automovel automovel = new Automovel();
		automovel.atribuir("Ford", "Fusion", -2018);
		automovel.mostrar();
		
			
		//automovel.marca = "Ford";
		//automovel.modelo = "Fusion";
		//automovel.ano = 2018;
		
		//System.out.println(automovel.marca);
		//System.out.println(automovel.modelo);
		///System.out.println(automovel.ano);
		
	}
}
