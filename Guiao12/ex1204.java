/*
 * ex1204.java
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

public class ex1204 {
	
	static final Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException{
		
		int a;
		int [][] alunos = null;
		
		do
		{
			System.out.println("Serviços Académicos - Gestão de uma pauta:");
			System.out.println("\t1 - Ler ciheiros com números mecanográficos e pedir informação de notas");
			System.out.println("\t2 - Imprimir no terminal a informação da disciplina");
			System.out.println("\t3 - Calcular estatísticas das notas finais");
			System.out.println("\t4 - Alterar as notas de um aluno");
			System.out.println("\t5 - Imprimir um diagrama de notas");
			System.out.println("\t6 - Gravar num ficheiro a informação da disciplina");
			System.out.println("\t7 - Terminar o programa");
			System.out.print("Opção -> ");
			a = sc.nextInt();
			
			switch (a)
			{
				case 1:
					alunos = lerFich();
					break;
				
				case 2:
					print(alunos);
					break;
					
				case 3:
					stats(alunos);
					break;
				
				case 4:
					change(alunos);
					break;
				default:
					_
			}
			
			
		} while (_)
		
		
	}
}

