/*
 * ex67.java
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

public class ex67 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int length = (int)(Math.random()*9+1);
		int min, max;
		int[] arr = new int[length];
		int[] hist = new int[7];
		
		System.out.print("Insira o valor minimo: ");
		min = sc.nextInt();
		
		System.out.print("Insira o valor maximo: ");
		max = sc.nextInt();
		
		while (max <= min)
		{
			System.out.print("Reinsira o valor minimo: ");
			min = sc.nextInt();
			System.out.print("Reinsira o valor maximo: ");
			max = sc.nextInt();
		}
		
		for (int i = 0; i < length-1; i++)    //bloco que gera os elementos do array
		{
			arr[i] = (int)(min + Math.random()*(max-min+1));
		}
		
		for (int a = 0; a < length-1; a++)
		{
			hist[arr[a]] = hist [arr[a]]+1;
		}
		
		for (int b = min; b <= max; b++)
		{
			System.out.println("O valor " + b + " surge " + hist[b] + " vezes.");
		}
	}
}

