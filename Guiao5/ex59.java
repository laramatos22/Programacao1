/*
 * ex59.java
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

public class ex59 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
	
		//input
		int i=1, n;
		do
		{
			System.out.print("Numero: ");
			n = sc.nextInt();
			
			if (n<=0)
			{
				System.out.println("a>0");
			}
		} while (n<=0);
		
		for (i = 1; i <= n; i++)
		{
			if (isprime(i) == true || i == 2)
			{
				System.out.printf("%d", i);
			}
		}
		
		
	}
	
	public static boolean isprime (int a) {
			
		int b=2;
		double r = a%2;
		boolean c=false;
		
		while (r != 0 && b<a)
		{
			r = a%b;
			b++;
			
			if (r != 0 || a == 2)
			{
				c = true;
			} else if (r == 0)
			{
				c = false;
			}
		}
		return c;
	}
}

