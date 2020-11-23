package hacker_rank.java_classics.strings;

import java.util.Scanner;

//Given a string, s , and two indices start and end print a substring consisting of all
// characters in the inclusive range from start to end.
public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}

