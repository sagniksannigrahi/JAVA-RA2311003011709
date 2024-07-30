import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 2;
        do {
            sum =sum+ i;
            i =i+2;
        } while (i <= n);
        System.out.println("The sum of even numbers from 1 to " + n + " as sagnik want is " + sum);
    }
}
