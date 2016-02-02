package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _10_aula13 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que peça a temperatura em graus Celsius,
		 * transforme e mostre em graus Farenheit. 
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		double temCel = meu.nextDouble();
		
		double fire = temCel  * 1.8 + 32;
		System.out.println(fire + " F");
		
	}

}
