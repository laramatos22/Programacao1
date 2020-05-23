/*
 * ex117.java
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

public class ex117 {
	
	public static void main (String args[]) {
		
	//leitura de valores (Scanner)
	Scanner sc = new Scanner(System.in);
	
	//valores de entrada
	double vprod; //valor dos produtos
	double desc;  //valor do desconto (em percentagem)
	double taxaiva; //valor da tava de IVA 
	
	//valor de saída
	double total;
	
	//valores do teclado
	System.out.print("Valor dos produtos:");
	vprod = sc.nextDouble();
	
	System.out.print("Desconto oferecido:");
	desc = sc.nextDouble();
	
	System.out.print("Taxa de IVA:");
	taxaiva = sc.nextDouble();
	
	//formula
	total = vprod - (vprod * (desc/100)) * (vprod * (taxaiva/100));
	
	//output
	System.out.printf("Total líquido da fatura: " + total);
	
	sc.close();
	}
}

