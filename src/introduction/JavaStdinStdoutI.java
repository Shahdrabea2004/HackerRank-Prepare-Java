package introduction;

import java.util.Scanner;
/**
 * HackerRank - Java Stdin and Stdout I
 * Problem:
 * https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem
 */
public class JavaStdinStdoutI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(x + "\n" + y + "\n" + z);
    }
}
