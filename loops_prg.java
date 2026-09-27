import java.util.*;
public class loops_prg {
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i);
            i++;
        }

        for(int j = 1; j <= 10; j++)
        {
            System.out.println(j);
        }

        int k = 1;
        do
        {
            System.out.println(k);
            k++;
        }while(k <= 10);
    }
}
