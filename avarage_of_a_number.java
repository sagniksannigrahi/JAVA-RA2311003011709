import java.util.Scanner;
public class avarage_of_a_number {
    public static void main(String[] args) {
                int[] numbers = getInputArray();// funcction 1

                double average = calculateAverage(numbers); //function 2

                System.out.printf("The average is: %.2f%n", average);
            }

            // Method to prompt the user to enter the number of elements and populate the array
            public static int[] getInputArray() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of elements as sagnik wanted: ");
                int size = scanner.nextInt();

                int[] numbers = new int[size];

                System.out.println("Enter " + size + " numbers:");
                for (int i = 0; i < size; i++) {
                    numbers[i] = scanner.nextInt();
                }

                return numbers;
            }

            public static double calculateAverage(int[] numbers) {
                if (numbers.length == 0) {
                    return 0; // Avoid division by zero if no elements
                }

                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }

                return (double) sum / numbers.length;
            }
        }
