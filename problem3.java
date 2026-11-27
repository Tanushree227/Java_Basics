import java.util.Scanner;

public class problem3 {
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance(in KM): ");
        double distance = sc.nextDouble();

        System.out.print("Enter the fuel consumed(in litres): ");
        double fuel = sc.nextDouble();

        double avgFuel = distance/fuel;
        System.out.println("avg fuel economy: " +avgFuel+ "kmpl");

        System.out.println("1. Dist estimation");
        System.out.println("2. Fuel estimation");
        System.out.print("Enter your choice(0 to stop): ");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.print("Fuel consumed");
        }
    }
}
