//Code is done by SAGNIK(RA2311003011709)
//Q8 of week 1
import java.util.Scanner;

public class Leap_year_check {

        public static void main(String[] args) {
            System.out.println(" Give me the year , Which you want to check-->");

            Scanner sc = new Scanner(System.in);
            int year =sc.nextInt();
            System.out.println("Your year is= "+year);

            if(year%4==0)
            {
                System.out.println("It's a Leap-Year");
            }
            else {
                if (year % 400 == 0)
                {
                    System.out.println("It's a Leap-Year");
                }

                else
                {
                    System.out.println("It's NOTa Leap-Year");
            }
        }
    }



}
