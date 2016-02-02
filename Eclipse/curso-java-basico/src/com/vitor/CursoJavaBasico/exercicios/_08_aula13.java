package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _08_aula13 {

	public static void main(String[] args) {

		/*
		 * Faça um Programa que pergunte quanto você 
		 * ganha por hora e o número de horas trabalhadas no mês. 
		 * Calcule e mostre o total do seu salário no referido mês. 
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = meu.nextDouble();
		System.out.println("Quantas horas você trabalhou mês passado?");
		double horasTrab = meu.nextDouble();
		
		double resultado = valorHora * horasTrab;
		
		System.out.println("Seu sálario mês passado foi de " + resultado + " Reais");
		
	}

}
