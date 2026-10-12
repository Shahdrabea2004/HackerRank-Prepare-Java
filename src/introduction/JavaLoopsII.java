package introduction;

import java.util.Scanner;

/**
 * HackerRank - Java Loops II
 * Problem:
 * https://www.hackerrank.com/challenges/java-loops/problem
 */
public class JavaLoopsII {
    static void javaLoopsII(int a, int b, int n) {
        int res = a;
        for (int i = 0; i < n; i++) {
            res += (Math.pow(2, i) * b);
            System.out.print(res+" ");
        }
        System.out.println();
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            javaLoopsII(a, b, n);
        }
        in.close();
    }
}
