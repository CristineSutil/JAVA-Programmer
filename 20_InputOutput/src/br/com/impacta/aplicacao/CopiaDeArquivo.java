package br.com.impacta.aplicacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class CopiaDeArquivo {
	
	public static void main(String[] args) {
		
		System.out.println("Copiando um arquivo para outro");
		try {
			copiar("teste.txt", "copiaDoTeste.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Arquivo copiado com sucesso");
	}

	private static void copiar(String arquivo1, String arquivo2) throws IOException {
		
		//Associando o FileInputStream ao Scanner
		Scanner scan = new Scanner(new FileInputStream(arquivo1));
		//Associando o FileOutputStream ao PrintStream
		PrintStream ps = new PrintStream(new FileOutputStream(arquivo2));
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			ps.println(linha);
		}
		
		scan.close();
		ps.flush();
		ps.close();
	}
	
	
	
	
	

}
