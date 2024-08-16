import java.util.Arrays;
public class grade_of_student {
    public static void main(String[] args) {

                int[] grades = {
                        85, 92, 76, 81, 90, 68, 77, 94, 88, 73,
                        84, 91, 69, 77, 95, 82, 78, 80, 74, 87,
                        90, 67, 83, 79, 91, 88, 76, 85, 92, 69
                };

                int sum = 0;
                int highestGrade = grades[0];
                int lowestGrade = grades[0];


                for (int grade : grades) {
                    sum += grade;
                    if (grade > highestGrade) {
                        highestGrade = grade;
                    }
                    if (grade < lowestGrade) {
                        lowestGrade = grade;
                    }
                }
        System.out.println("As Sagnik wanted -->");

                double averageGrade = (double) sum / grades.length;
                System.out.printf("Average grade: %.2f%n", averageGrade);
                System.out.println("Highest grade: " + highestGrade);
                System.out.println("Lowest grade: " + lowestGrade);

                // Step 5: Sort the grades in descending order and print the top 5 scores
                Arrays.sort(grades); // Sorts in ascending order
                System.out.println("Top 5 scores:");
                for (int i = grades.length - 1; i >= grades.length - 5; i--) {
                    System.out.println(grades[i]);
                }

    }
}
