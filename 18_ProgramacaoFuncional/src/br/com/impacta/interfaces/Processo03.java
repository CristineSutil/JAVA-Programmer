package br.com.impacta.interfaces;

@FunctionalInterface
public interface Processo03<T> {
	T buscar(int x, T[] elementos);
}
