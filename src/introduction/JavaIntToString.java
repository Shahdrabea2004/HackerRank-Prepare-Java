package introduction;

import java.util.Scanner;

/**
 * HackerRank - Java Int to String
 * Problem:
 * https://www.hackerrank.com/challenges/java-int-to-string/problem
 */
public class JavaIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
