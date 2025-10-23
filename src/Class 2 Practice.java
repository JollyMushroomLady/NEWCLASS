/*
 * JAVA IN-CLASS PRACTICE - Variables, Operators & Conditionals
 *
 * Instructions: Work through each section together as a class.
 * The instructor will guide you through the problems.
 * Feel free to experiment and ask questions!
 */

import java.util.Scanner;

public class ClassPractice {
    public static void main(String[] args) {

        // =====================================================================
        // WARM-UP: PREDICT THE OUTPUT
        // Before running, predict what each section prints!
        // =====================================================================

        System.out.println("=== WARM-UP: PREDICT THE OUTPUT ===\n");

        // Example 1: What prints here?
        System.out.println("Example 1:");
        int apples = 20;
        int students = 6;
        System.out.println(apples / students);
        System.out.println(apples % students);
        // Discuss: Why these numbers? not fuckin 3.33333 - its an interger

        System.out.println();

        // Example 2: What prints here?
        System.out.println("Example 2:");
        int points = 100;
        points -= 15;  // Lost some points
        points *= 2;   // Double points bonus!
        System.out.println(points);
        // Discuss: What happened step by step?

        System.out.println();

        // Example 3: What prints here?
        System.out.println("Example 3:");
        int grade = 78;
        if (grade >= 80) {
            System.out.println("Great job!");
        } else if (grade >= 70) {
            System.out.println("Good work!");
        } else {
            System.out.println("Keep trying!");
        }
        // Discuss: Which branch executes?

        System.out.println();

        // Example 4: What prints here?
        System.out.println("Example 4:");
        boolean isWeekend = false;
        boolean isHoliday = true;
        if (isWeekend || isHoliday) {
            System.out.println("No school!");
        } else {
            System.out.println("Time for class!");
        }
        // Discuss: Why this output?

        System.out.println("\n");


        // =====================================================================
        // SPOT THE BUG
        // These code snippets have errors. Find and fix them together!
        // =====================================================================

        System.out.println("=== SPOT THE BUG ===\n");

        // Bug 1: Why won't this compile?
        System.out.println("Bug 1:");
        // int temperature = 72;
        // if (temperature > 70)
        //     System.out.println("Warm outside");
        //     System.out.println("Wear shorts");
        // FIX IT HERE:



        System.out.println();

        // Bug 2: This compiles but gives wrong answer. Why?
        System.out.println("Bug 2:");
        // double average = 15 / 2;
        // System.out.println("Average: " + average);
        // FIX IT HERE:



        System.out.println();

        // Bug 3: Why doesn't this work as expected?
        System.out.println("Bug 3:");
        // int speed = 65;
        // if (speed = 55) {
        //     System.out.println("Going speed limit");
        // }
        // FIX IT HERE:



        System.out.println("\n");


        // =====================================================================
        // CODE ALONG: SIMPLE PROGRAMS
        // Build these together as a class!
        // =====================================================================

        System.out.println("=== CODE ALONG #1: Tip Calculator ===\n");

        // Let's build a tip calculator together!
        // Steps:
        // 1. Ask for bill amount
        // 2. Ask for tip percentage (15, 18, or 20)
        // 3. Calculate tip amount
        // 4. Calculate total bill
        // 5. Print both amounts

        // START CODING HERE:

        Scanner scanner = new Scanner (System.in);
        System.out.println ("How much was it?");
        double cost = scanner.nextDouble();
        System.out.println ("Whats the tip percentage (15, 18, 50?)");
        double tipPercent = scanner.nextDouble();
        tipPercent /= 100;
        double tipAmount = cost * tipPercent;
        double Total = cost + tipAmount;
        System.out.println ("Your tip is:" + tipAmount);
        System.out.println ("Your grand total is:" + Total);












        System.out.println("\n");


        System.out.println("=== CODE ALONG #2: Movie Rating Checker ===\n");

        // Let's check if someone can watch a movie!
        // Movie ratings:
        // - G: Everyone can watch
        // - PG: Need to be 8+ years old
        // - PG-13: Need to be 13+ years old
        // - R: Need to be 17+ years old
        //
        // Steps:
        // 1. Ask for person's age
        // 2. Ask for movie rating (use a number: 1=G, 2=PG, 3=PG-13, 4=R)
        // 3. Check if they can watch it
        // 4. Print appropriate message

        // START CODING HERE:

        Scanner scanner = new Scanner (System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("What rating is the movie");
        String rating = scanner.nextLine();
        if (rating == "G"){
            System.out.println("you can watch this!");
            }
        }







        System.out.println("\n");


        System.out.println("=== CODE ALONG #3: Shopping Discount ===\n");

        // Let's calculate a shopping discount!
        // Rules:
        // - If you spend $100 or more, get 20% off
        // - If you spend $50-$99, get 10% off
        // - If you spend less than $50, no discount
        //
        // Steps:
        // 1. Ask for purchase amount
        // 2. Calculate discount based on amount
        // 3. Calculate final price
        // 4. Print original price, discount, and final price

        // START CODING HERE:








        System.out.println("\n");


        // =====================================================================
        // PAIR PROGRAMMING: Try These Together!
        // Work with a partner on these problems
        // =====================================================================

        System.out.println("=== PAIR PROGRAMMING CHALLENGE #1 ===\n");

        // Water Temperature Checker
        // Ask for water temperature in Celsius
        // Print what state the water is in:
        // - 0 or below: "Frozen (ice)"
        // - 1-99: "Liquid (water)"
        // - 100 or above: "Gas (steam)"

        // YOUR CODE HERE:







        System.out.println("\n");


        System.out.println("=== PAIR PROGRAMMING CHALLENGE #2 ===\n");

        // Parking Fee Calculator
        // First hour: $5
        // Each additional hour: $3
        // Maximum daily charge: $20
        //
        // Ask user how many hours they parked
        // Calculate and print the parking fee
        // Hint: Use Math.min() to cap at $20

        // YOUR CODE HERE:







        System.out.println("\n");


        System.out.println("=== PAIR PROGRAMMING CHALLENGE #3 ===\n");

        // Triangle Validator
        // Ask for three side lengths (use doubles)
        // Check if they can form a valid triangle
        // Rule: Sum of any two sides must be greater than the third side
        // (Check all three combinations: a+b>c AND b+c>a AND a+c>b)
        //
        // Print "Valid triangle" or "Invalid triangle"

        // YOUR CODE HERE:







        System.out.println("\n");


        // =====================================================================
        // CHALLENGE: For Early Finishers
        // =====================================================================

        System.out.println("=== CHALLENGE PROBLEM ===\n");

        // Rock, Paper, Scissors Judge
        // Player 1 and Player 2 each choose: 1=Rock, 2=Paper, 3=Scissors
        // Your program should determine the winner:
        // - Rock beats Scissors
        // - Scissors beats Paper
        // - Paper beats Rock
        // - Same choice = Tie
        //
        // Ask for both players' choices
        // Print who wins or if it's a tie
        //
        // Extra challenge: Can you do this without a long chain of if-else?

        // YOUR CODE HERE:









        System.out.println("\n");


        // =====================================================================
        // REFLECTION QUESTIONS
        // Discuss these with the class at the end
        // =====================================================================

        /*
         * DISCUSSION QUESTIONS:
         *
         * 1. When do you use == vs = ?
         *
         * 2. What's the difference between && and || ?
         *
         * 3. Why does 10 / 3 give you 3 instead of 3.333...?
         *
         * 4. When should you use if-else vs if-else if-else?
         *
         * 5. What happens if you forget curly braces in an if statement?
         *
         * 6. How can you test if a number is even?
         *
         * 7. What's one thing you learned today that surprised you?
         *
         * 8. What's still confusing that we should review?
         */


        // =====================================================================
        // HOMEWORK PREVIEW
        // =====================================================================

        /*
         * TONIGHT'S HOMEWORK:
         *
         * Build a "Vending Machine" program:
         * - Show a menu with 3 items and their prices
         * - Ask user to select an item (1, 2, or 3)
         * - Ask how much money they insert
         * - Check if they have enough money
         * - If yes: print "Dispensing [item]" and calculate change
         * - If no: print "Insufficient funds" and how much more they need
         *
         * Bonus: Handle invalid selections (not 1, 2, or 3)
         */
    }
}