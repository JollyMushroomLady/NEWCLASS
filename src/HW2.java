/*
 * JAVA PRACTICE WORKSHEET - Variables, Operators & Conditionals
 * Name: _________________  Date: _________________
 *
 * Instructions: Complete all sections. You can write answers as comments
 * or run the code to test your understanding.
 */

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        // =====================================================================
        // PART 1: CODE READING (What's the Output?)
        // Write what each program prints as a comment
        // =====================================================================

        System.out.println("=== PART 1: CODE READING ===\n");

        // Question 1:
        System.out.println("Question 1:");
        int x = 10;
        int y = 3;
        System.out.println(x / y);
        System.out.println(x % y);
        // Your answer: _________________

        System.out.println();

        // Question 2:
        System.out.println("Question 2:");
        int a = 5;
        a = a + 3;
        a *= 2;
        System.out.println(a);
        // Your answer: _________________

        System.out.println();

        // Question 3:
        System.out.println("Question 3:");
        int age = 16;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        // Your answer: _________________

        System.out.println();

        // Question 4:
        System.out.println("Question 4:");
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        }
        // Your answer: _________________

        System.out.println();

        // Question 5:
        System.out.println("Question 5:");
        boolean hasTicket = true;
        int age2 = 25;
        if (hasTicket && age2 >= 18) {
            System.out.println("Entry allowed");
        } else {
            System.out.println("Entry denied");
        }
        // Your answer: _________________

        System.out.println("\n");


        // =====================================================================
        // PART 2: FIND AND FIX THE ERRORS
        // Each snippet has ONE error. Fix it below.
        // =====================================================================

        System.out.println("=== PART 2: FIND AND FIX THE ERRORS ===\n");

        // Question 6: (BROKEN - FIX IT)
        // int price = 20;
        // if (price = 20) {
        //     System.out.println("Correct price");
        // }
        // Error: _________________________________
        // Fixed code:



        // Question 7: (BROKEN - FIX IT)
        // int x = 5;
        // int y = 10;
        // if (x > y)
        //     System.out.println("x is bigger");
        //     System.out.println("This always prints");
        // Error: _________________________________
        // Fixed code:



        // Question 8: (BROKEN - FIX IT)
        // double result = 10 / 4;
        // System.out.println(result);
        // What prints? _________________
        // Why is this wrong? _________________________________
        // Fixed code:


        System.out.println("\n");


        // =====================================================================
        // PART 3: FILL IN THE BLANKS
        // Complete the code by filling in the blanks
        // =====================================================================

        System.out.println("=== PART 3: FILL IN THE BLANKS ===\n");

        // Question 9: Temperature Checker
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter temperature: ");
        // int temp = input.nextInt();
        //
        // if (temp _____ 32) {
        //     System.out.println("Freezing");
        // } else if (temp > 32 _____ temp < 80) {
        //     System.out.println("Nice weather");
        // } _____ {
        //     System.out.println("Hot");
        // }


        // Question 10: Even or Odd
        // int number = 17;
        // if (number _____ 2 == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println(_____);
        // }

        System.out.println("\n");


        // =====================================================================
        // PART 4: WRITE THE CODE
        // Write complete programs for each problem
        // =====================================================================

        System.out.println("=== PART 4: WRITE THE CODE ===\n");

        // Question 11: Age Category
        // Write a program that asks for a person's age and prints their category:
        // - 0-12: "Child"
        // - 13-19: "Teenager"
        // - 20-64: "Adult"
        // - 65+: "Senior"

        System.out.println("Question 11: Age Category");
        // YOUR CODE HERE





        System.out.println("\n");


        // Question 12: Pizza Cost Calculator
        // Write a program that calculates pizza cost:
        // - Ask for pizza size: 1 (small), 2 (medium), or 3 (large)
        // - Small = $8, Medium = $12, Large = $15
        // - Ask if they want extra cheese (adds $2)
        // - Print the total cost

        System.out.println("Question 12: Pizza Cost Calculator");
        // YOUR CODE HERE





        System.out.println("\n");


        // =====================================================================
        // PART 5: CHALLENGE PROBLEMS
        // =====================================================================

        System.out.println("=== PART 5: CHALLENGE PROBLEMS ===\n");

        // Question 13: Password Validator
        // Write a program that checks if a password is valid:
        // - Password must be at least 8 characters long
        // - Password must contain at least one number
        // Hint: Use password.length() and password.contains("1")

        System.out.println("Question 13: Password Validator");
        // YOUR CODE HERE





        System.out.println("\n");


        // Question 14: Leap Year Checker
        // A year is a leap year if:
        // - It's divisible by 4 AND
        // - (It's NOT divisible by 100 OR it IS divisible by 400)
        // Test with: 2020 (yes), 1900 (no), 2000 (yes), 2023 (no)

        System.out.println("Question 14: Leap Year Checker");
        // YOUR CODE HERE





        System.out.println("\n");


        // =====================================================================
        // BONUS: DEBUG THE PROGRAM
        // =====================================================================

        System.out.println("=== BONUS: DEBUG THE PROGRAM ===\n");

        // Question 15: This program should give a discount if you buy 10+ items.
        // Find ALL the errors and fix them.

        // BROKEN CODE (uncomment and fix):
        // Scanner input = new Scanner(System.in);
        //
        // System.out.print("Enter item price: ");
        // double price = input.nextDouble();
        //
        // System.out.print("Enter quantity: ");
        // int quantity = input.nextInt();
        //
        // double total = price * quantity;
        //
        // if (quantity > 10)
        //     total = total * 0.9;
        //     System.out.println("Discount applied!");
        //
        // System.out.println("Total: $" + total);

        // Errors found: _________________________________


        // =====================================================================
        // SELF-ASSESSMENT
        // =====================================================================

        /*
         * Circle your confidence level for each topic:
         *
         * Topic                                 | Need Help | Getting There| Got It!
         * ----------------- ----------- ------ -|-----------|--------------|---------
         * Arithmetic operators                  |           |              |
         * Comparison operators (==, <, >, etc.) |           |              |
         * If/else statements                    |           |              |
         * Logical operators (&&, ||)            |           |              |
         *
         * What was most confusing? _________________________________
         *
         * What do you want more practice with? _________________________________
         */
    }
}