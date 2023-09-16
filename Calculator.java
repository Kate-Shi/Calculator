import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read the user's input

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read the user's input

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

//      Calculate the double squareRoot

        double squareRoot = Math.sqrt(sum);

        // Display the result
        System.out.println("The double squareRoot of sum " + squareRoot);

        // Close the scanner to free up resources
        scanner.close();
    }

}
