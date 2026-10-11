package introduction;

import java.util.Scanner;
/**
 * HackerRank - Java Stdin and Stdout II
 * Problem:
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 */
public class JavaStdinStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println("String: "+s + "\nDouble: " + y + "\nInt: " + x);
    }
}
