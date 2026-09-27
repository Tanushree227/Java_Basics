public class loops_prg {
    public static void main(String[] args)
    {
        //for loop
        System.out.println("Multiplication table of 2 using for loop");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("2 * " +i+ " = " +2*i);
        }

        String[]  avengers = {"Ironman", "Hulk", "Captain America", "Thor", "Black Widow"};
        System.out.println("The OG Marvels");
        for (String m : avengers)
        {
            System.out.println(m);
        }

        //while loop
        System.out.println("Multiplication Table of 3 using while loop");
        int j = 1;
        while(j <= 10)
        {
            System.out.println("3 * " +j+ " = " +3*j);
            j++;
        }

        //do-while
        System.out.println("Multiplication Table of 4 using do-while loop");
        int k = 1;
        do {
            System.out.println("4 * " +k+ " = " +4*k);
            k++;
        }while(k <= 10);
    }
}
