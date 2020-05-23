/*
 * ex56.java
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

public class ex56 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a;  //valor introduzido no teclado da tabuada
		
		do
		{
			System.out.print("Tabuada de: ");
			a = sc.nextInt();
		} while (a<0 || a>100);
		
		System.out.println("----------------");
		System.out.printf("|Tabuada de %d |\n", a);
		System.out.println("----------------");
		for (int i = 0; i <= 10; i++)
		{
			System.out.printf("|  " +a+ " X " +i+ " = " +a*i+ " |\n");
		}
		System.out.println("----------------");
		
		
	}
}

