import java.util.Scanner;

public class ex110 {

	public static void main(String[] args) {
	
	//Scanner para leitura de dados do teclado
	Scanner sc = new Scanner(System.in);
	
	double temp; //variável de entrada
	double far;  //variável de saída
	
	System.out.print("Introduza a temperatura (em celcius): ");
	temp = sc.nextDouble();
	
	far = 1.8*temp + 32;
	
	System.out.printf(temp + "º Celcius é equivalente a" + far + "º Fahrenheit");
	sc.close();  //para fechar o Scanner
	}
}
