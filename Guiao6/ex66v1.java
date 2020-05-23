/*
 * ex66v1.java
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

public class ex66v1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		char letras[] = new char[26];
		boolean verificar[] = new boolean[26];
		
		System.out.print("Inserir uma frase: ");
		String frase = sc.nextLine();
		frase = frase.toLowerCase();
		
		char letrasfrase[] = new char[frase.length()];
		
		for (int i = 0; i < 26; i++)
		{
			verificar[i] = false;
		}
		
		for (int i = 0; i < frase.length(); i++)
		{
			letrasfrase[i] = frase.charAt(i);
		}
		
		for (int i = 0; i < frase.length(); i++)
		{
			char p = letrasfrase[i];
			for (int j = 0; j < 26; j++)
			{
				if (letras[j] == p)
				{
					verificar[i] = true;
					break;
				}
			}
			
			for (int k = 0; k < frase.length(); k++)
			{
				if (verificar[k]=true)
				{
					System.out.println(letrasfrase[k]);
				}
			}
			
		}
		
		
		
	}
}

