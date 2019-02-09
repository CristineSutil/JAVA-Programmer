package br.com.impacta.programa;

import javax.swing.JOptionPane;

public class AdivinhaNumero {
	public static void main(String[] args) {
		/*
		 * 1.O programa gera um numero aleatorio de (0 a 100)
		 * 2. Iterativamente, o usuario é solicitado informar um número 
		 * 3. se o usuario informar um valor menos que o numero gerado, o programa 
		 * devera resposnder:
		 * "Informe o Número maior "
		 * 4. caso contrario , se o usuario formecer um valor acima do numero gerado
		 * o programa devera responder:
		 * "Informe um numero menor"
		 * 5. quando for informado um valor igual ao que o programa gerou, o programa deve responder:
		 * "Voce acertou em N tentativa"
		 * 
		 */
		//geração de um numero aleatorio
		
		int numero = (int)(Math.random() * 100);
		
		//variavel representanto numero tentativas 
		int tentativas = 0;
		
		//valor minimo e maximo de tentativa
		int min = 0, max = 100;
		
		while(true) {
			tentativas++;
			//obtendo o valor do usuario
			
			int valor = Integer.parseInt(
				JOptionPane.showInputDialog("Informa um número entre " + min + " e" + max));
			
			//validar o valor informado
			if(valor < min || valor > max) {
				continue;
			}
			
			//se o valor informado for menor que o aleatorio (gerado)
			if(valor > numero){
				min = valor + 1;
			}else if (valor > numero) {
				max = valor -1;
			}else {
				break;//aqui, o usuario acertou
			}
		}
		JOptionPane.showMessageDialog(null,"Voce acertou em " + tentativas + " tentativas");
	}
	
	
}
