package part1_recursion;

/**
 * Part 1. Demonstrate recursion.
 */
public class Part1Recursion {

    // Counter used to show how deep the recursion went before StackOverflowError
    private static int depth = 0;

    public static void main(String[] args) {
        int n = 9;

        // Part 1.1 Print numbers backward: 9 8 7 6 5 4 3 2 1
        System.out.println("Part 1.1. printNumberBackward(" + n + "):");
        printNumberBackward(n);
        System.out.println();

        // Part 1.2 Print numbers forward: 1 2 3 4 5 6 7 8 9
        System.out.println("\nPart 1.2. printNumber(" + n + "):");
        printNumber(n);
        System.out.println();

        // Part 1.3 Recursion without base case -> StackOverflowError
        System.out.println("\nPart 1.3. infiniteRecursion():");
        try {
            infiniteRecursion();
        } catch (StackOverflowError e) {
            System.err.println("Caught: " + e);
            System.err.println("Recursion depth reached: " + depth);
        }
    }

    // Part 1.1 Print n first, then recurse with n - 1
    static void printNumberBackward(int n) {
        if (n < 1) {            // base case
            return;
        }
        System.out.print(n + " ");
        printNumberBackward(n - 1);
    }

    // Part 1.2 Recurse with n - 1 first, then print n on the way back
    static void printNumber(int n) {
        if (n < 1) {            // base case
            return;
        }
        printNumber(n - 1);
        System.out.print(n + " ");
    }

    // Part 1.3 No base case: every call makes another call until the stack is full
    static void infiniteRecursion() {
        depth++;
        infiniteRecursion();
    }
}
