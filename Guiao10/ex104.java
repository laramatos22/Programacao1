/*
 * ex104.java
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

public class ex104 {
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException {
		
		Aluno104 [] inf = new Aluno104[1];
		int op;
		
		while (true)
		{
			System.out.println("");
			System.out.println("\nMenu:");
			System.out.println("1- Ler Ficheiro");
			System.out.println("2- Procurar Nmecs por pesquisa binaria");
			System.out.println("3- Sair");
			op = sc.nextInt();
			
			switch (op)
			{
				case 1:
					inf = readFile();
					break;
				
				case 2:
					lookName(inf);
					break;
				
				case 3:
					System.exit(0);
					break;
			}
			
		}
		
	}
	
	public static Aluno104[] readFile() throws IOException {
		
		int meca;
		String [] nomes;
		String [] mecs;
		String firstname = "", secondname = "", linhamec = "", nomedoficheiro, linhanome = "";
		File ficheiro;
		
		while (true)
		{
			System.out.println("Nome do ficheiro: ");
			nomedoficheiro = sc.next();
			ficheiro = new File (nomedoficheiro);
			
			if (ficheiro.isFile() || ficheiro.canRead())
			{
				break;
			} else
			{
				System.out.println("Nome do ficheiro inválido");
			}
		}
		
		Scanner sf = new Scanner (ficheiro);
		while (sf.hasNext())
		{
			meca = sf.nextInt();
			firstname = sf.next();
			secondname = sf.next();
			linhamec += meca + " ";
			linhanome = firstname + " " + secondname + "/";
		}
		
		mecs = linhamec.split(" ");
		nomes = linhanome.split("/");
		Aluno104[] inf = new Aluno104[mecs.length];
		
		for (int i = 0; i < mecs.length; i++)
		{
			System.out.println(nomes[i]);
		}
		
		for (int i = 0; i < mecs.length; i++)
		{
			inf[i].mec = Integer.parseInt(mecs[i]);
		}
		sf.close();
		return inf;
		
	}
	
	public static void lookName (Aluno104 inf[]) {
		
		int rep;
		
		while (true)
		{
			int mec;
			int inicio = 0, fim = inf.length - 1, meio;
			int haValor = -1;
			System.out.println("Procura de alunos");
			System.out.print("Nmec -> ");
			mec = sc.nextInt();
			
			do
			{
				meio = (fim + inicio) / 2;
				
				if (mec > inf[meio].mec)
				{
					inicio = meio + 1;
				}
				
				if (mec < inf[meio].mec)
				{
					haValor = meio;
				} else if (mec == inf[meio].mec)
				{
					haValor = meio;
				}
			} while (haValor == -1 && inicio <= fim);
			
			if (haValor == -1)
			{
				System.out.println("Esse aluno nao existe");
			}
			
			if (haValor != -1)
			{
				System.out.printf("O aluno com nmec %d chama-se %s", inf[haValor], inf[haValor].mec);
			}
			System.out.println("Quer repetir(1) ou terminar(0)?");
			rep = sc.nextInt();
			
			if (rep == 0)
			{
				break;
			}
		}
		
	}
	
}

class Aluno104 {
	String nome;
	int mec;
}

