//Q)1Write a program that asks the user to enter a number. Use an if statement to check if the number is even or odd: • If the number divided by 2 has a remainder of 0 (even number), print "The number is even." • Otherwise (odd number), print "The number is odd."

//Code is done by SAGNIK(RA2311003011709)
//Q1 of week 1
import java.util.Scanner;

public class Odd_Number_Check {
    public static void main(String[] args) {
        System.out.print(" Enter your number as sagnik want-->");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Your given number is="+a);

        if(a%2==0)
        {
            System.out.println(" Your number is even");
        }
        else
        {
            System.out.println("Your number is odd");
        }
    }
}