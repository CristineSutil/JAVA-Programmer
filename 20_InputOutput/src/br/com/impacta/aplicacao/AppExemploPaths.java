package br.com.impacta.aplicacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppExemploPaths {
	
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\braulio\\Documents");

		//listando os paths do diretorio
		System.out.println("--- PATHS DOS ARQUIVOS DO DIRETORIO ---");
		path.forEach(System.out::println);
		
		//listando os caminhos completos de cada path
		System.out.println("\n--- PATHS COMPLETOS DOS ARQUIVOS DO DIRETORIO ---");
		path.forEach(p -> System.out.println(p.toAbsolutePath()));
		
		//Listando o diret�rio pai
		System.out.printf("\nDiret�rio pai: %s \n", path.getParent().toAbsolutePath());
		
		try {
			//Exemplo de m�todo envolvendo o utilitario Files
			Files.copy(path,Paths.get("c:\\Users\\braulio\\temp"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
