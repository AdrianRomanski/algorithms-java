package hacker_rank.java_classics.strings;

import java.util.ArrayList;
import java.util.List;

//
// Given a string s and an integer k complete the function
// so that it finds the lexicographically smallest and largest substrings of length k
public class SubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int length = s.length();
        List<String> substrings = new ArrayList<>();

        for(int i = 0; i <= length; i++) {
            if(k <= length) {
                substrings.add(s.substring(i, k));
                k++;
            }
        }
        substrings.sort(String::compareTo);
        smallest = substrings.get(0);
        largest = substrings.get(substrings.size() - 1);

        System.out.println(substrings.toString());
        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {


        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}
