package br.com.impacta.programa;

public class OperadorAdicao {
	public static void main(String[] args) {
		String curso = "Java";
		int ch = 100;
		int sabados = 13;
		
		System.out.println("Curso: " + curso + "\nCH: " + ch + '\n' + sabados + " sábados");
		
		
		int capitulos_ap1 = 10;
		int capitulos_ap2 = 9;
		
		//TUDO o que for somado com String, vira String
		System.out.println("Num. Capitulos: " + (capitulos_ap1 + capitulos_ap2));
		System.out.println(capitulos_ap1 + capitulos_ap2);
		
		int a = 10, b = 10, c = 10, d = 10;
		
		String resposta = a + b + "Soma: " + c + d;		
		System.out.println(resposta);
		
	}
}








