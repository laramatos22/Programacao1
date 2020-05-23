/*
 * ex84.java
 * 
 * Copyright 2019 Programacao 1 <p1@p1-vbox>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.*;

public class ex84 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		boolean operacao;
		char op;
		
		Complexo num1 = new Complexo();
		Complexo num2 = new Complexo();
		Complexo nFinal = new Complexo();
		
		//loop
		while (true)
		{
			do
			{
				System.out.print("Operacao: ");
				op = sc.next().charAt(0);
				operacao = (op=='+' || op=='-' || op=='*' || op=='/');
				if (op == '=')
				{
					System.out.println("O programa vai terminar");
					System.exit(1);
				}
				if (operacao == false)
				{
					System.out.println("Operação inválida!");
				}
			} while (!operacao);
			
			//ler os numeros introduzidos
			lerNumCompl(num1);
			lerNumCompl(num2);
			
			//switch remete para a função pretendida dependendo do operando
			switch (op)
			{
				case '+':
					nFinal = adicaoComplexos(num1, num2);
					System.out.printf("%s %c %s = %s\n", printComplexo(num1), op, printComplexo(num2), printComplexo(nFinal));
					break;
				case '-':
					nFinal = subtracaoComplexos(num1, num2);
					System.out.printf("%s %c %s = %s\n", printComplexo(num1), op, printComplexo(num2), printComplexo(nFinal));
					break;
				case '*':
					nFinal = multiplicacaoComplexos(num1, num2);
					System.out.printf("%s %c %s = %s\n", printComplexo(num1), op, printComplexo(num2), printComplexo(nFinal));
					break;
				case '/':
					nFinal = divisaoComplexos(num1, num2);
					System.out.printf("%s %c %s = %s\n", printComplexo(num1), op, printComplexo(num2), printComplexo(nFinal));
					break;
				
			}
			
		}
		
	}
	
	//função para ler numero complexo
	public static void lerNumCompl(Complexo num) {
		System.out.println("Introduzir um numero: ");
		System.out.print("Parte real: ");
		num.r = sc.nextDouble();
		System.out.print("Parte imaginária: ");
		num.i = sc.nextDouble();
		
	}
	
	//função que imprima um número complexo com o seguinte formato:
	//#.#+/-#.#i (em que +/- depende do sinal da parte imaginária)
	public static String printComplexo (Complexo num) {
		
		String s = "";
		s += num.r;
		if (num.i >= 0)
		{
			s += "+";
		}
		s += num.i;
		s += "i";
		return s;
		
	}
	
	//funcao Adição: a+bi+c+di=(a+c)+(b+d)i
	public static Complexo adicaoComplexos(Complexo n1, Complexo n2) {
		
		Complexo nFinal = new Complexo();
		nFinal.r = n2.r + n1.r;
		nFinal.i = n2.i + n1.i;
		return nFinal;
	}
	
	//funcao Subtração: a+bi-c+di=(a-c)+(b-d)i
	public static Complexo subtracaoComplexos(Complexo n1, Complexo n2) {
		
		Complexo nFinal = new Complexo();
		nFinal.r = n2.r - n1.r;
		nFinal.i = n2.i + n1.i;
		return nFinal;
	}
	
	//funcao Multiplicação: (a+bi)*(c+di)=(ac-bd)+(bc+ad)i
	public static Complexo multiplicacaoComplexos(Complexo n1, Complexo n2) {
		
		Complexo nFinal = new Complexo();
		nFinal.r = n2.r * n1.r;
		nFinal.i = n2.i * n1.i;
		return nFinal;
	}
	
	//funcao Divisão: (a+bi)/(c+di)=((ac+bd)/(c 2+d 2))+((bc-ad)/(c 2+d 2))i
	public static Complexo divisaoComplexos(Complexo n1, Complexo n2) {
		
		Complexo nFinal = new Complexo();
		nFinal.r = n2.r / n1.r;
		nFinal.i = n2.i / n1.i;
		return nFinal;
	}
	
}

class Complexo {
	double r; //parte real
	double i; //parte imaginaria
}
