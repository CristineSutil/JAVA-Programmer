package br.com.impacta.programa;

import br.com.impacta.classes.exercicios.Imovel;

public class AppImovel {
	public static void main(String[] args) {
		
		Imovel imovel = new Imovel();
		imovel.setDescricao("Apartamento com janela nos quartos");
		imovel.setEndereco("Av Paulista, 1009");
		
		imovel.setArea(100);
		imovel.setPreco(500000);
		
		
		System.out.println("Descrição: " + imovel.getDescricao());
		System.out.println("Endereço: " + imovel.getEndereco());
		System.out.println("Preço: " + imovel.getPreco());
		System.out.println("Área: " + imovel.getArea());
		
	}
}
