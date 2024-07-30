public class patern {
    public static void main(String[] args) {

        int i,j;

        i=1;
        while(i<5)
        {
            j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println(" ");
            i++;
        }
    }
}
