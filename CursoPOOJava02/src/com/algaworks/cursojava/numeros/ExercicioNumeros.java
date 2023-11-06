package com.algaworks.cursojava.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioNumeros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um valor para que seja aplicado o desconto de 10%: ");
		Double valorDouble = scanner.nextDouble();
		
		System.out.println("\nO valor " + valorDouble + " com o desconto de 10% aplicado"
				+ " e igual a:");
		BigDecimal bg = new BigDecimal(valorDouble);
		bg = bg.multiply(BigDecimal.TEN);
		bg = bg.divide(BigDecimal.valueOf(100));
		
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		
		System.out.println("\n" + formatador.format(bg));
		
		
		
		
		
		
		
		scanner.close();
	}
}
