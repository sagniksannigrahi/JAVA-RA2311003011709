//Code is done by SAGNIK(RA2311003011709)
//Q4 of week 1
import java.util.Scanner;

public class temperature_check {

    public static void main(String[] args) {
        System.out.print(" HEY SAGNIK What is the current temperature (in degree celsius)-->");
        Scanner sc = new Scanner(System.in);
        int temperature=sc.nextInt();
        System.out.println("The temperature  is= "+temperature);

        if(temperature>30)
        {
            System.out.println("It's hot!" );
        }
        else if(20<temperature && temperature<30)
        {
            System.out.println(" It's warm.");
        }
        else if (10< temperature && temperature<20)
        {
            System.out.println("It's cool.");
        }

        else
        {
            System.out.println("It's cold.");
        }
    }
}