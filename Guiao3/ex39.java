/*
 * ex39.java
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

public class ex39 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
	
		int n;
		int sum=0;   //soma de todos os numeros pares
		
		//leitura do valor
		System.out.print("Inserir valor: ");
		n = sc.nextInt();
		
		if (n < 0 || n > 1000)
		{
			System.out.print("Numero invalido!");
		} else
		{
			for (int i = 1; i <= n; i++)
			{
				if (i % 2 == 0)
				{
					System.out.println(i);
					sum += i;
					sum++;
				}
			}
			System.out.printf("\nA soma dos numeros pares é %d", sum);
			
		}
	}
}

