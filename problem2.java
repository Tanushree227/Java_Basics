import java.util.Scanner;

public class problem2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fee = 50000;
        double increase = fee * (5.0/100);
        for(int i = 1; i <= 10; i++)
        {
            fee = fee + increase;
            System.out.println("The fee after "+i+" year = " +fee);
        }
    }
}
