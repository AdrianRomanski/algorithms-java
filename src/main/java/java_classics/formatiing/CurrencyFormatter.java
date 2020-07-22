package java_classics.formatiing;
//Given a double-precision number payment denoting an amount of money,
// use the NumberFormat class' getCurrencyInstance method to convert payment
// into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        Locale indiaLocale = new Locale.Builder()
                .setLanguage("en")
                .setRegion("IN").build();
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}


