/*
 * ex208.java
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


public class ex208 {
	
	public static void main (String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double temp;
		double cel = 0;
		double far = 0;
		int num;
		
		System.out.print("Temperatura (real): ");
		temp = sc.nextDouble();
		System.out.print("Que tipo de temperatura é? (1-Celcius|0-Farheneit): ");
		num = sc.nextInt();
		
		if (num == 1) {
			far = ((1.8 * temp) + 32);
			System.out.printf(temp + "º Celsius é equivalente a " + far + "º Farheneit");
			} else {
				cel = ((temp - 32) / 1.8);
				System.out.printf(temp + "º Farheneit é equivalente a " + cel + "º Celsius");
				}
	}
}

