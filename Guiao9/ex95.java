/*
 * ex95.java
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

public class ex95 {
	
	public static void main (String[] args) {
		numToBase(17,2);
		
	}
	
	public static void numToBase(int num, int base) {
		
		int div_temp;
		String numconv = "";
		
		do
		{
			div_temp = (num % base);
			num = num/base;
			numconv = div_temp + numconv;
		} while (num != 0);
		
		System.out.println(numconv);
		
	}
}

