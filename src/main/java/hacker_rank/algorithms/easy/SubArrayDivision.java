package hacker_rank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

public class SubArrayDivision {

    public static void main(String[] args) {

//        List<Integer> birthList = Arrays.asList(1,2,1,3,2);
//
//        System.out.println(birthday(birthList, 3, 2));
//
//        List<Integer> birthList2 = Arrays.asList(1,1,1,1,1);
//
//        System.out.println(birthday(birthList2, 3, 2));
//
//        List<Integer> birthList3 = Arrays.asList(4);
//
//        System.out.println(birthday(birthList2, 4, 1));

        List<Integer> birthList4 = Arrays.asList(2, 3, 4, 4, 2, 1, 2, 5, 3, 4, 4, 3, 4, 1, 3, 5, 4, 5, 3, 1, 1, 5, 4,
                3, 5, 3, 5, 3, 4, 4, 2, 4, 5, 2, 3, 2, 5, 3, 4, 2, 4, 3, 3, 4, 3, 5, 2, 5, 1, 3, 1, 4, 2, 2, 4, 3, 3, 3, 3, 4,
                1, 1, 4, 3, 1, 5, 2, 5, 1, 3, 5, 4, 3, 3, 1, 5, 3, 3, 3, 4, 5, 2);

        System.out.println(birthday(birthList4, 26, 8));


    }

    static int birthday(List<Integer> s, int d, int m) {
        int sum;
        int count = 0;
        if(m == 1) {
            for(int i: s) {
                if(i == d)
                    count++;
            }
            return count;
        }
        for(int i = 0; i <= s.size()-m; i++) {
            sum = s.get(i);
            for(int j = i+1; j < i + m; j++) {
                sum+=s.get(j);
            }
            if(sum == d)
                count++;
        }
        return count;
    }


}
