package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _13_aula13 {

	public static void main(String[] args) {
		
		/*
		 *  Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		 *  Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o 
		 *  descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:  . 
		 *  	sal�rio bruto. 
		 *  	a. quanto pagou ao INSS. 
		 *  	b. quanto pagou ao sindicato. 
		 *  	c. o sal�rio l�quido. 
		 *  	d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo: 
		 * 		Sal�rio Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio Liquido : R$
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = meu.nextDouble();
		System.out.println("Quantas horas voc� trabalhou m�s passado?");
		double horasTrab = meu.nextDouble();
		
		double salarioBruto = valorHora * horasTrab;
		
		System.out.println("Sal�rio bruto R$ " + salarioBruto);
		
		double ir = (salarioBruto / 100) * 11 ;
		System.out.println("Valor do Imposto de Renda R$ " + ir);
		
		double inss = (salarioBruto / 100) * 8 ;
		System.out.println("Valor do INSS R$ " + inss);
		
		double sindicato = (salarioBruto / 100) * 5 ;
		System.out.println("Valor do Sindicato R$ " + sindicato);
		
		double resultado = ir + inss + sindicato;
		System.out.println("Descontos R$ " + resultado);
		
		double salarioLiquido = salarioBruto - ir - inss - sindicato;
		System.out.println("Salario Liquido R$ " + salarioLiquido);
		
	}

}
