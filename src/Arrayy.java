import java.util.Scanner;

public class Arrayy {
    public static void main(String[] args) {
        // Part (a): Declare a 2D array of size 10 by 10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Populate the array with user input
        System.out.println("Please enter values for the 2D array:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();  // Accepting input from the user
            }
        }

        // Part (b): Using a for-each loop, print out the input entered by the user
        System.out.println("\nThe values entered are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();  // Print a new line for each row
        }

        scanner.close();  // Close the scanner
    }
}

