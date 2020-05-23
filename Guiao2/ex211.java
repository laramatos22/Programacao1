/*
 * ex211.java
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

import java.util.Scanner;

public class ex211 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		double x1, x2;
		
		System.out.print("Ax²+Bx+C");
		System.out.print("A: ");
		a = sc.nextDouble();
		System.out.print("B: ");
		b = sc.nextDouble();
		System.out.print("C: ");
		c = sc.nextDouble();
		
		x1 = (-b + (Math.sqrt((Math.pow(b,2) - (4*a*c)))))/2*a;
		x2 = (-b - (Math.sqrt((Math.pow(b,2) - (4*a*c)))))/2*a;
		
		System.out.printf()
	}
}

