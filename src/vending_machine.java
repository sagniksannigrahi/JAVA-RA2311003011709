//Code is done by SAGNIK(RA2311003011709)
//Q3 of week 1

import java.util.Scanner;
public class vending_machine {
        public static void main(String[] args) {
            System.out.println(" Press 1 for juice or 2 for soda.");

            System.out.print(" Enter your choice-->");
            Scanner sc = new Scanner(System.in);
            int number =sc.nextInt();
            System.out.println("Your age is= "+number);

            if(number==1)
            {
                System.out.println("Dispensing juice.");
            }
            else if(number==2)
            {
                System.out.println("Dispensing soda.");
            }
            else
            {
                System.out.println("Invalid choice");
            }
        }
    }


