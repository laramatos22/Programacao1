/*
 * ex201.java
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

public class ex201 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		double tpg1, tpg2, ei;
		
		System.out.print("Nota TPG1: ");
		tpg1 = sc.nextDouble();
		
		System.out.print("Nota TPG2: ");
		tpg2 = sc.nextDouble();
		
		System.out.print("Nota EI: ");
		ei = sc.nextDouble();
		
		double notafinal = (0.20 * tpg1) + (0.30 * tpg2) + (0.50 * ei);
		
		if (notafinal < 9.5) {
			System.out.printf("Aluno reprovado");
			} else {
				System.out.print("Aluno aprovado");
				}
	}
}

