/*
 * ex72.java
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
import java.io.*;

public class ex72 {
	
	static Scanner sc = new Scanner (System.in);
	static File file;
	
	public static void main (String[] args) throws IOException {
		
		File file = new File(args[0]);
		file_validar();
		lernum();
	}
	
	//validação do nome do ficheiro e do proprio ficheiro
	public static void file_validar() {
		
		if (file.isFile() == false)
		{
			System.out.println("O ficheiro nao existe!");
			System.exit(1);
		} else if (file.canRead() == false)
		{
			System.out.println("O ficheiro nao pode ser lido!");
			System.exit(1);
		} else
		{
			System.out.println("Validação: Done!!");
		}
	}
	
	public static void lernum() throws IOException {
		
		Scanner scf = new Scanner(file);
		int n, rep;
		System.out.print("Introduza o valor de contagem");
		rep = sc.nextInt();
		
		for (int i = 0; i < 100; i++)
		{
			while (file.hasNextLine())
			{
				n = scf.nextInt();
				if (n>0 && n==rep)
				{
					i++;
				}
				if (n<0)
				{
					break;
				}
			}
		}
		
	}
}

