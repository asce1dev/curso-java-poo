package com.algaworks.curso.teste;

public class Teste {

	public static void main(String[] args) {
		long posicao = 5;
		long valor = Fibonacci.calcula(posicao);
		
		System.out.println("F(" + posicao + ") = " + valor);
	}
}
