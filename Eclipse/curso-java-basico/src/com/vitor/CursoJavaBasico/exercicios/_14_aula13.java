package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _14_aula13 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça o tamanho de um arquivo para download (em MB)
		 * e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo 
		 * aproximado de download do arquivo usando este link (em minutos). 
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB");
		double arquivoMB = meu.nextDouble();
		
		System.out.println("Digite a velocidade do sua internet em Mbps");
		double velocidade = meu.nextDouble();
		
		double segundos = arquivoMB / velocidade;
		double minutos = segundos / 60;
		
		System.out.println("Tempo para finalizar download " + minutos + " minutos");
		
		
	}

}
