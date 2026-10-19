package part1_recursion;

/**
 * Part 1. Demonstrate recursion.
 */
public class Part1Recursion {

    // Counter used to show how deep the recursion went before StackOverflowError
    private static int depth = 0;

    public static void main(String[] args) {
        int n = 9;

        // Part 1.1 
        System.out.println("Part 1.1. printNumberBackward(" + n + "):");
        printNumberBackward(n);
        System.out.println();

        // Part 1.2 
        System.out.println("\nPart 1.2. printNumber(" + n + "):");
        printNumber(n);
        System.out.println();

        // Part 1.3 
        System.out.println("\nPart 1.3. infiniteRecursion():");
        try {
            infiniteRecursion();
        } catch (StackOverflowError e) {
            System.err.println("Caught: " + e);
            System.err.println("Recursion depth reached: " + depth);
        }
    }

    // Part 1.1 
    static void printNumberBackward(int n) {
        if (n < 1) {            
            return;
        }
        System.out.print(n + " ");
        printNumberBackward(n - 1);
    }

    // Part 1.2 
    static void printNumber(int n) {
        if (n < 1) {            
            return;
        }
        printNumber(n - 1);
        System.out.print(n + " ");
    }

    // Part 1.3 
    static void infiniteRecursion() {
        depth++;
        infiniteRecursion();
    }
}
