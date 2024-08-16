import java.util.Random;
import java.util.Scanner;


public class largest_number {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Get the size of the array from the user
                System.out.print("As for sagnik , Enter the size of the array: ");
                int size = scanner.nextInt();

                System.out.print("Enter the minimum value for random numbers: ");
                int minValue = scanner.nextInt();

                System.out.print("Enter the maximum value for random numbers: ");
                int maxValue = scanner.nextInt();


                int[] numbers = fillArray(size, minValue, maxValue);

                int largest = findLargest(numbers);
                System.out.println("The largest number in the array is: " + largest);
            }

            public static int[] fillArray(int size, int minValue, int maxValue) {
                Random random = new Random();
                int[] numbers = new int[size];

                for (int i = 0; i < size; i++) {
                    numbers[i] = random.nextInt(maxValue - minValue + 1) + minValue;
                }

                return numbers;
            }

            public static int findLargest(int[] numbers) {
                int largest = numbers[0];

                for (int number : numbers) {
                    if (number > largest) {
                        largest = number;
                    }
                }

                return largest;
            }
        }