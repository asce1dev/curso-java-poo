package com.algaworks.curso.fjoo.imc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Essa classe e util para fazer o calculo do IMC 
 * O IMC e baseado no peso e altura da pessoa.

 * @author Alan
 */

public class CalculoIMC {

	/**
	 * O metodo principal faz o calculo do IMC
	 * 
	 * @param args Recebe a entrada de dados da linha de comando
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("00.0");
		
		imprimir("Digite seu peso: ");
		double peso = scanner.nextDouble();
		
		imprimirEspaco();
		imprimir("Digite a sua altura: ");
		double altura = scanner.nextDouble();
		imprimirEspaco();
		
		double imc = calcularIMC(peso, altura);
		
		imprimir("O seu imc e igual a: " + formatador.format(imc));
		
		scanner.close();
	}
	// Metodos
	private static void imprimirEspaco() {
		
	}
	/**
	 * O metodo calcularIMC divide o valor de peso pelo valor da altura ao quadrado.
	 * @param peso
	 * @param altura
	 * @return
	 */
	private static Double calcularIMC(Double peso, Double altura) {
		Double imc = peso / (altura * altura);
		return imc;
	}
	
	public static void imprimir(String texto) {
		System.out.println(texto);
	}
	
}
