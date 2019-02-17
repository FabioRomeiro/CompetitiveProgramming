import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) 
        {
            int number = scanner.nextInt();
            if (number == 42) break;
            System.out.println(number);
        }
    }
}
