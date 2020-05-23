
import java.util.Scanner;
/*
 * JAM, 17-out-2019
 * Cálculo das raízes reais de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 *  -procurando os pontos em que y = 0;
 */

public class PolinomioRaizesFunc {

    public static void main(String[] args) {
        // Scanner para leitura de dados do teclado
        Scanner ler = new Scanner(System.in);
        // variáveis
        double A1, B1, C1, Xi, Xf; // coeficientes do polinómio
        double dx = 0.1;
        int mais;
        String r;

        // Ler coeficientes A; B; C e intervalo de x
        do {
            System.out.println("Introduza os coeficientes A, B, C do polinomio do 2grau:");
            do {
                A1 = ler.nextDouble();
                if (A1 == 0) {
                    System.out.println("A não pode ser 0, repita:");
                }
            } while (A1 == 0);
            B1 = ler.nextDouble();
            C1 = ler.nextDouble();
            System.out.println("Introduza o intervalo Xinicial e Xfinal:");
            Xi = ler.nextDouble();
            Xf = ler.nextDouble();
            System.out.println("Introduza o delta x:");
            dx = ler.nextDouble();

            r = RaizesPol2(A1, B1, C1, Xi, Xf, dx);
            System.out.printf("%s\n", r);
            
            // Converte string para double .... usando Scanner
            Scanner raiz = new Scanner(r);
            String r1s = raiz.next();
            double r1 = raiz.nextDouble();
            System.out.printf("%s %f%n",r1s,r1);
            
            System.out.print("Para continuar (1) fim (0):");
            mais = ler.nextInt();
        } while (mais == 1);
    }

    /** Cálculo das raízes de um polinómio do grau 2
     *  @param A,B,C coeficientes do polin.
     *  @param xi, xf valores de x inicial e final do intervalo
     *  @param delta valor do incremento de x
     *  @return String com as raízes: "Raiz 1= -2.6100000000000083 Raiz 2= -0.3800000000000199"
     */
    public static String RaizesPol2(double A, double B, double C, double xi,
        double xf, double delta) {
        int npontos, nraizes = 0;
        double x, y, y0;
        String raizes="";

        npontos = (int) ((xf - xi) / delta);
        x = xi;
        y0 = A * x * x + B * x + C;
        for (int i = 0; i < npontos; i++) {
            x = x + delta;
            y = A * x * x + B * x + C;

            if ((y0 > 0 && y <= 0) || (y0 < 0 && y >= 0)) {
                nraizes = nraizes + 1;
                raizes = raizes + " Raiz"+nraizes+"= "+x;
            }
            // imprime resultado
            //~System.out.printf("x, y = % f, % f %n", x, y);
            y0 = y;
        }
        return raizes;
    }
}
