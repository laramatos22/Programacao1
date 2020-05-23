/*
 * JAM, out-2019
 *
 * Nesta classe deve definir novas funções e testá-las na função main.
 */
 
 import java.util.*;

public class Functions {
	
	static Scanner sc = new Scanner(System.in);

	public static void main (String args[]) {
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));

		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		//System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		//System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		//System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);

	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}

	// Defina as funções pedidas no enunciado:
	
	public static double f (double n) {
		n = 1 / (1 + Math.pow(n,2));
		return n;
		}
		
	public static double max (double x, double y) {
		if(x>y) {
			return x;
			} else {
				return y;
				}
		}
		
	public static int max (int x, int y) {
		if (x>y)
		{
			return x;
		} else {
			return y; 
		}
	}
	
	public static double poly3 (double a, double b, double c, double d, double x) {
		double pX;
		pX = a*Math.pow(x,3) + b*Math.pow(x,2) + c*x + d;
		return pX;
		}
		
	public static int fact (int x) {
		int y=1;
		for (int i = 1; i <= x; i++) {
			y*=i;
			}
		return y;
		}
		
	public static int getIntPos() {
		int a;  //valor introduzido no teclado
		do
		{
			System.out.print("Introduzir valor positivo: ");
			a = sc.nextInt();
		} while (a<0);
		return a;
		
		}
		
	public static int getIntRange (int a, int b) {
		int x;
		
		System.out.print("Introduzir número: ");
		x = sc.nextInt();
		
		if (x>a && x<b) {
			System.out.print("O número encontra-se dentro do intervalo");
			} else if (x<a && x>b) {
				System.out.print("O numero encontra-se dentro do intervalo");
				} else {
					System.out.print("O numero nao se encontra dentro do intervalo");
					}
		return x;
		}
		
		public static void printNtimes () {
			String c; //Mensagem q se pretende escrever
			int a;    //o numero de vezes q se pretende repetir a mensagem
			System.out.print("Mensagem: ");
			c = sc.next();
			System.out.print("Vezes:");
			a = sc.nextInt();
			
			for (int i = 1; i <= a; i ++){
				System.out.printf("%s", c);
				}
			}
}
