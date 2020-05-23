/*
 * ex58.java
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

public class ex58 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		//INPUT
		int n;       //numero de elementos da sequencia 
		double xi;   //x inicial
		double xf;   //x final
		double f;    
		
		do
		{
			System.out.print("X inicial: ");
			xi = sc.nextDouble();
			System.out.print("X final: ");
			xf = sc.nextDouble();
			System.out.print("Nº de entradas: ");
			n = sc.nextInt();
			
			if (xi >= xf)
			{
				System.out.print("xi <= xf");
			}
		} while (xi >= xf);
		
		f = (xf-xi)/(n-1);
		
		//OUTPUT
		System.out.println("--------------------------------------------");
		System.out.printf("|   x    |     poly1    |    poly2    |\n");
		System.out.println("------------------------------------------");
		for (double i = xi; i <= xf; i+=f)
		{
			System.out.printf("|  %3.1f  |   %5.2f    |     %8.3f    |\n", i, poly1(i), poly2(i));
		}
		System.out.println("-------------------------------------------");
		
	}
	
	public static double poly1 (double x) {
		double y;
		y = 5*Math.pow(x,2) + 10*x + 3;
		return y;
	}
	
	public static double poly2 (double x) {
		double y;
		y = 7*Math.pow(x,3) + 3*Math.pow(x,2) + 5*x + 2;
		return y;
	}
}

