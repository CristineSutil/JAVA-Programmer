package br.com.impacta.programa;

public class OperadoresLogicos {
	public static void main(String[] args) {
		
		int x = 10, y = 15;
		
		boolean b1 = (x < y && y < 20);		//b1 = true
		boolean b2 = (x > 10 && --y > 0);	//b2 = false, x = 10 , y = 15
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("-------------------");
		
		boolean b3 = (++x == 10 || y-- == 15);	//b3=true ,x=11 ,y=14
		System.out.println("b3 = " + b3);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("-------------------");		
	}
}




