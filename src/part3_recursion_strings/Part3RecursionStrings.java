package part3_recursion_strings;

/**
 * Part 3. Optional. Work with strings recursively.
 */
public class Part3RecursionStrings {

    public static void main(String[] args) {
        String s = "Java";

        // Part 3.1 Print string, one letter per line
        System.out.println("Part 3.1. printString(\"" + s + "\"):");
        printString(s);

        // Part 3.2 Print string backward, one letter per line
        System.out.println("\nPart 3.2. printReverseString(\"" + s + "\"):");
        printReverseString(s);

        // Part 3.3 Return reversed string
        System.out.println("\nPart 3.3. reverseString(\"" + s + "\"):");
        System.out.println(reverseString(s));
    }

    // Part 3.1 Print first char, then recurse for the rest
    static void printString(String s) {
        if (s.isEmpty()) {          // base case
            return;
        }
        System.out.println(s.charAt(0));
        printString(s.substring(1));
    }

    // Part 3.2 Recurse for the rest first, then print first char on the way back
    static void printReverseString(String s) {
        if (s.isEmpty()) {          // base case
            return;
        }
        printReverseString(s.substring(1));
        System.out.println(s.charAt(0));
    }

    // Part 3.3 Reverse of s = reverse of the rest + first char
    static String reverseString(String s) {
        if (s.isEmpty()) {          // base case
            return "";
        }
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}
