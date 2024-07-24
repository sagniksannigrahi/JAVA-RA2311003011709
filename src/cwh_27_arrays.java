import java.util.Scanner;

public class cwh_27_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        int[][] arr = new int[3][4];

        System.out.println("Enter array elements:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }


    }
}
