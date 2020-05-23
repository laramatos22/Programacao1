/*
 * ex103.java
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

public class ex103 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		double media;
		double[] phs = null;
		
		do
		{
			System.out.println("\nAnalisador de pH");
			System.out.println("\n1 - Ler valores de pH de um ficheiro");
			System.out.println("\n2 - Escrever valores de pH no terminal");
			System.out.println("\n3 - Calcular o pH médio das amostras");
			System.out.println("\n4 - Calcular o número de amostras ácidas (< 7) e básicas (> 7)");
			System.out.println("\n5 - Calcular o número de amostras de pH superior à média");
			System.out.println("\n6 - Escrever valores de pH no terminal ordenados de modo crescente");
			System.out.println("\n7 - Terminar o programa");
			System.out.print("\nOpção -> ");
			int opt = sc.nextInt();
			
			switch (opt)
			{
				case 1:
					phs = readFile(phs);
					break;
				
				case 2:
					termPrint(phs);
					break;
					
				case 3:
					media = avg(phs);
					System.out.printf("\n PH média das amostras: %4.2f\n", media);
					break;
					
				case 4:
					acdBas(phs);
					break;
				
				case 5:
					upMed(avg(phs), phs);
					break;
				
				case 6:
					ordTermPrint(phs);
					break;
				
				case 7:
					break;
					
				default:
					System.out.println("Opção inválida, tente outra vez");
			}
			
		} while (opt != 7);
	
	}
	
	//leitura de ficheiros
	public static double[] readFile (double[] phs) throws IOException {
		
		String nome;
		int nums=0;
		
		System.out.print("Nome do ficheiro com os dados de pH: ");
		nome = sc.next();
		
		File phf = new File (nome);
		Scanner kfile = new Scanner (phf);
		
		while (kfile.hasNext())
		{
			double tmp = kfile.nextDouble();
			
			if (tmp >= 0 && tmp <= 14)
			{
				nums++;
			}
		}
		
		phs = new double[nums];
		kfile.close();
		
		int number = 0;
		
		Scanner kfila = new Scanner(phf);
		
		while (kfila.hasNext())
		{
			double tmp = kfila.nextDouble();
			
			if (tmp >= 0 && tmp <= 14)
			{
				phs[number] = tmp;
				number++;
			}
		}
		kfila.close();
		
		return phs;
		
	}
	
	//modulo para escrita no terminal
	public static void termPrint(double[] phs) {
		
		System.out.print("\nValores de pH: ");
		
		for (int i = 0; i < phs.length; i++)
		{
			System.out.printf("Val #%2d: %4.2f\n", i+1, phs[i]);
		}
		
	}
	
	//modulo para o calculo de pH medio
	public static double avg(double[] phs) {
		
		double media = 0;
		
		for (int i = 0; i < phs.length; i++)
		{
			media += phs[i];
		}
		
		media /= phs.length;
		return media;
		
	}
	
	//modulo para o calculo do numero de amostras basicas e acidas
	public static void acdBas (double[] phs) {
		
			int basico = 0;
			int acido = 0;
			int neutro = 0;
			
			for (int i = 0; i < phs.length; i++)
			{
				if (phs[i] >= 0 && phs[i] < 7)
				{
					acido++;
				} else if (phs[i] > 7 && phs[i] <= 14)
				{
					basico ++;
				}else
				{
					neutro++;
				}
			}
			
			System.out.printf("\nA amostra contem " + acido + " soluções ácidas, " + basico + " soluções básicas e " + neutro + " soluções neutras.");
			
	}
	
	
	//modulo de calculo do mumero de amostras com pH superior à media
	public static void upMed(double med, double[] phs) {
		
		int superiores = 0;
		
		for (int i = 0; i < phs.length; i++)
		{
			if (phs[i] > med)
			{
				superiores++;
			}
		}
		
		System.out.printf("O numero de amostras com pH superior à media é: " + superiores);
		
	}
	
	//modulo de escrita dos valores no terminal de maneira crescente
	public static void ordTermPrint(double[] phs) {
			
		boolean swap = true;
		
		do
		{
			swap = false;
			
			for (int i = 0; i < phs.length - 1; i++)
			{
				if (phs[i+1] < phs[i])
				{
					double tmp = phs[i];
					phs[i] = phs[i+1];
					phs[i+1] = tmp;
					swap = true;
					
				}
			}
			
		} while (swap);
		
		for (int i = 0; i < phs.length; i++)
		{
			System.out.printf("valor %2d: %4.2f\n", i+1, phs[i]);
		}
		
	}
}

