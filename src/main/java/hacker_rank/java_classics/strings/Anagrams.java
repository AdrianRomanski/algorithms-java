package hacker_rank.java_classics.strings;

import java.util.Arrays;

//Two strings a and b are called anagrams if they contain all the same characters in the same frequencies.
// For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
//Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
public class Anagrams {

    static String sort(String unsorted) {
        char[] string1Chars = unsorted.toCharArray();
        Arrays.sort(string1Chars);
        return Arrays.toString(string1Chars);
    }

    static boolean isAnagram(String string1, String string2) {
        String sortedString1 = sort(string1.toLowerCase());
        String sortedString2 = sort(string2.toLowerCase());
        return sortedString1.equals(sortedString2);
    }

    public static void main(String[] args) {

    }
}
