package part3_recursion_strings;

/**
 * Part 3. Optional. Work with strings recursively.
 */
public class Part3RecursionStrings {

    public static void main(String[] args) {
        String s = "Java";

        // Part 3.1
        System.out.println("Part 3.1. printString(\"" + s + "\"):");
        printString(s);

        // Part 3.2
        System.out.println("\nPart 3.2. printReverseString(\"" + s + "\"):");
        printReverseString(s);

        // Part 3.3
        System.out.println("\nPart 3.3. reverseString(\"" + s + "\"):");
        System.out.println(reverseString(s));
    }

    // Part 3.1
    static void printString(String s) {
        if (s.isEmpty()) {          
            return;
        }
        System.out.println(s.charAt(0));
        printString(s.substring(1));
    }

    // Part 3.2 
    static void printReverseString(String s) {
        if (s.isEmpty()) {          // base case
            return;
        }
        printReverseString(s.substring(1));
        System.out.println(s.charAt(0));
    }

    // Part 3.3 
    static String reverseString(String s) {
        if (s.isEmpty()) {          
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
