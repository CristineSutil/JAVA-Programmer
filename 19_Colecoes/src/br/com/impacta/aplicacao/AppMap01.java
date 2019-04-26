package br.com.impacta.aplicacao;

import java.util.Map;
import java.util.TreeMap;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppMap01 {
	
	public static void main(String[] args) throws Exception {

		Pessoa p1 = new Pessoa("Otto", Sexo.MASCULINO, 67.3, 1.71);
		Pessoa p2 = new Pessoa("Patricia", Sexo.FEMININO, 51.8, 1.63);
		Pessoa p3 = new Pessoa("Basilio", Sexo.MASCULINO, 75.2, 1.75);
		Pessoa p4 = new Pessoa("Amanda", Sexo.FEMININO, 49.5, 1.57);
		Pessoa p5 = new Pessoa("Joanna", Sexo.FEMININO, 73.1, 1.80);
		Pessoa p6 = new Pessoa("Romulo", Sexo.MASCULINO, 88.3, 1.92);
		Pessoa p7 = new Pessoa("Camila", Sexo.FEMININO, 56.7, 1.52);
		
		//definindo uma instancia de map
		Map<String,Pessoa> mapCpfPessoa = new TreeMap<>();
		
		//adicionando as "tuplas" sendo a chave o cpf da pessoa
		mapCpfPessoa.put("777.777.777-77",p1);
		mapCpfPessoa.put("333.333.333-33",p2);
		mapCpfPessoa.put("666.666.666-66",p3);
		mapCpfPessoa.put("111.111.111-11",p4);
		mapCpfPessoa.put("444.444.444-44",p5);
		mapCpfPessoa.put("888.888.888-88",p6);
		mapCpfPessoa.put("111.111.111-11",p7);
		
		//exibir toda estrutura map
		mapCpfPessoa.forEach( (k,v) -> System.out.printf("%s : %s \n",k,v.getNome()));
		
		//recuperando uma pessoa específica pela chave
		System.out.println("--- Recuperando pessoa com cpf 444.444.444-44 ---");
		Pessoa recPessoa = mapCpfPessoa.get("444.444.444-44");
		System.out.println("Nome da pessoa recuperada: " + recPessoa.getNome());
		
		//Listando todas as chaves  
		System.out.println("--- Lista de chaves do map ---");
		mapCpfPessoa.keySet().forEach(System.out::println);
		
		//Listando todos os valores isoladamente
		System.out.println("--- Lista de valores desassociados de sua chave ---");
		mapCpfPessoa.values().forEach(System.out::println);
		
	}

}
