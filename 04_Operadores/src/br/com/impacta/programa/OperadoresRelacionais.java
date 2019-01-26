package br.com.impacta.programa;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		//operadores relacionais produzem resultados booleanos
		int x = 10, y = 10;
		
		boolean b1 = (x == y); 		// b1 = true
		boolean b2 = (x++ > y);		// b2 = false, x=11,	y=10
		boolean b3 = (--y < x--);	// b3 = true,  x=10,	y=9
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
	}
}
