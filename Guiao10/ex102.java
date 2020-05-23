/*
 * ex102.java
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

public class ex102 {
	
	public static void main (String[] args) {
		
		int[] chavef = new int[6]; //guarda a chave oficial
		int[] chave = new int[6];  //guarda a chave dada
		int[] n = new int[6];      //guarda os numeros que coindidem em ambas as chaves
		
		System.out.print("Introduza a chave: ");
		for (int i = 0; i < 6; i++)
		{
			chave[i] = sc.nextInt();
		}
		
		chavef = gerarChave();
		n = pertenceChave (chavef, chave);
		mostraChave(chavef, chave, n);
		
	}
	
	//gera uma chave oficial e verifica que os numeros gerados nao sa repetidos
	public static int[] gerarChave () {
		
		int[] a = new int[6];
		int check = 0;
		
		for (int i = 0; i < 6; i++)
		{
			a[i] = (int)(Math.random()*(49-1) + 1)
			for (int j = i-1; i >= 0; j--)  //vai verificar se alguns dos valores gerados anteriormente é igual
			{
				if (a[i] == a[j])  //verifica se é repetido
				{
					a[i] = (int)(Math.random() * (49-1) + 1);  //se for repetifo gera um novo
					j = i;  //volta ao inicio do ciclo for para verificar se o valor novo gerado é igual a algum dos já verificados anteriormente
				}
			}
			
		}
		
		return a;
		
	}
	
	public static int[] pertenceChave (int f[], int a[]) {
		
		int cont = 0;
		int[] n = new int[6];
		int k = 0;
		
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 6; j++)
			{
				if (f[i] == a[j])
				{
					cont ++; //Indica quantos numeros pertencem à chave
					n[k] = f[i]; //Regidta no array n os numeros que coincidem com a chave oficial
					k++;
				}
			}
			
		}
		
		if (cont =1)
		{
			System.out.printf("\n %d numero pertence à chave \n", cont);
		} else
		{
			System.out.printf("\n %d numeros pertencem à chave\n", cont);
		}
		return n;
		
	}
	
	public static void mostraChave (int f[], int a[], int[] n) {
		
		boolean igual = false;
		int cont = 0;
		int cont2 = 0;
		
		System.out.println("\n  Aposta de Totoloto  ");
		System.out.printf("\nChave: %d", f[0]);
		
		for (int w = 1; w < 6; w++)
		{
			System.out.printf();
		}
		
		
	}
}

