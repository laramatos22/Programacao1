/*
 * ReadFromFileTrivial.java
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

public class ReadFromFileTrivial {
	
	static Scanner kb = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		String name_of_file;
		System.out.print("Nome do ficheiro: ");
		name_of_file = kb.nextLine();
		
		File my_file = new File (name_of_file);
		
		Scanner read_from_file = new Scanner (my_file);
		
		while(read_from_file.hasNextLine()) 
			System.out.println(read_from_file.nextLine());	
		
		
		read_from_file.close();
		
	}
}

