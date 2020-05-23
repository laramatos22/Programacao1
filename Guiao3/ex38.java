/*
 * ex38.java
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

public class ex38 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int a, b;
		
		//ler teclado
		System.out.print("Insira dois numeros positivos: \n");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a < 0 || b < 0)
		{
			System.out.print("Valores invalidos");
		} else
		{
			if (a > b)
			{
				for (int i = b; i < a; i++)
				{
					if(i%2 != 0) {
					System.out.printf("%d é impar\n", i);
					}
				}
			}
			else
			{
				for (int j = a; j < b; j++)
				{
					if (j % 2 != 0)
					{
						System.out.printf("%d é impar\n", j);
					}
				}
			}
		}
	}
}

