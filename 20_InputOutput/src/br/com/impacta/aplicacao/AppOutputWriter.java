package br.com.impacta.aplicacao;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class AppOutputWriter {
	
	public static void main(String[] args) {
		
		try {
			
			OutputStream out = new FileOutputStream("saida2.txt");
			//Stream que converte bytes em caracter unicode 
			OutputStreamWriter osw = new OutputStreamWriter(out);
			//Stream que converte os caracteres em linhas de Texto
			BufferedWriter bw = new BufferedWriter(osw);
			
			bw.write("Primeira linha do arquivo");
			bw.newLine();
			bw.write("Segunda linha do arquivo");
			bw.newLine();
			bw.write("Terceira linha do arquivo");
			
			bw.flush();
			bw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
