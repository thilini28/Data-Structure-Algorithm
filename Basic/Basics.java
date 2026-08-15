import java.util.*;

/**
 * Day 01: Java DSA foundation: input, variables, loops, methods, and Big-O introduction.
 * Topic: Learn the Java basics needed for DSA. Practice loops and methods, then understand why algorithm efficiency is measured with Big-O notation.
 *
 * Run: javac Day01_Basics.java && java Day01_Basics
 */
public class Day01_Basics {
    public static void main(String[] args) {

        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum 1.." + n + " = " + sum);
        System.out.println("Example method: " + square(6));
        System.out.println("Big-O: one loop over n items -> O(n)");

    }

    static int square(int x) { return x * x; }

}
