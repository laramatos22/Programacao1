import java.util.Scanner;

public class ex111 {

	public static void main(String[] args) {
	
	
	//Scanner para ler dados do teclado
	Scanner sc = new Scanner (System.in);
	
	double qd, tc; //valores de entrada
	double conv;   //valores de saída
	
	System.out.print("Quantia em dólares: ");
	qd = sc.nextDouble();
	System.out.print("Taxa de conversao: ");
	tc = sc.nextDouble();
	
	//formula
	conv = qd*tc;
	
	System.out.printf(qd + "dólares é equivalente a " + conv + " euros");
	
	}
}
