/*
 * ex57.java
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

public class ex57 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int a, b;   //os dois valores
		
		do {
			System.out.print("Primeiro valor: ");
			a = sc.nextInt();
			System.out.print("Segundo valor: ");
			b = sc.nextInt();
			
			if(a==b) {
				System.out.print("Os numeros nao podem ser iguais!\n");
			}
		} while(a==b);
	
		//Só quando a e b forem numeros diferentes é que passa para a função mdc
		
		System.out.printf("%d é o MDC dos numeros dados", mdc(a,b));
		
	}
	
	public static int mdc (int a, int b) {
		
		int r;   //resto da divisao de a/b ou b/a
		
		if (a > b)
		{
			r = a%b;
			while (r != 0)
			{
				a = b;
				b=r;
				r = a%b;
			}
			return b;
		} else   //quando b>a
		{
			r = b%a;
			while(r != 0) 
			{
				b=a;
				a=r;
				r=b%a;
			}
			return a;
		}
	}
}

