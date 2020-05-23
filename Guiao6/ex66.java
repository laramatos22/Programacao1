/*
 * ex66.java
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
import java.lang.String;

public class ex66 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.print("Insira uma frase: ");
		String frase = sc.nextLine();
		boolean histograma = new boolean[127];
		
		System.out.println("Lista de letras utilizadas: ");
		
		for (int i = 0; i < frase.length(); i++)
		{
			int num = (int)frase.charAt(i);
			if (!histograma[(int)frase.charAt(i)])
			{
				System.out.println(frase.charAt(i));
			}
			histograma[(int)frase.charAt(i)] = true;
		}
		
	}
}

