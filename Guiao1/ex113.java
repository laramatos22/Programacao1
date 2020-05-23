/*
 * ex113.java
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

public class ex113 {
	
	public static void main (String args[]) {
		
		//Scanner de leitura
		Scanner sc = new Scanner(System.in);
		
		//valores de entrada
		double xA, yA;
		double xB, yB;
		
		//valores de saída
		double dist;
		
		//valores teclado
		//Coordenadas ponto A
		System.out.print("Coordenadas do ponto A:\n");
		System.out.print("X:");
		xA = sc.nextDouble();
		System.out.print("Y:");
		yA = sc.nextDouble();
		
		//Coordenadas ponto B
		System.out.print("Coordenadas do ponto B:\n");
		System.out.print("X:");
		xB = sc.nextDouble();
		System.out.print("Y:");
		yB = sc.nextDouble();
		
		double x = xB - xA;
		double y = yB - yA;
		
		dist = Math.sqrt((x*x) + (y*y)); //calculo da distancia
		
		double dk = dist * 100; //mudança de escala para Km
		
		//output
		System.out.printf("A distancia entre os pontos A e B é de " + dk + "km");
		
		sc.close();
		
	}
}

