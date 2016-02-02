package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _09_aula13 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que peça a temperatura em graus Farenheit, 
		 * transforme e mostre a temperatura em graus Celsius. 
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit");
		double temFare = meu.nextDouble();
		
		double celsius = (temFare - 32) / 1.8;
		
		System.out.println(celsius + "°C");
		
	}

}

