package br.com.impacta.programa;

public class NumerosAleatorios {
public static void main(String[] args) {
	double numero = Math.random(); //]0, 1[
	System.out.println(numero);
	
	//* numeros aleatorios serve para senhas de cartão de credito como exemplo.
		
	double numero2 = Math.random() *100;
	System.out.println(numero2);
	
	int numero3 =(int)(Math.random() * 30);
	System.out.println(numero3);
	System.out.println("---------------");
	
	for (int i = 0; i < numero3; i++) {
		int n = (int)(Math.random()* 100);
		if(n > 50) {
			System.out.println(n);
		}
	}
	
}
}
