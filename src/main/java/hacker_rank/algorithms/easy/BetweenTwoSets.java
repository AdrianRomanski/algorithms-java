package hacker_rank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16,32,96);

        getTotalX(a, b);


    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcm = a.get(0);
        for(int i = 1; i < a.size(); i++){
            lcm = findLCM(lcm, a.get(i));
        }
        int gcd = b.get(0);
        for(int i = 1; i < b.size(); i++){
            gcd = euclides(gcd, b.get(i));
        }
        int count = 0;
        int multiplier = 1;
        for(int i = lcm; i <= gcd; i = multiplier * lcm){
            if(gcd % i == 0) {
                count++;
            }
            multiplier++;
        }
        return count;
    }

    static int euclides(int number, int number2) {
        if(number2 == 0)
            return number;
        return euclides(number2, number%number2);
    }

    static int findLCM(int number, int number2) {
        return number * number2 / euclides(number, number2);
    }
}




