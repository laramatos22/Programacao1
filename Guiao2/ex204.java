/*
 * ex204.java
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

public class ex204 {
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano, mes, dias;
		bool
		ean bis, meses;
		
		System.out.print("Mês: ");
		mes = sc.nextInt();
		System.out.print("Ano: ");
		ano = sc.nextInt();
		
		//calculos
		//anos bissextos
		bis = (((ano%4==0) && !(ano%100==0)) || (ano%400==0));
		//meses com 31 dias
		meses = ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12));
		
		if ((bis == true) && (mes == 2)) {
			System.out.printf("O mês tem 29 dias");
			} else if ((bis == false) && (mes == 2)) {
				System.out.printf("O mês tem 28 dias");
				} else if (meses == true) {
					System.out.printf("O mês tem 31 dias");
					} else {
						System.out.printf("O mês tem 30 dias");
						}
	}
}

