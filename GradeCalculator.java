import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();
        
        // Calculate the grade
        String grade = calculateGrade(score);
        
        // Display the grade
        System.out.println("Your Grade is: " + grade);
    }
    
    // Method to get the student's score
    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double score = -1;
        
        // Prompt user for input and validate
        while (score < 0 || score > 100) {
            System.out.print("Enter your score: ");
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score! Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
        
        return score;
    }
    
    // Method to calculate the letter grade
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}