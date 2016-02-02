package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _12_aula13 {

	public static void main(String[] args) {
	/*
	 * Tendo como dados de entrada a altura de uma pessoa, construa um 
	 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 
	 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Digite sua altura para saber seu peso ideal");
		double altura = meu.nextDouble();
		
		double resultado = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal é " + resultado);
		System.out.println("Obrigado");
		
	}

}
