/*
 * ex1201.java
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
import static java.lang.System.*;

public class ex1201 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		int opcao;
		Data arrData[] = new Data[31];
		
		do
		{
			System.out.println("\nEstação Meteorológica:");
			System.out.println("\n1 - Ler ficheiro de dados");
			System.out.println("\n2 - Acrescentar medida");
			System.out.println("\n3 - Listar valores de temperatura e humidade");
			System.out.println("\n4 - Listar medidas ordenadas por valor de temperatura");
			System.out.println("\n5 - Listar medidas ordenadas por valor de humidade");
			System.out.println("\n6 - Calcular valores médios de temperatura e humidade");
			System.out.println("\n7 - Calcular vaores máximos e mínimos de temperatura e humidade");
			System.out.println("\n8 - Calcular histograma das temperaturas e humidade");
			System.out.println("\n9 - Terminar programa");
			System.out.print("Opção -> ");
			opcao = sc.nextInt();
			
			switch (opcao)
			{
				case 1:
					readFile(arrData);
					break;
				case 2:
					addData(arrData);
					break;
				case 3:
					showData(arrData);
					break;
				case 4:
					tempCresc(arrData);
					break;
				case 5:
					humDecresc(arrData);
					break;
				case 6:
					valMed(arrData);
					break;
				case 7:
					extr(arrData);
					break;
				case 8:
					histogramaTemp(arrData);
					histogramaHum(arrData);
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.print("Valor inválido!");
					break;
			}
			
		} while (opcao != 9);
		
	}
	
	public static void readFile(Data[] a) throws IOException {
		
		String fich;
		File fichDados;
		int i = countDatas(a);
		
			do
			{
				System.out.print("Nome do ficheiro a ler: ");
				fich = sc.nextLine();
				fichDados = new File(fich);
			} while (!fichDados.canRead() || !fichDados.exists() || !fichDados.isFile());
			
			Scanner lerFile = new Scanner(fichDados);
			
			while (lerFile.hasNextLine())
			{
				if (i == 31) break;
				if(!lerFile.hasNext());
				
				a[i] = new Data();
				a[i].temp = lerFile.nextInt();
				a[i].hum = lerFile.nextInt();
				i++;
			}
			System.out.print("Valores inseridos com sucesso!!");
			
			lerFile.close();
			
	}
	
	public static void addData (Data[] a) {
		
		int n = countDatas(a);
		int temp;
		
		if (n == 31)
		{
			System.out.println("A base de dados está completa! ");
		} else
		{
			a[n] = new Data();
		}
		
		do
		{
			System.out.print("Inserir nova temperatura: ");
			temp = sc.nextInt();
		} while (temp < -10 || temp > 40);
		a[n].temp = temp;
		
		do
		{
			System.out.print("Inserir nova humidade: ");
			temp = sc.nextInt();
		} while (temp < 0 || temp > 100);
		a[n].hum = temp;
		
		System.out.print("Os novos dados foram armazenados com sucesso!");
		
	}
	
	public static void showData(Data[] a) {
			
		int n = countDatas(a);
		
		System.out.println();
		System.out.print("Temperatura: \t Humidade: \n");
		for (int i = 0; i < n; i++)
		{
			System.out.printf("%12d\t%9d\n", a[i].temp, a[i].hum);
		}
		System.out.println();
			
	}
	
	public static void tempCresc(Data[] a) {
		
		int n=countDatas(a);
		boolean change;
		
		do
		{
			change = false;
			
			for (int i = 0; i < n-1; i++)
			{
				if (a[i].temp > a[i+1].temp)
				{
					Data[] temp = new Data[1];
					temp[0] = a[i];
					a[i] = a[i+1];
					a[i+1] = temp[0];
					change = true;
				}
			}
			
		} while (change);
		
		showData(a);
	}
	
	public static void humDecresc(Data[] a) {
		
		int n = countDatas(a);
		boolean change;
		
		do
		{
			change = false;
			
			for (int i = 0; i < n-1; i++)
			{
				if (a[i].hum < a[i+1].hum)
				{
					Data[] temp = new Data[1];
					temp[0] = a[i];
					a[i] = a[i+1];
					a[i+1] = temp[0];
					change = true;
				}
			}
			
		} while (change);
		
		showData(a);
		
	}
	
	public static void valMed (Data[] a) {
		
		int n = countDatas(a);
		int tempMed, humMed;
		boolean change;
		
		do
		{
			change = false;
			
			for (int i = 0; i < n-1; i++)
			{
				if (a[i].temp > a[i+1].temp)
				{
					Data[] temp = new Data[1];
					temp[0] = a[i];
					a[i] = a[i+1];
					a[i+1] = temp[0];
					change = true;
				}
			}
			
		} while (change);
		
		tempMed = a[(n-1)/2].temp;
		
		do
		{
			change = false;
			
			for (int i = 0; i < n-1; i++)
			{
				if (a[i].hum > a[i+1].hum)
				{
					Data[] temp = new Data[1];
					temp[0] = a[i];
					a[i] = a[i+1];
					a[i+1] = temp[0];
					change = true;
				}
			}
			
		} while (change);
		
		humMed = a[(n-1)/2].hum;
		
		System.out.printf("Valor médio da temperatura = " + tempMed);
		System.out.printf("Valor médio da humidade = " + humMed);
		
	}
	
	public static void extr(Data[] a) {
		
		int n = countDatas(a);
		int maxTemp = -10, maxHum = 0, minTemp = 40, minHum = 100;
		
		for (int i = 0; i < n; i++)
		{
			if (maxTemp < a[i].temp)
			{
				maxTemp = a[i].temp;
			}
			
			if (maxHum < a[i].hum)
			{
				maxHum = a[i].hum;
			}
			
			if (minTemp > a[i].temp)
			{
				minTemp = a[i].temp;
			}
			
			if (minHum > a[i].hum)
			{
				minHum = a[i].hum;
			}
		}
		
		System.out.printf("Valor máximo de temperatura: " + maxTemp);
		System.out.printf("Valor mínimo de temperatura: " + minTemp);
		System.out.printf("Valor máximo de humidade: " + maxHum);
		System.out.printf("Valor mínimo de humidade: " + minHum);
		
	}
	
	public static void histogramaTemp (Data[] a) {
		
		int n = countDatas(a);
		
		System.out.println();
		System.out.println("\n\nHistograma de Tempratura");
		System.out.println("\n--------------------------");
		
		for (int i = -10; i <= 40; i++)
		{
			System.out.printf("\n%3d | ",i);
			System.out.print(counts(i, "temp", a) + "\n");
		}
	}
	
	public static void histogramaHum(Data[] a) {
		
		int n = countDatas(a);
		
		System.out.println("\n\nHistograma da humidade");
		System.out.println("\n------------------------");
		
		for (int i = 0; i <= 100; i++)
		{
			System.out.printf("\n%3d | ", i);
			System.out.print(counts(i, "hum", a) + "\n");
		}
		
	}
	
	public static String counts(int i, String a, Data[] z) {
			
		String res = "";
		int n = countDatas(z);
		
		switch (a)
		{
			case "temp":
				for (int j = 0; j < n; j++)
				{
					if (i == z[j].temp)
					{
						res += "*";
					}
				}				
				break;
			
			case "hum":
				for (int j = 0; j < n; j++)
				{
					if (i == z[j].hum)
					{
						res += "*";
					}
				}
				break;
		}
		return res;
		
	}
	
	public static int countDatas(Data[] a) {
		
		int i = 0;
		
		for (int n = 0; n < 31; n++)
		{
			if (a[n] == null)
			{
				break;
			} else
			{
				n++;
			}
		}
		return i;
	}
	
}

class Data {
	int temp;
	int hum;
}

