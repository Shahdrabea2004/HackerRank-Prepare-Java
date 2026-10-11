package introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * HackerRank - Java If-Else
 * Problem:
 * https://www.hackerrank.com/challenges/java-if-else/problem
 */
public class JavaIfElse {
    static void javaIfElse(int n) {
        if (n % 2 == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
            return;
        }
        System.out.println("Weird");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        javaIfElse(N);

        bufferedReader.close();
    }
}
