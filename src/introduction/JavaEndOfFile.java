package introduction;

import java.util.Scanner;
/*
 * HackerRank - Java End-of-file
 * Problem:
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(++cnt + " " + s);
        }

        scanner.close();
    }
}