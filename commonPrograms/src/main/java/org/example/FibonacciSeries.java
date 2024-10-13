package org.example;

import java.util.Scanner;

public class FibonacciSeries {

    // Method to print Fibonacci series up to 'n' terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        // Print the first two terms
        System.out.print(first + " " + second);

        // Calculate and print the next terms
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of terms to display in the Fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Call the function to print the series
        if (n >= 2) {
            System.out.println("Fibonacci series:");
            printFibonacci(n);
        } else {
            System.out.println("Please enter a number greater than or equal to 2.");
        }

        scanner.close();
    }
}
