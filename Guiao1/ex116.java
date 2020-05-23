/*
 * ex116.java
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

public class ex116 {
	
	public static void main (String args[]) {
		
		//leitura de dados (Scanner)
		Scanner sc = new Scanner(System.in);
		
		double d1; //dinheiro q gastou no dia 1
		
		double d4; //dinheiro q gastou ao fim de 4 dias
		
		//valor teclado
		System.out.print("Introduzir o dinheiro q o turista gastou no 1º dia: ");
		d1 = sc.nextDouble();
		
		//calculos
		double d2 = d1 + (0.20*d1); //o turista gasta no dia seguinte mais 20% do q no dia anterior
		double d3 = d2 + (0.20*d2);
		d4 = d3 + (0.20*d3);
		
		//output
		System.out.printf("Ao fim de 4 dias, o turista gastou " + d4 + " euros");  
	}
}

