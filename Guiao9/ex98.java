/*
 * ex98.java
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

public class ex98 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		System.out.print("Introduza um número: ");
		String numero = sc.nextLine();
		
		System.out.print("Introduza a base em que se encontra o número: ");
		int n = sc.nextInt();
		
		System.out.printf("O número em decimal é %3.1f", baseToNum(numero, n));
		
	}
	
	public static double baseToNum(String s, int n) {
		
		double nfinal = 0;
		int l = s.length();
		int i=0;
		double potencia;
		
		do
		{
			char a = s.charAt(i);
			potencia = Math.pow(n, (l-1));
			int b = a - '0';
			nfinal = nfinal + b*potencia;
			i++;
			l--;
		} while (l>0);
		
		return nfinal;
		
	}
}

