/*
 * BidimensionalArray.java
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

public class BidimensionalArray {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int array[][] = {{1,2}, {3, 4}, {5, 6}};
		
		System.out.println("array.length = " + array.length); //3   - tamanho total do array
		System.out.println("array[0].length = " + array[0].length); //2  - tamanho da posição 0 do array ({1,2})
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[0].length; j++)
			{
				System.out.print(array[i][j] + " ");
			}
		}
		
		System.out.println();
		
		
	}
}

