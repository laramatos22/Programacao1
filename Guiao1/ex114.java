/*
 * ex114.java
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

public class ex114 {
	
	public static void main (String[] args) {
		
		//scanner de dados
		Scanner ler = new Scanner(System.in);
				
		//valores de entrada
		double c1, c2;
		
		//valores de saída
		double h, ang;
		
		//valores de teclado
		System.out.print("Insirir valor do cateto A:");
		c1 = ler.nextDouble();
		System.out.print("Inserir valor do cateto B:");
		c2 = ler.nextDouble();
		
		h = Math.sqrt((c1*c1) + (c2*c2));
		ang = Math.toDegrees(Math.acos(c1/h));
		
		//output
		System.out.printf("Valor da hipotenusa: " + h + "\n");
		System.out.printf("Valor do cateto A e a hipotenusa: " + ang);
		
		ler.close();
		
		
	}
}

