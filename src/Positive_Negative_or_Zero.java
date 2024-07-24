//Code is done by SAGNIK(RA2311003011709)
//Q5 of week 1
import java.util.Scanner;

public class Positive_Negative_or_Zero {
        public static void main(String[] args) {
            System.out.print(" Enter your number-->");
            Scanner sc = new Scanner(System.in);
            int number=sc.nextInt();
            System.out.println("Your given number is="+number);

            if(number>0)
            {
                System.out.println(" The number is positive.");
            }
            else if(number<0)
            {
                System.out.println("The number is negative");
            }

            else
            {
                System.out.println("The number is zero");
        }
    }

}
