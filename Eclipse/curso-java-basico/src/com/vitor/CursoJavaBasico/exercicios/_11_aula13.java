package com.vitor.CursoJavaBasico.exercicios;

public class _11_aula13 {

	public static void main(String[] args) {
		
		/*
		 *  Faça um Programa que peça 2 números inteiros e um número real. 
		 *  Calcule e mostre: 
		 *  	a. o produto do dobro do primeiro com metade do segundo. 
		 *  	b. a soma do triplo do primeiro com o terceiro. 
		 *  	c. o terceiro elevado ao cubo. 
		 */
		
		int number1 = 8;
		int number2 = 9;
		double number3 = 4.5;
		
		double resultadoA = (2 * number1) + (number2 / 2);
		double resultadoB = (3 * number1) + number3;
		double resultadoC = number3 * number3 * number3;
		
		System.out.println("A: " + resultadoA);
		System.out.println("B: " + resultadoB);
		System.out.println("C: " + resultadoC);

	}

}
