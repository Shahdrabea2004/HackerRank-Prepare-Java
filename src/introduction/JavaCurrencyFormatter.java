package introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * HackerRank - Java Currency Formatter
 * Problem:
 * https://www.hackerrank.com/challenges/java-currency-formatter/problem
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale localeUS = Locale.US;
        Locale localeIndia = Locale.forLanguageTag("en-IN");
        Locale localeChina = Locale.CHINA;
        Locale localeFrance = Locale.FRANCE;

        String formatterUS = NumberFormat.getCurrencyInstance(localeUS).format(payment);
        String formatterIndia = NumberFormat.getCurrencyInstance(localeIndia).format(payment)
                .replace("\u20B9", "Rs.");
        String formatterChina = NumberFormat.getCurrencyInstance(localeChina).format(payment)
                .replace("\u00A5", "\uFFE5");
        String formatterFrance = NumberFormat.getCurrencyInstance(localeFrance).format(payment)
                .replace('\u202F', '\u00A0')
                .replace("\u00A0\u20AC", "\u0020\u20AC");

        System.out.println("US: " + formatterUS);
        System.out.println("India: " + formatterIndia);
        System.out.println("China: " + formatterChina);
        System.out.println("France: " + formatterFrance);
    }
}
