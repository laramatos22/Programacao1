/*
 * ex64.java
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

public class ex64 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int num;
	static int arrayGlobal[];   //array global cujo alcance sao todas as funções
	
	public static void main (String[] args) {
		
		int num;   //notas a processar
		int arrayGlobal[];
		
		
		do
		{
			System.out.print("Numero de notas: ");
			num = sc.nextInt();
		} while (num <= 0 || num > 50);   //a quantidade de notas podem ir de 0 até 50 excluvise
		
		arrayGlobal = new int[num];  //array global tem tamanho a quantidade de numeros de notas
									 //numero de elementos do array é definido pelo teclado
		
		//CRIAR ARRAY
		for (int i = 0; i < num; i++)
		{
			arrayGlobal[i] = verifyNota();   //função de validação de cada valor introduzido
		}
		System.out.print("Histograma de notas\n");
		System.out.print("---------------------------\n");
		for (int i = 0; i < 20; i++)
		{
			System.out.printf(i + "|");
			for (int j = 0; j < arrayGlobal.length; j++)
			{
				if (arrayGlobal[j] == i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	//FUNÇÃO PARA VALIDAR VALOR
	public static int verifyNota() {
		
		int nota;
		do
		{
			System.out.print("Nota: ");
			nota=sc.nextInt();
		} while (nota<0 || nota>20);
		return nota;
	}
}

