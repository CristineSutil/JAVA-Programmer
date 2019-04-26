package br.com.impacta.aplicacao;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Curso;

public class AppBuscaCurso {

	static Map<String, Curso> mapCurso = new HashMap<>();

	public static void main(String[] args) {
		carregarCursos();
		
		String matricula = JOptionPane.showInputDialog("Digite o n�mero de matricula:");
		
		Curso cursoSelecionado = mapCurso.get(matricula);

		if (cursoSelecionado != null) {
			exibir(cursoSelecionado);
		} else {
			JOptionPane.showMessageDialog(null, "Curso n�o encontrado!", 
								"Falha", JOptionPane.ERROR_MESSAGE);
		}
	}

	private static void carregarCursos() {

		Curso c0 = new Curso("Hist�ria da Arte", 40, 765.45);
		Curso c1 = new Curso("Cinema e Pol�tica", 25, 234.51);
		Curso c2 = new Curso("Express�o Verbal", 60, 1013.44);
		Curso c3 = new Curso("Estrutura de Dados", 80, 1500.02);
		Curso c4 = new Curso("Algoritmos", 88, 1865.98);
		Curso c5 = new Curso("Bases da Economia", 44, 812.55);
		Curso c6 = new Curso("Matem�tica Financeira", 140, 2200.87);
		Curso c7 = new Curso("Reiki n�vel 1", 16, 334.56);
		Curso c8 = new Curso("Astrologia B�sica", 100, 888.88);
		Curso c9 = new Curso("Dire��o Defensiva", 25, 356.65);

		mapCurso.put("100", c0);
		mapCurso.put("101", c1);
		mapCurso.put("220", c2);
		mapCurso.put("201", c3);
		mapCurso.put("300", c4);
		mapCurso.put("301", c5);
		mapCurso.put("331", c6);
		mapCurso.put("401", c7);
		mapCurso.put("411", c8);
		mapCurso.put("444", c9);

	}
	
	private static void exibir(Curso curso) {
		String resposta = "Curso: " + curso.getDescricao() + "\n" +
				"Carga Hor�ria: " + curso.getCargaHoraria() + "\n" +
				"Pre�o: " + String.format("R$ %.2f",curso.getPreco());

		JOptionPane.showMessageDialog(null, resposta);
	}



}
