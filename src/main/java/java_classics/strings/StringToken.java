package java_classics.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Given a string s matching the regular expression [A-Za-z !,?._'@]+,
// split the string into tokens. We define a token to be one or more consecutive
// English alphabetic letters. Then, print the number of tokens, followed by each token on a new line
//
public class StringToken {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext()) {
            System.out.print(0);
            return;
        }
        String s = scan.nextLine();
        String regex = "[ !,?._'@]+";
        String[] strings;
        strings = s.trim().split(regex);
        System.out.println(strings.length);
        for (String string : strings) {
            System.out.println(string);
        }
        scan.close();
    }
}


