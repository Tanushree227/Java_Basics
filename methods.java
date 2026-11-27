public class methods {
    public void display()
    {
        System.out.println("Methods: Block of code that performs specific task.");
    }

    //Types of methods in Java
    //1. No parameters No return value
    //2. Parameters No return value
    //3. No parameters but return value
    //4. Parameters and returns a value
    public static void greet()
    {
        System.out.println("Hakuna Matata");
    }

    public static void displayName(String name)
    {
        System.out.println("Hola " +name);
    }

    public static int getID()
    {
        int id = 101;
        return id;
    }

    public static int efficiency(int power, int days)
    {
        return power * days;
    }

    public static void main(String[] args)
    {
        methods m = new methods();
        m.display();
        greet();
        displayName("Thor");
        int id = getID();
        System.out.println("Your ID is: " +id);
        int eff = efficiency(3500, 30);
        System.out.println("Hits with efficiency: " +eff);
    }
}
