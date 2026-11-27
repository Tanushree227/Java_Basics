public class methods {
    public void display()
    {
        System.out.println("Methods: Block of code that performs specific task.");
    }

    //Types of methods in Java
    //1. No parameters No return value
    public static void greet()
    {
        System.out.println("Hakuna Matata");
    }

    public static void main(String[] args)
    {
        methods m = new methods();
        m.display();
        greet();
    }
}
