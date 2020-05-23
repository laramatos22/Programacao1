/*
 * TestCommandLine.java
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

public class TestCommandLine {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException {
		
		File fout = new File("to_write.txt");
		PrintWriter pw = new PrintWriter(fout);
		String nameIn;
		System.out.println("args.length = " + args.length);
		
		for (int i = 0; i < args.length; i++)
		{
			pw.println(args[i]);
			System.out.println(args[i]);
		}
		pw.close();		
		
	}
}

