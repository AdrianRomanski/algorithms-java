package hacker_rank.algorithms.easy;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static java.math.RoundingMode.CEILING;

public class PlusMinus {

    public static void main(String[] args) {


        int[] ints = {-4,3,-9,0,4,1};

        plusMinus(ints);

    }

    public static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("#.######");
        double negative = 0f;
        double positive = 0f;
        double zeros = 0f;
        double total = arr.length;
        for(int i: arr) {
            if(i > 0)
                positive++;
            else if(i < 0)
                negative++;
            else
                zeros++;
        }

        printResults(positive, total, df);
        printResults(negative, total, df);
        printResults(zeros, total, df);
    }

    static void printResults(double number, double total, DecimalFormat df) {
        if(number > 0) {
            System.out.println(df.format(number/total));
        } else {
            System.out.println(df.format(0));
        }
    }
}
