/*
 * ex82.java
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

public class ex82 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		
		double soma = 0;
		double a = 0;
		double maisafastado = 0;
		Ponto2D p = new Ponto2D();
		Ponto2D p0 = new Ponto2D();
		Ponto2D ma = new Ponto2D();
		//Coordenadas na origem
		p0.x = 0;
		p0.y = 0;
		int con = -1;
		
		do
		{
			p = lerPontos();
			soma += DistPontos(p0,p);
			con++;
			a = DistPontos(p0, p);
			
			if (a > maisafastado)
			{
				maisafastado = a;
				ma = p;
			}
		} while (p.x == 0 && p.y == 0);
		
		System.out.printf("A soma das distâncias dos %d pontos à origem é %2.1f", con, soma);
		
		System.out.printf("O ponto mais afastado da origem foi:");
		writePontos(ma);
		
	}
	
	//função para ler o ponto
	public static Ponto2D lerPontos() {
		
		Ponto2D p = new Ponto2D();
		System.out.println("Introduza um ponto: ");
		System.out.print("Coordenada x: ");
		p.x = sc.nextInt();
		System.out.print("Coordenada y: ");
		p.y = sc.nextInt();
		
		return p;
	}
	
	//função para escrever no monitor um ponto no formato (#.#, #.#)
	public static void writePontos(Ponto2D p) {
		
		System.out.printf("%1.1f;%1.1f", p.x, p.y);
		
	}
	
	//função para o cálculo da distância entre dois pontos
	public static double DistPontos(Ponto2D p1, Ponto2D p2) {
		
		double dist;
		double calculo = Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2);
		dist = Math.sqrt(calculo);
		
		return dist;
	}
	
}

class Ponto2D {
	double x;
	double y;
}

