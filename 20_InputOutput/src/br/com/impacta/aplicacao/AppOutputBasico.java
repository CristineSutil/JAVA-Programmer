package br.com.impacta.aplicacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AppOutputBasico {
	
	public static void main(String[] args) {
		
		try {
			OutputStream out = System.out;//new FileOutputStream("saida.txt");
			out.write("Texto do arquivo".getBytes());
			out.flush(); //confirma a escrita da memoria para o arquivo
			out.close(); //fecha o arquivo
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
