/*
 * ex67final.java
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

public class ex67final {
	
	static Scanner rd = new Scanner (System.in);
	static Random rand = new Random();
	static int[] array; //array de valores criados
	static int[] cont; //array dos valores que cada valor criado aparece
	
	public static void main (String[] args) {
		
		int xi, xf, n;
		
		System.out.print("N: ");
		n = rd.nextInt();
		System.out.print("Inicio: ");
		xi = rd.nextInt();
		System.out.print("Fim: ");
		xf = rd.nextInt();
		
		System.out.println();
		
		array_gen(xi, xf, n);
		contagem(xi, xf, n);
		
		output(xi);
		
	}
	
	public static void array_gen (int xi, int xf, int n) {
		
		array = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			array[i] = (int)(Math.random() * (xf-xi) + xi);
		}
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void contagem(int xi, int xf, int n) {
		
		cont = new int[(xf - xi) + 1];
		
		for (int i = 0; i < n; i++)  //correr por todas as posições do array
		{
			int h=0;
			for (int g = xi; g <= xf; g++)  //comparar uma posição (i) do array com todos os valores no intervalo [xi, xf]
			{
				if (array[i] == g)
				{
					cont[h]++;
					break;
				}
				h++;
			}
		}
	}
	
	public static void output(int xi) {
		
		for (int i = 0; i < cont.length; i++)
		{
			System.out.printf("%d ocorre %d vezes\n", xi+i, cont[i]);
		}
		
		
	}
}

