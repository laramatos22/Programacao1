/*
 * ex71.java
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
import java.io.File;
import java.io.PrintWriter;

public class ex71 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
	
		System.out.print("Nome do ficheio: ");
		String FileName;
		FileName = sc.nextLine();
		File fin = new File (FileName);
		
		if ((!fin.isFile()) && (!fin.canRead()))
		{
			System.out.printf("O ficheiro " + FileName + " é um ficheiro normal com permissao de leitura");
		} else
		{
			System.out.printf("O ficheiro " + FileName + " não é um ficheiro normal com permissao de leitura");
		}
		
	}
}

