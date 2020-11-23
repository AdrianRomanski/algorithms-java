package hacker_rank.java_classics.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//In this problem, you are given a pattern.
// You have to check whether the syntax of the given pattern is valid.
public class PatternSyntaxChecker {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
