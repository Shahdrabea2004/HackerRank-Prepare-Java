package introduction;

import java.util.Scanner;

/**
 * HackerRank - Java Static Initializer Block
 * Problem:
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class JavaStaticInitializerBlock {
    static Scanner scanner = new Scanner(System.in);
    static int b = scanner.nextInt();
    static int h = scanner.nextInt();

    static boolean flag = true;

    static {
        if (b <= 0 || h <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag)
            System.out.println(b * h);
    }

}
