package br.com.impacta.aplicacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class AppInputBasico {
	
	public static void main(String[] args) {
		
		try {
			InputStream input = System.in;//new FileInputStream("teste.txt");
			int byteLido = input.read(); 
			while(byteLido != -1) {
				System.out.print((char) byteLido);
				byteLido = input.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
