/*
 * ex305.java
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

public class ex305 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double c;
		int e; //parte inteira de c
		
		System.out.print("Valor de A: ");
		a = sc.nextInt();
		System.out.print("Valor de B: ");
		b = sc.nextInt();
		
		for (a=0; a<100; a++) {
			for(b=0; b<100; b++) {
				if (a<b) {
					c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
					if (c>=100) {break;}
					else if (c%1==0) {
						e = (int)c;
						System.out.printf("%2f  , %2f   , %2f\n", a, b, e);
						}
					}
				}
			}
		
		
	}
}

