package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _08_aula13 {

	public static void main(String[] args) {

		/*
		 * Fa�a um Programa que pergunte quanto voc� 
		 * ganha por hora e o n�mero de horas trabalhadas no m�s. 
		 * Calcule e mostre o total do seu sal�rio no referido m�s. 
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = meu.nextDouble();
		System.out.println("Quantas horas voc� trabalhou m�s passado?");
		double horasTrab = meu.nextDouble();
		
		double resultado = valorHora * horasTrab;
		
		System.out.println("Seu s�lario m�s passado foi de " + resultado + " Reais");
		
	}

}
