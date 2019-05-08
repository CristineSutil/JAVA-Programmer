package br.com.impacta.aplicacao;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppInputReader {

	public static void main(String[] args) {

		try {
			InputStream input = new FileInputStream("teste.txt");
			// Stream que converte bytes em caracter unicode (acima de 127)
			InputStreamReader isr = new InputStreamReader(input);
			// Stream que converte caracteres em linhas de texto
			BufferedReader br = new BufferedReader(isr);

			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
