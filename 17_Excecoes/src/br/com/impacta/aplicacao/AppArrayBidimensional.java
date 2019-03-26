package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppArrayBidimensional {
 public static void main(String[] args){
	 
	int [] [] tabela = new int[2][3];
	
	tabela[0][0] = 3;
	tabela[0][1] = 7;
	tabela[0][2] = 10;
	
	tabela[1][0] = 5;
	tabela[1][1] = 8;
	tabela[1][2] = 9;
	
	for (int i = 0; i < 2; i++) {// direção da linha
		for (int j = 0; j < 3; j++) {// colunas por linhas
			System.out.print(tabela[i][j] + "\t");
		}
		System.out.println();
	  }
	
	int[][] matriz = new int[3][];
	
	int[] array = {1,4,6,7,8};
	
	matriz [0] = array; // matriz[0] [5] elementos 
	matriz [1] = new int[] {2, 4, 6};
	matriz [2] = new int[] {0, 1, 0, 1};
	
	System.out.println("---------------");
	
		for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++){
			System.out.print(matriz[i][j] + "\t");
	}
	System.out.println();
		}
	
	
	
	
	}
}
