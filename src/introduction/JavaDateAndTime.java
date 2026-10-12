package introduction;

import java.io.*;
import java.time.LocalDate;

/**
 * HackerRank - Java Date and Time
 * Problem:
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 */
class Result {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day)
                .getDayOfWeek()
                .toString();
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
