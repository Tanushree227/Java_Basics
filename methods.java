public class methods {
    public void display()
    {
        System.out.println("This is being called from user defined method");
    }

    public static void main(String[] args)
    {
        methods m = new methods();
        m.display();
    }
}
