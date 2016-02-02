package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _05_aula13 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que converta metros para centímetros
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double cent = 100;
		
		System.out.println("Conversor de Metros em Centimetros");
		System.out.println("Digite o valor em metros : ");
		double hue = scan.nextDouble();
		
		System.out.println(hue * cent + " centimetros");
		
	}

}
