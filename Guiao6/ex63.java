/*
 * ex63.java
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

public class ex63 {
	
	static Scanner sc = new Scanner(System.in);
	
	// int[] arrayInt = new int[50]  //array com tamanho 50 numeros da sequencia
	
	// static array[];  //array usado nas funções e é igual ao arrayInt
	
	public static void main (String[] args) {
		
		int opcao;
		int[] arrayInt = new int[50];
		
		//MENU
		System.out.print("Análise de uma sequencia de numeros inteiros");
		System.out.print("1 - ler sequencia");
		System.out.print("2 - escrever sequencia");
		System.out.print("3 - Calcular o maximo da sequencia");
		System.out.print("4 - Calcular o minimo da sequencia");
		System.out.print("5 - Calcular a media da sequencia");
		System.out.print("6 - Detetar se é uma sequencia constituida apenas por numeros pares");
		System.out.print("10 - Terminar programa");
		
		do
		{
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			
			switch(opcao){
				case 1:
						lerSequencia(arrayInt);
						break;
						
				case 2:
						imprimirSequencia(arrayInt);
						break;
						
				case 3:
						System.out.printf("O numero maximo da sequencia é " + maxSequencia(arrayInt));
						break;
						
				case 4:
						System.out.printf("O numero minimo da sequencia é " + minSequencia(arrayInt));
						break;
						
				case 5:
						System.out.printf("A media da sequencia é " + medSequencia(arrayInt));
						break;
						
				case 6:
						ParSequencia(arrayInt);
						break;
						
				case 10:
						break;
						
				default:
						System.out.printf("OPÇÃO INVALIDA\n");
						break;
						
			}
		} while (opcao != 10); // o programa termina quando é introduzido o 10
		
	}
		// 1) LER SEQUENCIA
		public static void lerSequencia(int[] array) {
		
			int i=0;  //letra que vai ficar com cada valor do array
			int count = 0;   //contagem da quantidade de numeros que fazem parte do array
			
			do
			{
				System.out.print("Valor: ");
				array[i]= sc.nextInt();
				i++;
				count++;
			} while (array[i-1] != 0);
			count--;
		}
		
	
		// 2) IMPRIMIR SEQUENCIA
		public static void imprimirSequencia(int[] array) {
			
			for (int i = 0; array[i] != 0; i++)
			{
				System.out.printf("array["+ i +"] = "+ array[i]);
			}
		}
		
		// 3) CALCULAR MAXIMO DA SEQUENCIA
		public static int maxSequencia(int[] array) {
					//tem se que colocar o int no maxSequencia pq o numero de retorno max
					//da função é um int
				
				int max = array[0];  //o max será o 1º numero introduzido por ser supostamente o maior;
									 //caso nao se confirme o max vai alterando conforme seja introduzido um 
									 //numero mais elevado
				int count = 0;
				
				for (int i = 0; i < count; i++)
				{
					if (array[i]>max)
					{
						max = array[i];
					}
				}
				return max;     //manda se o max para a função main
		}
		
		// 4) CALCULAR MINIMO DA SEQUENCIA
		public static int minSequencia(int[] array) {
					//tem se que colocar o int no minSequencia pq o numero de retorno min
					//da função é um int
			
			int min = array[0];		 //o min será o 1º numero introduzido por ser supostamente o menor;
									 //caso nao se confirme o min vai alterando conforme seja introduzido um 
									 //numero mais baixo
			int count = 0;
			
			for (int i = 0; i < count; i++)
			{
				if (array[i]<min)
				{
					min = array[i];
				}
			}
			return min; //manda se o min para a função main			
		}
		
		// 5) CALCULAR A MEDIA DA SEQUENCIA
		public static double medSequencia(int[] array) {
			
			int soma = 0;    //soma de todos os valores do array
			int media;       //media dos valores
			int count = 0;   //contagem dos valores que fazem parte do array
			
			for (int i = 0; i < count; i++)
			{
				soma += array[i];  //soma dos valores do array;
			}
			
			System.out.printf("Soma: " + soma);
			System.out.printf("Nº de elementos da sequencia: " + count);
			media = soma/count;
			
			return media;		
		}
		
		// 6) DETETAR SE É UMA SEQUENCIA SÓ CONSTITUIDA POR NUMEROS PARES
		public static void ParSequencia(int[] array) {
				
			int numPar = 0;     //numeros pares do array
			int count = 0;      //contagem dos numeros que fazem parte do array
			
			for (int i = 0; i < count; i++)    // i sao os numeros do array
			{
				if (array[i] % 2 == 0)    //se for numero par a divisao por 2 tem que dar resto 0
				{
					numPar++;   //"caixa" onde se colocam todos os numeros pares
				}
			}
			
			if (numPar == 0)  //se todos os numeros do array forem numeros pares
			{
				System.out.printf("A sequencia é constituida apenas por numeros pare\n");
			} else {
				System.out.printf("A sequencia nao é constituida apenas por numeros pares\n");
				}
			
		}
		
}

