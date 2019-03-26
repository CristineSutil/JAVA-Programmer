package br.com.impacta.aplicacao;

import java.util.Arrays;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;


public class AppArrayRetangulos {
public static void main(String[] args) {
	
	//Lista 01
	Retangulo[] retangulos1 = new Retangulo[4];
	retangulos1[0] = new Retangulo(1.5,2.5);
	retangulos1[1] = new Retangulo(3,3);
	retangulos1[2] = retangulos1[0];
	
	System.out.println("Elementos da Lista 01: ");
	for (Retangulo retangulo : retangulos1) {
		if (retangulo != null) {
			System.out.println(retangulo.exibirFigura());
		}		
	}
		
	//Lista 02
	
	Retangulo[] retangulo2 = { 
			new Retangulo(2,3),
			new Retangulo(3,7),
			new Retangulo(2.5, 3.6), 
			retangulos1[1] };
	System.out.println("\nElementos da Lista 02:");
	for (Retangulo retangulo : retangulo2) {
		if (retangulo != null) {
			System.out.println(retangulo.exibirFigura());		
			
			Arrays.sort(retangulo2);
		}
	}
		
	//Lista 03
	Figura[] figuras  = new Figura[3];
	figuras[0] = new Retangulo(2, 2);
	figuras[1] = new Circulo(3);
	figuras[2] = new Circulo(1);
	
	System.out.println("\nElementos da Lista 03:");
	for (Figura figura : figuras) {
		if (figura != null) {
			System.out.println(figura.exibirFigura());
		}
	}
}
}
