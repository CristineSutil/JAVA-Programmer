package br.com.impacta.classes;

public class AppAutomovel {
	public static void main(String[] args) {
		
		Automovel auto1 = new Automovel();
		auto1.marca = "Ford";
		auto1.modelo = "Fiesta";
		auto1.ano = 2018;
		
		System.out.println("auto1");
		System.out.println("marca " + auto1.marca);
		System.out.println("modelo: " + auto1.modelo);
		System.out.println("ano: " + auto1.ano);
		System.out.println("------------");
		
		Automovel auto2 = new Automovel();
			auto2.marca = "VW";
			auto2.modelo = "Fusca";
			auto2.ano = 1970;
			
			System.out.println("auto2");
			System.out.println("marca " + auto2.marca);
			System.out.println("modelo: " + auto2.modelo);
			System.out.println("ano: " + auto2.ano);
			System.out.println("------------");
		
		Automovel auto3 = auto2;
		auto3.ano = 2019;
		
			System.out.println("auto2");
			System.out.println("marca " + auto2.marca);
			System.out.println("modelo: " + auto2.modelo);
			System.out.println("ano: " + auto2.ano);
			System.out.println("------------");
	
		
		auto1 = null;
//			System.out.println("auto1");
//			System.out.println("marca " + auto1.marca);
//			System.out.println("modelo: " + auto1.modelo);
//			System.out.println("ano: " + auto1.ano);
//			System.out.println("------------");
//		
		
	}
}
