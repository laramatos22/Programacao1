import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
	//Escrita da hora no terminal com o formato HH:MM:SS
	public static void printHora (Hora relogio) {
		System.out.printf("%2d:%2d:%2d", relogio.h, relogio.m, relogio.s);
	}
	
	public static Hora lerHora(){
		
		Hora relogio = new Hora();
		int horas, minutos, segundos;
		
		do
		{
			System.out.print("horas? ");
			horas = sc.nextInt();
		} while (horas<0 || horas>23);
		
		do
		{
			System.out.print("minutos? ");
			minutos = sc.nextInt();
		} while (minutos<0 || minutos>59);
		
		do
		{
			System.out.print("segundos? ");
			segundos = sc.nextInt();
		} while (segundos<0 || segundos>59);
		
		relogio.h = horas;
		relogio.m = minutos;
		relogio.s = segundos;
		
		return relogio;
	}
}

class Hora {
	int h;
	int m;
	int s;
}

/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
