package br.com.impacta.programa;

import br.com.impacta.classes.exercicios.Imovel;

public class AppImovel {
 public static void main(String[] args) {
	 
	Imovel imovel1 = new Imovel();
	imovel1.desc = "Apto";
 	imovel1.area = 150;
 	imovel1.end = "Avenida Paulista";
 	
 	//String resposta = "Descrição: " +imovel1.desc + "\nArea: " + imovel1.area + "\nEndereco: " + imovel1.end;
 	
	Imovel imovel2 = new Imovel();
	imovel2.desc = "Casa";
 	imovel2.area = 100;
 	imovel2.end = "Avenida Paulista";
 	
	System.out.println("Imovel 1");
	System.out.println("Tipo " + imovel1.desc);
	System.out.println("Area " + imovel1.area);
	System.out.println("Endereço " + imovel1.end);
	System.out.println("------------");
	
	System.out.println("Imovel 2");
	System.out.println("Tipo " + imovel2.desc);
	System.out.println("Area " + imovel2.area);
	System.out.println("Endereço " + imovel2.end);
	System.out.println("------------");
		 
}
}
