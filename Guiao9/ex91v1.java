/*
 * ex91v1.java
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

public class ex91v1 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int up=0;
		int low=0;
		int dig=0;
		int vog=0;
		int cons=0;
		
		System.out.println ("Análise de uma frase");
		System.out.print("Frase de entrada -> ");
		String s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c))
			{
				up++;
			} else if (Character.isLowerCase(c))
			{
				low++;
			} else if (Character.isDigit(c))
			{
				dig++;
			}
			
			if (isVowel(c))
			{
				vog++;
			} else
			{
				cons++;
			}
		}
		
		System.out.printf("Numero de caracteres minusculos -> %d\n", low);
		System.out.printf("Numero de caracteres maiusculos -> %d\n", up);
		System.out.printf("Numero de caracteres numericos -> %d\n", dig);
		System.out.printf("Numero de vogais -> %d\n", vog);
		System.out.printf("Numero de consoantes -> %d\n", cons);
	
	}
	
	public static boolean isVowel (char c) {
		
		String s;
		s = ""+c;
		
		if ("aeiou".contains(s.toLowerCase()))
		{
			return true;
		} else
		{
			return false;
		}
	}
}

