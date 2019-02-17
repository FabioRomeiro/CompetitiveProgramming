import java.util.Scanner;
import java.lang.StringBuffer;

class Main 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= number; i++) 
        {
            String palavra = scanner.nextLine();
            StringBuffer stringBuffer = new StringBuffer(palavra);
            boolean isPalindromo = stringBuffer.reverse().toString().equals(palavra);
            System.out.println(i + ((isPalindromo) ? " \"YES\"" : " \"NO\""));
        }
    }
}