import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many employees you want to calculate the SIMPLE INTEREST for sagnik:");
        int numberOfEmployees = sc.nextInt();

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee " + i + ":");

            System.out.print("Enter the principal: ");
            int principal = sc.nextInt();

            System.out.print("Enter the rate: ");
            float rate = sc.nextFloat();

            System.out.print("Enter the number of years: ");
            int numberOfYears = sc.nextInt();

            float simpleInterest = (principal * rate * numberOfYears) / 100;
            System.out.println("Your simple interest is: " + simpleInterest);
            System.out.println();
        }

        sc.close();
    }
}
