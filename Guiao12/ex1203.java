/*
 * ex1203.java
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

public class ex1203 {
	
	static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		int in;
		Robo[] r = new Robo[50];
		
		do
		{
			System.out.println("\n");
			System.out.println("Micro-Rato 2013 - Gestão da prova:");
			System.out.println("1 - Adicionar informação relativa a um robô");
			System.out.println("2 - Imprimir informação dos robos em prova");
			System.out.println("3 - Vencedor da prova e tempos médios de prova");
			System.out.println("4 - Média do número de elementos por equipa");
			System.out.println("5 - Mostrar o nome dos robôs em maiúsculas");
			System.out.println("6 - Alterar informação de um robô");
			System.out.println("7 - Remover robôs da competição");
			System.out.println("8 - Gravar informação da prova num ficheiro");
			System.out.println("9 - Terminar o programa");
			System.out.print("Opção -> ");
			in = sc.nextInt();
			
			switch (in)
			{
				case 1:
					adicionarRobo(r);
					break;
					
				case 2:
					printRobo(r);
					break;
				
				case 3:
					vencedorDados(r);
					break;
				
				case 4:
					mediaEquipa(r);
					break;
				
				case 5:
					OrdemNomesRobos(r);
					break;
				
				case 6:
					alterarInfRobo(r);
					break;
					
				case 7:
					removerRobo(r);
					break;
					
				case 8:
					gravarFich(r);
					break;
				
				case 9:
					System.exit(0);
					break;
					
				default:
					System.out.println("Opção inválida!");
					System.out.print("Inserir novamente: ");
					in = sc.nextInt();
					break;
			}
		} while (in != 9);
		
	}
	
	public static void adicionarRobo(Robo[] r) {
		
		int n = countRobo(r);
		
		r[n] = new Robo();
		System.out.print("Nome do robô: ");
		r[n].nome = sc.next();
		System.out.print("\nTempo de prova (sem segundos): ");
		r[n].time = sc.nextInt();
		System.out.print("\nNúmero de Elementos da Equioa: ");
		r[n].elem = sc.nextInt();
		System.out.println();
		
	}
	
	public static void printRobo(Robo[] r) {
		
		int n = countRobo(r);
		
		for (int i = 0; i < n; i++)
		{
			System.out.printf("\nRobô: " + (i+1));
			System.out.printf("\nNome: " + r[i].nome);
			System.out.printf("\nTempo: " + secToHour(r[i].time));
			System.out.printf("\nNúmero de Elementos da Equipa: " + r[i].elem);
			
		}
		System.out.println();
		
	}
	
	public static void vencedorDados (Robo[] r) {
		
		int n = countRobo(r);
		int pos=-1;
		int best= Integer.MAX_VALUE;
		int med = 0; 
		int sum = 0;
		
		for (int i = 0; i < n; i++)
		{
			sum += (r[i].time);
			if (r[i].time < best)
			{
				best = r[i].time;
				pos = i;
			}
		}
		med = sum / n;
		
		System.out.printf("\nO robô vencedor foi " +r[pos].nome+ " e o tempo médio foi de " + secToHour(med) + ".\n");
		
	}
	
	public static void mediaEquipa (Robo[] r) {
		
		int n = countRobo(r), sum = 0, med;
		
		for (int i = 0; i < n; i++)
		{
			sum += r[i].elem;
		}
		med = sum/n;
		
		System.out.println("\nMédia do número de Elementos por equipa: " + med);
		
	}
	
	public static void OrdemNomesRobos (Robo[] r) {
		
		int n = countRobo(r);
		boolean troca = false;
		
		do
		{
			for (int i = 0; i < n-1; i++)
			{
				troca = false;
				if (Character.getNumericValue(r[i].nome.charAt(0)) > Character.getNumericValue(r[i+1].nome.charAt(0)))
				{
					Robo[] temp = new Robo[1];
					temp[0] = r[i];
					r[i] = r[i+1];
					r[i+1] = temp[0];
					troca = true;
				}
			}
			
		} while (troca);
		
		System.out.println("\nNomes: ");
		for (int i = 0; i < n; i++)
		{
			System.out.println("\n");
			String s = r[i].nome;
			for (int j = 0; j < s.length(); j++)
			{
				System.out.print(Character.toUpperCase(s.charAt(j)));
			}
		}
		System.out.println();
		
	}
	
	public static void alterarInfRobo (Robo[] r) {
		
		int n = countRobo(r);
		int pos = -1;
		String name;
		
		System.out.println();
		System.out.print("Nome do robô que seja alterar: ");
		name = sc.nextLine();
		
		for (int i = 0; i < n; i++)
		{
			if (r[i].nome.indexOf(name) != -1)
			{
				pos = i;
			}
		}
		
		if (pos == -1)
		{
			System.out.println("O robô não existe");
		} else
		{
			System.out.print("Novo nome: ");
			r[pos].nome = sc.nextLine();
			System.out.print("Temp (em segundos): ");
			r[pos].time = sc.nextInt();
			System.out.print("Número de elementos: ");
			r[pos].elem = sc.nextInt();
			System.out.println();
		}
	}
	
	public static void removerRobo (Robo[] r) {
		
		int sec, n=countRobo(r);
		boolean troca = false;
		
		System.out.print("Inserir em segundos o tempo limite de prova: ");
		sec = sc.nextInt();
		
		do
		{
			n = countRobo(r);
			troca = false;
			
			for (int i = 0; i < n; i++)
			{
				if (i != (n-1))
				{
					if (troca)
					{
						r[i] = r[i+1];
						r[i+1] = null;
					} else
					{
						if (r[i].time > sec)
						{
							r[i]= r[i+1];
							r[i+1] = null;
							troca = true;
						}
					}
				} else
				{
					if (troca)
					{
						r[i] = null;
					} else
					{
						if (r[i] == null);
						else if (r[i].time > sec) r[i] = null;
					}
				}
			}
			
		} while (troca);
		
		System.out.print("Operação concluída com sucesso");
		
	}
	
	public static void gravarFich (Robo[] r) throws IOException {
		
		File ficheiro;
		int n = countRobo(r);
		
		while(sc.nextLine().length() != 0);
		System.out.print("Nome do ficheiro para guardar os dados dos robôs: ");
		String name = sc.nextLine();
		ficheiro = new File (name);
		
		PrintWriter write = new PrintWriter(ficheiro);
		
		for (int i = 0; i < n; i++)
		{
			write.println(r[i].nome+"\t"+secToHour(r[i].time)+"\t"+r[i].elem+"\n");
		}
		System.out.println("Copiado com suceso!\n");
		
		write.close();
	}
	
	public static int countRobo(Robo[] r) {
		
		int n;
		for (n = 0; n < 50; n++)
		{
			if (r[n] == null)
			{
				break;
			}
		}
		return n;
		
	}
	
	public static String secToHour (int sec) {
		
		String time;
		int hour = 0, min = 0;
		
		min = sec/60;
		sec = sec%60;
		hour = min/24;
		min=min%24;
		
		time = hour+":"+min+":"+sec;
		
		return time;
		
	}
}

class Robo {
	String nome;
	int time;
	int elem;  //elementos da equipa
}
