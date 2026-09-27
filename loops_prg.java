public class loops_prg {
    public static void main(String[] args)
    {
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
    }
}
