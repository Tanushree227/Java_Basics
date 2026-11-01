import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in KG: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in CMs: ");
        double heightCM = sc.nextDouble();

        double heightM = heightCM / 100;

        double BMI = weight / (heightM * heightM);

        if (BMI < 18.5) {
            System.out.println("Underweight!");
        } else if (BMI >= 18.5 && BMI < 24.9) {
            System.out.println("Normal");
        } else if (BMI >= 24.9 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
