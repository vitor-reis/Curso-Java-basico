package com.vitor.CursoJavaBasico.exercicios;

import java.util.Scanner;

public class _13_aula13 {

	public static void main(String[] args) {
		
		/*
		 *  Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		 *  Calcule e mostre o total do seu salário no referido mês, sabendo-se que são 
		 *  descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:  . 
		 *  	salário bruto. 
		 *  	a. quanto pagou ao INSS. 
		 *  	b. quanto pagou ao sindicato. 
		 *  	c. o salário líquido. 
		 *  	d. calcule os descontos e o salário líquido, conforme a tabela abaixo: 
		 * 		Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
		 */

		Scanner meu = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora?");
		double valorHora = meu.nextDouble();
		System.out.println("Quantas horas você trabalhou mês passado?");
		double horasTrab = meu.nextDouble();
		
		double salarioBruto = valorHora * horasTrab;
		
		System.out.println("Salário bruto R$ " + salarioBruto);
		
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
