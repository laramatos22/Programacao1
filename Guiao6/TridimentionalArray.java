/*
 * TridimentionalArray.java
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

public class TridimentionalArray {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int Three_D_Array[][][] = new int [2][3][4];
		
		System.out.println("\nThree Dimentional Array\n");
		
		for (int i = 0; i < Three_D_Array.length; i++)
		{
			for (int j = 0; j < Three_D_Array[0].length; j++)
			{
				for (int k = 0; k < Three_D_Array[0][0].length; k++)
				{
					Three_D_Array[i][j][k] = i+j+k;
				}
			}
		}
		
		for (int i = 0; i < Three_D_Array.length; i++)
		{
			for (int j = 0; j < Three_D_Array[0].length; j++)
			{
				for (int k = 0; k < Three_D_Array[0][0].length; k++)
				{
					System.out.print(Three_D_Array[i][j][k] + " ");
				}
				
				System.out.println();
				
			}
			
			System.out.println();
			
		}
		
	}
}

