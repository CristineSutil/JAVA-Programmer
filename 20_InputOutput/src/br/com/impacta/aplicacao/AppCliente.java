package br.com.impacta.aplicacao;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class AppCliente {
	
	public static void main(String[] args) {
		
		//Se conecta com app servidora no ip informado e porta 
		try {
			Socket cliente = new Socket(args[0],5555);
			ler(cliente);
			cliente.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void ler(Socket cliente) throws IOException {
		Scanner scan = new Scanner(cliente.getInputStream());
		while(scan.hasNextLine()) {
			System.out.printf("Servidor falou: %s \n",scan.nextLine());
		}
	}
}
