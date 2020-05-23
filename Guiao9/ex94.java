/*
 * ex94.java
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
 import java.io.*;

public class ex94 {
	
	static Scanner sc = new Scanner (System.in);
	static String str;
	static String pattern;
	
	public static void main (String[] args) {
		
		System.out.print("Escolha o padrão da matrícula.: ex 'AA-00-00' -> ");
		pattern = sc.nextLine();
		System.out.print("Introduza a matrícula -> ");
		str = sc.nextLine();
		
		if (match1(str, pattern) == true)
		{
			System.out.print("A matrícula é válida");
		}
		if (match1(str, pattern) == false)
		{
			System.out.print("A matrícula é inválida");
		}
		
	}
	
	public static boolean match1 (String str, String padrao) {
		
		boolean valida = true;
		for (int i = 0; i < padrao.length(); i++)
		{
			char p = padrao.charAt(i);
			char m = str.charAt(i);
			
			if (p != '-')
			{
				if (Character.isLetter(p) && Character.isDigit(m) || Character.isLetter(m) && Character.isDigit(p))
				{
					valida = false;
				}
			}
		}
		return valida;
		
	} 
}

