/*
 * ex97.java
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

public class ex97 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		capitalize("era uma vez");
		
	}
	
	public static void capitalize(String str) {
		
		char p = str.charAt(0);
		char c, d;
		System.out.print(Character.toUpperCase(p));
		
		for (int i = 1; i < str.length(); i++)
		{
			c = str.charAt(i);
			
			if (c == ' ')
			{
				System.out.print(' ');
				d = str.charAt(i + 1);
				System.out.print(Character.toUpperCase(d));
				i++;
			} else
			{
				System.out.print(c);
			}
		}
		
	}
}

