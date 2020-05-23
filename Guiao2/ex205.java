/*
 * ex205.java
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

public class ex205 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner (System.in);
		
		double xp1, yp1, xp2, yp2, xp3, yp3, xp4, yp4; //pontos
		double d1, d2;         //distancias p1-p2 e p3-p4
		
		System.out.print("xPonto1: ");
		xp1 = sc.nextDouble();
		System.out.print("yPonto1: ");
		yp1 = sc.nextDouble();
		System.out.print("xPonto2: ");
		xp2 = sc.nextDouble();
		System.out.print("yPonto2: ");
		yp2 = sc.nextDouble();
		System.out.print("xPonto3: ");
		xp3 = sc.nextDouble();
		System.out.print("yPonto3: ");
		yp3 = sc.nextDouble();
		System.out.print("xPonto4: ");
		xp4 = sc.nextDouble();
		System.out.print("yPonto4: ");
		yp4 = sc.nextDouble();
		
		double x1 = xp2 - xp1;
		double y1 = yp2 - yp1;
		
		d1 = (Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2)));
		
		double x2 = xp4 - xp3;
		double y2 = yp4 - yp3;
		
		d2 = (Math.sqrt(Math.pow(x2,2) + Math.pow(y2,2)));
		
		if (d1 != d2) {
			System.out.printf("A figura não é um quadrado");
			} else {
				System.out.printf("A figura é um quadrado");
				}
	}
}

