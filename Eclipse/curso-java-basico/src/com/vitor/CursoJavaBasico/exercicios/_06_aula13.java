package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _06_aula13 {

	public static void main(String[] args) {
		
		/*
		 * Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double pi = 3.14;
		
		System.out.println("Insira o Raio do circulo");
		double raio = scan.nextDouble();
		
		double resultado = raio * raio * pi;
		
		System.out.println("A �rea do circulo �: " + resultado + " quadrados");
		
		
		
	}

}
