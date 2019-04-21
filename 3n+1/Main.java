import java.util.Scanner;
import java.lang.Math;

public class Main{

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int maiorNum = Math.max(i,j);
            int menorNum = Math.min(i,j);
            int maiorCiclo = 1;
            for(int n = menorNum; n <= maiorNum; n++) {
                int tamanhoCiclo = calcAlgo(n);
                if (tamanhoCiclo > maiorCiclo) maiorCiclo = tamanhoCiclo;
            }
            System.out.println(i + " " + j + " " + maiorCiclo);
        }
    }

    private static int calcAlgo(int n) {
        int tamanhoCiclo = 1;
        while (n != 1) {
            n = (n % 2 != 0) ? 3 * n + 1 : n / 2;
            tamanhoCiclo++;
        }
        return tamanhoCiclo;
    }
}