/*
 * ex91.java
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

public class ex91 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println("Análise de uma frase: ");
		
		char c;
		
		int a=0, b=0, d=0, v=0, cons=0;
		
		String frase;
		
		System.out.print("Frase de entrada: ");
		frase = sc.nextLine();
		
		for (int i = 0; i < frase.lenght(); i++)
		{
			c = frase.charAt(i);
			if (Character.isLowerCase(c))
			{
				a++;
			}
			
			if (Character.isUpperCase(c))
			{
				b++;
			}
			
			if (Character.isDigit(c))
			{
				d++;
			}
			
			if (isVowel(c) == true)  
			{
				v++;
			}
			
			if (isVowel(c) == false)
			{
				cons++;
			}
		}
		
		System.out.printf("Numero de caracteres minusculos -> " + a);
		System.out.printf("\nNumero de caracteres maiusculos -> " + b);
		System.out.printf("\nNumero de caracteres numéricos -> " + c);
		System.out.printf("\nNumero de vogais -> " + v);
		System.out.printf("\nNumero de consoantes");
		
		System.out.println("\nCaracter que queremos verificar se é vogal ou nao: ");
		
		c = sc.nextLine().charAt(0);
		
		if (isVowel(c) == true)
		{
			System.out.printf("O caracter " + c + " é uma vogal");
		} else
		{
			System.out.printf("O caracter " + c + " não é uma vogal");
		}
		
	}
	
	public static boolean isVowel(char c) {
		
		char a, e, i, o, u;
		a = 'a';
		e = 'e';
		i = 'i';
		o = 'o';
		u = 'u';
		
		boolean vogal = false;
		
		if (c == a | c == e | c == i | c == o | c == u)
		{
			vogal = true;
		} else
		{
			vogal = false;
		}
		return vogal;
	}
}

