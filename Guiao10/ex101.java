/*
 * ex101.java
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
import java.io.*;

public class ex101 {
		
	static Scanner sc = new Scanner(System.in);
	
	// int[] arrayInt = new int[50]  //array com tamanho 50 numeros da sequencia
	
	// static array[];  //array usado nas funções e é igual ao arrayInt
	
	static File flin;
	static File flout;
	
	public static void main (String[] args) throws IOException {
		
		int opcao;
		int[] arrayInt = new int[50];
		
		//MENU
		System.out.print("Análise de uma sequencia de numeros inteiros\n");
		System.out.print("1 - Ler sequencia\n");
		System.out.print("2 - Escrever sequencia\n");
		System.out.print("3 - Calcular o maximo da sequencia\n");
		System.out.print("4 - Calcular o minimo da sequencia\n");
		System.out.print("5 - Calcular a media da sequencia\n");
		System.out.print("6 - Detetar se é uma sequencia constituida apenas por numeros pares\n");
		System.out.print("7 - Ler uma sequência de numeros de um ficheiro\n");
		System.out.print("8 - Adicionar números à sequencia existente\n");
		System.out.print("9 - Gravar a sequencia atual de numeros num ficheiro\n");
		System.out.print("10 - Ordenar a sequência por ordem crescente utilizando a ordenação sequencial\n");
		System.out.print("11 - Ordenar a sequência por ordem decrescente utilizando ordenação por flutuação\n");
		System.out.print("12 - Pesquisa de valor na sequência\n");
		System.out.print("13 - Terminar programa\n");
		
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
						
				case 7:
						arrayInt = lerFicheiro();
						break;
						
				case 8:
						int n;
						
						System.out.print("Quantos numeros quer adicionar? ");
						n = sc.nextInt();
						
						int b[] = new int [(n+arrayInt.length)]; //novo array com o numero de valores q estavam em arrayInt + n (os valores agora introduzidos)
						b = adicionar (arrayInt, n);
						
						break;
						
				case 9:
						gravar(arrayInt);
						break;
						
				case 10:
						ordp(arrayInt);
						break;
						
				case 11:
						ordf(arrayInt);
						break;
					
				case 12:
						search(arrayInt);
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
	
		public static int[] lerFicheiro() throws IOException {
			
			String nome;
			int a[] = new int[10];
			File fich;
			
			do
			{
				System.out.print("Nome do ficheiro: ");
				nome = sc.nextLine();
				fich = new File (nome);
			} while (!fich.canRead() && !fich.exists());
			
			Scanner scFile = new Scanner (fich);   //Scanner proprio para o ficheiro fich
			
			int i=0;
			while (scFile.hasNextLine() && i<10)
			{
				a[i] = scFile.nextInt();
				if (a[i]==0)
				{
					break;
				}
				i++;
			}
			
			scFile.close();
			
			return a;
		}
		
		public static int[] adicionar (int arrayInt[], int n) {
			
			int b[] = new int[(n + arrayInt.length)];
			
			for (int i = 0; i < arrayInt.length; i++)
			{
				b[i] = arrayInt[i];
			}
			
			System.out.print("Introduzir numero: ");
			for (int i = arrayInt.length; i < (n + arrayInt.length); i++)
			{
				b[i] = sc.nextInt();
			}
			
			return b;
		
		}
		
		public static void gravar (int b[]) throws IOException {
			
			String NameOut;
			System.out.print("Qual o nome do ficheiro que vai guardar a informação? ");
			NameOut = sc.next();
			
			File fileOut = new File (NameOut);
			
			PrintWriter pw = new PrintWriter(fileOut);
			
			for (int i = 0; i < b.length; i++)
			{
				if (b[i] != 0)
				{
					pw.println(b[i]);
				}
			}
			
			pw.close();
		
		}
		
		public static void ordp (int[] array) {
			
			int max = a[0];
			for (int i = 1; i < a.length; i++)
			{
				if (max < a[i])
				{
					max = a[i];
				}
			}
			int n = -1, i, j, tmp;
			
			for (int c = 0; c < a.length; c++)
			{
				if (a[c] < max)
				{
					n = c;
				}
			}
			
			for (i = 0; i < n; i++)
			{
				for (j = i + 2; j < n + 1; j++)
				{
					if (a[i] > a[j])
					{
						tmp = a[i];
						a[i] = a[j];
						a[j] = tmp;
					}
				}
				
			}
		}
		
		public static void ordf(int[] array) {
			
			int max = a[0];
			for (int i = 1; i < a.length; i++)
			{
				if (max < a[i])
				{
					max = a[i];
				}
			}
		}
		
		public static void search(int[] array) {
			
			int[] pos = new int [a.length];
			System.out.print("Qual é o valor de busca: ");
			int find = sc.nextInt();
			int n= -1;
			
			for (int i = 0; i < a.length; i++)
			{
				if (a[i] == find)
				{
					pos[i] = i;
				}
			}
			
			if (n == -1)
			{
				System.out.printf("O valor %d não existe na lista \n", find);
			} else
			{
				System.out.printf("O valor %d existe na lista e encontra-se na posição %d \n", find, n+1);
			}
			System.out.println("");
			
			
		}
}

