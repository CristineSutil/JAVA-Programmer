package br.com.impacta.aplicacao;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(5555);
			System.out.println("Aguardando conexões...");
			Socket socket = server.accept(); 
			System.out.printf("Conectado ao IP %s \n",socket.getInetAddress());
			escrever(socket, args[0]);
			server.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void escrever(Socket socket, String mensagem) throws IOException {
		PrintStream ps = new PrintStream(socket.getOutputStream());
		ps.println(mensagem);
		ps.flush();
		ps.close();
	}

}
