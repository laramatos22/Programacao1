/*
 * ex115.java
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

public class ex115 {
	
	public static void main (String args[]) {
	
	//Scanner de leitura de dados
	Scanner sc = new Scanner(System.in);
	
	//valores de entrada
	double tp1, tp2, api, ep;
	
	//valor de saída
	double notafinal;
	
	//valores do teclado
	System.out.print("Avaliação do Aluno:\n");
	System.out.print("TP1:");
	tp1 = sc.nextDouble();
	System.out.print("TP2:");
	tp2 = sc.nextDouble();
	System.out.print("API:");
	api = sc.nextDouble();
	System.out.print("EP:");
	ep = sc.nextDouble();
	
	//formula
	notafinal = ((tp1 * 0.15) + (tp2 * 0.15) + (api * 0.30) + (ep * 0.40));
	
	System.out.printf("A nota final do aluno é de:" + notafinal);
	}
}

