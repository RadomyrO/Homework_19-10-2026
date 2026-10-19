package part2_recursion_arrays;

import java.util.Arrays;

/**
 * Part 2. Recursion and arrays.
 */
public class Part2RecursionArrays {

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 7, 9, 2, 7, 5};
        System.out.println("Array: " + Arrays.toString(array));

        // Part 2.1 
        System.out.println("\nPart 2.1. printArray(array, 0):");
        printArray(array, 0);
        System.out.println();

        // Part 2.2 
        System.out.println("\nPart 2.2. arraySum(array, 0):");
        System.out.println("Sum = " + arraySum(array, 0));

        // Part 2.3 
        int what = 7;
        System.out.println("\nPart 2.3. findCountInArray(array, " + what + ", 0):");
        System.out.println("Count of " + what + " = " + findCountInArray(array, what, 0));
    }

    // Part 2.1 
    static void printArray(int[] array, int i) {
        if (i >= array.length) {    
            return;
        }
        System.out.print(array[i] + " ");
        printArray(array, i + 1);
    }

    // Part 2.2 
    static int arraySum(int[] array, int i) {
        if (i >= array.length) {    
            return 0;
        }
        return array[i] + arraySum(array, i + 1);
    }

    // Part 2.3 
    static int findCountInArray(int[] array, int what, int i) {
        if (i >= array.length) {    
            return 0;
        }
        int current = (array[i] == what) ? 1 : 0;
        return current + findCountInArray(array, what, i + 1);
    }
}
