package br.com.impacta.programa;

public class OperadorIncrementoDecremento {
	public static void main(String[] args) {
		
		int x = 10;
		x++;	//x = 11;
		x--;	//x = 10;
		
		++x;	//x = 11;
		--x;	//x = 10
		System.out.println("x: " + x);
		System.out.println("-------------");
		
		int y = x++;	//y = 10, 	x = 11
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("-------------");
		
		int j = ++y;	//j = 11,	y = 11
		System.out.println("j: " + j);
		System.out.println("y: " + y);
	}
}








