package hacker_rank.algorithms.easy;

import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {

    }


    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = 0;
        int count = 0;

        for(int i:candles) {
            if(i > max)
                max = i;
        }
        for(int i: candles) {
            if(i == max)
                count++;
        }
        return count;
    }
}
