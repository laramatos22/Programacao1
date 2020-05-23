/*
 * ex86.java
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

public class ex86 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		Dia d = new Dia();
		Dia dia[] = new Dia[5];
		int i=0;
		for (int i = 0; i < dia.length; i++)
		{
			dia[i] = new Dia();
		}
		
		do
		{
			d = input(d, i);
			dia[i] = d;
			i++;
		} while (i<5);
		
		System.out.println(dia[1].amp);
		System.out.println(dia[2].amp);
		amplitudemax(dia);
		
	}
	
	public static Dia input (Dia d, int i) {
		
		for (int g = 0; g < 5; g++)
		{
			dia[g] = new Dia();
		}
		
		while (true)
		{
			System.out.printf("Qual foi a temperatura maxima do dia %d? ", i+1);
			d.tmax = sc.nextDouble();
			if (d.tmax >= -20 && d.tmax <= 50)
			{
				break;
			}
		}
		
		while (true)
		{
			System.out.printf("Qual foi a temperatura minima do dia %d? ", i+1);
			d.tmin = sc.nextDouble();
			if (d.tmin >=-20 && d.tmin <= d.tmax)
			{
				break;
			}
		}
		
		d.amp = d.tmax - d.tmin;
		return d;
		
	}
	
	public static void amplitudemax (Dia dia[]) {
		double ampmax = 0;
		int k = 0;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(dia[i].amp);
			
			if (dia[i].amp > ampmax)
			{
				ampmax = dia[i].amp;
				k = i;
			}
		}
		
		System.out.printf("A amplitude termica maxima foi de %2.1f e ocorreu no dia %d", ampmax, k);
		
	}
}

class Dia {
	double tmin;
	double tmax;
	double amp; 
}
