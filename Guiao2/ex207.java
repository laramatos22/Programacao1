/*
 * ex207.java
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
 
import java.util.Scanner;


public class ex207 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("1º numero: ");
		a = sc.nextInt();
		System.out.print("2º numero: ");
		b = sc.nextInt();
		System.out.print("3º numero: ");
		c = sc.nextInt();
		
		if (b > a && b > c) {
			System.out.printf("O maior numero é " + b);
			} else if (a > b && a > c) {
				System.out.printf("O maior numero é " + a);
				} else {
					System.out.printf("O maior numero é " + c);
					}
	}
}

