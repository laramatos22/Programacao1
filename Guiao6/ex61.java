/*
 * ex61.java
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

public class ex61 {
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		int N;  //quantidade de numeros
		
		
		System.out.print("Quantidade de numeros: ");
		N = sc.nextInt();
		
		int array[] = new int[N];  //array inicial
		
		array = leituraSeq(array); 
		
		int temp[] = new int[array.length]; //array temporario com a quantidade de numeros do 1º array
		
		//inversao
		for (int i = 0; i <= array.length; i++)
		{
			temp[i-1] = array[array.length - i];  //temp5 = array0
		}
		 System.out.print(Arrays.toString(temp));
		
	}
	
	public static int[] leituraSeq (int array[]) {   //int[] tem q ter [] para mostrar q é para trabalhar com um array
		
		System.out.print("Valor: ");
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		
		return array;
		}
}

