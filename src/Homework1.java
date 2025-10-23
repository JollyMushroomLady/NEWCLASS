import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner index1 = new Scanner(System.in);

        // ========================================
        // EXERCISE 1: Hello World
        // Difficulty: ⭐ (Easiest)
        // ========================================
        // TODO: Print "Hello, World!" to the console


        System.out.println("Hello, World!");




        // ========================================
        // EXERCISE 2: Personal Greeting
        // Difficulty: ⭐⭐
        // ========================================
        // TODO: Ask the user for their name, then greet them personally
        // Example output: "hello!, Alice!"
        // HINT: Use scanner.nextLine() to read a line of text


        System.out.println("What is your name");
        String name = index1.nextLine();
        System.out.println("hello!," + name);



        // ========================================
        // EXERCISE 3: Age Calculator
        // Difficulty: ⭐⭐
        // ========================================
        // TODO: Ask for the user's birth year
        // Calculate their age (assume current year is 2025)
        // Print: "You're [age] years old"
        // HINT: Use scanner.nextInt() to read a number
        // HINT: Don't forget scanner.nextLine() after nextInt()!


        System.out.println("What is your birth year?");
        int birthYear = index1.nextInt();
        int age = 2025 -birthYear;
        System.out.println("You're " + age + " years old");




        // ========================================
        // EXERCISE 4: Simple Calculator
        // Difficulty: ⭐⭐⭐
        // ========================================
        // TODO: Ask the user for two numbers
        // Calculate and print their sum, difference, product, and quotient
        // HINT: Use scanner.nextDouble() for decimal numbers


        System.out.println("May I get two numbers from you, " + name + "?");
        System.out.println("Give me the first number:");
        double num1 = index1.nextDouble();
        System.out.println("Give me the second number:");
        double num2 = index1.nextDouble();



        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);



    }
}