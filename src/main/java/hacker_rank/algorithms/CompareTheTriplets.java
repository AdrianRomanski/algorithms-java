package hacker_rank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {

    public static void main(String[] args) {

        List<Integer> aliceArray = Arrays.asList(17, 28, 30);
        List<Integer> bobArray = Arrays.asList(99, 16, 8);


    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aSum = 0;
        int bSum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aSum+=1;
            } else if(a.get(i) < b.get(i)) {
                bSum+=1;
            }
        }
        return new ArrayList<>(Arrays.asList(aSum, bSum));
    }

}
