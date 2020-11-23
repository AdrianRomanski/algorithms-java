package hacker_rank.days30_of_code;

import java.util.Arrays;

public class MaximumDifference {

    public static void main(String[] args) {

        int[] numbers = {1,2,5};

        System.out.println(countMaximumDifference(numbers));
    }

    public static int countMaximumDifference(int[] numbers) {
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        return max - min;
    }
}
