/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodslab;

/**
 *
 * @author early
 */
import java.util.Scanner;

public class MethodsLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1: Greet User
        greetUser();
        System.out.println();

        // Task 2: Arithmetic Methods
        System.out.print("Enter two numbers for arithmetic: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Addition: " + add((int)num1, (int)num2));
        System.out.println("Subtraction: " + subtract((int)num1, (int)num2));
        System.out.println("Multiplication: " + multiply((int)num1, (int)num2));
        System.out.println("Division: " + divide(num1, num2));
        System.out.println();

        // Task 3: Factorial
        System.out.print("Enter a number for factorial: ");
        int factNum = input.nextInt();
        System.out.println("Factorial (Iterative): " + factorial(factNum));
        System.out.println("Factorial (Recursive): " + recursiveFactorial(factNum));
        System.out.println();

        // Task 4: Sum of Array Elements
        int[] sampleArray = {10, 20, 15, 25, 5}; // Initialized with 5 numbers
        System.out.println("Array elements: [10, 20, 15, 25, 5]");
        System.out.println("Sum of array elements: " + sumArray(sampleArray));
        System.out.println();

        // Task 5: Prime Number Check
        System.out.print("Enter a number to check prime: ");
        int primeNum = input.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum + " is prime.");
        } else {
            System.out.println(primeNum + " is not prime.");
        }
        System.out.println();

        // Additional Task 6: Max in Array
        System.out.println("Max element in array [10, 20, 15, 25, 5]: " + maxInArray(sampleArray));
        System.out.println();

        // Task 7: GCD and LCM
        System.out.print("Enter two positive integers for GCD and LCM (a b): ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        System.out.println("LCM(" + a + ", " + b + ") = " + lcm(a, b));
        System.out.println();

        // Challenge 2: Recursive Fibonacci
        System.out.print("Enter N for nth Fibonacci number: ");
        int N = input.nextInt();
        System.out.println("Fibonacci(" + N + ") = " + fib(N));
        System.out.println();

        // Challenge 3: Palindrome Check
        input.nextLine(); // Consume newline left-over
        System.out.print("Enter a word or phrase to check palindrome: ");
        String text = input.nextLine();
        if (isPalindrome(text)) {
            System.out.println("\"" + text + "\" -> true");
        } else {
            System.out.println("\"" + text + "\" -> false");
        }

        input.close();
    }

    // TASK SOLUTIONS & METHODS IMPLEMENTATION

    // Task 1: greetUser()
    public static void greetUser() {
        System.out.println("Hello, welcome to the Math Program!");
    }

    // Task 2: Arithmetic Methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0.0;
        }
        return a / b;
    }

    // Task 3: factorial(int) - Iterative
    public static long factorial(int n) {
        if (n < 0) return -1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Task 4: sumArray(int[])
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Task 5: isPrime(int)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Task 6: maxInArray(int[])
    public static int maxInArray(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Task 7: gcd(int, int) and lcm(int, int)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0; // lcm(0, 0) is undefined
        return (a / gcd(a, b)) * b;
    }

    // Challenge 1
    public static long recursiveFactorial(int n) {
        if (n <= 1) return 1;
        return n * recursiveFactorial(n - 1);
    }

    // Challenge 2
    public static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // Challenge 3
    public static boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
