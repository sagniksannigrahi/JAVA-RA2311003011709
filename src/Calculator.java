//Code is done by SAGNIK(RA2311003011709)
//Q7 of week 1

import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            System.out.print(" Enter 1 for addition or 2 for subtraction-->");
            Scanner sc = new Scanner(System.in);
            int value=sc.nextInt();
            System.out.println("Your given choice is="+value);

            if(value==1)
            {
                System.out.print("What will be the two numbers-->");
                Scanner sc1 = new Scanner(System.in);
                int a= sc1.nextInt();
                int b= sc1.nextInt();

                int add=a+b;
                System.out.println(" The value of the addition is-->"+add);
            }

            else if(value==2)
            {
                System.out.println("What will be the two numbers -->");
                Scanner sc1 = new Scanner(System.in);
                int c= sc1.nextInt();
                int d= sc1.nextInt();

                int subs=c-d;
                System.out.println(" The value of the addition is-->"+subs);
            }
            else
            {
                System.out.println("Invalid chocies");
            }
        }
    }


