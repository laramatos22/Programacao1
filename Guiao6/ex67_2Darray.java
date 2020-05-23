/*
 * ex67_2Darray.java
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

public class ex67_2Darray {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int numero; //numero(s) introduzidos pelo teclado q fazem parte do array seq
		int N = 20;  //quantidade de numeros numero que fazem parte do array seq
		int[] seq = new int[N];  //array dos 20 numeros introduzidos pelo teclado
		int n = 0;   //numero d vezes que um numero é repetido
		do
		{
			System.out.print("Valor: ");
			numero = sc.nextInt();
			if (numero >= 0)
			{
				seq[n] = numero;   //o numero introduzido faz parte
				n++;
			}
		} while ((numero >= 0) && (n<20));
		
		int count = 0;
		
		for (int i = numero - 1; i >= 0; i--)
		{
			if (seq[i] == numero)
			{
				count++;
			}
		}
		
		System.out.printf("repetições do numero" + numero + ":" + n + "vezes");
		
	}
}

