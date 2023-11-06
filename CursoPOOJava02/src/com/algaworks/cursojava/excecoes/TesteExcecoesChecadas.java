package com.algaworks.cursojava.excecoes;

public class TesteExcecoesChecadas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(100);
		
		try {
		cc.sacar(60);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Operacao nao realizada, saldo insuficiente");
		}
		System.out.println("Saldo atual: " + cc.getSaldo());
		
		try {
		cc.sacar(50);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Operacao nao realizada, saldo Insuficiente");			
		}
		System.out.println("Saldo atual: " + cc.getSaldo());
	}
}
