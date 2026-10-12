package introduction;

import java.util.Scanner;

/**
 * HackerRank - Java Output Formatting
 * Problem:
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int x = scanner.nextInt();

            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
    }
}
