package br.com.impacta.excecoes;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SalarioInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public SalarioInvalidoException() {
		super();
	}
	
	public SalarioInvalidoException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
	
		InetAddress address;
		String endereco = "Desconhecido";
		try {
			address = InetAddress.getLocalHost();
			endereco = address.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		return "[" + endereco + "] - " + super.getMessage();
	}
	
	
}
