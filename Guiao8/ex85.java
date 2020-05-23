/*
 * ex85.java
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

public class ex85 {
	
	static Scanner sc = new Scanner (System.in);
	static DadosPessoa person = new DadosPessoa();
	static double tas;
	
	public static void main (String[] args) {
		String resp;
		
		while (true)
		{
			dadospessoa();
			tas();
			output();
			
			System.out.println("Deseja continuar? ");
			resp = sc.nextLine();
			if (resp.equals("nao"))
			{
				System.exit(1);
			} else
			{
				System.out.println();
				continue;
			}
		}
		
	}
	
	//função a pedir os dados pessoais da pessoa
	public static void dadospessoa() {
		System.out.print("Nome: ");
		person.nome = sc.nextLine();
		
		while(true) 
		{
			System.out.print("Sexo(m/f):");
			person.sexo = sc.nextLine().charAt(0);
			if (person.sexo == 'm' || person.sexo == 'f')
			{
				break;
			}
			else
			{
				System.out.println("Sexo invalido!");
			}
		}
		
		while (true)
		{
			System.out.print("Peso(kg): ");
			person.peso = sc.nextDouble();
			if (person.peso > 0)
			{
				break;
			} else
			{
				System.out.println("Peso invalido!");
			}
		}
		
		while (true)
		{
			System.out.print("Quantidade de bebida(mL): ");
			person.quant = sc.nextDouble();
			if (person.quant > 0)
			{
				break;
			} else
			{
				System.out.println("Quantidade de bebida inválida!");
			}
		}
		
		while (true)
		{
			System.out.print("Teor Alcoólico: ");
			person.teor = sc.nextDouble();
			if (person.teor > 0)
			{
				break;
			} else
			{
				System.out.println("Teor alcoólico invalido!");
			}
		}
		
		while (true)
		{
			System.out.print("Foi consumida em jejum? (sim/nao): ");
			String resp = sc.nextLine();
			if (resp.equals("sim"))
			{
				person.jejum = true;
				break;
			} else if (resp.equals("nao"))
			{
				person.jejum = false;
				break;
			} else
			{
				System.out.println("Resposta inválida!");
			}
		}
	}
	
	public static void tas() {
		
		double coef = 0;
		double densidade = 0.8;
		double tas = 0;
		
		if (person.jejum = true)
		{
			if (person.sexo == 'm')
			{
				coef = 0.7;
			}
			if (person.sexo == 'f')
			{
				coef = 0.6;
			}
		} else
		{
			coef = 1.1;
		}
		
		System.out.println(coef);
		
		tas = (densidade*person.quant*(person.teor/100)) / (person.peso*coef);
	}
	
	public static void output() {
		System.out.println();
		System.out.println(person.nome);
		System.out.println("TAS: " + tas);
		System.out.println();
	}
}

class DadosPessoa {
	String nome;
	char sexo;
	Double peso, quant, teor;
	boolean jejum = true;
}
