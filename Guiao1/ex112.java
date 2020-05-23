import java.util.Scanner;

public class ex112 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double ss; //variavel de entrada
	double hh, mm; //variavel de saída
	
	System.out.print("Introduza o tempo(sem segundos): ");
	ss = sc.nextDouble();
	
	mm = ss/60;
	ss = ss%60;
	hh = mm/60;
	mm = mm%60;
	
	System.out.printf(hh + ":" + mm + ":" + ss);
	sc.close();
	
	}
}
