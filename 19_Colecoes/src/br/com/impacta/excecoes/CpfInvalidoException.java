package br.com.impacta.excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CpfInvalidoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public CpfInvalidoException() {
		super();
	}
	
	public CpfInvalidoException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
		Date data = new Date();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		return "[" + df.format(data) + "] - " + super.getMessage();
	}
}







