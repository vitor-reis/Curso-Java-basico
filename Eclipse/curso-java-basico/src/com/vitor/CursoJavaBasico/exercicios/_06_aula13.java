package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _06_aula13 {

	public static void main(String[] args) {
		
		/*
		 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14;
		
		System.out.println("Insira o Raio do circulo");
		double raio = scan.nextDouble();
		
		double resultado = raio * raio * pi;
		
		System.out.println("A Área do circulo é: " + resultado + " quadrados");
		
		
		
	}

}
