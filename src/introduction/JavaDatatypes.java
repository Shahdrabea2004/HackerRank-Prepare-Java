package introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * HackerRank - Java Datatypes
 * Problem:
 * https://www.hackerrank.com/challenges/java-datatypes/problem
 */
public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                long x = scanner.nextLong();
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println(x + " " + "can be fitted in:");
                    System.out.println("* byte\n* short\n* int\n* long");
                } else if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println(x + " " + "can be fitted in:");
                    System.out.println("* short\n* int\n* long");
                } else if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println(x + " " + "can be fitted in:");
                    System.out.println("* int\n* long");
                } else if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println(x + " " + "can be fitted in:");
                    System.out.println("* long");
                }
            } catch (InputMismatchException e) {

                String s = scanner.next();
                System.out.println(s + " " + "can't be fitted anywhere.");
            }
        }
    }
}
