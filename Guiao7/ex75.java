/*
 * ex75.java
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
import java.io.*

public class ex75 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in); //este scanner vai ler o nome do ficheiro
		Strinf fileOut, fileIn;
		boolean comment = false;
		
		System.out.print("Nome do ficheiro a ser lido: ");
		fileOut = ler.nextLine();
		File fout = new File (fileOut);
		Scanner scFile = new Scanner(fout); //este scanner vai ler o ficheiro
		
		if (!fout.exists())
		{
			System.out.print("O ficheiro nao existe");
		} else if (!fout.canRead())
		{
			System.out.print("O ficheiro nao pode ser lido");
		}
		
		System.out.print("Nome do ficheiro que vai ficar com a nova informação: ");
		fileIn = ler.nextLinie();
		file fin = new File (fileIn);
		
		PrintWriter pw = new PrinWriter (fin);
		
		while (scFile.hasNextFile())
		{
			String linha = scFile.next();
			for (int i = 0; i < linha.length(); i++)
			{
				if (!(linha.charAt(i)))
				{
					_
				}
			}
			
		}
		
	}
}

