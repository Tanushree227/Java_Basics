import java.util.Scanner;

public class prg_conditional {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 28)
        {
            System.out.println("Eligible for marriage");
        }

        int i = sc.nextInt();
        if(i % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
        System.out.println("Program executed successfully");
    }
}
