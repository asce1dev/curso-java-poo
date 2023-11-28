package com.algaworks.curso.teste;

public class Fibonacci {

	public static long calcula(long posicao) {
		if (posicao == 0 || posicao == 1) {
		return posicao;	
		}
		
		long valor1 = calcula(posicao - 1); 
		long valor2 = calcula(posicao - 2);
		return valor1 + valor2;
	}

}
