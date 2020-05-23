/*
 * JAM, 10-out-2019
 * calcular factorial de n; n!
 */
import java.util.Scanner;

public class FFactorial {

    static Scanner ler = new Scanner(System.in); //variável global: ler é vista por todos os blocos.

    public static void main(String[] args) {

        int n, fact, f0 = 1;

        System.out.print("Factorial de : ");
        n = ler.nextInt();

        fact = 1;
        for (int i = 1; i <= n; i++) {
            // f0
            fact = fact * i;
            //~ System.out.printf(" %3d! = % d %n",i,fact); 	// print passos
        }
        System.out.printf(" %3d! = %d %n",n,factorial(7));				//fact/n == f0 ? fact:-1
        f0 = factorial(f0);
    }
    // funcao factorial
    public static int factorial(int n) {
        int fact = 1, f0=2;
        //~ if (n > 0 && n <13) {
            for (int i = 1; i <= n; i++) {
                f0 = fact;
                fact = fact * i;
            }
        //~ } else fact = -1;
        i++;
        return fact/n == f0 ? fact:-1;
    }
}

