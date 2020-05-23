/*
 * retangulo.java
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

public class retangulo {
	
	static Random rand = new Random();
	
	public static void main (String[] args) {
		
		Retangulo rect = new Retangulo();
		G(rect);
		System.out.println("lado A = " + rect.ladoA);
		System.out.println("lado B = " + rect.ladoB);
		
		System.out.println("Diagonal = " + Diag(rect));
		
		System.out.println("Diferença = " + Dif(rect));
		
	}
	
	public static void G(Retangulo R) {
		
		R.ladoA = (double)(rand.nextInt(8) + 2);
		R.ladoB = (double)(rand.nextInt(8) + 2);
		
	}
	
	public static double Diag(Retangulo R) {
		
		return Math.sqrt(Math.pow(R.ladoA,2) + Math.pow(R.ladoB,2));
		
	}
	
	public static double Dif(Retangulo R) {
		
		return Math.abs(R.ladoA - R.ladoB);
		
	}
}

class Retangulo {
	double ladoA;
	double ladoB;
	double diagonal;
}

