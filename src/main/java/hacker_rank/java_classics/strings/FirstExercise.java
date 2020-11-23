package hacker_rank.java_classics.strings;

import java.util.Scanner;

//String A is "hello" and B is "java".
//A has a length of 5, and B  has a length of 4; the sum of their lengths is 9.
//When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A  is not greater than B and the answer is No.
// When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
public class FirstExercise {

    private static String capitalizeFirstLetter(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = A.length() + B.length();
        boolean isGreater = A.compareTo(B) > 0;
        String isGreaterMsg = isGreater ? "Yes" : "No";
        System.out.println(length);
        System.out.println(isGreaterMsg);
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));
    }
}
