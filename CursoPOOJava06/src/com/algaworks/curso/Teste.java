package com.algaworks.curso;

import com.algaworks.curso.modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Joao Silva", 3000);
		
		System.out.println(funcionario.adiantamentoViagem(5, true));
	}
}
