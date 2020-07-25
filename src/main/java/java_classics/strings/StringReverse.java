package java_classics.strings;

import java.util.Scanner;

//Given a string , print Yes if it is a palindrome, print No otherwise.
public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder sb = new StringBuilder();

        char[] charArray = A.toCharArray();
        for(int i = charArray.length - 1; i >= 0; i--) {
            sb.append(charArray[i]);
        }
        String reversed = sb.toString();
        System.out.println(reversed.equals(A) ? "Yes" : "No");
    }
}
