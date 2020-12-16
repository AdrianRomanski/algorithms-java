package hacker_rank.algorithms.easy;

public class DivisibleSumPairs {


    public static void main(String[] args) {

    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for(int i = 0; i < ar.length; i++) {
            for(int j = 0; j < ar.length; j++) {
                if(i < j && (ar[i] + ar[j]) % k == 0)
                    count++;
            }
        }
        return count;
    }
}


