//Code is done by SAGNIK(RA2311003011709)
//Q2 of week 1

import java.util.Scanner;

public class age_for_vote {
    public static void main(String[] args) {
        System.out.print(" Enter your age-->");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Your age is= "+age);

        if(age>=18)
        {
            System.out.println("Congratulation FROM sasa! You are eligible to vote. ");
        }
        else
        {
            System.out.println(" oops! You are not eligible to vote");
        }
    }
}